package com.Oops;
class Account{
	private long acc_no;
	private String name,email;
	private float amount;
	
	public long getacc_no() {
		return acc_no;
	}
	public void setacc_no(long a) {
		this.acc_no=a;
	}	
	public String getname() {
		return name;
	}
	public void setname(String n) {
		this.name=n;
	}
	public String getemail() {
		return email;
	}
	public void  setemail(String e) {
		this.email=e;
	}
	public float getamount() {
		return amount;
	}
	public void setamount(float f) {
		this.amount=f;
	}
}
public class Encapsulation2 {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setacc_no(3059712577L);
		obj.setname("Asif shaikh");
		obj.setemail("shaikh.asif7474@gmail.com");
		obj.setamount(50000f);
		
	System.out.println(obj.getacc_no()+"    "+obj.getname()+"    "+obj.getemail()+"  "+obj.getamount());
	}

}
