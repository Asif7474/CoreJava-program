package com.Map;

import java.util.*;
public class Map1 {

	public static void main(String[] args) {
	Map map=new HashMap();
	map.put(1, "asif");
	map.put(2, "akhil");
	map.put(4, "fareed");
	map.put(3, "asif");
	
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry entry=(Map.Entry)itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

	}

}
