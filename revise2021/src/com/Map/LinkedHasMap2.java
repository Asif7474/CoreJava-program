package com.Map;

import java.util.LinkedHashMap;

public class LinkedHasMap2 {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
	lhm.put(101, "Asif");
	lhm.put(102, "Akhil");
	lhm.put(103, "Fareed");
	lhm.put(141, "Owais");
	
	System.out.println("key number is "+lhm.keySet());
	
	System.out.println("value is "+lhm.values());
	
	System.out.println("key and values is "+lhm.entrySet());
}
}
