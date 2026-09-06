package com.jsp.demo;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded And Registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
