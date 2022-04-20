package com.String;

public class StringEndwith2 {

	public static void main(String[] args) {
		String name= "i love my family";
		String str="love";
		System.out.println(name.endsWith(str));
		
		if(name.endsWith(str)) {
			System.out.println("yes ...!!!String ends with "+str);
		}
		else {
			System.out.println("No ...!!!String not endwith "+str);
		}
	}

}
