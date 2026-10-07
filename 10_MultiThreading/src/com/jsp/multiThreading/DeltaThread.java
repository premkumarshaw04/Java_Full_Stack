package com.jsp.multiThreading;

public class DeltaThread implements Runnable{

	@Override
	public void run() {
		test();
	}

	synchronized void test() {
		for(int a = 1;a<=5;a++) {
			Thread th = Thread.currentThread();
			System.out.println("Name: " + th.getName());
		}
	}
}
