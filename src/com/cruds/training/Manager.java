package com.cruds.training;

public class Manager extends Employee{
	
	private String deptName;

	public Manager(int empId, String name) {
		super(empId, name);
		System.out.println("MGR CONST");
	}

	public Manager(int empId, String name, String deptName) {
		super(empId, name);
		this.deptName = deptName;
	}

	
	
}
