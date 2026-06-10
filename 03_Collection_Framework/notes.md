# Collections Framework

---

## What is the Collections Framework?

Before collections, if you wanted to store multiple values you used **arrays**. But arrays have problems:
- **Fixed size** — once declared, size cannot change
- **No built-in methods** — no sort, search, insert, delete built in
- **Hard to manage** — adding/removing elements is painful

The **Collections Framework** is a set of **ready-made classes and interfaces** in Java that give you flexible, powerful data structures to store, manage, and manipulate groups of objects — with all the operations (add, remove, search, sort) built in.

```java
// Old way — array (fixed, rigid)
int[] marks = new int[5];   // stuck with size 5 forever

// New way — collection (flexible, powerful)
ArrayList<Integer> marks = new ArrayList<>();
marks.add(95);
marks.add(88);
marks.remove(0);   // built-in operations — no manual work
```

---

### Why Do We Need It?
- Arrays are **fixed in size** — collections grow and shrink dynamically
- No need to write sorting, searching logic from scratch — it's all built in
- Different problems need different data structures — collections give you all of them
- Works with **generics** — type-safe storage (no accidental wrong types)

---

### Benefits & Advantages:

| Benefit | Meaning |
|---------|---------|
| **Dynamic size** | Grows and shrinks automatically as you add/remove elements |
| **Ready-made algorithms** | Sort, search, shuffle — all built in |
| **Type safety** | Generics prevent storing wrong data types |
| **Multiple data structures** | List, Set, Queue, Map — pick what fits your problem |
| **Less code** | No need to manually implement linked lists, trees, hash tables from scratch |
| **Interoperability** | All collections work with the same set of methods — easy to switch |

---

### Real-World Use Cases:

| Use Case | Collection Used |
|----------|----------------|
| Storing a list of students | `ArrayList` |
| Storing unique usernames | `HashSet` |
| Browser history (back/forward) | `Stack` / `Deque` |
| Task queue (first in, first out) | `Queue` |
| Storing key-value pairs (user ID → name) | `HashMap` |
| Leaderboard (sorted scores) | `TreeMap` / `TreeSet` |

---

## The Collections Framework — Full Structure

The framework is built around **interfaces** that define the behaviour, and **classes** that implement those interfaces.

There are **two separate hierarchies** inside the framework:

```
java.util
│
├── Collection Interface  (stores individual elements)
│     ├── List Interface
│     │     ├── ArrayList
│     │     ├── LinkedList
│     │     └── Vector
│     │           └── Stack
│     ├── Set Interface
│     │     ├── HashSet
│     │     ├── LinkedHashSet
│     │     └── SortedSet Interface
│     │           └── TreeSet
│     └── Queue Interface
│           ├── PriorityQueue
│           ├── ArrayDeque
│           └── Deque Interface
│                 └── LinkedList
│
├── Map Interface  (stores key-value pairs — NOT part of Collection)
│     ├── HashMap
│     ├── LinkedHashMap
│     ├── Hashtable
│     └── SortedMap Interface
│           └── TreeMap
│
└── Iterator Interface  (used to traverse/loop through collections)
```

---

## Collection Interface

### What is the Collection Interface?
`Collection` is the **root interface** of the collection hierarchy. It defines the **basic operations** that every collection must support — add, remove, size, contains, iterate, etc.

Every data structure like `ArrayList`, `HashSet`, `Queue` is ultimately a child of `Collection`.

### Why Do We Need It?
- It defines a **common contract** — any class implementing it must provide `add()`, `remove()`, `size()` etc.
- It allows **polymorphism** — you can write code that works on ANY collection type

```java
// Works for ArrayList, HashSet, LinkedList — all are Collection
public void printAll(Collection<String> items) {
    for (String item : items) {
        System.out.println(item);
    }
}
```

### Benefits:
- Provides a **unified API** — learn once, use on all collections
- Foundation for all other interfaces (List, Set, Queue all extend it)
- Enables writing **generic, reusable** code

---

### Collection Interface — Children (Diagram):

```
Collection Interface
│
├── List Interface  →  Ordered, allows duplicates, index-based access
│     ├── ArrayList      → Dynamic array, fast random access
│     ├── LinkedList     → Doubly linked list, fast insert/delete
│     └── Vector         → Thread-safe ArrayList (older)
│           └── Stack    → Last In First Out (LIFO)
│
├── Set Interface  →  Unordered, NO duplicates allowed
│     ├── HashSet        → Fastest, no order guaranteed
│     ├── LinkedHashSet  → Maintains insertion order
│     └── TreeSet        → Sorted order (natural/custom)
│
└── Queue Interface  →  Ordered for processing, First In First Out (FIFO)
      ├── PriorityQueue  → Elements processed by priority
      ├── ArrayDeque     → Double-ended queue (add/remove from both ends)
      └── LinkedList     → Also implements Queue
```

---

### Quick Summary of Children:

| Interface | Key Feature | Example Use |
|-----------|------------|-------------|
| **List** | Ordered + allows duplicates + index access | Student marks list |
| **Set** | No duplicates + unordered | Unique usernames |
| **Queue** | FIFO — first in, first out | Task processing |

---

## Map Interface

