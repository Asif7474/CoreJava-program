package com.Collection;

import java.util.*;

class HashsetTest{
	
	int id,quantity;
	String name,author,publisher;
	public HashsetTest(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
 class HashsetBook {
	public static void main(String[] args) {
	HashSet<HashsetTest>hset=new HashSet<HashsetTest>();
	HashsetTest s1=new HashsetTest(1, "Asif", "majid", "java", 10);
	HashsetTest s2=new HashsetTest(2, "Akhil", "majid", "spring", 50);
	HashsetTest s3=new HashsetTest(4, "umar", "feroj", "python", 200);
	
	hset.add(s1);
	hset.add(s2);
	hset.add(s3);
	
	for(HashsetTest h:hset) {
		System.out.println(h.id+" "+h.name+" "+h.author+" "+h.publisher+" "+h.quantity);
		}
	
	}
}
