package com.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
	
		Queue<String> q=new PriorityQueue<String>();
		q.add("asif");
		q.add("shubham");
		q.add("brijesh");
		q.add("anwar");
		
		Iterator<String>itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}			
	}
}
