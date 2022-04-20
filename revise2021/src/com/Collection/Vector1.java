package com.Collection;

import java.util.*;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String>v1=new Vector<String>();
		v1.add("asif");
		v1.add("umar");
		v1.add("asif");
		v1.add("shubahm");
		v1.add(null);
		v1.add(null);
		
		Iterator<String>itr=v1.iterator();
		while(itr.hasNext()) {

			
		System.out.println(itr.next());
		}
	}

}
