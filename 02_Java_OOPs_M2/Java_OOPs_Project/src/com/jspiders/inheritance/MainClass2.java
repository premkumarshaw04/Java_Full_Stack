package com.jspiders.inheritance;

class Alpha{//Super Class 
	String str = "Java";
	void learn() {
		System.out.println("Learning: " + str);
	}
}

class Beta extends Alpha{//Sub Class
	
}

public class MainClass2 {
	public static void main(String[] args) {
		Beta obj = new Beta();
		obj.learn();
	}
}

//Output:
//Learning: Java