package com.jsp.multiThreading.ClassLevelLock;

public class Resource {
	static void printNumbers() {
		for(int i = 1;i<=5;i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
	
	static void printAlpha() {
		for(char i = 'a';i<='e';i++) {
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}
}
