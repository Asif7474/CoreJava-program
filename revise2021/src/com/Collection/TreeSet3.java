package com.Collection;


import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		TreeSet<Integer> tint=new TreeSet<Integer>();
		tint.add(10);
		tint.add(5);
		tint.add(100);
		tint.add(50);
		
		System.out.println("highest number is "+tint.pollLast());
		System.out.println("Lower number is "+tint.pollFirst());
		
	
	}

}
