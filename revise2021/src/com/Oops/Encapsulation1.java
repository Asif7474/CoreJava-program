package com.Oops;
class Testi{
	private int id;
	void  setid(int a) {
		id=a;
	}
	int getid() {
	return id;
	}
}
public class Encapsulation1 {
public static void main(String[] args) {
	Testi obj=new Testi();
	obj.setid(100);
	System.out.println(obj.getid());
}
	
}
