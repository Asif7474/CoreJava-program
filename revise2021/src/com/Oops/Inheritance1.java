package com.Oops;

class Test{
	public static void single() {
		System.out.println("single inheritance working");
	}
}
class Test3 extends Test{
	public static void single() {
		System.out.println("single ");
	}
}
public class Inheritance1  {
	

	public static void main(String[] args) {
		Test obj=new Test3();
		obj.single();
	}

}
