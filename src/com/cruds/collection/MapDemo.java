package com.cruds.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Sada");
		map.put(222, "Anil");
		map.put(333, "Girish");
		
		Set<Entry<Integer, String>> mapentries = map.entrySet();
		for(Entry<Integer,String> entry : mapentries)
		{
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		Set<Integer> keyset = map.keySet();
		for(int k : keyset)
		{
			System.out.println(k);
		}
		
		Collection<String> values = map.values();
		for(String s : values)
		{
			System.out.println(s);
		}
		
	}

}
