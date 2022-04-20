package com.String;

public class StringSplit1 {
	public static void main(String[] args) {
		
		String str=	"My Name Is Asif Shaikh";
		
		String[]words=	str.split("\\s");
		
		for(String w:words) {
			System.out.println(w);
		}
	}

}
