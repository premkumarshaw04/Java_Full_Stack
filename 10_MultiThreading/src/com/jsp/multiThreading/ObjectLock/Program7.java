package com.jsp.multiThreading.ObjectLock;

public class Program7 {
	public static void main(String[] args) {
		ConsumerThread ct = new ConsumerThread();
		Thread t1 = new Thread(ct);
		t1.setName("thread-1");
		Thread t2 = new Thread(ct);
		t2.setName("thread-2");
		
		t1.start();
		t2.start();
		
	}
}

//Output
//1 thread-1
//2 thread-1
//3 thread-1
//4 thread-1
//5 thread-1
//a thread-1
//b thread-1
//c thread-1
//d thread-1
//e thread-1
//1 thread-2
//2 thread-2
//3 thread-2
//4 thread-2
//5 thread-2
//a thread-2
//b thread-2
//c thread-2
//d thread-2
//e thread-2
