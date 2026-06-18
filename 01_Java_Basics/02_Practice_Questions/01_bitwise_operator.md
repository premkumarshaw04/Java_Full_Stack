# Codes On Bitwise Operators

## 1. Bitwise AND(), Bitwise OR(), Bitwise XOR()

```java
class Program1
{
	public static void main(String[] args)
	{
		int a = 13;
		int b = 11;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
	}
}

//Save the file as Program1.java (file name should be same as Class name.)
//To run this program, two steps:
// javac Program1.java
// java Program1

//Output:
// 9
// 15
// 6

```

```java
class Program2
{
	public static void main(String[] args)
	{
		int p = 21;
		int q = 25;
		System.out.println(p & q);
		System.out.println(p | q);
		System.out.println(p ^ q);
	}
}

//Output:
// 17
// 29
// 12
```

```java
class Program3
{
	public static void main(String[] args)
	{
		int i = 45;
		int j = 52;
		
		System.out.println(i & j);
		System.out.println(i | j);
		System.out.println(i ^ j);
		
	}
}

//Output:
// 36
// 61
// 25
```

```java
class Program4
{
	public static void main(String[] args)
	{
		int x = 27;
		int y = 13;
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
	}
}

//Output:
// 9
// 31
// 22
```

## 2. Left Shift Operator **(<<)**

```java
class Program5
{
	public static void main(String[] args)
	{
		int a = 11;
		int b = 21;
		int c = 17;
		int d = 10;
		System.out.println(a << 1);//Left Shift By 1
		System.out.println(b << 1);
		System.out.println(c << 1);
		System.out.println(d << 2);//Left Shift By 2
	}
}

//Output:
// 22
// 42
// 34
// 40
```

## 3. Right Shift Operator **(>>)**

```java
class Program6
{
	public static void main(String[] args)
	{	
		//Right Shift
		int x = 21;
		int p = 45;
		int q = 143;
		System.out.println(x >> 1);//10 ////Right Shift by 1
		System.out.println(x >> 2);//5
		System.out.println(p >> 2);//11
		System.out.println(q >> 3);//17  //Right Shift by 3
	}
}

//Output:
// 10
// 5
// 11
// 17
```