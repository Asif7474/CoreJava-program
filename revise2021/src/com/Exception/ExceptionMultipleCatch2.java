package com.Exception;

public class ExceptionMultipleCatch2 {

	public static void main(String[] args) {
		try{
			int a[] =new int [10];	
		System.out.println(a[15]);
		}
		catch(ArithmeticException e) {

			System.out.println("arithmatic exception accure "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException accure "+e);
		}
		catch(Exception e) {
			System.out.println("parent exception accure "+e);
		}
		System.out.println("rest of the code");
	}
}
/* 
 1  create java project & understand pojo & Interface
 2  Mysql
 3  JDBC CRUD
 4  Insert with file in Sql	g
 5  do all above with maven
 6  JSP & Servlet with maven
 7  Make Project
 */
