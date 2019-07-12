package com.cruds.training;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Dog extends Animal implements IVehicle {
	
	@Override
	public void talk() throws NullPointerException
	{
		System.out.println("BOW WOW!!");
	}

	public void wagTail()
	{
		System.out.println("Dog wags tail");
	}

	//@Override
	public void eat() {
		System.out.println("Eating pedigree");
	}

	@Override
	public void start() {
		System.out.println("Dog starting");
	}

	@Override
	public void stop() {
		System.out.println("Dog stopping");
	}
	
}
