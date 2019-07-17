package com.cruds.thread;

public class SyncDemo {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		User u1 = new User(p, "Hello"); // sync method
		User2 u2 = new User2(p, "TEST****"); // normal method
		//User u2 = new User(p, "Synchronized");
		//User u3 = new User(p, "World");
		
		try {
			u1.t.join();
			u2.t.join();
			//u3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
