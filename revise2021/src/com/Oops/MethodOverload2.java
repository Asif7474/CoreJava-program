package com.Oops;

public class MethodOverload2 {
	
	void  add(int a,int b) {
		System.out.println(a+b);
	}
	
	void add(double a,double b) {
		System.out.println(a+b);
	}
		
	public static void main(String[] args) {
	MethodOverload2 obj=new MethodOverload2();

	
	obj.add(10, 20);
	obj.add(25.5, 25.22);

	}

}
