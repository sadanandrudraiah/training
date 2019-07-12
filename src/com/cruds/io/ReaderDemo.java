package com.cruds.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cruds.training.Student;

public class ReaderDemo {

	public static void main(String[] args) {
		
		Student[] studens = new Student[10];
		int pos = 0;

		try(FileReader fr = new FileReader("students.csv");
				BufferedReader br = new BufferedReader(fr))
		{
			String line = br.readLine();
			
			while(line != null && line.trim().length() > 0)
			{
				String[] tokens = line.split(",");
				Student s = new Student(Integer.parseInt(tokens[0]),tokens[1]);
				studens[pos] = s;
				pos++;
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
