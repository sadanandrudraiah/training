package com.cruds.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.cruds.training.Student;

public class ObjectStreamDemo {

	public static void main(String[] args) {

		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser"));
			Student s1 = new Student(101, "Anil");
			os.writeObject(s1);
			os.close();
			System.out.println("Object written successfully");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
