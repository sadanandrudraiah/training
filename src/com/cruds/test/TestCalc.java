package com.cruds.test;

import com.cruds.training.Calculator;

public class TestCalc {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		int result = 0;
		try
		{
			result = c.divide(10, 0);
		}
		catch(RuntimeException rte)
		{
			System.out.println(rte.getMessage());
		}
		finally
		{
			System.out.println("Finally in Main ===>");
		}
		 
		
		System.out.println("Result is " + result);
		
	}

}
