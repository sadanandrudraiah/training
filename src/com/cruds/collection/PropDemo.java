package com.cruds.collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropDemo {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put("Karnataka", "Bangalore");
		prop.put("Tamil Nadu", "Chennai");
		prop.put("Maharashtra", "Mumbai");
		
		System.out.println(prop.getProperty("Karnataka"));
		System.out.println(prop.getProperty("Andhra"));
		System.out.println(prop.getProperty("Andhra","Not found"));
		
		try {
			prop.store(new FileOutputStream("capitals.properties"), "State capitals");
			System.out.println("Stored successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
