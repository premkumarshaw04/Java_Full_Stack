# Patterns

## 1. Patterns based on Square
```java
class Square1
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				System.out.print('*'+" ");
			}
			System.out.println();
		}
	}
}
//commands to run java file:
//javac Square1.java
//java Square1

//Output:
//* * * * *
//* * * * *
//* * * * *
//* * * * *
//* * * * *

```

```java
class Square2
{
	public static void main(String[] args)
	{
		int n = 5;
		int val = 1;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
			}
			System.out.println();
			val++;
		}
	}
}

//Output:
//1 1 1 1 1
//2 2 2 2 2
//3 3 3 3 3
//4 4 4 4 4
//5 5 5 5 5
```

```java
class Square3
{
	public static void main(String[] args)
	{
		int n = 5;
		char val = 'a';
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
			}
			System.out.println();
			val++;
		}
	}
}

//Output:
//a a a a a
//b b b b b
//c c c c c
//d d d d d
//e e e e e
```

```java
class Square4
{
	public static void main(String[] args)
	{
		int n = 5;
		int val = 5;
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
			}
			System.out.println();
			val--;
		}
	}
}

//Output:
//5 5 5 5 5
//4 4 4 4 4
//3 3 3 3 3 
//2 2 2 2 2 
//1 1 1 1 1
```

```java
class Square5 //Important
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i<n; i++){
			int val = 1;
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}
}

//Output:
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
//1 2 3 4 5
```

```java
class Square6
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i<n; i++){
			char val = 'a';
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}
}

//Output:
//a b c d e
//a b c d e
//a b c d e
//a b c d e
//a b c d e
```

```java
class Square7
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i<n; i++){
			int val = 5;
			for(int j = 0; j<n; j++){
				System.out.print(val + " ");
				val--;
			}
			System.out.println();
		}
	}
}

//Output:
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1
//5 4 3 2 1
```

```java
//ROW specific swapping

//This is also called as Sandwitch Program
class Square8
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i<n; i++){
			for(int j = 0;j<n;j++){
				if(i % 2 == 0){
					System.out.print(1 + " ");
				}
				else{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

//Output:
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1
//0 0 0 0 0
//1 1 1 1 1

//Logic:
//whenever the value of i is even then we have to print 1
//and when the value of i is odd then we have to print 0
```

```java
//COLUMN specific swapping

//This is also called as Sandwitch Program
class Square9
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i = 0; i<n; i++){
			for(int j = 0;j<n;j++){
				if(j % 2 == 0){
					System.out.print(1 + " ");
				}
				else{
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}

//Output:
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1

//Logic:
//whenever the value of j is even then we have to print 1
//and when the value of j is odd then we have to print 0
```

```java
//Homework: 

//Output:
//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
//0 1 0 1 0
//1 0 1 0 1
```
---

# Day 2 Of Pattern Printing:

