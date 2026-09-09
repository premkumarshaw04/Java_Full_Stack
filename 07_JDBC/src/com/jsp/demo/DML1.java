package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DML1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			
			//Insert
			int i1 = stmt.executeUpdate("insert into btm.student values(4,'D',74.50)");
			System.out.println(i1 + "record updated");
			
			//Update
			int i2 = stmt.executeUpdate("update btm.student set name = 'Abhi' where marks = 94.50");
			System.out.println(i2+" records updated");
			
			//delete
			int i3 = stmt.executeUpdate("delete from the student )
		}
	}
}
