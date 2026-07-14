# Strings

```java
//charAt()
class Program1
{
	public static void main(String[] args)
	{
		String str = "Developer";
		System.out.println(str.charAt(4));//l
		System.out.println(str.charAt(2));//v
		System.out.println(str.charAt(10));//Exeception
	}
}

//Output:
//l
//v
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: 
//Index 10 out of bounds for length 9
```

```java
//length()
class Program2
{
	
	public static void main(String[] args)
	{
		String s1 = "Java";
		System.out.println(s1.length());//4
		
		String s2 = "Java_SE26";
		System.out.println(s2.length());//9
		
		String s3 = "Java Full Stack";
		System.out.println(s3.length());//15
	}
}

//Output:
//4
//9
//15

```

```java
//toCharArray()
class Program3
{
	
	public static void main(String[] args)
	{
		String str = "Tiger";
		char[] ch = str.toCharArray();
		for(int i = 0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	}
}

//Output:
//T
//i
//g
//e
//r

```

```java
//indexOf() [Important] [Left to rigth Operation]
class Program4
{
	public static void main(String[] args)
	{
		String str = "Karnataka";
		System.out.println(str.indexOf('n'));//3
		System.out.println(str.indexOf('t'));//5
		System.out.println(str.indexOf('h'));//-1 => If the character is not available
		
		System.out.println(str.indexOf('a'));//1 =>First Occurrance
		
		//Multiple occurrance of 'a':
		int p = str.indexOf('a'); //1st Occurrance
		int q = str.indexOf('a', p+1);//2nd Occurrance
		int r = str.indexOf('a', q+1);//3rd Occurrance
		int s = str.indexOf('a', r+1);//4th Occurrance
		
		System.out.println("1st: "+p+" 2nd: "+q+" 3rd: "+r+" 4th: "+s);
		
	}
}

//Output:
//3
//5
//-1
//1
//1st: 1 2nd: 4 3rd: 6 4th: 8


```

```java
//lastIndexOf() [Important] [right to left Operation]
class Program5
{
	public static void main(String[] args)
	{
		String str = "Developer";
		System.out.println(str.lastIndexOf('v'));//2
		System.out.println(str.lastIndexOf('o'));//5
		System.out.println(str.lastIndexOf('L'));//-1 => If the character is not available
		
		//Multiple occurrance of 'e':
		int x = str.lastIndexOf('e'); //1st Occurrance
		int y = str.lastIndexOf('e', x-1);//2nd Occurrance
		int z = str.lastIndexOf('e', y-1);//3rd Occurrance
		
		System.out.println("1st: "+x+" 2nd: "+y+" 3rd: "+z);
		
	}
}

//Output:
//2
//5
//-1
//1st: 7 2nd: 3 3rd: 1


```

```java
//contains(), startsWith(), endsWith()
class Program6
{
	public static void main(String[] args)
	{
		String str = "Engineering";
		System.out.println("=>contains");
		System.out.println(str.contains("job"));//false
		System.out.println(str.contains("gin"));//true
		
		System.out.println("=>startsWith()");
		System.out.println(str.startsWith("eng"));//false
		System.out.println(str.startsWith("Eng"));//true
		
		System.out.println("=>endsWith()");
		System.out.println(str.endsWith(" ing"));//false
		System.out.println(str.endsWith("ing"));//true
	}
}

//Output:
//=>contains
//false
//true
//=>startsWith()
//false
//true
//=>endsWith()
//false
//true

```

```java
//equals(), equalsIgnoreCase()
class Program7
{
	public static void main(String[] args)
	{
		String str = "j2ee";
		
		System.out.println("=>equals");
		System.out.println(str.equals("j2ee"));//true
		System.out.println(str.equals("adv java"));//false
		System.out.println(str.equals("J2ee"));//false
		
		System.out.println("=>equalsIgnoreCase()");
		System.out.println(str.equalsIgnoreCase("j2ee"));//true
		System.out.println(str.equalsIgnoreCase("adv java"));//false
		System.out.println(str.equalsIgnoreCase("J2ee"));//true
	}
}

//Output:
//=>equals
//true
//false
//false
//=>equalsIgnoreCase()
//true
//false
//true
```

```java

```

```java

```

```java

```


