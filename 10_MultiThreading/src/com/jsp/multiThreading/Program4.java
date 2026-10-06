//We can assign the name and Priority by ourselves also.
package com.jsp.multiThreading;

class ExampleThread implements Runnable{
	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			Thread th = Thread.currentThread();
			System.out.println("Id: "+th.getId() +
					"| Name: " + th.getName() +
					"| Priority: " + th.getPriority());
		}
	}
}

public class Program4 {
	public static void main(String[] args) {
		ExampleThread et = new ExampleThread();
		Thread t1 = new Thread(et);
		t1.setName("jsp");
		t1.setPriority(10);
		Thread t2 = new Thread(et);
		t2.setName("qsp");
		t2.setPriority(1);
		t1.start();
		t2.start();
	}
}


//Output:
//Id: 21| Name: jsp| Priority: 10
//Id: 21| Name: jsp| Priority: 10
//Id: 21| Name: jsp| Priority: 10
//Id: 21| Name: jsp| Priority: 10
//Id: 21| Name: jsp| Priority: 10
//Id: 22| Name: qsp| Priority: 1
//Id: 22| Name: qsp| Priority: 1
//Id: 22| Name: qsp| Priority: 1
//Id: 22| Name: qsp| Priority: 1
//Id: 22| Name: qsp| Priority: 1