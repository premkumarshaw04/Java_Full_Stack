# Control Statements

```
Java provides the following control statements:
1. If Statements
2. Switch Statments
3. For loop
4. While loop
```

# 1. If Statements:

## Version 1 [Simple If Statement]

```java
class Program1
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		if(true)
		{
			System.out.println("Developer");
		}
		
		System.out.println("Program Ends");
	}
}
```

```java
class Program2
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		if(false)
		{
			System.out.println("Developer");
		}
		
		System.out.println("Program Ends");
	}
}

//Steps to run the program in cmd
//javac Program2.java
//java Program2

//Output:
//Program Starts
//Program Ends
```

```java
class Program3
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		int num = 7;
		if(num < 10)
		{
			System.out.println("Java Full Stack");
			System.out.println("Mern Stack");
			System.out.println("Python Stack");
		}
		
		System.out.println("Program Ends");
	}
}

//Output:
//Program Starts
//Java Full Stack
//Mern Stack
//Python Stack
//Program Ends
```

```java
class Program4
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		int num = 11;
		if(num < 10)
		{
			System.out.println("Java Full Stack");
			System.out.println("Mern Stack");
			System.out.println("Python Stack");
		}
		
		System.out.println("Program Ends");
	}
}

//Output:
//Program Starts
//Program Ends
```

```java
class Program5
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		int val = 7;
		if(val > 5 && val < 10)
		{
			System.out.println("Jspiders BTM");
		}
		
		System.out.println("Program Ends");
	}
}

//Output:
//Program Starts
//Jspiders BTM
//Program Ends
```

```java
class Program6
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		
		int val = 11;
		if(val > 5 && val < 10) //Condition fails here
		{
			System.out.println("Jspiders BTM");
		}
		
		System.out.println("Program Ends");
	}
}

//Output:
//Program Starts
//Program Ends
```

```java
class Program7
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
	
		int n = 10;
		if(n%2 == 0 || n%5 == 0)
		{
			System.out.println("Royal Chalangers Bengalore");
		}
		
		System.out.println("Program Ends");
	}
}

//Output
//Program Starts
//Royal Chalangers Bengalore
//Program Ends
```

## Version 2 [If Else Statement]

```java
class Program8
{
	public static void main(String[] args)
	{
		if(false){
			System.out.println("Development");
		}
		else{
			System.out.println("Testing");
		}
	}
}

//Output:
//Testing
```

```java
class Program9
{
	public static void main(String[] args)
	{
		int n = 12;
		if(n%2 == 0){
			System.out.println(n + " is an Even number.");
		}
		else{
			System.out.println(n + " is an Odd Number.");
		}
	}
}

//Output:
//12 is an Even number.
```

```java
class Program10
{
	public static void main(String[] args)
	{
		int age = 5;
		
		if(age >= 18)
		{
			System.out.println("Major");
		}
		else
		{
			System.out.println("Minor");
		}
	}
}

//Output:
//Minor
```

```java
class Program11
{
	public static void main(String[] args)
	{
		double accBal = 10000.0;
		int amt = 13000; //Amount
		
		if(amt <= accBal)
		{
			System.out.println("Withdrwal Success");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
}

//Output:
//Insufficient Balance
```

## Version 3 [If Else-If Statements]

```java
class Program1
{
	public static void main(String[] args)
	{
		int num = 9;
		if(num < 7)
		{
			System.out.println("Java Full Stack");
		}
		else if(num == 7)
		{
			System.out.println("MERN Stack");
		}
		else
		{
			System.out.println("DevOps");
		}
	}
}

//Output
//DevOps
```

```java
class Program2
{
	public static void main(String[] args)
	{
		int a = 17;
		if(a%2 == 0 && a%3 == 0){
			System.out.println("Bangalore");
		}
		else if(a%2 == 0){
			System.out.println("Chennai");
		}
		else if(a%3 == 0){
			System.out.println("Haiderabad");
		}
		else{
			System.out.println("Kochi");
		}
	}
}

//Output:
//Kochi
```

