package com.jspiders.typecasting;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raj", "TCS", 45000);
		Employee e2 = new Employee("Rahul", "Wipro", 32000);
		Employee e3 = new Employee("Krishna", "TCS", 38000);
		Employee e4 = new Employee("Ramesh", "Infosys", 55000);
		Employee e5 = new Employee("Rohit", "Infosys", 42000);
		Employee emp[] = {e1, e2, e3, e4, e5};
		
		for (int i = 0;i<emp.length;i++) {
			System.out.println(emp[i].name+" "+emp[i].company+" "+emp[i].salary);
		}
		
		System.out.println("-----------------Earning more than 45000--------------");
		for (int i = 0;i<emp.length;i++) {
			if(emp[i].salary >= 45000) {
				emp[i].display();
			}
		}
		
		System.out.println("-----------------Employee from Infosys--------------");
		for (int i = 0;i<emp.length;i++) {
			if(emp[i].company.equalsIgnoreCase("Infosys")) {
				emp[i].display();
			}
		}
		
		System.out.println("Employee from TCS earning b/w 30000 - 50000");
		for (int i = 0;i<emp.length;i++) {
			if((emp[i].company.equalsIgnoreCase("TCS")) 
					&& (emp[i].salary >= 30000 && emp[i].salary<50000)) {
				emp[i].display();
			}
		}
	}
}