### What is the Map Interface?
`Map` is an interface that stores data as **key-value pairs** — every value is associated with a unique key. Think of it like a dictionary — you look up a word (key) and get its meaning (value).

> ⚠️ **Important:** `Map` is **NOT** a child of `Collection` interface. It is a **completely separate hierarchy** in the framework. But it is still part of the **Collections Framework**.

### Why Do We Need It?
- Sometimes you don't just want to store values — you want to **associate** them with something
- Fast lookup — find a value by its key in O(1) time (HashMap)
- Perfect for any kind of ID → data mapping

```java
HashMap<Integer, String> students = new HashMap<>();
students.put(1, "Anuj");
students.put(2, "Prem");
students.put(3, "Shiva");

System.out.println(students.get(2));   // Prem — found instantly by key
```

### Benefits:

| Benefit | Meaning |
|---------|---------|
| **Key-value storage** | Associate any data with a unique key |
| **Fast lookup** | Find values by key in constant time (HashMap) |
| **No duplicate keys** | Each key is unique — prevents data conflicts |
| **Flexible** | Keys and values can be any object type |

---

### Map Interface — Children (Diagram):

```
Map Interface  (key → value pairs, NOT a Collection)
│
├── HashMap         → Fastest, NO order guaranteed, allows one null key
├── LinkedHashMap   → Maintains insertion order
├── Hashtable       → Thread-safe, older version of HashMap
└── SortedMap Interface
      └── TreeMap   → Keys stored in sorted (natural) order
```

---

### Quick Summary of Map Children:

| Class | Key Feature | Example Use |
|-------|------------|-------------|
| **HashMap** | Fastest, unordered | User ID → User data |
| **LinkedHashMap** | Insertion order maintained | Cache (keep recent order) |
| **TreeMap** | Keys sorted automatically | Leaderboard (sorted by score) |
| **Hashtable** | Thread-safe (old) | Legacy multi-threaded apps |

---

### Collection vs Map — Key Difference:

| | Collection | Map |
|--|-----------|-----|
| **Stores** | Individual elements | Key-value pairs |
| **Example** | `[Anuj, Prem, Shiva]` | `{1→Anuj, 2→Prem, 3→Shiva}` |
| **Duplicate values** | Depends on type (List=yes, Set=no) | Values can duplicate, keys cannot |
| **Access** | By index or iteration | By key |
| **Part of Collection?** | ✅ Yes | ❌ No — separate hierarchy |

---

## Iterator Interface

### What is the Iterator Interface?
`Iterator` is an interface that provides a **standard way to traverse (loop through) any collection** one element at a time — without needing to know the internal structure of the collection.

Think of it like a **pointer** that starts before the first element and moves forward one step at a time.

### Why Do We Need It?
- Different collections store data differently internally (array, linked list, tree)
- You don't want to write different traversal logic for each
- `Iterator` gives a **uniform way** to go through any collection the same way

### Benefits:

| Benefit | Meaning |
|---------|---------|
| **Universal** | Works on ArrayList, HashSet, LinkedList — any Collection |
| **Safe removal** | Can safely remove elements while iterating (can't do this with for-each) |
| **Decoupled** | You don't need to know HOW the collection stores data internally |

---

### Iterator — Three Key Methods:

| Method | What it does |
|--------|-------------|
| `hasNext()` | Returns `true` if there are more elements to iterate |
| `next()` | Returns the next element and moves the pointer forward |
| `remove()` | Removes the last element returned by `next()` |

---

### Iterator Example:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Anuj");
        names.add("Prem");
        names.add("Shiva");
        names.add("Ravi");

        // Get iterator for the list
        Iterator<String> it = names.iterator();

        // Traverse using iterator
        while (it.hasNext()) {                  // is there a next element?
            String name = it.next();            // get it and move forward
            System.out.println(name);
        }

        // Output:
        // Anuj
        // Prem
        // Shiva
        // Ravi
    }
}
```

---

### Safe Removal Using Iterator:

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);

Iterator<Integer> it = numbers.iterator();

while (it.hasNext()) {
    int num = it.next();
    if (num == 20) {
        it.remove();   // ✅ safe removal while iterating
    }
}

System.out.println(numbers);   // [10, 30, 40]
```

> ⚠️ If you try to remove elements using a regular `for` loop or `for-each` while iterating, Java throws a `ConcurrentModificationException`. Iterator's `remove()` is the safe way.

---

### Iterator — Diagram (Where it fits):

```
Iterator Interface
│
├── Works with → All Collection types
│     ├── List (ArrayList, LinkedList)
│     ├── Set  (HashSet, TreeSet)
│     └── Queue (PriorityQueue)
│
└── ListIterator (child of Iterator)
      └── Works only with List — can go BOTH forward and backward
```

---

## Collection Framework vs Collection Interface — The Difference

This is a common confusion because both have the word "Collection".

| | Collections Framework | Collection Interface |
|--|----------------------|---------------------|
| **What it is** | The entire **package/system** — all interfaces, classes, algorithms together | One **specific interface** inside the framework |
| **Includes** | `Collection`, `Map`, `Iterator`, `ArrayList`, `HashMap`, `TreeSet` and everything else | Only defines basic operations: `add()`, `remove()`, `size()`, `contains()` etc. |
| **Scope** | The whole thing — the big picture | Just one piece of the puzzle |
| **Analogy** | The entire **toolkit** | One specific **tool** inside the toolkit |

