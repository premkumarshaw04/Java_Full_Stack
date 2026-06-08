
public class mainClass {
    public static void main(String[] args) {

        Person p2 = new Person(21, "Shiva");
        p2.eat(); 

        Developer d1 = new Developer(25, "Anuj");
        d1.walk();

    }
}

class Developer extends Person{//child class
    public Developer(int age, String name){
        super(age, name); //here Parameterised constructor of Parent class will be called, because developer is a person
    }

    //This is also the example of Runtime polymorphism
    void walk(){//this walk method is only for developer objects | 
        System.out.println("Developer " + name + " is walking.");
    }
}

class Person{ //Prent Class Person
    //properties
    String name;
    int age;

    // int count; //
    static int count; //Now it becomes a property of class

    public Person(){//Default Constructor
        count++;
        System.out.println("Creating an Object"); 
    }

    public Person(int age, String name){ // parameterised Constructor
        this.name = name;
        this.age = age;
    }

    //behaviour
    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name + " walked "+ steps + " steps");
    }
    void doWork(){
        System.out.println("Person is working.");
    }
}

//Output------------
// Shiva is eating.
// Developer Anuj is walking.




