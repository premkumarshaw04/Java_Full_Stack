> Day 1

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

> Day 2
