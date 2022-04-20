package com.revise;

public class InstanceBlock1 {
	int speed;
	InstanceBlock1(){
	System.out.println("speed is "+speed);
	}
	{speed=100;}
	
	public static void main(String[] args) {
		
	InstanceBlock1 i=new InstanceBlock1();
	InstanceBlock1 k=new InstanceBlock1();
	}

}
