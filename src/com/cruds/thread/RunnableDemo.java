package com.cruds.thread;

public class RunnableDemo {

	public static void main(String[] args) {

		MyThreadR obj1 = new MyThreadR("Child Thread 1");
		MyThread t2 = new MyThread();
		
		try {
			t2.join();
			obj1.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread() + " Exiting");
		
	}

}
