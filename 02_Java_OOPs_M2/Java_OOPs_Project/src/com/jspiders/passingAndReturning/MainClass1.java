package com.jspiders.passingAndReturning;

public class MainClass1 {
	public static void main(String[] args) {
		Student s1 = StudentHelper.createStudent();
		StudentHelper.displayStudentDetails(s1);
		System.out.println("----------------------");
		Student s2 = StudentHelper.createStudent();
		StudentHelper.displayStudentDetails(s2);
		System.out.println("----------------------");
		Student s3 = StudentHelper.createStudent();
		StudentHelper.displayStudentDetails(s3);
	}
}
//Output:
//Enter Id: 
//101
//Enter CGPA: 
//9.5
//ID: 101
//CGPA: 9.5
//----------------------
//Enter Id: 
//102
//Enter CGPA: 
//8.5
//ID: 102
//CGPA: 8.5
//----------------------
//Enter Id: 
//103
//Enter CGPA: 
//8.9
//ID: 103
//CGPA: 8.9
