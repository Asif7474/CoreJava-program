package com.Exception;

public class ExceptionFinaly1 {

	public static void main(String[] args) {
		try {
		int a=50/0;
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println(" finaly block executed ");
		}
		System.out.println("Rest of the code");
	}
}
