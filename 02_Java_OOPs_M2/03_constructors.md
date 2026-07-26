```java
//Default Constructor
class Demo{
	int val = 10;
	void test(){
		System.out.println("Executing test()...");
	}
}
public class MainClass1{
	public static void main(String[] args){
		Demo ref = new Demo();
		System.out.println(ref.val);
		ref.test();
	}
}
//output:
//10
//Executing test()...
```

```java
//Default Constructor
class Example{
	int x;
	double y;
	boolean z;
}
public class MainClass2{
	public static void main(String[] args){
		Example ref = new Example();
		System.out.println(ref.x);
		System.out.println(ref.y);
		System.out.println(ref.z);
	}
}
//Output
//0
//0.0
//false
```

```java
//User Defined Constructor [Zero Argument Constructor]
class Alpha{
	int x;
	void play(){
		System.out.println("Executing play().....");
	}
	Alpha(){//Zero Argument Constructor
		System.out.println("Alpha() Constructor.....");
		x = 100;
	}
}
public class MainClass3{
	public static void main(String[] args){
		Alpha ref = new Alpha();
		System.out.println(ref.x);
		ref.play();
	}
}
//Output
//Alpha() Constructor.....
//100
//Executing play().....
```

```java
//User Defined Constructor [Zero Argument Constructor]
class Beta{
	int a;
	double d;
	char c;
	Beta(){//Zero Argument Constructor
		a = 15;
		d = 7.4;
		c = 'A';
	}
}
public class MainClass4{
	public static void main(String[] args){
		Beta ref = new Beta();
		System.out.println(ref.a);
		System.out.println(ref.d);
		System.out.println(ref.c);
	}
}
//Output
//15
//7.4
//A
```

```java
//Parameterised Constructor
class Container{
	int capacity;
	Container(int arg){
		capacity = arg;
	}
}
public class MainClass5{
	public static void main(String[] args){
		Container c1 = new Container(500);
		System.out.println(c1.capacity);
		
		Container c2 = new Container(1000);
		System.out.println(c2.capacity);
		
		Container c3 = new Container(250);
		System.out.println(c3.capacity);
		
	}
}
//Output 
//500
//1000
//250
```

```java
//Parameterised Constructor
class Student{
	String name;
	double cgpa;
	int yop;
	
	Student(String str, double val, int num){//Parameterised Constructor
		name = str;
		cgpa = val;
		yop = num;
	}
}
public class MainClass6{
	public static void main(String[] args){
		Student s1 = new Student("Rama", 8.5, 2020);
		System.out.println("Name: " + s1.name);
		System.out.println("CGPA: " + s1.cgpa);
		System.out.println("YOP: " + s1.yop);
		
		System.out.println("-----------------");
		
		Student s2 = new Student("Sita", 9.5, 2021);
		System.out.println("Name: " + s2.name);
		System.out.println("CGPA: " + s2.cgpa);
		System.out.println("YOP: " + s2.yop);
	}
}
//Output 
//Name: Rama
//CGPA: 8.5
//YOP: 2020
//-----------------
//Name: Sita
//CGPA: 9.5
//YOP: 2021
```