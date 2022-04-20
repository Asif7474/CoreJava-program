package com.revise;
import java.util.Scanner;
public class Practice2 {
	int a;
	int b;
	int c;
	static int x;
	static int add(int a,int b) {
		
		return a+b;
	}
	static int add(int a,int b,int c) {
		
		return a+b+c;
	}
	public static void main(String[] args) {
		
		System.out.println("which method u want to called ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		if(x==2) {
			System.out.println("enter the number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=Practice2.add(a,b);
			System.out.println(c);
		}
		else {
			System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int x=Practice2.add(a,b,c);
		System.out.println(x);
			
		}
		
		
		
		
		
		
		/*
		int x=add(10,20);
		int x1=add(10, 20,30);
		System.out.println(x);
		System.out.println(x1);
		*/
		
		/*
		 * Practice2 obj=new Practice2();
		 * obj.add(10, 20);
		obj.add(10, 20, 30);
		*/

	}

}
