package com.cruds.test;

public class TestUserDAO {

	public static void main(String[] args) {

		UserDAO dao = new UserDAO();
		
		if(dao.authenticate2("admin", "' OR '1'='1"))
		{
			System.out.println("User found");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
		
	}

}
