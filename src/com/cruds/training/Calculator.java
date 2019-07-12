package com.cruds.training;

public class Calculator {
	
	public int divide(int x, int y)
	{
		System.out.println("Before Division");
		int result = 0;
		int[] nums = new int[3];
		Student s = null;
		
		try
		{
			System.out.println(s.getName());
			nums[3] = 99;
			result = x/y;
			System.out.println("After Division");
		}catch(ArithmeticException ae)
		{
			System.out.println("Invalid Divisor, please provide non zero value");
		}
		catch(ArrayIndexOutOfBoundsException aobe)
		{
			System.out.println(aobe.getMessage());
		}
		catch(RuntimeException rte)
		{
			System.out.println(rte.getMessage());
		}
		finally
		{
			System.out.println("Inside Finally Line 1 ****");
			s.getRollNo();
			System.out.println("Inside Finally Line 2 %%%%%%%");
		}
		return result;
	}

}
