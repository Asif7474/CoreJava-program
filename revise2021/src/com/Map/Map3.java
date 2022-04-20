package com.Map;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "Kiara");
		map.put(104, "Karina");
		map.put(102, "Katrina");
		map.put(103, "preeti");
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
		.forEach(System.out::println);
			
		
	}

}
