package com.Collection;
import java.util.LinkedHashSet;

class LinkedHasSet2{
	int id,PassingYear;
	String Name,Course;
	public LinkedHasSet2(int id,String Name,String Course,int PassingYear) {
		this.id=id;
		this.Name=Name;
		this.Course=Course;
		this.PassingYear=PassingYear;
		
	}
}
public class LinkedHasSetStudent {
	public static void main(String[] args) {
	
		LinkedHashSet<LinkedHasSet2> lhs = new LinkedHashSet<LinkedHasSet2>();
		
		LinkedHasSet2 l1=new LinkedHasSet2(1, "Asif", "BCA", 2019);
		LinkedHasSet2 l2=new LinkedHasSet2(2, "shubham", "bscit", 2019);
		LinkedHasSet2 l3=new LinkedHasSet2(3, "fahad", "Btech", 2017);
		LinkedHasSet2 l4=new LinkedHasSet2(4, "akhil", "Bcom", 2020);
		
		lhs.add(l1);
		lhs.add(l2);
		lhs.add(l3);
		lhs.add(l4);
		
		for(LinkedHasSet2 l:lhs) {
			System.out.println(l.id+" "+l.Name+" "+l.Course+" "+l.PassingYear);
		}
	
	

}
}
