//Question8 : Create a class employee, define attributes: name, company, salary, initialize using
//constructor, store them in an arrayList.
//i. print the attributes using for loop.
//ii. Also sort in alphabetical Order based on name.

//Second Approach : Using TreeSet
package com.jspiders.intervieQuestions;

import java.util.*;
public class Question8a {
	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", "Wipro", 25000);
		Employee e2 = new Employee("Raj", "TCS", 35000);
		Employee e3 = new Employee("Prem", "Google", 45000);
		Employee e4 = new Employee("Ritesh", "EY", 55000);
		Employee e5 = new Employee("Suraj", "Amazon", 65000);
		
		TreeSet<Employee> t1 = new TreeSet<Employee>();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		for(Employee e : t1) {
			System.out.println(e);
		}
	}
}
//Output:
//Prem Google 45000.0
//Rahul Wipro 25000.0
//Raj TCS 35000.0
//Ritesh EY 55000.0
//Suraj Amazon 65000.0