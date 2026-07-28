package com.jspiders.inheritance;
class AdobeFree{
	void read() {
		System.out.println("Read PDF Documents");
	}
}
class AdobePaid extends AdobeFree{
	void edit() {
		System.out.println("Edit PDF Documents");
	}
}
public class MainClass6 {
	public static void main(String[] args) {
		AdobeFree free = new AdobeFree();
		free.read();
		System.out.println("-----------------------");
		AdobePaid paid = new AdobePaid();
		paid.read();
		paid.edit();
	}
}

//Output:
//Read PDF Documents
//-----------------------
//Read PDF Documents
//Edit PDF Documents