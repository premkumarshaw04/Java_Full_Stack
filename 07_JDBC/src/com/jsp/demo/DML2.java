package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DML2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password = admin";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement("insert into btm.student values(?,?,?)");
			pstmt.setInt(1, 2);
			pstmt.setString(0, url);
		}
	}
}
