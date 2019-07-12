package com.cruds.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) {

		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("emp.dat"));
			dos.writeInt(101);
			dos.writeFloat(3.1415f);
			dos.writeUTF("Sada");
			dos.close();
			System.out.println("Data written successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
