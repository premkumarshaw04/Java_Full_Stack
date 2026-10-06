package com.jsp.multiThreading;

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Program Starts..........");
		for(int i = 0;i<5;i++) {
			Thread th = Thread.currentThread();
			System.out.println("Id: "+th.getId() + "| Name: " + th.getName() + "| Priority: " + th.getPriority());
		}
		System.out.println("Program Ends.........");
	}
}

//Output:

//Program Starts..........
//Id: 1| Name: main| Priority: 5
//Id: 1| Name: main| Priority: 5
//Id: 1| Name: main| Priority: 5
//Id: 1| Name: main| Priority: 5
//Id: 1| Name: main| Priority: 5
//Program Ends.........

