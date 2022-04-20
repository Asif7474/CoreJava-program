package com.Collection;
import java.util.*;


public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("asif");
		list.add("shubham");
		list.add("asif");
		list.add("umar");
		list.add(null);
		list.add(null);
	
	
		Iterator itr=list.iterator();
		while(itr.hasNext()) {

			System.out.println(itr.next());
		}

	}
}
