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