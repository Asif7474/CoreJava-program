package com.String;

public class StringIntern2 {

	public static void main(String[] args) {
		String s1=	"hello";
		String s2=s1.intern();
		String s3=	new String("hello");
		String s4=s3.intern();
		
		System.out.println(s1==s2);	//t
		System.out.println(s1==s3);	//f
		System.out.println(s2==s3);	//f
		System.out.println(s3==s4);	//f
		System.out.println(s1==s4);	//t

	}

}
