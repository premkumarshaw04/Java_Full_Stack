package com.jsp.multiThreading.ObjectLock;

public class ConsumerThread implements Runnable{
	Resource res = new Resource();
	@Override
	public void run() {
		synchronized (res) {
			res.printNumbers();
			res.printAlpha();
		}
	}
}
