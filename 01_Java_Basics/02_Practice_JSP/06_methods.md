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
