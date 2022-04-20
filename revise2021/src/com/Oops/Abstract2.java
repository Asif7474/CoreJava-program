package com.Oops;
abstract class Bike11{
	
	Bike11(){System.out.println("bike is runing");}
	
	abstract void run(); 
		void change() {
			System.out.println("gear changed");
	}
}
class Suzuki extends Bike11{
	void run() {
		System.out.println("runing safe");
	}
}
public class Abstract2 {

	
	public static void main(String[] args) {
		Bike11 b=new Suzuki();
		b.change();
		b.run();
		
	}
}
