package com.jspiders.inheritance;
class Watch{
	void time() {
		System.out.println("Showing Time...");
	}
	void date() {
		System.out.println("Showing Date...");
	}
}
class SmartWatch extends Watch{
	void notification() {
		System.out.println("Showing Notification...");
	}
}
public class MainClass7 {
	public static void main(String[] args) {
		SmartWatch sw = new SmartWatch();
		sw.time();
		sw.date();
		sw.notification();
	}
}
//Output
//Showing Time...
//Showing Date...
//Showing Notification...
