package com.jsp.multiThreading;

public class Program6 {
	public static void main(String[] args) {
		DeltaThread dt = new DeltaThread();
		Thread t1 = new Thread(dt);
		Thread t2 = new Thread(dt);
		t1.start();
		t2.start();
	}
}