> 💡 **Simple way to remember:** The **Collections Framework** is the entire library. The **Collection Interface** is one book inside that library. `Map` and `Iterator` are other books in the same library — but they are NOT part of the `Collection` book.

---

# 1. List Interface

---

## List Interface

### What is the List Interface?
`List` is a child interface of `Collection` that represents an **ordered sequence of elements**. "Ordered" means the elements maintain the **order in which they were inserted** — element at index 0 stays at 0 unless you move it.

### What does it do?
- Allows **duplicate elements** — same value can appear multiple times
- Provides **index-based access** — you can get, set, or remove by position
- Maintains **insertion order** — elements stay in the order you added them

### Advantages:

| Advantage | Meaning |
|-----------|---------|
| **Ordered** | Elements always in a predictable sequence |
| **Duplicates allowed** | Unlike Set — same value can exist multiple times |
| **Index access** | Get any element instantly using its position |
| **Flexible implementations** | ArrayList (fast read), LinkedList (fast insert/delete) |

### Example:

```java
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");   // duplicate — allowed in List

        System.out.println(fruits);          // [Apple, Banana, Apple]
        System.out.println(fruits.get(1));   // Banana — index-based access
    }
}
```

> `List` is an **interface** — you can't create `new List()` directly. You always create an object of a class that **implements** List, like `ArrayList` or `LinkedList`.

---

## *[i]* ArrayList

### What is ArrayList?
`ArrayList` is a class that **implements the List interface** using a **dynamic array** internally. It solves the biggest problem with regular arrays — the fixed size.

---

### The Problem with Arrays:

```java
String[] studentName = new String[30];
// Can only store 30 students
// If a 31st student comes — you're stuck
// You'd have to create a NEW bigger array and copy everything manually
// Not scalable at all
```

### How ArrayList Solves It:

```java
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Rakesh");   // add as many as you want — no size limit
        studentName.add("Anuj");
        studentName.add("Prem");
        // keep going... ArrayList handles it automatically
    }
}
```

---

### How ArrayList Solves the Problem Internally:

ArrayList uses an **array under the hood** — but it manages resizing automatically for you. Here's what happens step by step:

1. ArrayList starts with a **default capacity of 10**
2. You keep adding elements
3. When the array gets **full**, ArrayList creates a **new bigger array** using this formula:

```
New size = old size + (old size / 2) + 1

Example: old size = 10
New size = 10 + 5 + 1 = 16
```

4. All elements from the old array are **copied** to the new array
5. The old array is **discarded (garbage collected)**
6. You never see any of this — it all happens silently behind the scenes

> 💡 This is why ArrayList feels like it has no size limit — it keeps growing automatically whenever needed.

---

### Advantages of ArrayList Over Arrays:

| | Array | ArrayList |
|--|-------|-----------|
| **Size** | Fixed — set at creation | Dynamic — grows automatically |
| **Built-in methods** | None | add, remove, get, set, contains, sort, etc. |
| **Type safety** | Primitive or Object | Generics — type-safe |
| **Memory** | Exact size only | May have extra capacity (auto-managed) |
| **Ease of use** | Manual management | Fully managed |

---

## ArrayList Functionalities

---

### Important Line — Explained:

```java
List<Integer> list = new ArrayList<>();
```

| Part | Meaning |
|------|---------|
| `List<Integer>` | The **type** of the variable — declared as the `List` interface. This is good practice — program to the interface, not the implementation |
| `<Integer>` | **Generic type** — this list will only hold `Integer` objects. No accidental wrong types. |
| `new ArrayList<>()` | The actual object created in memory — `ArrayList` is the implementation |
| `<>` | **Diamond operator** — Java infers the type from the left side, so you don't repeat `<Integer>` |

> 💡 Why declare as `List` instead of `ArrayList`? Because if you later want to switch to `LinkedList`, you only change one line — `new LinkedList<>()`. The rest of your code stays the same. This is **good OOPs practice**.

---

### i. `add()` Function — Types & Time Complexity

#### Type 1 — Add at the end: `list.add(element)`
Adds the element at the **last position**.
- ⏱ **Time complexity: O(1)** amortized (occasionally O(n) when resize happens)

```java
list.add(4);
// Before: [1, 2, 3]
// After:  [1, 2, 3, 4]
```

#### Type 2 — Add at specific index: `list.add(index, element)`
Inserts element at the given index. All existing elements from that index **shift right**.
- ⏱ **Time complexity: O(n)** — shifting takes time

```java
list.add(1, 50);
// Before: [1, 2, 3, 4]
// After:  [1, 50, 2, 3, 4]   → everything from index 1 shifted right
```

#### Type 3 — Add another list: `list.addAll(anotherList)`
Adds **all elements** of another collection to the end of the current list.
- ⏱ **Time complexity: O(k)** where k = size of the list being added

