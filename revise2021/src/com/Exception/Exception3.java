package com.Exception;

public class Exception3 {

	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code ");
			
	}

}
