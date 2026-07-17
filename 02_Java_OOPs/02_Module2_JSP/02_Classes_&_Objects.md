> Note: Files will be saved by the name of public class only.
> For below Program, we have **"MainClass1"** as public class, so the file will be saved as **MainClass1.java**

```java
class Student{
	String name;
	double cgpa;
	void listen(){
		System.out.println(name + " is listening");
	}
	void write(){
		System.out.println(name + " is writing their CGPA is " + cgpa);
	}
	
}

public class MainClass1{
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "Ram";
		s1.cgpa = 8.7;
		s1.listen();
		s1.write();
		System.out.println("--------------------------");
		Student s2 = new Student();
		s2.name = "Sita";
		s2.cgpa = 8.5;
		s2.listen();
		s2.write();
	}
}
//Output:
//Ram is listening
//Ram is writing their CGPA is 8.7
//--------------------------
//Sita is listening
//Sita is writing their CGPA is 8.5
```

```java
class Employee{
	int id;
	double ctc;
	void work(){
		System.out.println("Employee is working the id is " + id + " The CTC is " + ctc);
	}
	void meeting(){
		System.out.println("Employee is meeting the id is " + id + " The CTC is " + ctc);
	}
}
public class MainClass2{
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.id = 101;
		e1.ctc = 4.5;
		e1.work();
		e1.meeting();
		System.out.println("--------------------------");
		Employee e2 = new Employee();
		e2.id = 102;
		e2.ctc = 3.5;
		e2.work();
		System.out.println("--------------------------");
		Employee e3 = new Employee();
		e3.id = 103;
		e3.ctc = 7.5;
		e3.meeting();
	}
}
//Output:
//Employee is working the id is 101 The CTC is 4.5
//Employee is meeting the id is 101 The CTC is 4.5
//--------------------------
//Employee is working the id is 102 The CTC is 3.5
//--------------------------
//Employee is meeting the id is 103 The CTC is 7.5
```

```java
class Mobile{
	String name;
	double price;
	void call(){
		System.out.println("Calling in " + name);
		System.out.println("Its price is " + price);
	}
	void message(){
		System.out.println("Message in " + name);
		System.out.println("Its price is " + price);
	}
}
public class MainClass3{
	public static void main(String[] args){
		Mobile m1 = new Mobile();
		m1.name = "Iphone";
		m1.price = 1.6;
		m1.call();
		m1.message();
		System.out.println("--------------------------");
		Mobile m2 = new Mobile();
		m2.name = "Samsung S26 ultra";
		m2.price = 1.2;
		m2.call();
		m2.message();
	}
}
//Output:
//Calling in Iphone
//Its price is 1.6
//Message in Iphone
//Its price is 1.6
//--------------------------
//Calling in Samsung S26 ultra
//Its price is 1.2
//Message in Samsung S26 ultra
//Its price is 1.2
```

```java
class Pen{
	String type;
	String color;
	void write(){
		System.out.println("Writing with " + type + " pen");
		System.out.println("Writing with " + color + " pen");
	}
	void draw(){
		System.out.println("Drawing with " + type + " pen");
		System.out.println("Drawing with " + color + " pen");
	}
}
public class MainClass4{
	public static void main(String[] args){
		Pen p1 = new Pen();
		p1.type = "Gel";
		p1.color = "Black";
		p1.write();
		p1.draw();
		System.out.println("--------------------------");
		Pen p2 = new Pen();
		p2.type = "Ball";
		p2.color = "Blue";
		p2.write();
		p2.draw();
	}
}
//Output:
//Writing with Gel pen
//Writing with Black pen
//Drawing with Gel pen
//Drawing with Black pen
//--------------------------
//Writing with Ball pen
//Writing with Blue pen
//Drawing with Ball pen
//Drawing with Blue pen
```

```java
class Person{
	int age;
	char gender;
	void eat(){
		System.out.println("Person is eating. His age is " + age + " His gender is "+gender);
	}
	void talk(){
		System.out.println("Person is talking. His age is " + age + " His gender is "+gender);
	}
}
public class MainClass5{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.age = 25;
		p1.gender = 'M';
		p1.eat();
		p1.talk();
		System.out.println("--------------------------");
		Person p2 = new Person();
		p2.age = 23;
		p2.gender = 'F';
		p2.eat();
		p2.talk();
	}
}
//Output:
//Person is eating. His age is 25 His gender is M
//Person is talking. His age is 25 His gender is M
//--------------------------
//Person is eating. His age is 23 His gender is F
//Person is talking. His age is 23 His gender is F
```
