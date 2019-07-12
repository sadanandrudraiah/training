package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("E:/Java/jdk1.8.0_65/README.html")) 
		{
			int size = fis.available();
			System.out.println(size);
			
			byte[] data = new byte[size];
			
			fis.read(data);
			
			System.out.println(new String(data));
			
			/*for(int i=0; i < size; i++)
			{
				System.out.print((char)fis.read());
			}*/
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