```java
List<Integer> newList = new ArrayList<>();
newList.add(150);
newList.add(160);

list.addAll(newList);
// Before: [1, 50, 2, 3, 4]
// After:  [1, 50, 2, 3, 4, 150, 160]
```

---

### Full add() Example — Explained:

```java
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);   // [1, 2, 3]

        list.add(4);                // add at end
        System.out.println(list);   // [1, 2, 3, 4]

        list.add(1, 50);            // add 50 at index 1 — shifts others right
        System.out.println(list);   // [1, 50, 2, 3, 4]

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);       // merge newList into list
        System.out.println(list);   // [1, 50, 2, 3, 4, 150, 160]
    }
}
```

---

### ii. `get()` Function

Returns the element at a specific index — **read only**, doesn't remove it.
- ⏱ **Time complexity: O(1)** — direct index access, instant

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(0));   // 10 — first element
System.out.println(list.get(2));   // 30 — third element
```

> ⚠️ If you use an index that doesn't exist, Java throws `IndexOutOfBoundsException`.

---

### iii. `remove()` and `clear()`

#### `remove(int index)` — Remove by index
Removes the element at the given index. All elements after it **shift left**.
- ⏱ **Time complexity: O(n)** — shifting required

```java
list.remove(1);
// Removes element at index 1
// [10, 20, 30, 40] → [10, 30, 40]
```

#### `remove(Object o)` — Remove by value
Removes the **first occurrence** of the specified value.
- ⏱ **Time complexity: O(n)** — must search for the value first

```java
list.remove(Integer.valueOf(30));
// Removes the value 30 (not index 30)
// [10, 30, 40, 50] → [10, 40, 50]
```

> ⚠️ **Why `Integer.valueOf(30)` and not just `30`?**
> Because `remove(1)` takes an `int` — Java treats it as **index**. To remove by **value**, you must pass an `Integer` object, not a primitive `int`. `Integer.valueOf(30)` wraps 30 as an object so Java knows you mean the value, not the index.

#### `clear()` — Remove everything
Removes ALL elements from the list. List becomes empty `[]`.
- ⏱ **Time complexity: O(n)**

```java
list.clear();
// [10, 40, 50, 60, 70, 80] → []
```

---

### Full remove() Example with Output:

```java
List<Integer> list = new ArrayList<>();
list.add(10); list.add(20); list.add(30);
list.add(40); list.add(50); list.add(60);
list.add(70); list.add(80);

System.out.println(list);               // [10, 20, 30, 40, 50, 60, 70, 80]

list.remove(1);                         // remove index 1 (value 20)
System.out.println(list);               // [10, 30, 40, 50, 60, 70, 80]

list.remove(Integer.valueOf(30));       // remove value 30
System.out.println(list);               // [10, 40, 50, 60, 70, 80]

list.clear();                           // remove everything
System.out.println(list);               // []
```

---

### iv. `set()` Function

**Replaces** the element at a given index with a new value. The size of the list stays the same.
- ⏱ **Time complexity: O(1)**

```java
list.set(2, 1000);
// Before: [10, 20, 30, 40, 50, 60, 70, 80]
// After:  [10, 20, 1000, 40, 50, 60, 70, 80]
// Element at index 2 (was 30) is now replaced by 1000
```

---

### v. `contains()` Function

Checks whether a specific value **exists** in the list. Returns `true` or `false`.
- ⏱ **Time complexity: O(n)** — scans through the list

```java
System.out.println(list.contains(50));    // true  — 50 exists in list
System.out.println(list.contains(999));   // false — 999 not in list
```

---

### Full set() and contains() Example with Output:

```java
List<Integer> list = new ArrayList<>();
list.add(10); list.add(20); list.add(30);
list.add(40); list.add(50); list.add(60);
list.add(70); list.add(80);

System.out.println(list);               // [10, 20, 30, 40, 50, 60, 70, 80]

list.set(2, 1000);
System.out.println(list);               // [10, 20, 1000, 40, 50, 60, 70, 80]

System.out.println(list.contains(50));  // true
System.out.println(list.contains(999)); // false
```

---

## What is `toString()` and Why Does `System.out.println(list)` Print Nicely?

When you write `System.out.println(list)`, you're passing an **object** to `println`. Internally, `println` calls the **`toString()` method** of that object to convert it to a String before printing.

### What is `toString()`?
`toString()` is a method defined in the **`Object` class** — the root parent of every class in Java. By default, it returns something like `ArrayList@7852e922` (class name + memory address) — not very useful.

But `ArrayList` **overrides** `toString()` to return a nicely formatted string like `[10, 20, 30]`.

### How it works internally:
1. You write `System.out.println(list)`
2. Java calls `list.toString()` automatically
3. ArrayList's `toString()` loops through all elements, joins them with `, `, wraps in `[ ]`
4. Returns `"[10, 20, 30, 40]"` as a String
5. That String gets printed

```java
// What ArrayList's toString() roughly does internally:
public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
        sb.append(elements[i]);
        if (i < size - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
}
```

> 💡 This is why every class in Java should override `toString()` — so when you print an object, you see meaningful data instead of a memory address. It's a best practice.

---

## Traversing ArrayList Elements

There are 3 ways to loop through an ArrayList:

---

### 1. Using `for` Loop

Classic index-based loop. Use when you need the **index** of each element.

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println("The element is " + list.get(i));
}
```

