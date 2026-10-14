//Approach 2: Suing TreeSet

package com.jspiders.comparator;

import java.util.TreeSet;

public class Question10a {
	public static void main(String[] args) {
		Employee e1 = new Employee("Rahul", "Wipro", 25000);
		Employee e2 = new Employee("Raj", "TCS", 35000);
		Employee e3 = new Employee("Prem", "Google", 45000);
		Employee e4 = new Employee("Ritesh", "EY", 55000);
		Employee e5 = new Employee("Suraj", "Amazon", 65000);
		
		TreeSet<Employee> t1 = new TreeSet<Employee>(new Salary());
//											   	 or new Company();
//	   	 										 or new Name();
//	   	 										 or new SalaryReverseOrder();
//	   											 or new CompanyReverseOrder();
//	   	 										 or new NameReverseOrder();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		
		for(Employee e: t1) {
			System.out.println(e);
		}
	}
}

//Output:
//Rahul Wipro 25000.0
//Raj TCS 35000.0
//Prem Google 45000.0
//Ritesh EY 55000.0
//Suraj Amazon 65000.0

