package com.cruds.exception;

public class StudentException extends RuntimeException {

	private String details;
	
	public StudentException(String details)
	{
		this.details = details;
	}

	public String getDetails() {
		return details;
	}
	
}
