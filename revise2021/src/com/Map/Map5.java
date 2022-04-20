package com.Map;


import java.util.HashMap;
import java.util.Map;

public class Map5 {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(4, "haidar");
	map.put(2, "sameer");
	map.put(1, "rahul");
	map.put(3, "vijay");
							//comparing by value
	map.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByValue())
	.forEach(System.out::println);
}
}
