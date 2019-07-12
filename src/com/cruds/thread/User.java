package com.cruds.thread;

public class User implements Runnable {
	Printer p;
	String msg;
	Thread t;
	
	public User(Printer p, String msg)
	{
		this.p = p;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		synchronized (p) {
			p.print(msg);
		}		
	}
}