```java
//Bus Ticket System
class Program3
{
	public static void main(String[] args)
	{
		int age = 8;
		
		if(age <= 3){
			System.out.println("Free");
		}
		else if(age > 3 && age <= 10){
			System.out.println("Half Ticket");
		}
		else if(age > 10 && age <= 60){
			System.out.println("Full Ticket");
		}
		else{
			System.out.println("Seniour Citizen");
		}
	}
}

//Output:
//Half Ticket
```

```java
class Program4
{
	public static void main(String[] args){
		double percentage = 25;
		
		if(percentage >= 90){
			System.out.println("Distinction");
		}
		else if(percentage >= 75 && percentage < 90){
			System.out.println("First");
		}
		else if(percentage >= 60 && percentage < 75){
			System.out.println("Second");
		}
		else if(percentage >= 35 && percentage < 60){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
}

//Output:
//Fail
```

```java
class Program5
{
	public static void main(String[] args)
	{
		char ch = 'D';
		
		if(ch >= 'A' && ch <= 'Z'){
			System.out.println("Uppercase");
		}
		else if(ch >= 'a' && ch <= 'z'){
			System.out.println("Lowercase");
		}
		else if(ch >= '0' && ch <= '9'){
			System.out.println("Number");
		}
		else{
			System.out.println("Special Character");
		}
	}
}

//Output 
//Uppercase
```

## Version 4 [Nested-If Statements]

```java
class Program6
{
	public static void main(String[] args)
	{
		int n = 13;
		
		if(n%2 == 0){
			if(n < 10){
				System.out.println("Panipuri");
			}
			else{
				System.out.println("Bhelpuri");
			}
		}
		else{
			if(n < 10){
				System.out.println("Masalapuri");
			}
			else{
				System.out.println("Sevpuri");
			}
		}
	}
}
//Output
//Sevpuri
```

```java
//ATM Software
class Program7
{
	public static void main(String[] args)
	{
		double accBal = 10000.0;
		int amt = 130; //amt stands fro amount
		
		if(amt <= accBal){
			if(amt % 100 == 0){
				System.out.println("Withdrwal Success");
			}
			else{
				System.out.println("Invalid Denomination");
			}
		}
		else{
			System.out.println("Insufficient Balance");
		}
	}
}

//Output 
//Invalid Denomination
```

```java
class Program8
{
	public static void main(String[] args)
	{
		char gender = 'M';
		int age = 20;
		
		if(gender == 'M'){
			if(age >= 21){
				System.out.println("Eligible Bachelor");
			}
			else{
				System.out.println("Boy Underage");
			}
		}
		else if(gender == 'F'){
			if(age >= 18){
				System.out.println("Eligible Spinster");
			}
			else{
				System.out.println("Girl Underage");
			}
		}
		else{
			System.out.println("Invalid Gender");
		}
	}
}

//Output
//Boy Underage
```

# 2. Switch Statments

```java
class Program1
{
	public static void main(String[] args)
	{
		int choice = 3;
		switch(choice)
		{
			case 1 : System.out.println("COD");
			break;
			case 2 : System.out.println("CARD");
			break;
			case 3 : System.out.println("UPI");
			break;
			case 4 : System.out.println("NETBANKING");
			break;
			default : System.out.println("INVALID");
		}
	}
}

//Output:
//UPI
```

```java
class Program2
{
	public static void main(String[] args)
	{
		int option = 3;
		switch(option)
		{
			case 1 : System.out.println("English");
			break;
			case 2 : System.out.println("Kannada");
			break;
			case 3 : System.out.println("Hindi");
			break;
			
			default : System.out.println("Invalid Selection");
		}
	}
}
//Output:
//Hindi
```

