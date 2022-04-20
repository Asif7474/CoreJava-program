package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(1, "Asif");
		lhm.put(3, "saif");
		lhm.put(4, "naveed");
		lhm.put(2, "vishal");
		
		for(Map.Entry<Integer, String> m:lhm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
