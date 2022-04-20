package com.revise;

 class StaticMethod2 {
	int id;
	String name;
	static String college="DCP";
	
	static void change(){
		
		college="SNDT";
		}
		
	StaticMethod2(int i,String n){
		id=i;
		name=n;
	}
	
	
	void show(){
		System.out.println(id+" "+name+" "+college);
	}
}
public class StaticMethod1{
	public static void main(String args[]){
		
		StaticMethod2 s1=new StaticMethod2(1,"asif");
		StaticMethod2 s2=new StaticMethod2(2,"shubham");
		
		StaticMethod2.change();
		
		s1.show();
		s2.show();
		
}

}
