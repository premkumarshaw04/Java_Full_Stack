# Codes Based On Unary Operators:

>Java Provides the following two Unary Operators:  
>i. **++** (Increment Operator)  
>ii. **--** (Decrement Operator)

>Increment and Decrement Operation must be done in two ways:  
>i. Post Operation  
>ii. Pre Operation

```
NOTE: 
Order of Execution of a program:
Top to Bottom
left to right
```

## Codes based on Post Operation:

```java
class Program1
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println(a++);
		System.out.println(a);
		
		int b = 9;
		System.out.println(b++);
		System.out.println(b);
	}
}
//Output:
//5
//6
//9
//10
```

```java
class Program2
{
	public static void main(String[] args)
	{
		int p = 17;
		System.out.println(p++);//17
		System.out.println(p++);//18
		System.out.println(p);//19
		
		System.out.println();
		
		int q = 19;
		System.out.println(q--);//19
		System.out.println(q--);//18
		System.out.println(q);//17
	}
}
//Output: 
//17
//18
//19

//19
//18
//17
```

```java
class Program3
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = a++ + a++; 
		System.out.println(b);//21
		
		int c = 15;
		int d = c-- + c--;
		System.out.println(d);//29
		
		int p = 12;
		int q = p++ + p++ + p++;
		System.out.println(q);//39
		
		int r = 18;
		int s = r-- + r-- + r--;
		System.out.println(s);//51
	}
}
```

## Codes based on Pre Operation:

```java
class Program4
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println(++a);//6
		System.out.println(a);//6
		
		int b = 8;
		System.out.println(--b);//7
		System.out.println(b);//7
	}
}

//Output:
//6
//6
//7
//7
```

```java
class Program5
{
	public static void main(String[] args)
	{
		int x = 17;
		System.out.println(++x);//18
		System.out.println(++x);//19
		System.out.println(x);//19
		
		int y = 14;
		System.out.println(--y);//13
		System.out.println(--y);//12
		System.out.println(y);//12
	}
}
```

```java

class Program6
{
	public static void main(String[] args)
	{
		int a = 16;
		int b = ++a + ++a;
		System.out.println(b);//35
		
		int c = 11;
		int d = --c + --c;
		System.out.println(d);//19
		
		int p = 23;
		int q = ++p + ++p + ++p;
		System.out.println(q);//75
		
		int r = 25;
		int s = --r + --r + --r;
		System.out.println(s);//69
	}
}
```