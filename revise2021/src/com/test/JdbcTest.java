package com.test;
import java.sql.*;  
class JdbcTest{  
public static void main(String args[]){  
try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/msoft","root","root");   
	Statement stmt=con.createStatement(); 
	System.out.println("connection success");
	
	ResultSet rs=stmt.executeQuery("select * from Employee");  
	
	while(rs.next())  	
		System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
	}  
}  