package com.jsp.multiThreading.ObjectLock;

public class Resource {
	void printNumbers() {
		for(int i = 1;i<=5;i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
	
	void printAlpha() {
		for(char i = 'a';i<='e';i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}
