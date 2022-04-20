package com.revise;

public class Practice1 {

	
	 
		 int a;
		 void run(int a) {
			 String s=Integer.toString(a);
			 char[] ch = s.toCharArray();
			 
			 System.out.println("enter value is "+a);
			 System.out.println("revserse value is ");
		        for (int i = ch.length - 1; i >= 0; i--)
		        	
		            System.out.print(ch[i]);
		       
		        
		 }
		 public static void main(String[] args) {
			Practice1 obj=new Practice1();
			obj.run(123456);
		}
	}

