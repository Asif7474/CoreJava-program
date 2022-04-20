package com.revise;

public class Wasim {
	
	static {
		System.out.println("static1");
	};
	static {
		System.out.println("static2");
	};
	{
		System.out.println("init1");
	};
	{
		System.out.println("init2");
	};
	Wasim(){
		System.out.println("const");
	};
	Wasim(int a){
		System.out.println("const1");
	};
	
	public static void main(String[] args) {
		Wasim obj=new Wasim();
		Wasim obj1=new Wasim(1);
		 
	}
}