```java
class Program3
{
	public static void main(String[] args)
	{
		int choice = 5;
		switch(choice)
		{
			case 1 : System.out.println("Cash Withdrawl");
			break;
			case 2 : System.out.println("Balance Enquiry");
			break;
			case 3 : System.out.println("PIN Change");
			break;
			case 4 : System.out.println("Mini Statement");
			break;
			
			default : System.out.println("Invalid Choice");
		}
	}	
}
//Output:
//Invalid Choice
```

```java
class Program4
{
	public static void main(String[] args)
	{
		int choice = 4;
		
		switch(choice)
		{
			case 1 : System.out.println("Excellent");
			break;
			case 2 : System.out.println("Good");
			break;
			case 3 : System.out.println("Average");
			break;
			case 4 : System.out.println("Poor");
			break;
			
			default : System.out.println("Skip");
		}
	}
}

//Output:
//Poor
```

```java
class Program5
{
	public static void main(String[] args)
	{
		char choice = 'A';
		
		//char choice = 'a'; //Error : Because Java is case sensitive language 
		
		switch(choice)
		{
			case 'A' : System.out.println("Apple");
			break;
			case 'B' : System.out.println("Ball");
			break;
			case 'C' : System.out.println("Cat");
			break;
			case 'D' : System.out.println("Dog");
			break;
			case 'E' : System.out.println("Elephant");
			break;
			case 'F' : System.out.println("Fox");
			break;
			
			default : System.out.println("Under Development");
		}
	}
}

//Output:
//A : Apple

//a : Under Development

```

```java
class Program6
{
	public static void main(String[] args)
	{
		int amount = 20;
		switch(amount)
		{
			case 30 : System.out.println("Frooti");
			break;
			case 40 : System.out.println("Dairy Milk");
			break;
			case 10 : System.out.println("Lays");
			break;
			case 20 : System.out.println("Biscuit");
			break;
			
			default : System.out.println("No Product Found");
		}
	}
}

//Output:
//Biscuit
```
---

# 3. For loop

```java
class Program1
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++){
			System.out.println("Java");
		}
	}
}
//Output:
//Java
//Java
//Java
//Java
//Java
```

```java
class Program2
{
	public static void main(String[] args)
	{
		for(int i = 5; i>=1; i--){
			System.out.println("JSpiders");
		}
	}
}
//Output:
//JSpiders
//JSpiders
//JSpiders
//JSpiders
//JSpiders
```

```java
class Program3
{
	public static void main(String[] args)
	{
		for(int i = 1; i<=10; i = i + 2){
			System.out.println("Bangalore");
		}
	}
}
//Output:
//Bangalore
//Bangalore
//Bangalore
//Bangalore
//Bangalore
```

```java
class Program4
{
	public static void main(String[] args)
	{
		for(int p = 10; p > 0; p = p - 3){
			System.out.println("Biryani");
		}
	}
}

//Output:
//Biryani
//Biryani
//Biryani
//Biryani
```

```java
class Program5
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i < n; i++){
			System.out.println("*");
		}
	}
}

//Output:+
//*
//*
//*
//*
//*
```

```java
class Program6
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i < n; i++){
			System.out.print("*" + " ");//Recommended way to add space
			//System.out.print("* ");//we can do like this also, but follow the recommended way
		}
	}
}

//Output:
//* * * * *
```

```java
class Program7
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				System.out.print(1 + " ");
			}
			else{
				System.out.print(0 + " ");
			}
		}
	}
}

//Output:
//1 0 1 0 1
```

```java
class Program8
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				System.out.print('a' + " ");
			}
			else{
				System.out.print('b' + " ");
			}
		}
	}
}

//Output:
//a b a b a
```

```java
class Program9
{
	public static void main(String[] args)
	{
		int n = 5;
		int val = 1;
		
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				System.out.print(val + " ");
				val++;
			}
			else{
				System.out.print('*' + " ");
			}
		}
	}
}

//Output:
//1 * 2 * 3
```

