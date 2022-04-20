package com.Oops;

interface I1 {
	  void show();
}
interface I2{
	void display();
}
 public class Interfacesimple implements I1,I2{
	public void show() {
		System.out.println("hello");
	}
	
	public void display() {
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		
		Interfacesimple s=new Interfacesimple();
		s.show();
		s.display();
	}
}