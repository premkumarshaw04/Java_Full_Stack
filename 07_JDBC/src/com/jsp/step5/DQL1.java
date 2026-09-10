package com.jsp.step5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DQL1 {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306?user=root&password=prem@1234";
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet res = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url);
		pstmt = con.prepareStatement("select * from btm.student where id=?");
		pstmt.setInt(1, 2);
		res=pstmt.executeQuery();
		if(res.next()) {
			int sid=res.getInt(1);
			String sname = res.getString("name");
			double sm = res.getDouble(3);
			System.out.println(sid+"\t"+sname+"\t"+sm);
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}finally {
		if(res!=null) {
			try {
				res.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
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