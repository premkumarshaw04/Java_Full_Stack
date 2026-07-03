# Flow Of solving all the questions is Important, Solve one by one according to the flow.

```java
//all divisors of N

class FindDivisors
{
	public static void main(String[] args)
	{
		int num = 12;
		int a = 1;
		int b = num/2;
		
		while(a <= b){
			if(num % a == 0){
				System.out.print(a + " ");
			}
			a++;
		}
	}
}
//Output:
//1 2 3 4 6
```

```java
//Sum of all divisors of N

class SumOfDivisors
{
	public static void main(String[] args)
	{
		int num = 15;
		int a = 1;
		int b = num/2;
		int sum = 0;
		
		while(a <= b){
			if(num % a == 0){
				sum = sum + a;
			}
			a++;
		}
		System.out.println("Divisor Sum: " + sum);
	}
}
//Output:
//Divisor Sum: 9

```

```java
//Prefect Number
//ex of Perfect Number : 6, 28

class PerfectNumber
{
	public static void main(String[] args)
	{
		int num = 28;
		int a = 1;
		int b = num/2;
		int sum = 0;
		
		while(a <= b){
			if(num % a == 0){
				sum = sum + a;
			}
			a++;
		}
		
		if(sum == num){
			System.out.println("The given No " + num + " is a Perfect Number.");
		}
		else{
			System.out.println("The given No " + num + " is not a Perfect Number.");
		}
	}
}
//Output:
//The given No 28 is a Perfect Number.

```

```java

class CountDivisors
{
	public static void main(String[] args)
	{
		int num = 12;
		int a = 1;
		int b = num/2;
		int count = 0;
		
		while(a <= b){
			if(num % a == 0){
				count++;
			}
			a++;
		}
		System.out.println("Divisor Count : " + count);
	}
}
//Output:
//Divisor Count : 5

```

```java
//Prime Number:

class CheckPrime
{
	public static void main(String[] args)
	{
		int num = 7;
		int a = 1;
		int b = num/2;
		int count = 0;
		
		while(a <= b){
			if(num % a == 0){
				count++;
			}
			a++;
		}
		if(count == 1){
			System.out.println("The given number is a Prime no.");
		}
		else{
			System.out.println("The given number is not a Prime no.");
		}
	}
}
//Output:
//The given number is a Prime no.

```