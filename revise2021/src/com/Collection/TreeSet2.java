package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("aaa");
		tree.add("bbb");
		tree.add("ccc");
		tree.add("ddd");
		
		
		Iterator<String> itr=tree.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
