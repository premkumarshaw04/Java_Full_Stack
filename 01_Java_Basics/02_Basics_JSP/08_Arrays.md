# Arrays

```java
//Store the values and retrieve the values.
class Program1
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		arr[0] = 14;
		arr[1] = 16;
		arr[2] = 13;
		arr[3] = 15;
		arr[4] = 18;
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

//Output:
//14
//16
//13
//15
//18
```

```java

class Program2
{
	public static void main(String[] args)
	{
		int[] arr = {12,15,13,16,14,17,18};
		
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

//Output:
//12
//15
//13
//16
//14
//17
//18
```

```java
class Program3
{
	public static void main(String[] args)
	{
		double[] dArr = {6.0,5.3,7.9,8.2,9.5};
		
		for(int i = 0;i<dArr.length;i++){
			System.out.println(dArr[i]);
		}
	}
}

//Output:
//6.0
//5.3
//7.9
//8.2
//9.5
```

```java
class Program4
{
	public static void main(String[] args)
	{
		char[] ch = {'J', 'a', 'v', 'a'};
		
		for(int i = 0;i<ch.length;i++){
			System.out.print(ch[i]);
		}
	}
}

//Output:
//Java
```

```java
class Program5
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		
		for(int i = arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}

//Output:
//5
//4
//3
//2
//1
```

```java
class Program6
{
	public static void main(String[] args)
	{
		int[] arr = {14,10,12,13,16};
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Sum: " + sum);
	}
}
//Output:
//Sum: 65
```

```java
//int[] arr = {12,15,13,16,14,17,18};

/*1. Print only even Number.
2. Print Only odd numbers. 
3. Print Only numbers divisible by 2 or 3.
4. Find Sum Of all even numbers only.
5. Find Sum Of all odd numbers only.
6. Find Avg value in array.
*/
```


