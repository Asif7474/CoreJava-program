package com.Collection;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String>s1=new Stack<String>();
		
		s1.push("a");
		s1.push("b");
		s1.push("c");
		s1.push("d");
		s1.push("e");
		s1.push(null);
		s1.push(null);
		s1.pop();
		
		Iterator<String>itr=s1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
