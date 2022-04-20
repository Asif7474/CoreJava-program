package com.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map6 {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(222, "Pooja");
	map.put(444, "Manisha");
	map.put(333, "Divya");
	map.put(111, "Huma");
	
	map.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	.forEach(System.out::println);
}
}
