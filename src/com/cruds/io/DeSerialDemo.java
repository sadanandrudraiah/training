package com.cruds.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.cruds.training.Student;

public class DeSerialDemo {

	public static void main(String[] args) {

		try 
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
			Student student =  (Student) ois.readObject();
			ois.close();
			System.out.println(student.getName() + ":" + student.getRollNo());
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
