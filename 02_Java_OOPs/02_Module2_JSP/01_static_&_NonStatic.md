# Static and Non Static Methods

## Static Members

```java
//Static Members
class Demo
{
	static int a = 100;
	static void test(){
		System.out.println("Executing test()");
	}
}

public class MainClass1
{
	public static void main(String[] args)
	{
		System.out.println(Demo.a);
		Demo.test();
	}
}
//Output:
//100
//Executing test()
```

```java
//Static Members
class Sample
{
	static int x = 25;
	static double y = 7.3;
	static void play(){
		System.out.println("Executing play()");
	}
	static void disp(){
		System.out.println("Executing disp()");
	}
}
public class MainClass2
{
	public static void main(String[] args)
	{
		System.out.println(Sample.x);
		System.out.println(Sample.y);
		Sample.play();
		Sample.disp();
	}
}
//Output
//25
//7.3
//Executing play()
//Executing disp()
```

```java
//Static Members
class Alpha
{
	static char p = 'A';
	static boolean q = true;
	
	static void help(){
		System.out.println("Executing help()....");
	}
	static void send(){
		System.out.println("Executing send()....");
	}
}
public class MainClass3
{
	public static void main(String[] args)
	{
		System.out.println(Alpha.p);
		System.out.println(Alpha.q);
		Alpha.help();
		Alpha.send();
	}
}
//Output
//A
//true
//Executing help()....
//Executing send()....

```

## Non Static Members

```java
//Non Static Members
class Beta
{
	int x = 500;
	void test()
	{
		System.out.println("Executing test()...");
	}
}
public class MainClass4
{
	public static void main(String[] args)
	{
		System.out.println(new Beta().x);
		new Beta().test();
	}
}
//Output
//500
//Executing test()...

```

```java
//Non Static Members
class Delta
{
	char a = 'J';
	long b = 865645854565L;
	void play()
	{
		System.out.println("Executing play()...");
	}
	void start()
	{
		System.out.println("Executing start()...");
	}
}
public class MainClass5
{
	public static void main(String[] args)
	{
		Delta ref = new Delta();
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.play();
		ref.start();
	}
}
//Output
//J
//865645854565
//Executing play()...
//Executing start()...


```

```java
//Non Static Members
class Example
{
	String p = "Prem";
	int q = 17;
	void verify()
	{
		System.out.println("Executing verify()...");
	}
	void help()
	{
		System.out.println("Executing help()...");
	}
}
public class MainClass6
{
	public static void main(String[] args)
	{
		Example ref = new Example();
		System.out.println(ref.p);
		System.out.println(ref.q);
		ref.verify();
		ref.help();
	}
}
//Output
//Prem
//17
//Executing verify()...
//Executing help()...

```
