package com.Exception;

public class Exception4 {

	public static void main(String[] args) {
		try {
		String a="asif";
		int s=Integer.parseInt(a);
		System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of code");
	}

}
