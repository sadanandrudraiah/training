package com.cruds.training;

import java.io.Serializable;

import com.cruds.exception.StudentException;

public class Student implements Serializable, Comparable<Student> {
	
	public int rollNo;
	private String name;
	
	private String lastName;
	
	private static int count;
	
	public Student(int rollNo, String name) throws StudentException {
		if(rollNo <= 0)
		{
			throw new StudentException("Roll No cannot be negative or zero " + rollNo);
		}
		if(name != null && name.equals(""))
		{
			throw new StudentException("Name cannot be empty");
		}
		
		this.rollNo = rollNo;
		this.name = name;
		count++;
		System.out.println("2 ARG CONST");
	}
	
	public Student(int rollNo, String name, String lastName) throws StudentException {
		this(rollNo,name);
		//this.lastName = lastName;
		System.out.println("3 ARG CONST");
	}



	public static int getCount() {
		return count;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("This roll no " + this.rollNo + " **** Other" + o.getRollNo());
		return this.rollNo - o.getRollNo();
	}
	
}
