package com.Oops;

public class MethodOverloading1 {
	
	static int add(int a,int b){
		return a+b;
		}
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		
		System.out.println(MethodOverloading1.add(10,25));
		System.out.println(MethodOverloading1.add(10,25,45));
		
	}

}
