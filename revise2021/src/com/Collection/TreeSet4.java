package com.Collection;

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet<String> l=new TreeSet<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		System.out.println(l.headSet("C", false));
		
		System.out.println(l.subSet("A", false, "E", true));
		
		System.out.println(l.tailSet("C", false));
		
	}

}
