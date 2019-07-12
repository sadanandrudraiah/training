package com.cruds.training;

public class Counter {
	
	public static int objCount;
	
	public Counter()
	{
		objCount++;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method Entered " + objCount);
		System.out.println(Thread.currentThread());
		objCount--;
		System.out.println("Finalize method Exit " + objCount);
	}
	
}
