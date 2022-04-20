package com.Exception;

public class ExceptionThrow1 {

	static void validate(int age) {
		if(age<=18) {
			throw new ArithmeticException("person is not eligible for voting");
		}
		else {
			System.out.println("person is eligible for voting");
		}
	}
	public static void main(String[] args) {
		validate(15);
		System.out.println("rest of code");

	}
}
