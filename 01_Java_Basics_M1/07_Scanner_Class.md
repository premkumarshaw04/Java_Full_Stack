# Taking Input Using **Scanner Class**:

```java
import java.util.Scanner;//Step1
class Program1
{
	public static void main(String[] args)
	{
		//int num = 10;//HARDCODING
		
		Scanner sc = new Scanner(System.in);//Step2
		System.out.println("Enter the value: ");
		int num = sc.nextInt();//Step3 //Taking User Input
		
		if(num % 2 == 0){
			System.out.println("Even Number");
		} 
		else{
			System.out.println("Odd Number");
		}
	}
}
//Output:

//Enter the value:
//10
//Even Number
//-------------------
//Enter the value:
//15
//Odd Number
```

```java
import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd number: ");
		double num2 = sc.nextDouble();
		
		double sum = num1+num2;
		System.out.println("Sum: " + sum);
	}
}
//Output:
//Enter 1st number:
//12.5
//Enter 2nd number:
//13.5
//Sum: 26.0
```

```java
import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Mobile number :");
		long mobileNumber = sc.nextLong();
		
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		
		System.out.println("Are you single : True Or False");
		boolean single = sc.nextBoolean();
		
		System.out.println();
		System.out.println("Mobile Number: " + mobileNumber);
		System.out.println("Age: " + age);
		System.out.println("Single or Not: " + single);
		
	}
}
//Output:

//Enter Mobile number :
//8240308148
//Enter your age :
//23
//Are you single : True Or False
//true

//Mobile Number: 8240308148
//Age: 23
//Single or Not: true
```

```java
import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String value :");
		String st = sc.nextLine();
		System.out.println(st);
	}
}
//next() : It will read single word only
//nextLine() : It will read multyiple words with spaces.

//Output:
//Enter String value :
//Prem Kumar Shaw
//Prem Kumar Shaw


//Warning: 
//Avoid reading string values directly in the program.
//create one separate method for reading strings and return that string.
//If you dont have any choice, then use next() method instead of nextLine().
```

```java
/*
There is not any way to read Character.
In the below program we are reading a String value and retrieving the first character 
from the entered String. 
*/

import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		char ch = sc.next().charAt(0);
		System.out.println("Character: " + ch);
	}
}

/*Output:
Enter the value :
Prem
Character: P
*/


/*
When we will get InputMismatchException ? 
If programmer tries to read invalid input values using Scanner It will cause InputMismatchException.

Exception is called as Runtime failure.
*/
```