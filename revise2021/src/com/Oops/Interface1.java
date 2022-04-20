package com.Oops;
 interface A1 {
	void a();
	void b();
	void c();
	void d();

}
 abstract class B1 implements A1{
		public void d() {
			System.out.println("im d");
		}
	}
	class C1 extends B1{

		
		public void a() {
		System.out.println("im a");	
			
		}

		public void b() {	
			System.out.println("im b");
		}
		
		public void c() {		
			System.out.println("im c");
		}
	}
public class Interface1 {
	public static void main(String[] args) {
		A1 obj=new C1();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}


