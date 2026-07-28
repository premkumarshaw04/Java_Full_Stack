package com.jspiders.inheritance;

class Whatsapp1{
	void message() {
		System.out.println("Message in whatsapp");
	}
}
class Whatsapp2 extends Whatsapp1{
	void call() {
		System.out.println("Call in whatsapp");
	}
}
class Whatsapp3 extends Whatsapp2{
	void status() {
		System.out.println("Status in whatsapp");
	}
}
public class MainClass5 {
	public static void main(String[] args) {
		Whatsapp3 ref = new Whatsapp3();
		ref.message();
		ref.call();
		ref.status();
	}
}
//Output:
//Message in whatsapp
//Call in whatsapp
//Status in whatsapp