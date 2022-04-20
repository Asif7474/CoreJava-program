package com.Collection;

import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) {
		TreeSet<String> ll=new TreeSet<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");

		System.out.println(ll.headSet("B"));
		
		System.out.println(ll.subSet("B", "E"));
		
		System.out.println(ll.tailSet("C"));
	}

}
