package com.cruds.test;

import java.util.List;

import com.cruds.db.StudentDAO;
import com.cruds.training.Student;

public class TestStudentDAO {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAO();
		
		//dao.update(new Student(888, "Test JDBC"));
		dao.delete(888);
		
		List<Student> list = dao.getAllStudent();
		for(Student s : list)
		{
			System.out.println(s.getRollNo() + ":" + s.getName());
		}
		
		
		/*Student s = dao.getByRollNo(888);
		System.out.println(s.getName());*/
		
		/*if(dao.create(new Student(888, "Test")))
		{
			System.out.println("Student created successfully");
		}*/
		
	}

}
