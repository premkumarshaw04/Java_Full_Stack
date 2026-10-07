package com.jsp.multiThreading.ClassLevelLock;

public class ConsumerThread implements Runnable{
	@Override
	public void run() {
		synchronized (Resource.class) { //Class level Lock
			Resource.printNumbers();
			Resource.printAlpha();
		}
	}
}
