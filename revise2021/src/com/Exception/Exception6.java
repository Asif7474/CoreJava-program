package com.Exception;

public class Exception6 {

	public static void main(String[] args) {
		try {
			int a=50/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
