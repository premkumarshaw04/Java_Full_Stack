package com.jsp.multiThreading;

public class Program5 {
	public static void main(String[] args) {
		System.out.println("Program Starts.....");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program Ends...");
	}
}
