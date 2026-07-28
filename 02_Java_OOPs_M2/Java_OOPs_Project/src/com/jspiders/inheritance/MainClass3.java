//RULE 1: Inheritance is Uni-directional: Sub class can access properties of Super class, 
//but Super class can not access sub class properties.
package com.jspiders.inheritance;
class Delta{
	void play() {//Super Class
		System.out.println("Executing play().....");
	}
}

class Example extends Delta{//Sub Class
	void start() {
		System.out.println("Executing start().....");
	}
}
public class MainClass3 {
	public static void main(String[] args) {
		Example ex = new Example();
		ex.play();
		ex.start();
		System.out.println("---------------------");
		Delta ref = new Delta();//Super class
		ref.play();
		//ref.start(); //Super Class can not access Sub class properties
	}
}
//Output:
//Executing play().....
//Executing start().....
//---------------------
//Executing play().....
