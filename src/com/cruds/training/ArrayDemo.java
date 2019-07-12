package com.cruds.training;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < nums.length; i++)
		{
			System.out.println("Please enter a number:");
			nums[i] = sc.nextInt();
		}
		
		while(true)
		{
			System.out.println("Please enter a number to search or -1 to quit");
			int searchNum = sc.nextInt();
			
			if(searchNum == -1)
			{
				break;
			}
			
			boolean found = false;
			
			for(int i=0; i < nums.length; i++)
			{
				if(searchNum == nums[i])
				{
					found = true;
					break;
				}
			}
			
			if(found)
			{
				System.out.println("Number found");
			}
			else
			{
				System.out.println("Sorry number not found");
			}
		}
		
		sc.close();
		
	}

}
