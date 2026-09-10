package com.jsp.callableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DML3 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
		Connection con = null;
		CallableStatement cstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url);
			cstmt=con.prepareCall("{call btm.addStudent(?,?,?)}");
			
			cstmt.setInt(1, 7);
			cstmt.setString(2, "G");
			cstmt.setDouble(3, 78.12);
			int i1 = cstmt.executeUpdate();
			
			cstmt.setInt(1, 8);
			cstmt.setString(2, "H");
			cstmt.setDouble(3, 75.12);
			int i2 = cstmt.executeUpdate();
			
			cstmt.setInt(1, 9);
			cstmt.setString(2, "I");
			cstmt.setDouble(3, 88.12);
			int i3 = cstmt.executeUpdate();
			
			System.out.println(i1+i2+i3+ " rows afected");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			if(cstmt!=null) {
				try {
					cstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}