package com.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Map4 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(203, "S");
		map.put(201, "F");
		map.put(204, "A");
		map.put(202, "I");
							//comparing By key
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
		forEach(System.out::println);
	}
}
