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