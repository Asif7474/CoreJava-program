package com.Collection;


import java.util.*;;

public class Hashset2 {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(null);
		set.add(3);
		
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			
		System.out.println(itr.next());
		}
		//System.out.println(set);
	}
	

}