- `list.size()` → returns total number of elements
- `list.get(i)` → gets element at index `i`

---

### 2. Using `for-each` Loop

Cleaner syntax. Use when you just need **each element** and don't need the index.

```java
for (Integer element : list) {
    System.out.println("foreach element is " + element);
}
```

- Automatically goes through each element one by one
- Can't access index, can't remove elements safely while iterating

---

### 3. Using `Iterator`

### What is an Iterator?
`Iterator` is an interface that provides a **cursor** to traverse a collection one element at a time — without knowing how the collection stores data internally.

### Why Do We Use It?
- **Safe removal** — you can remove elements while iterating without errors
- **Universal** — works the same way on any Collection type
- Useful when you need to **filter and remove** elements during traversal

### Advantages:
| Advantage | Meaning |
|-----------|---------|
| **Safe removal** | `it.remove()` is the only safe way to remove while iterating |
| **Universal** | Same code works for ArrayList, HashSet, LinkedList |
| **Controlled traversal** | `hasNext()` gives you precise control over when to stop |

```java
import java.util.Iterator;

Iterator<Integer> it = list.iterator();   // get iterator for the list

while (it.hasNext()) {                    // as long as there's a next element
    System.out.println("iterator " + it.next());   // get it and move forward
}
```

---

### Full Traversal Example — All 3 Methods:

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        list.add(40); list.add(50); list.add(60);
        list.add(70); list.add(80);

        System.out.println(list);   // [10, 20, 30, 40, 50, 60, 70, 80]

        // 1. for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for loop: " + list.get(i));
        }

        // 2. for-each loop
        for (Integer element : list) {
            System.out.println("for-each: " + element);
        }

        // 3. Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator: " + it.next());
        }
    }
}
```

---

### Traversal Methods — When to Use Which:

| Method | Use when... |
|--------|------------|
| `for` loop | You need the **index** of each element |
| `for-each` | Simple traversal — you just need each **value** |
| `Iterator` | You need to **remove elements** safely while iterating |

---

### Quick Reference — All ArrayList Methods:

| Method | What it does | Time Complexity |
|--------|-------------|----------------|
| `add(e)` | Add at end | O(1) amortized |
| `add(i, e)` | Add at index | O(n) |
| `addAll(list)` | Add another list | O(k) |
| `get(i)` | Get element at index | O(1) |
| `set(i, e)` | Replace element at index | O(1) |
| `remove(i)` | Remove by index | O(n) |
| `remove(Object)` | Remove by value | O(n) |
| `clear()` | Remove all elements | O(n) |
| `contains(e)` | Check if value exists | O(n) |
| `size()` | Get number of elements | O(1) |

---

## *[ii]* Stack

## What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO** principle —
**Last In, First Out**.

The element that is added **last** is the one that comes out **first** — just like a stack of plates. You put a plate on top, and you always pick from the top too. You can't directly access a plate in the middle.

```
        ┌─────────┐
        │   Cat   │  ← TOP (added last, removed first)
        ├─────────┤
        │  Horse  │
        ├─────────┤
        │   Dog   │
        ├─────────┤
        │  Lion   │  ← BOTTOM (added first, removed last)
        └─────────┘
```

> 💡 **LIFO = Last In, First Out** — the last element pushed is the first one popped.

---

### Advantages of Using Stack:

| Advantage | Meaning |
|-----------|---------|
| **Simple and fast** | Push and pop are O(1) — constant time operations |
| **Natural fit for LIFO problems** | Undo/redo, backtracking, recursion all naturally follow LIFO |
| **Built-in in Java** | `java.util.Stack` class is ready to use — no manual implementation needed |
| **Extends Vector** | Gets thread-safety and all Vector methods along with stack operations |

---

### Where Do We Use Stack?

| Use Case | How Stack Helps |
|----------|----------------|
| **Undo/Redo** (MS Word, Photoshop) | Every action is pushed — undo pops the last action |
| **Browser Back Button** | Each visited page is pushed — back button pops the last page |
| **Function Call Stack** | Java itself uses a stack to track method calls — when a method is called it's pushed, when it returns it's popped |
| **Expression Evaluation** | Compilers use stacks to evaluate `(2 + 3) * 4` type expressions |
| **Backtracking** (Maze solving, DFS) | Explore a path, push positions — backtrack by popping |

---

## Stack Functions

---

### `push(element)` — Add to Top
Adds an element to the **top** of the stack.
- ⏱ **Time Complexity: O(1)**

```java
animals.push("Lion");    // Stack: [Lion]
animals.push("Dog");     // Stack: [Lion, Dog]
animals.push("Horse");   // Stack: [Lion, Dog, Horse]
animals.push("Cat");     // Stack: [Lion, Dog, Horse, Cat]
```

---

### `peek()` — View Top Element (Without Removing)
Returns the element at the **top** of the stack — but does **not** remove it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.peek());   // Cat — just looks, doesn't remove
// Stack is still: [Lion, Dog, Horse, Cat]
```

> 💡 `peek()` is like looking at the top plate without picking it up.

---

