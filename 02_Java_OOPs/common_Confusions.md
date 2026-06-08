# Common Confusions

---

## 1. `static` Keyword — Deep Clarity

### What is `static`?
`static` means the variable or method **belongs to the CLASS itself**, not to any individual object created from that class.

---

### Without `static` vs With `static` — What Actually Changes?

To understand this, you need to understand how memory works when you create objects.

When you create an object using `new`, Java **allocates separate memory** for that object. Every non-static variable gets its **own separate copy** in that memory.

But a `static` variable is stored **separately at the class level** — only **one copy** exists, no matter how many objects you create. All objects **share** that one copy.

---

### Example — Without `static`:

```java
class Person {
    String name;
    int age;
    int count;   // non-static — every object gets its OWN copy of count
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Anuj";
        p1.count = 1;

        Person p2 = new Person();
        p2.name = "Prem";
        p2.count = 2;

        System.out.println(p1.count);   // 1
        System.out.println(p2.count);   // 2
        // p1 and p2 have COMPLETELY SEPARATE copies of count
        // changing p2.count does NOT affect p1.count
    }
}
```

**Memory picture WITHOUT static:**
```
p1 object          p2 object
-----------        -----------
name = "Anuj"      name = "Prem"
age  = 0           age  = 0
count = 1          count = 2      ← separate copies, no sharing
```

---

### Same Example — With `static`:

```java
class Person {
    String name;
    int age;
    static int count;   // static — ONE shared copy at class level
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Anuj";
        Person.count = 1;   // changing via class name (correct way)

        Person p2 = new Person();
        p2.name = "Prem";
        Person.count = 2;   // this updates the SAME count — shared by all

        System.out.println(Person.count);   // 2
        System.out.println(p1.name);        // Anuj (own property — not shared)
        System.out.println(p2.name);        // Prem (own property — not shared)
    }
}
```

**Memory picture WITH static:**
```
p1 object          p2 object        Person CLASS
-----------        -----------       ------------
name = "Anuj"      name = "Prem"     count = 2    ← ONE shared copy
age  = 0           age  = 0
                                     (p1 and p2 both see the same count)
```

---

### What Exactly Changes When You Add `static`?

| | Without `static` | With `static` |
|--|-----------------|--------------|
| **Belongs to** | Each individual object | The class itself |
| **Copies in memory** | One copy per object | Only one copy total |
| **Accessed via** | Object name: `p1.count` | Class name: `Person.count` |
| **Shared?** | ❌ No — each object has its own | ✅ Yes — all objects share it |
| **Created when?** | When object is created (`new`) | When class is loaded into memory |
| **Needs object?** | ✅ Yes | ❌ No |

---

### Real Use Case — Object Counter:

```java
class Person {
    String name;
    static int count = 0;   // tracks how many Person objects have been created

    Person(String name) {
        this.name = name;
        count++;   // every time a new Person is made, shared count goes up
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Anuj");    // count = 1
        Person p2 = new Person("Prem");    // count = 2
        Person p3 = new Person("Shiva");   // count = 3

        System.out.println(Person.count);   // 3
        // All 3 objects share the SAME count variable
    }
}
```

> 💡 **Simple rule to remember:**
> - Non-static → **"mine"** — each object owns its own copy
> - Static → **"ours"** — all objects share one copy at the class level

---

## 2. Why is `String` Written with a Capital `S`?

### Short Answer:
Because `String` is **not a primitive data type** — it is a **Class** in Java. And in Java, class names always start with a capital letter.

---

### Long Answer — The Full Picture:

Java has two categories of data types:

**Primitive types** — built directly into Java, stored as raw values:
```java
int age = 21;
double price = 99.9;
char grade = 'A';
boolean flag = true;
```
These are all **lowercase** because they are simple, built-in types — not classes.

**Reference types (Classes)** — objects that come from a class:
```java
String name = "Anuj";
```
`String` starts with a capital `S` because it is actually a **class** defined inside Java (`java.lang.String`). When you write `String name = "Anuj"`, you are essentially creating an **object of the String class**.

---

### Proof That `String` is a Class:

Because `String` is a class, it comes with **built-in methods** you can call on it — just like any object:

```java
String name = "Anuj";

System.out.println(name.length());          // 4 — number of characters
System.out.println(name.toUpperCase());     // ANUJ
System.out.println(name.toLowerCase());     // anuj
System.out.println(name.charAt(0));         // A — character at index 0
System.out.println(name.contains("nu"));    // true
```

> A primitive like `int` can't do this — you can't write `age.length()` on an `int`. Only objects (class instances) have methods.

---

