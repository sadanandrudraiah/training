package com.cruds.io;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		File file = new File("xyz.txt");
		
		if(file.exists())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("File not exist");
		}
		
		
	}

}
