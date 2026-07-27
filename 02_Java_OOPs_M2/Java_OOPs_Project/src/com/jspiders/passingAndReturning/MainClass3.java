package com.jspiders.passingAndReturning;

public class MainClass3 {
	public static void main(String[] args) {
		Account a1 = Bank.createAccount();
		Bank.displayAccountInfo(a1);
		System.out.println("-------------------");
		Account a2 = Bank.createAccount();
		Bank.displayAccountInfo(a2);
		System.out.println("-------------------");
		Account a3 = Bank.createAccount();
		Bank.displayAccountInfo(a3);
	}
}
//Output:
//Enter Account Number: 
//565887894556
//Enter Account Balance: 
//222000
//Account Number: 565887894556
//Account Balance: 222000.0
//-------------------
//Enter Account Number: 
//45554477888
//Enter Account Balance: 
//120000
//Account Number: 45554477888
//Account Balance: 120000.0
//-------------------
//Enter Account Number: 
//558997894556
//Enter Account Balance: 
//45000
//Account Number: 558997894556
//Account Balance: 45000.0
