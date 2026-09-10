package com.jsp.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DML2 { //MultipleRecords
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
	Connection con = null;
	PreparedStatement pstmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url);
		
//		Insert
//		pstmt = con.prepareStatement("insert into btm.student values(?,?,?)");
//		pstmt.setInt(1, 4);
//		pstmt.setString(2, "D");
//		pstmt.setDouble(3, 70.45);
//		int i1 = pstmt.executeUpdate();
//
//		pstmt.setInt(1, 5);
//		pstmt.setString(2, "E");
//		pstmt.setDouble(3, 77.45);
//		int i2 = pstmt.executeUpdate();
//		
//		pstmt.setInt(1, 6);
//		pstmt.setString(2, "F");
//		pstmt.setDouble(3, 82.45);
//		int i3 = pstmt.executeUpdate();
//		
//		pstmt.setInt(1, 7);
//		pstmt.setString(2, "G");
//		pstmt.setDouble(3, 35.45);
//		int i4 = pstmt.executeUpdate();
//		
//		System.out.println(i1+i2+i3+i4 + " rows affected");
		
		
		
//		Update
//		pstmt = con.prepareStatement("update btm.student set name=? where id = ?");
//		pstmt.setString(1, "Abhi");
//		pstmt.setInt(2, 5);
//		int i5 = pstmt.executeUpdate();
//
//		System.out.println(i5 + " rows updated");
		
		
		
//		Delete
		pstmt = con.prepareStatement("delete from btm.student where id = ?");
		pstmt.setInt(1, 7);
		int i9 = pstmt.executeUpdate();
		
		System.out.println(i9 + " rows deleted");
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	finally {
		if(pstmt!=null) {
			try {
				pstmt.close();
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