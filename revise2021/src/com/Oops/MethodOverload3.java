package com.Oops;

public class MethodOverload3 {
	void sum(int i,int x) {System.out.println("int arg invoked");}
	
	void sum(long a,long b) {System.out.println("long invoked");}
	
	public static void main(String[] args) {
		
		MethodOverload3 obj=new MethodOverload3();
		obj.sum(100, 200);
	}

}
