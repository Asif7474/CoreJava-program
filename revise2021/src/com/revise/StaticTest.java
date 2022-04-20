package com.revise;
class Test{
	
	static String name;
	Test(String n){
		name=n;
	}
	void display() {
		System.out.println(name);
	};
}
public class StaticTest {

	public static void main(String[] args) {
		Test obj=new Test("asif");
		obj.display();
		//System.out.println(Test.name);
	}
}
