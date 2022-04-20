package com.Oops;

class Vehicle{
	void suzuki() {
		System.out.println("suzuki is vehicle Company");
	}
}
class Bike extends Vehicle{
	void access() {
		System.out.println("Acess is suzuki scooter");
	}
}
class Car extends Vehicle{
	void wagonR() {
		System.out.println("WagonR is suzuki car");
	}
}
public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.wagonR();
		obj.suzuki();
		
		Bike b=new Bike();
		b.access();
		b.suzuki();
				
		
	}

}
