package com.Collection;

import java.util.HashSet;

public class HashsetRemove {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("akhil");
		set.add("asif");
		set.add("umar");
		set.add("asad");
		set.add("fareed");
		
		System.out.println("list before remove method "+set);
		
		set.remove("asad");
		
		System.out.println("list after remove method "+set);
		
		set.add("arif");
		System.out.println("updated list "+set);
	}

}
