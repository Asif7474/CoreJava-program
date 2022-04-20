package com.Exception;

public class ExceptionMultipleCatch1 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
			
		}
		catch (ArithmeticException e) {
			System.out.println("arithmatic exception accure"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException accure"+e);
		}
		catch(Exception e) {
			System.out.println("parent exception accure "+e);
		}
		System.out.println("rest of the code");
		

	}

}
