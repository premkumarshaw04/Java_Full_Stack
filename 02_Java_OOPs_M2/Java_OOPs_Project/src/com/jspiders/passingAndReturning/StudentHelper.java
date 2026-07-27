//Service Layer Program 
////Service Layer Program : Whenever we deal with multiple objects it is always recommended to use Service Layer Program.
/// // It is also called as utility method 
package com.jspiders.passingAndReturning;

import java.util.Scanner;

public class StudentHelper {
	static void displayStudentDetails(Student s) {
		if(s != null) {
			System.out.println("ID: " + s.id);
			System.out.println("CGPA: " + s.cgpa);
		}
	}
	
	static Student createStudent() { //Here Student object is the return type of this function
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("Enter CGPA: ");
		double cgpa = sc.nextDouble();
		Student s = new Student(id, cgpa);
		return s;
	}
}

//MainClass1
