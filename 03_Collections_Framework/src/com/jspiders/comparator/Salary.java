package com.jspiders.comparator;

import java.util.Comparator;

public class Salary implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o1.salary - o2.salary);
	}
}

class Name implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}

class Company implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.company.compareTo(o2.company);
	}
}