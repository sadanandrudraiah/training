package com.cruds.training;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestAnimal {

	public static void main(String[] args) {

		Animal a = new Dog();
		try {
			a.talk();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
