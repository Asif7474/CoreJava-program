package com.revise;

public class InstanceBlock2 {
	
	int bike;
	 InstanceBlock2() {
		 
		System.out.println("constructor inboked");
	}
	 {System.out.println("instance initilizer block");}

	 public static void main(String[] args) {
		InstanceBlock2 obj=new InstanceBlock2();
		
	}
}
