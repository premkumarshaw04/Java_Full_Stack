//Step 1: Load and Register Driver

package com.jsp.step1;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded And Registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