### Why is `String` Automatically Available Without Import?
Because `String` belongs to the `java.lang` package — and `java.lang` is the **only package Java imports automatically** in every program. That's why you never write `import java.lang.String`.

---

### Summary:

| | `int` | `String` |
|--|-------|---------|
| **Type** | Primitive | Class (Reference type) |
| **Case** | lowercase | Capital S |
| **Has methods?** | ❌ No | ✅ Yes |
| **Stored as** | Raw value | Object in memory |
| **Package** | Built-in | `java.lang` (auto-imported) |

---

## 3. Difference Between `this` and `super`

Both `this` and `super` are reference keywords — but they point in **completely different directions**.

| | `this` | `super` |
|--|--------|--------|
| **Refers to** | The **current object** (same class) | The **parent class** |
| **Used for variables** | `this.name` → current class's variable | `super.name` → parent class's variable |
| **Used for methods** | `this.walk()` → current class's method | `super.walk()` → parent class's method |
| **Used for constructors** | `this()` → calls another constructor in the **same class** | `super()` → calls the **parent class** constructor |
| **Where used** | Any method or constructor | Only in a child class |

---

### Example — Both Side by Side:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;   // 'this.name' → Person's own name variable
    }

    void walk() {
        System.out.println(name + " is walking normally.");
    }
}

class Developer extends Person {
    String name;   // Developer also has its own name variable

    Developer(String name) {
        super(name);      // calls Person's constructor — sets Person's name
        this.name = name; // sets Developer's own name
    }

    void showNames() {
        System.out.println("Developer's name: " + this.name);   // Developer's own name
        System.out.println("Person's name: " + super.name);     // Parent's name
    }

    void walk() {
        super.walk();   // calls Person's walk() method
        System.out.println("Developer " + name + " is walking with a laptop.");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer("Anuj");
        d.showNames();
        d.walk();
    }
}
```

**Output:**
```
Developer's name: Anuj
Person's name: Anuj
Anuj is walking normally.
Developer Anuj is walking with a laptop.
```

---

### One Line Summary:
- `this` → *"Look at me — the current object"*
- `super` → *"Look at my parent"*

---

## 4. In Java, Every Class Has a Parent — It is a Must

### The Line Explained:
In Java, **every class automatically extends a class called `Object`** — even if you don't write `extends` anywhere. This happens silently behind the scenes.

So when you write:
```java
class Person {
    // ...
}
```

Java silently treats it as:
```java
class Person extends Object {
    // ...
}
```

`Object` is the **topmost class in Java** — the root of the entire class hierarchy. Every class in Java is a descendant of `Object`, directly or indirectly.

---

### Why Does Java Do This?

Because `Object` provides a set of **fundamental methods** that every class in Java should have. Since every class extends `Object`, every class gets these methods for free:

| Method | What it does |
|--------|-------------|
| `toString()` | Returns a string representation of the object |
| `equals(Object obj)` | Checks if two objects are equal |
| `hashCode()` | Returns a unique integer (hash) for the object |
| `getClass()` | Returns the class of the object |

---

### Proof — You Can Call `Object` Methods on Any Object:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Anuj");

        // These methods come from the Object class — Person never defined them
        System.out.println(p.toString());    // Person@<hashcode>
        System.out.println(p.getClass());    // class Person
        System.out.println(p.hashCode());    // some integer
    }
}
```

`Person` never defined `toString()`, `getClass()`, or `hashCode()` — but it can use them because it **inherits them from `Object`**.

---

### The Full Inheritance Chain:

```
Object                   ← topmost parent of ALL classes in Java
   └── Person            ← extends Object (automatically)
         └── Developer   ← extends Person (explicitly written)
```

So `Developer` has a chain of inheritance:
- Gets properties/methods from `Person`
- `Person` gets foundational methods from `Object`
- `Developer` indirectly inherits from `Object` too

---

### Why is This Important to Know?

1. **It explains why every object has methods like `toString()` and `equals()`** without you ever defining them
2. **It is why the property lookup flow never truly ends in nothing** — it always climbs up to `Object` as the last stop before giving up
3. **It is the foundation of Java's type system** — in Java, you can store any object in a variable of type `Object`:

```java
Object obj1 = new Person("Anuj");    // valid
Object obj2 = new Developer("Prem"); // valid
Object obj3 = "Hello";               // valid — String is also an Object
// Every class is ultimately an Object
```

> 💡 **Simple way to remember:** In Java, nobody is parentless. Even if you don't write `extends`, Java gives every class `Object` as its parent automatically. `Object` is the great-grandparent of every class in Java.

---

*End of Notes — Common Confusions Cleared*