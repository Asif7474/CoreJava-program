package com.Oops;
class Animal{
	
	void dog() {System.out.println("barking...");
	}
}
public class MethodOveride2 extends Animal{
	

	void dog() {
		System.out.println("eating....");
	}

	public static void main(String[] args) {
		MethodOveride2 obj=new MethodOveride2();
		
		obj.dog();
	}
}

