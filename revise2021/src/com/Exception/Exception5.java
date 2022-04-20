package com.Exception;

public class Exception5 {

	public static void main(String[] args) {
	try{
		
		int a[]= {1,2,3,4,5};
		a[6]=50;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
		}
	System.out.println("rest of codes");
	}
}
