package com.Map;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "Sharukh khan");
		map.put(200, "Salman khan");
		map.put(300, "Amir khan");
		map.put(400, "Saifali khan");
		
		for(Map.Entry m:map.entrySet()) {

			System.out.println(m.getKey()+" "+m.getValue());
		}

	}	
}