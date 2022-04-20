package com.Map;

import java.util.LinkedHashMap;

public class LinkedHasMapRemove1 {
public static void main(String[] args) {
	LinkedHashMap<Integer, String>lhm=new LinkedHashMap<Integer, String>();
	lhm.put(201, "Ertugrul");
	lhm.put(202, "Turgut");
	lhm.put(203, "Dogan");
	lhm.put(204, "Bamsi");
	
	System.out.println("before invoke remove method"+lhm);
	
	lhm.remove(203);
	
	System.out.println("after invoked remove method"+lhm);
}
}
