package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset1 {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		Iterator<String>itr=set.iterator();
		
		while(itr.hasNext()) {	
			
		System.out.println(itr.next());
		}
	}

}
