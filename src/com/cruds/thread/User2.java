package com.cruds.thread;

public class User2 implements Runnable {

	Printer p;
	String msg;
	Thread t;
	
	public User2(Printer p, String msg)
	{
		this.p = p;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		
			p.testPrint(msg);
				
	}	

}
