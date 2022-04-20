package com.Oops;

class Bank{
	int getRateOfIntrest() {
	return 0;
	}
}
class Sbi extends Bank{
	int getRateOfIntrest() {
		return 7;
		}
}
class HDFCbank extends Bank{
	int getRateOfIntrest() {
		return 8;
	}
}
class AxisBank extends Bank{
	int getRateOfIntrest() {
		return 9;
	}
}
public class MethodOveride3 {
	public static void main(String[] args) {
		
	Sbi s=new Sbi();
	HDFCbank h=new HDFCbank();
	AxisBank a=new AxisBank();
	
	System.out.println(s.getRateOfIntrest());
	System.out.println(h.getRateOfIntrest());
	System.out.println(a.getRateOfIntrest());
	}
}