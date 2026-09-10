//Step 2: Establish the connection between Java application and Database Server.

package com.jsp.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
	Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");  	// Register
		conn = DriverManager.getConnection(url);   // Establish Connection
		System.out.println("Connection established");
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
}