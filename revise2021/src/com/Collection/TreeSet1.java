package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("asif");
		ts.add("akhil");
		ts.add("fareed");
		ts.add("asif");
		ts.add("akhil");
		
		
		Iterator<String> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
