//Question8 : Create a class employee, define attributes: name, company, salary, initialize using
//constructor, store them in an arrayList.
//i. print the attributes using for loop.
//ii. Also sort in alphabetical Order based on name.


package com.jspiders.intervieQuestions;

public class Employee implements Comparable<Employee>{
	String name;
	String company;
	double salary;
	Employee(String name, String company, double salary){
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name + " " + company + " " + salary;
	}
	
	@Override 
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
}
