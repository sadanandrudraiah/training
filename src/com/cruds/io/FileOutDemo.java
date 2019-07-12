package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {

	public static void main(String[] args) {
		byte[] data = null;
		
		try {
			FileInputStream fis = new FileInputStream("E:/Java/jdk1.8.0_65/README.html");
			data = new byte[fis.available()];
			fis.read(data);
			
			FileOutputStream fos = new FileOutputStream("output.txt");
			fos.write(data);
			fos.close();
			fis.close();
			System.out.println("File written successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
