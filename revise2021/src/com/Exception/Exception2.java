package com.Exception;

public class Exception2 {

	public static void main(String[] args) {
		try{
			int a=100/0;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code working");

	}

}
