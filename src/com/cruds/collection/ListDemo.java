package com.cruds.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Akash");
		names.add("Mahesh");
		names.add("Rakesh");
		names.add("Anil");
		names.add("Anil");
		
		names.add(2, "Ravi");
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
/*		for(String s : names)
		{
			System.out.println(s);
		}*/
		
	}

}
