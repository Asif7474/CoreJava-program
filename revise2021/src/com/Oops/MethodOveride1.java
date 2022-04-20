package com.Oops;
class Test1{
	void run(int a,int b) {
		System.out.println(a+b);
	}
}
public class MethodOveride1 extends Test1 {
	void run(int a,int b) {
		System.out.println(a*b);	
	}
	public static void main(String[] args) {
	MethodOveride1 obj=new MethodOveride1();
	obj.run(20, 40);
	}
}