### `pop()` — Remove from Top
Removes and returns the element at the **top** of the stack.
- ⏱ **Time Complexity: O(1)**

```java
animals.pop();   // removes Cat (the top element)
// Stack is now: [Lion, Dog, Horse]
```

> ⚠️ If you call `pop()` on an empty stack, Java throws `EmptyStackException`.

---

### `isEmpty()` — Check if Stack is Empty
Returns `true` if the stack has no elements, `false` otherwise.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false — stack has elements
```

---

### `size()` — Get Number of Elements
Returns the total number of elements currently in the stack.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 3
```

---

## Full Example — All Operations Together:

```java
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();   // creating a Stack of Strings

        // push — adding elements to the top
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
        // Stack: [Lion, Dog, Horse, Cat]

        // peek — view top element without removing
        System.out.println(animals.peek());
        // Cat

        // pop — remove top element
        animals.pop();

        System.out.println("Stack: " + animals);
        // Stack: [Lion, Dog, Horse]

        // peek again — now Horse is on top
        System.out.println(animals.peek());
        // Horse

        // isEmpty
        System.out.println(animals.isEmpty());
        // false

        // size
        System.out.println(animals.size());
        // 3
    }
}
```

**Output:**
```
Stack: [Lion, Dog, Horse, Cat]
Cat
Stack: [Lion, Dog, Horse]
Horse
false
3
```

---

### How the Stack Changes Step by Step:

| Operation | Stack State | Top Element |
|-----------|------------|-------------|
| `push("Lion")` | `[Lion]` | Lion |
| `push("Dog")` | `[Lion, Dog]` | Dog |
| `push("Horse")` | `[Lion, Dog, Horse]` | Horse |
| `push("Cat")` | `[Lion, Dog, Horse, Cat]` | Cat |
| `peek()` | `[Lion, Dog, Horse, Cat]` | Cat (unchanged) |
| `pop()` | `[Lion, Dog, Horse]` | Horse |
| `peek()` | `[Lion, Dog, Horse]` | Horse (unchanged) |

---

### Quick Reference — Stack Methods:

| Method | What it does | Time Complexity |
|--------|-------------|----------------|
| `push(e)` | Add element to top | O(1) |
| `pop()` | Remove and return top element | O(1) |
| `peek()` | View top element without removing | O(1) |
| `isEmpty()` | Check if stack is empty | O(1) |
| `size()` | Get number of elements | O(1) |

---

*End of Notes — Stack*

---

## *[iii]* LinkedList

### What is a LinkedList?

A **LinkedList** is a linear data structure where elements are **not stored in continuous memory locations** like arrays. Instead, each element (called a **Node**) holds:
- The **data** itself
- A **pointer/reference** to the **next node**

Think of it like a **treasure hunt** — each clue (node) tells you where the next clue is.

```
[Lion | •]──→ [Dog | •]──→ [Horse | •]──→ [Cat | null]
  ↑
 HEAD
```

> 💡 The last node points to `null` — meaning there's no next element after it.

---

### Doubly LinkedList (How Java Implements It)

Java's `LinkedList` is actually a **Doubly LinkedList** — each node has **two pointers**:
- One pointing to the **next** node
- One pointing to the **previous** node

```
null ←[Lion]⇄[Dog]⇄[Horse]⇄[Cat]→ null
        ↑                    ↑
       HEAD                 TAIL
```

> 💡 Because of two pointers, you can **traverse in both directions** — forward and backward.

---

### Advantages of LinkedList:

| Advantage | Meaning |
|-----------|---------|
| **Fast Insert/Delete** | Adding or removing from beginning or middle is O(1) — no shifting needed |
| **Dynamic Size** | Grows and shrinks at runtime — no fixed size like arrays |
| **Implements Multiple Interfaces** | Works as a `List`, `Queue`, and `Deque` — very flexible |
| **No Memory Waste** | Memory is allocated only when a new node is added |

---

### Disadvantages of LinkedList:

| Disadvantage | Meaning |
|--------------|---------|
| **Slow Access** | To reach index 3, you must traverse from HEAD — O(n) |
| **Extra Memory** | Each node stores data + pointer(s) — more memory than ArrayList |
| **No Random Access** | You cannot directly do `get(5)` efficiently like an array |

---

### Where Do We Use LinkedList?

| Use Case | How LinkedList Helps |
|----------|---------------------|
| **Music Playlist** | Each song points to next — easy to insert/remove songs |
| **Browser History** | Doubly linked — go forward and backward easily |
| **Implementing Queue/Stack** | Natural fit due to fast insert/delete at both ends |
| **Undo Functionality** | Each action is a node — easy to traverse back |

---

## LinkedList Functions

---

### `add(element)` — Add to End
Adds an element to the **end** of the list.
- ⏱ **Time Complexity: O(1)**

```java
animals.add("Lion");     // [Lion]
animals.add("Dog");      // [Lion, Dog]
animals.add("Horse");    // [Lion, Dog, Horse]
animals.add("Cat");      // [Lion, Dog, Horse, Cat]
```

---

### `addFirst(element)` — Add to Beginning
Adds an element to the **front** of the list.
- ⏱ **Time Complexity: O(1)**

