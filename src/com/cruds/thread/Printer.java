package com.cruds.thread;

public class Printer {
	
	public synchronized void print(String msg)
	{
		System.out.print("[" + msg);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
	public synchronized void testPrint(String msg)
	{
		System.out.println("[TESTING" + msg);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
		
	}

}
