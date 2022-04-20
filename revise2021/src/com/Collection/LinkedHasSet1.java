package com.Collection;
import java.util.*;
public class LinkedHasSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> Lset=new LinkedHashSet<String>();
		Lset.add("Asif");
		Lset.add("Akhil");
		Lset.add("fareed");
		Lset.add("owais");
		Lset.add("owais");  //Duplicate not allowed
		Lset.add(null); 	//1 null allowed
		
		Iterator<String> itr=Lset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