```java
class Program10
{
	public static void main(String[] args)
	{
		int n = 5;
		char val = 'a';
		
		for(int i = 0; i < n; i++){
			if(i % 2 == 0){
				System.out.print(val + " ");
				val++;
			}
			else{
				System.out.print('*' + " ");
			}
		}
	}
}

//Output:
//a * b * c
```

```java
class Homework
{
	public static void main(String[] args)
	{
		int n = 5;
		int val = 1;
		for(int i = 0;i<n;i++){
			System.out.print(val +" ");
			if(i < n/2){
				val++;
			}
			else{
				val--;
			}
		}
	}
}
//Output:
//1 2 3 2 1
```

---

# 4. While loop

```java
class Program1
{
	public static void main(String[] args)
	{
		int a = 1;
		while(a <= 5){
			System.out.println("Java");
			a++;
		}
	}
}
//Output:
//Java
//Java
//Java
//Java
//Java

```

```java
class Program2
{
	public static void main(String[] args)
	{
		int x = 5;
		while(x >= 1){
			System.out.println("JSpiders");
			x--;
		}
	}
}
//Output
//JSpiders
//JSpiders
//JSpiders
//JSpiders
//JSpiders

```

```java
class Program3
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 5;
		while(x <= y){
			System.out.println(x);
			x++;
		}
	}
}
//Output
//1
//2
//3
//4
//5

```

```java
class Program4
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 1;
		while(x >= y){
			System.out.println(x);
			x--;
		}
	}
}
//Output
//5
//4
//3
//2
//1

```

```java
//Program to eritr even numbers
class Program5
{
	public static void main(String[] args)
	{
		int x = 1;
		int y = 10;
		while(x <= y){
		
			if(x % 2 == 0){
				System.out.println(x);
				//x++;//don't write x++ here, it will go in infite loop.
			}
			x++;//Now it will work properly.
		}
	}
}
//Output
//2
//4
//6
//8
//10

```

```java
//Program to print odd numbers
class Program6
{
	public static void main(String[] args)
	{
		int x = 10;
		int y = 1;
		while(x >= y){
		
			if(x % 2 != 0){
				System.out.println(x);
				//x--;//don't write x++ here, it will go in infite loop.
			}
			x--;//Now it will work properly.
		}
	}
}
//Output
//9
//7
//5
//3
//1


```

```java
//Find the sum of digits in the given range.

class Program7
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 10;
		int sum = 0;
		
		while(a <= b){
			sum = sum + a;
			a++;
		}
		System.out.println(sum);
	}
}

//Output:
//15
```

```java
//Find the sum of all even digits in the given range.

class Program8
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 10;
		int sum = 0;
		
		while(a <= b){
			if(a % 2 == 0){
				sum = sum + a;
				//a++; //Dont write here
			}
			a++;
		}
		System.out.println(sum);
	}
}

//Output:
//30
```

```java
//Find the sum of all odd digits in the given range.

class Program9
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 10;
		int sum = 0;
		
		while(a <= b){
			if(a % 2 != 0){
				sum = sum + a;
				//a++; //Dont write here
			}
			a++;
		}
		System.out.println(sum);
	}
}

//Output:
//25
```

```java
//Table of 5

class Program10
{
	public static void main(String[] args)
	{
		int num = 5;
		int a = 1;
		int b = 10;
		
		while(a <= b){
			int product = num*a;
			System.out.println(num + " * " + a + " = " + product);
			a++;
		}
	}
}

//Output:
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50
```

```java
//Java Program to find Factorial Of a number.

class Factorial
{
	public static void main(String[] args)
	{
		int n = 5;
		int fact = 1;
		while( n >= 1){
			fact = fact * n;
			n--;
		}
		System.out.println("Factorial : " + fact);
	}
}

//Output:
//Factorial : 120
```
