package com.cruds.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.cruds.exception.StudentException;

public class StudentDirectory {

	public static void main(String[] args) throws StudentException {

		Student[] studentDir = new Student[25];
		int position = 0;
		
		Scanner sc = new Scanner(System.in);
		String choice = null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentdir.ser"));
			studentDir = (Student[]) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e1) {
			//e1.printStackTrace();
			System.out.println("Initial Run");
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		do
		{
			System.out.println("1.Add Student");
			System.out.println("2.List All Students");
			System.out.println("3.Exit Application");
			choice = sc.nextLine();
			
			switch (choice) {
			case "1":
				System.out.println("Please enter rollno and name");
				int rollno = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				Student s = new Student(rollno, name);
				studentDir[position] = s;
				position++;
				break;
			case "2":
				for(int i=0; i < studentDir.length; i++)
				{
					if(studentDir[i] != null){
						System.out.println(studentDir[i].getName());
					}
				}
				
				break;
			case "3":
				System.out.println("Application exiting!");
				try {
					ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("studentdir.ser"));
					os.writeObject(studentDir);
					os.close();
					System.out.println("Data Saved successfully");
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			default:
				break;
			}
			
		}while(!choice.equals("3"));
		
		sc.close();
		
	}

}
