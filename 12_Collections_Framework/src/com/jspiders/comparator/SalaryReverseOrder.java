
package com.jspiders.comparator;

import java.util.Comparator;

public class SalaryReverseOrder implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int)(o2.salary - o1.salary);
	}
}

class NameReverseOrder implements Comparator<Employee>{
	@Override 
	public int compare(Employee o1, Employee o2) {
		return o2.name.compareTo(o1.name);
	}
}
class companyReverseOrder implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.company.compareTo(o1.company);
	}
}
