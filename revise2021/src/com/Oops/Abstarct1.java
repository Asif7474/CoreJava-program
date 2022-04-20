package com.Oops;
abstract class Vehicle1{
	abstract void start();
}

class Car1 extends Vehicle1{
	void start() {
		System.out.println("car start with key");
	}
}
class Bike1 extends Vehicle1{
	void start() {
		System.out.println("bike start with kick");
	}
}
public class Abstarct1  {
		public static void main(String[] args) {
			
			Car1 c=new Car1();
			c.start();
			 
			Bike1 b=new Bike1();
			b.start();
		}
}
