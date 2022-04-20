package com.String;

public class StringIntern1 {

	public static void main(String[] args) {
		String s1= "asif";
		String s2=new String("asif");
		
		String s3=s2.intern();
		
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}
