package com.Exception;

public class ExceptionResolveInCatchBlock {

	public static void main(String[] args) {
		int i=100;
		int j=0;
		int data;
		try {
			data=i/j;
		}
		catch(Exception e) {
			System.out.println("Data = "+i/(j+2));
		}
		System.out.println("rest of code");

	}

}