```java
animals.addFirst("Tiger");
// [Tiger, Lion, Dog, Horse, Cat]
```

---

### `addLast(element)` — Add to End
Explicitly adds an element to the **end** — same as `add()`.
- ⏱ **Time Complexity: O(1)**

```java
animals.addLast("Elephant");
// [Tiger, Lion, Dog, Horse, Cat, Elephant]
```

---

### `getFirst()` — Get First Element
Returns the **first** element without removing it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.getFirst());   // Tiger
```

---

### `getLast()` — Get Last Element
Returns the **last** element without removing it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.getLast());   // Elephant
```

---

### `removeFirst()` — Remove from Front
Removes and returns the **first** element.
- ⏱ **Time Complexity: O(1)**

```java
animals.removeFirst();   // removes Tiger
// [Lion, Dog, Horse, Cat, Elephant]
```

---

### `removeLast()` — Remove from End
Removes and returns the **last** element.
- ⏱ **Time Complexity: O(1)**

```java
animals.removeLast();   // removes Elephant
// [Lion, Dog, Horse, Cat]
```

---

### `get(index)` — Access by Index
Returns the element at a specific **index**.
- ⏱ **Time Complexity: O(n)** — has to traverse from HEAD

```java
System.out.println(animals.get(2));   // Horse
```

> ⚠️ This is slower than ArrayList because LinkedList has no direct memory access — it walks node by node.

---

### `size()` — Get Number of Elements
Returns the total number of elements in the list.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 4
```

---

### `isEmpty()` — Check if List is Empty
Returns `true` if the list has no elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false
```

---

## Full Example — LinkedList:

```java
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        // add elements
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("LinkedList: " + animals);
        // LinkedList: [Lion, Dog, Horse, Cat]

        // addFirst
        animals.addFirst("Tiger");
        System.out.println("After addFirst: " + animals);
        // After addFirst: [Tiger, Lion, Dog, Horse, Cat]

        // addLast
        animals.addLast("Elephant");
        System.out.println("After addLast: " + animals);
        // After addLast: [Tiger, Lion, Dog, Horse, Cat, Elephant]

        // getFirst and getLast
        System.out.println("First: " + animals.getFirst());   // Tiger
        System.out.println("Last: " + animals.getLast());     // Elephant

        // removeFirst and removeLast
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removals: " + animals);
        // After removals: [Lion, Dog, Horse, Cat]

        // get by index
        System.out.println("Index 2: " + animals.get(2));   // Horse

        // size and isEmpty
        System.out.println("Size: " + animals.size());        // 4
        System.out.println("isEmpty: " + animals.isEmpty());  // false
    }
}
```

**Output:**
```
LinkedList: [Lion, Dog, Horse, Cat]
After addFirst: [Tiger, Lion, Dog, Horse, Cat]
After addLast: [Tiger, Lion, Dog, Horse, Cat, Elephant]
First: Tiger
Last: Elephant
After removals: [Lion, Dog, Horse, Cat]
Index 2: Horse
Size: 4
isEmpty: false
```

---

### How the LinkedList Changes Step by Step:

| Operation | List State | Head | Tail |
|-----------|-----------|------|------|
| `add("Lion")` | `[Lion]` | Lion | Lion |
| `add("Dog")` | `[Lion, Dog]` | Lion | Dog |
| `add("Horse")` | `[Lion, Dog, Horse]` | Lion | Horse |
| `add("Cat")` | `[Lion, Dog, Horse, Cat]` | Lion | Cat |
| `addFirst("Tiger")` | `[Tiger, Lion, Dog, Horse, Cat]` | Tiger | Cat |
| `addLast("Elephant")` | `[Tiger, Lion, Dog, Horse, Cat, Elephant]` | Tiger | Elephant |
| `removeFirst()` | `[Lion, Dog, Horse, Cat, Elephant]` | Lion | Elephant |
| `removeLast()` | `[Lion, Dog, Horse, Cat]` | Lion | Cat |

---

### Quick Reference — LinkedList Methods:

| Method | What it does | Time Complexity |
|--------|-------------|-----------------|
| `add(e)` | Add to end | O(1) |
| `addFirst(e)` | Add to front | O(1) |
| `addLast(e)` | Add to end | O(1) |
| `getFirst()` | View first element | O(1) |
| `getLast()` | View last element | O(1) |
| `removeFirst()` | Remove from front | O(1) |
| `removeLast()` | Remove from end | O(1) |
| `get(index)` | Access by index | O(n) |
| `size()` | Get element count | O(1) |
| `isEmpty()` | Check if empty | O(1) |

---

---

## *[iv]* Vector 

### What is a Vector?

A **Vector** is similar to an **ArrayList** — it stores elements in a **dynamic array** that grows automatically when needed. But the key difference is:

> 💡 **Vector is synchronized** — meaning it is **thread-safe**. Only one thread can access it at a time, which prevents data corruption in multi-threaded programs.

Think of it like a **single-lane bridge** — only one vehicle (thread) can cross at a time, making it safe but slightly slower.

---

### Vector vs ArrayList — Key Difference:

