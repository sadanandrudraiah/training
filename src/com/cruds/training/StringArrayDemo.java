package com.cruds.training;

import java.util.Scanner;

public class StringArrayDemo {

	public static void main(String[] args) {

		String[] names = new String[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < names.length; i++)
		{
			System.out.println("Please enter a name:");
			names[i] = sc.nextLine();
		}
		
		System.out.println("Please enter a name to seach");
		String seachName = sc.nextLine();
		boolean found = false;
		
		for(int i=0; i < names.length; i++)
		{
			if(seachName.equals(names[i]))
			{
				found = true;
				break;
			}
		}
		
		sc.close();
		
		
	}

}
