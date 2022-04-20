package com.Exception;

public class ExceptionFinaly2 {

	public static void main(String[] args) {
		
		try {
			String s=null;
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finaly executed");
		}

		System.out.println("rest of the code");
	}

}
