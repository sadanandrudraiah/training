package com.cruds.thread;

public class PriorityDemo {

	public static void main(String[] args) {

		Clicker hi = new Clicker(Thread.NORM_PRIORITY + 3);
		Clicker low = new Clicker(Thread.NORM_PRIORITY - 3);
		
		hi.start();
		low.start();
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hi.stop();
		low.stop();
		
		System.out.println("Hi Counter " + hi.counter);
		System.out.println("Low Counter" + low.counter);
		
	}

}
