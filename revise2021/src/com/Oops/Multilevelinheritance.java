package com.Oops;

class GrandFather{
	void a() {
		System.out.println("I am GrandFather");
		}
}

class Father extends GrandFather{
	void b() {
		System.out.println("I am father");
		}
}

class Child extends Father{
	void c() {
		System.out.println("I am child");
	}
}

public class Multilevelinheritance  {

	public static void main(String[] args) {
		Child obj=new Child();
		obj.a();
		obj.b();
		obj.c();			
	}
}