| Feature | ArrayList | Vector |
|---------|-----------|--------|
| **Thread Safety** | ❌ Not thread-safe | ✅ Thread-safe (synchronized) |
| **Speed** | Faster | Slightly slower (due to sync) |
| **Growth Rate** | Grows by 50% | Grows by 100% (doubles) |
| **Legacy** | Modern (Java 1.2) | Old (Java 1.0) |

> 💡 When Vector runs out of space, it **doubles its size**. ArrayList only grows by **50%**.

---

### Advantages of Vector:

| Advantage | Meaning |
|-----------|---------|
| **Thread-safe** | Safe to use in multi-threaded environments without extra code |
| **Dynamic Sizing** | Automatically grows — no need to define size upfront |
| **Legacy Support** | Older Java codebases use Vector heavily |

---

### Where Do We Use Vector?

| Use Case | How Vector Helps |
|----------|-----------------|
| **Multi-threaded apps** | When multiple threads read/write a list simultaneously |
| **Legacy Java code** | Older projects written before `ArrayList` existed |
| **Simple thread-safety** | Without manually writing `synchronized` blocks |

---

## Vector Functions

---

### `add(element)` — Add to End
Adds an element to the **end** of the Vector.
- ⏱ **Time Complexity: O(1)**

```java
animals.add("Lion");
animals.add("Dog");
animals.add("Horse");
// [Lion, Dog, Horse]
```

---

### `get(index)` — Access by Index
Returns the element at a specific index.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.get(1));   // Dog
```

---

### `remove(index)` — Remove by Index
Removes the element at the given index.
- ⏱ **Time Complexity: O(n)** — elements shift after removal

```java
animals.remove(1);   // removes Dog
// [Lion, Horse]
```

---

### `size()` — Get Number of Elements
Returns the total number of elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 2
```

---

### `contains(element)` — Check if Element Exists
Returns `true` if the element is present in the Vector.
- ⏱ **Time Complexity: O(n)**

```java
System.out.println(animals.contains("Lion"));   // true
System.out.println(animals.contains("Cat"));    // false
```

---

### `isEmpty()` — Check if Vector is Empty
Returns `true` if the Vector has no elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false
```

---

### `clear()` — Remove All Elements
Removes **all** elements from the Vector.
- ⏱ **Time Complexity: O(n)**

```java
animals.clear();
System.out.println(animals.isEmpty());   // true
```

---

## Full Example — Vector:

```java
import java.util.Vector;

public class LearnVector {
    public static void main(String[] args) {

        Vector<String> animals = new Vector<>();

        // add elements
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Vector: " + animals);
        // Vector: [Lion, Dog, Horse, Cat]

        // get by index
        System.out.println("Index 1: " + animals.get(1));   // Dog

        // remove by index
        animals.remove(1);
        System.out.println("After remove(1): " + animals);
        // After remove(1): [Lion, Horse, Cat]

        // contains
        System.out.println("Contains Lion: " + animals.contains("Lion"));   // true
        System.out.println("Contains Dog: " + animals.contains("Dog"));     // false

        // size and isEmpty
        System.out.println("Size: " + animals.size());        // 3
        System.out.println("isEmpty: " + animals.isEmpty());  // false

        // clear
        animals.clear();
        System.out.println("After clear, isEmpty: " + animals.isEmpty());   // true
    }
}
```

**Output:**
```
Vector: [Lion, Dog, Horse, Cat]
Index 1: Dog
After remove(1): [Lion, Horse, Cat]
Contains Lion: true
Contains Dog: false
Size: 3
isEmpty: false
After clear, isEmpty: true
```

---

### How the Vector Changes Step by Step:

| Operation | Vector State |
|-----------|-------------|
| `add("Lion")` | `[Lion]` |
| `add("Dog")` | `[Lion, Dog]` |
| `add("Horse")` | `[Lion, Dog, Horse]` |
| `add("Cat")` | `[Lion, Dog, Horse, Cat]` |
| `remove(1)` | `[Lion, Horse, Cat]` |
| `clear()` | `[]` |

---

### Quick Reference — Vector Methods:

| Method | What it does | Time Complexity |
|--------|-------------|-----------------|
| `add(e)` | Add to end | O(1) |
| `get(index)` | Access by index | O(1) |
| `remove(index)` | Remove by index | O(n) |
| `contains(e)` | Check if element exists | O(n) |
| `size()` | Get element count | O(1) |
| `isEmpty()` | Check if empty | O(1) |
| `clear()` | Remove all elements | O(n) |

---

---

## 🆚 LinkedList vs Vector vs ArrayList — Full Comparison:

| Feature | LinkedList | Vector | ArrayList |
|---------|-----------|--------|-----------|
| **Internal Structure** | Doubly linked nodes | Dynamic array | Dynamic array |
| **Thread-safe** | ❌ No | ✅ Yes | ❌ No |
| **Access by index** | O(n) — traverse | O(1) — direct | O(1) — direct |
| **Insert/Delete (middle)** | O(1) — just relink | O(n) — shift | O(n) — shift |
| **Memory** | More (stores pointers) | Less | Less |
| **Growth** | Node by node | Doubles (100%) | 50% |
| **Best used when** | Frequent insert/delete | Multi-threading | General purpose |


---

*End of Notes — List Interface*

---






