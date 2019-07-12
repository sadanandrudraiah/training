package com.cruds.thread;

public class TestTreadDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		t1.run();
		
		for(int i=5; i > 0; i--)
		{
			System.out.println("Inside Main Thread " + i + Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread exit");
		
	}

}
