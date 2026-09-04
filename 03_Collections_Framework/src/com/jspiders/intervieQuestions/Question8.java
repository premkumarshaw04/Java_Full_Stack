//Question8 : Create a class employee, define attributes: name, company, salary, initialize using
//constructor, store them in an arrayList.
//i. print the attributes using for loop.
//ii. Also sort in alphabetical Order based on name.

package com.jspiders.intervieQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", "Wipro", 25000);
		Employee e2 = new Employee("Raj", "TCS", 35000);
		Employee e3 = new Employee("Prem", "Google", 45000);
		Employee e4 = new Employee("Ritesh", "EY", 55000);
		Employee e5 = new Employee("Suraj", "Amazon", 65000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		Collections.sort(al);
		
		for(Employee e: al) {
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
