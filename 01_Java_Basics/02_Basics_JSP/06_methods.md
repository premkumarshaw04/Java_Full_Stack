# Day 1

```java
class Program1
{
	static void test()
	{
		System.out.println("Executing test().....");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		test();//Method Calling
		System.out.println("Program Ends");
	}
}

//Output:
//Program Starts
//Executing test().....
//Program Ends
```

```java
class Program2
{
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		play();//Method Calling
		play();
		play();
		play();
		play();
		System.out.println("Program Ends");
	}
	
	//Once a method is created, it can be called N number of times.
	static void play()
	{
		System.out.println("Executing Play().......");
	}
}

//Output:
//Program Starts
//Executing Play().......
//Executing Play().......
//Executing Play().......
//Executing Play().......
//Executing Play().......
//Program Ends
```

```java
class Program3
{
	static void help()
	{
		System.out.println("Executing help().......");
	}
	static void disp()
	{
		System.out.println("Executing disp().......");
	}
	static void run()
	{
		System.out.println("Executing run().......");
	}
	public static void main(String[] args)
	{
		disp();
		help();
		run();
	}
}
//Output:
//Executing disp().......
//Executing help().......
//Executing run().......
```

```java
class Program4
{
	static void verify()
	{
		System.out.println("Java Full Stack");
		System.out.println("Mern Stack");
		
		int a = 12;
		if(a % 2 == 0)
		{
			System.out.println("DevOps");
		}
	}
	public static void main(String[] args)
	{
		verify();
	}
}
//Output:
//Java Full Stack
//Mern Stack
//DevOps
```

```java
class Program5
{
	static void test()
	{
		System.out.println("Test Starts");
		System.out.println("Test Ends");
	}
	static void disp()
	{
		System.out.println("Disp Starts");
		test();
		System.out.println("Disp Ends");
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		disp();
		System.out.println("Main Ends");
	}
}
//Output:
//Main Starts
//Disp Starts
//Test Starts
//Test Ends
//Disp Ends
//Main Ends
```

---

# Day 2

```java
class Program6
{
	static void test(int a)
	{
		System.out.println("Passed value: " + a);
	}
	public static void main(String[] args)
	{
		test(10);
	}
}

//Output:
//Passed value: 10
```

```java
class Program7
{
	static void help(double arg)
	{
		System.out.println("Value: " + arg);
	}
	public static void main(String[] args)
	{
		help(2.3);
		help(4.5);
		help(3.2);
	}
}

//Output:
//Value: 2.3
//Value: 4.5
//Value: 3.2
```

```java
class Program8
{
	static void addition(int a, int b)
	{
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
	public static void main(String[] args)
	{
		addition(10, 20);
		addition(12, 13);
		addition(10, 15);
	}
}

//Output:
//10 + 20 = 30
//12 + 13 = 25
//10 + 15 = 25
```

```java
class Program9
{
	static void display(int a, char c, double d, boolean b)
	{
		System.out.println("Integer: " + a);
		System.out.println("Character: " + c);
		System.out.println("Double: " + d);
		System.out.println("Boolean: " + b);
	}
	public static void main(String[] args)
	{
		display(10, 'A', 4.5, true);
	}
}

//Output:
//Integer: 10
//Character: A
//Double: 4.5
//Boolean: true
```

```java
class Program10
{
	static void play(long val;)
	{
		System.out.println("Value: " + val);
	}
	static void test(long val);
	{
		play(2509635894565L);
	}
	public static void main(String[] args)
	{
		test();
	}
}

//Output:
//Integer: 10
//Character: A
//Double: 4.5
//Boolean: true
```

```java
class Program11
{
	static int test(){
		return 25;
	}
	public static void main(String[] args)
	{
		int val = test();
		
		System.out.println("Returned value : " + val);
		
		System.out.println("Returned value : " + test());
		
	}
}
//Output:
//Returned value : 25
//Returned value : 25

```

```java
class Program12
{
	static char play(){
		return 'A';
	}
	static double help(){
		System.out.println("Value Returned: " + play());
		return 7.3;
	}
	public static void main(String[] args)
	{
		double val = help();
		System.out.println("Returned value : " + val);
	}
}
//Output:
//Value Returned: A
//Returned value : 7.3

```

```java
class Program13
{
	static boolean verify()
	{
		return true;
	}
	public static void main(String[] args)
	{
		boolean value = verify();
		System.out.println("Returned value : " + value);
		
		System.out.println("Returned value : " + verify());
	}
}
//Output:
//Returned value : true
//Returned value : true

```

--- 

# Day 3

```java
class Program14
{
	static double calculateInterest(double principle, int tenure, double rate)
	{
		double simpleInterest = (principle * tenure * rate) / 100;
		return simpleInterest;
	}
	public static void main(String[] args)
	{
		double result = calculateInterest(100000.0, 3, 11.5);
		System.out.println("Result : " +result);
		System.out.println("Result : " + calculateInterest(500000.0, 20, 7.5));
	}
}
//Output:
//Result : 34500.0
//Result : 750000.0
```

```java
class Program15
{
	static double generateElectricityBill(int units)
	{
		if(units <= 100){
			return 0.0;
		}
		else{
			double billAmount = units * 5.8;
			double gst = billAmount * 0.18;//18% GST
			double totalBill = billAmount + gst;
			return totalBill;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Pavan's House : " + generateElectricityBill(100));
		System.out.println("Girish's House : " + generateElectricityBill(500));
		
	}
}
//Output:
//Pavan's House : 0.0
//Girish's House : 3422.0
```

```java
class Program16
{
	static double calculateFare(int kilometers, char modeOfTransport)
	{
		double fare = 0.0;
		switch(modeOfTransport)
		{
			case 'C' : 
			fare = kilometers * 18;
			break;
			case 'A' :
			fare = kilometers * 12;
			break;
			case 'B' :
			fare = kilometers * 10;
			break;
		}
		double gst = fare * 0.18;
		double totalFare = fare + gst;
		return totalFare;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Total Fare : " + calculateFare(10, 'C'));
		System.out.println("Total Fare : " + calculateFare(13, 'A'));
		System.out.println("Total Fare : " + calculateFare(20, 'B'));
	}
}
//Output:
//Total Fare : 212.4
//Total Fare : 184.07999999999998
//Total Fare : 236.0

```

```java
class Program17
{
	static int square(int n){
		int sq = n*n;
		return sq;
	}
	public static void main(String[] args)
	{
		for(int a = 1;a <= 5;a++){
			System.out.println(a+" Square : " + square(a));
		}
	}
}
//Output:
//1 Square : 1
//2 Square : 4
//3 Square : 9
//4 Square : 16
//5 Square : 25
```

```java
class Factorial
{
	static int findFact(int n){
		int fact = 1;
		while(n > 1){
			fact = fact * n;
			n--;
		}
		return fact;
	}
	
	public static void main(String[] args)
	{
		for(int a = 1;a <= 5;a++){
			System.out.println(a+" Factorial : " + findFact(a));
		}
	}
}
//Output:
//1 Factorial : 1
//2 Factorial : 2
//3 Factorial : 6
//4 Factorial : 24
//5 Factorial : 120
```

```java
//1. Write a Java program to find all the prime numbers from 1 to 100 using methods.


```

```java
//2. Calculate Swiggy bill 
total amount < 250   => add delivery fees 30
total amount > 250   => delivery free

Add : 
GSt 18%
handling fee : 5rs
platfrom fee : 2rs
```
