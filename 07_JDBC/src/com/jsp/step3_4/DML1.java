package com.jsp.step3_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

//This code has step 3 and 4 -> creating platform and executing queries

public class DML1 {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
	Connection con = null;
	Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // register
		con = DriverManager.getConnection(url); // establish connection with db
		stmt = con.createStatement(); // create platform to write query
		
		//Queries
		
		// Insert
//		int i1 = stmt.executeUpdate("insert into btm.student values(4,'D',65.66)");
//		System.out.println(i1 + " rows affected");	
		
		
//		Update
//		int i2 = stmt.executeUpdate("update btm.student set name = 'Ritesh' where marks = 94.50");
//		System.out.println(i2 + " rows updated");	
		
//		Delete
		int i3 = stmt.executeUpdate("delete from btm.student where marks = 65.66");
		System.out.println(i3 + " records deleted");
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}