package com.Collection;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList <String> l1=new LinkedList<String>();
		l1.add("asif");
		l1.add("akhil");
		l1.add("raj");
		l1.add("yogesh");
		l1.add(null);
		l1.add(null);
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
