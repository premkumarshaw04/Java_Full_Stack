//------------------Inheritance || Is-A relation-----------------

//Note: First Create MainClass always.------------

package com.jspiders.inheritance;

class Demo{ //Super Class | Base Class | Parent Class
	int val = 10;
	void test() {
		System.out.println("Executing test(...)");
	}
}

class Sample extends Demo{ //Sub class | Derived Class | Child class
	
}

public class MainClass1 {
	public static void main(String[] args) {
		Sample ref = new Sample();
		System.out.println(ref.val);
		ref.test();
	}
}
//output:
//10
//Executing test(...)
