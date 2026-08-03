package com.jspiders.typecasting;

public class Employee {
	String name, company;
	double salary;
	Employee(String name, String company, double salary){
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	void display() {
		System.out.println(name+" "+ company +" "+salary);
	}
}
