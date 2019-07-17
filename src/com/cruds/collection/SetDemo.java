package com.cruds.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.cruds.training.Student;

public class SetDemo {

	public static void main(String[] args) {

		Set<Student> studs = new TreeSet<>();
		studs.add(new Student(765, "Anil"));
		studs.add(new Student(876, "Kishore"));
		studs.add(new Student(303, "Akash"));
		studs.add(new Student(303, "Sada"));
		
		for(Student s : studs)
		{
			System.out.println(s);
		}
		
	}

}
