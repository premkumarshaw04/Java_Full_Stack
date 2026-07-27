//Service Layer
package com.jspiders.passingAndReturning;

import java.util.Scanner;

public class Bank {
	static void displayAccountInfo(Account a) {
		if(a != null) {
			System.out.println("Account Number: " + a.accountNumber);
			System.out.println("Account Balance: " + a.accountBalance);
		}
	}
	
	static Account createAccount() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Account Number: ");
		long accountNumber = sc.nextLong();
		
		System.out.println("Enter Account Balance: ");
		double accountBalance = sc.nextDouble();

		Account a = new Account(accountNumber, accountBalance);
		return a;
	}
}

//MainClass3
