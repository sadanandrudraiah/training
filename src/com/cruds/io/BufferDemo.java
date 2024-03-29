package com.cruds.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) {

		try 
		{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("output.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(System.out);
			byte[] data = new byte[50];
			boolean eof = false;
			int length = 0;
			
			while(!eof)
			{
				length = bis.read(data);
				if(length == -1)
				{
					eof = true;
				}
				else
				{
					bos.write(data, 0, length);
				}
			}
			
			bos.close();
			bis.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
