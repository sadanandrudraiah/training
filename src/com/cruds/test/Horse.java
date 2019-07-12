package com.cruds.test;

import com.cruds.training.Animal;

public class Horse extends Animal{

	@Override
	public void talk() {
		//super.talk();
		System.out.println("Horse neigh!");
	}
}
