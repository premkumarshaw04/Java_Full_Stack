# Day 1 

```html
<!-- HTML file  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Internal way -->
     <!-- <script>
        console.log("I am from Internal JS")
     </script> -->


    <!-- External Way : It should always be placed at the bottom of the body tag. --> 
    <script src="./app.js"></script>
</body>
</html>
```

```js
//JS File
console.log("I am from External JS")
```


## To place the script tag in head tag, we can use defere keyword and Async.

## What is the difference between defere and Async?
>defer : always gives the priority to body tag.  
>Async : It will just make that code(line) to wait for some time.

---

# Day 2: Conditional Statements

```js

/* Conditional Statemets are of 5 types:
1. If statement
2. If else statement
3. Nested If
4. Else if lader
5. Switch Statement
 */

//Else if
let marks = 55
if(marks >= 90){
    console.log("Proud of u my child, choose ypur favourite bike");
}
else if(marks >= 70){
    console.log("Very good, choose ypur favourite bycycle");
}
else if(marks >= 50){
    console.log("Order Biryani and eat");
}
else if(marks >= 35){
    console.log("Thank god fees is not wasted");
}
else{
    console.log("Jaaydaad se bedakhal");
    
}
```

---

# Day 3: Looping Statements
```html
<!-- HTML file  -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- Internal way -->
     <!-- <script>
        console.log("I am from Internal JS")
     </script> -->


    <!-- External Way : It should be placed at the bottom of the body tag. --> 
    <script src="./if.js"></script>
</body>
</html>
```
```js
// JS file

/*Loops 
Types of loops:
1. For loop : Whenever we know the no of iterations to be done.
2. While Loop : When we dont know thw no of iteration.
3. Do while loop : When we need to execute the code atleast once without checking the condition.
 */

//for loop
for(let i = 1;i<=100;i++){
    if(i % 2 == 0){
        console.log(i);
    }
}

//while loop
let num = 1
while(num <= 100){
    if(num % 2 == 0){
        console.log(num);
    }
    num++;
}

//Do While
let res = 0
do{
    console.log(res)
    res++;
}while(res > 1)
```
---

# Day 4:  Functions

Named block of code, which executes some tasks when we invoke them.  
We can invoke the function s n number of times.

Why we use:  
mainly used for reduce code complexity and make the code reusable.  

## Declare a function in JavaScript :

```js
// Normal(Named) function--------------------------------
// The function which is created by function keyword and having its own name, 
// that function is called named function.
function jsp(){
    console.log("We will get Job soon.");
    
}

//Parameterized function---------------------------------
//Parameters: the variables which we take during function declaration
//Arguments: the values which we pass to the function's parameters, are called as arguments.

function add(a, b){
    console.log(a+b);   
}

// add(100, 200) //300
//add() //NaN
add(100) //NaN

//Keeping some default values-----------------------------
function product(a, b=10){
    console.log(a*b);   
}

product(100) //1000
product(100, 20)//2000
product(100, undefined)//1000
//undefined is also a default value but b=10 is highest priority than undefined.

product(100, null) //0


//return statement-----------------------------
//if the result we want to reuse then we will go for return statement
function Sub(a, b){
    return a-b   
    //after return statement no code will be execute
    console.log("Subtraction");//It will not be executed
    
}

//handling return values-----------------------
//first way : Recommended
let result = Sub(100, 50)
console.log(result);

//second way
console.log(Sub(200, 100));

//If the function is not returning anything, the default return type of the function will be undefined.---------------------
function undef(a){
    return
    5
}
let res = undef(10)
console.log(res);

//Anonymous Function ----------------------------------------------
// Its an unkown function: The function which is declared using function keyword without any function Name.
//To invoke this function:  Store entire function in a variable.
let anonym = function(a, b){
    console.log("Anonymous function");
    console.log(a-b)
    return a+b
    
}

anonym(10, 20) //-10
// console.log(anonym(10, 20))//30

// Output:
// Anonymous function
// -10

// Anonymous function
// -10
// 30

```
---


# Day 5 | Arrow function

Simplest Shortest function  
Invoke it by storing it in a variable.  
introduced in ES-6 version in 2015  
It will best for call backs

## Characteristics of Arrow functions:
```js
// 1. In case of no parameters: 
// ()=>{}

// 2. In case of single parameter, parenthesis are optional
// a=>{}

// 3. In case of multiple parameters, parenthesis are mandatory
// let arrow3 = (a,b) => {console.log(a+b)}
// arrow3(10, 20)

// 4. Implicit return: It will work only when you have one line expression
// let arrow4 = (a,b) => a+b
// console.log(arrow4(10, 20))

// 5. Explicit return (When we want to use return keyword manually): it should must be enclosed with in curly braces [Most Important]
// let arrow5 = (a,b) => {
//     console.log(a);
//     console.log(b);
//     return a+b;
// }
// console.log(arrow5(10,20));
```


## Drawbacks/Failure/Limitations of Arrow Functions  
```js
//1. Arrow function can not use this keyword
// Use of this keyword: Point to the current object 

//2.We can not use arrow functions as Constructors
//3.arrow functions will not support arrow functions.


// How to find the length of the function
// let arrow5 = (a,b) => { //no fo parameters will be the length of the function
//     //If you have default values thenit will not considered as length 
//     console.log(a);
//     console.log(b);
//     return a+b;
// }
// console.log(arrow5(10,20));
// console.log(arrow5.length); //2// beacuse we have a, b as patrameters
```


# Day 6 | IIFE function
IIFE : Immedietely invoked Function expression   
it will execute only once in its lifetime   
>The function which is wrapped inside paraenthesis and executes immedietly after its declaration, that function is known as IIFE function.  
>Syntax: ()()
We have to terminate previous code by using ; (Semi colon) before IIfE function

```js

//? IIFE using Arrow function
// After wrapping the whole function in brackets then it will become IIFE function 
(()=>{
    console.log("IIFE using Arrow function")
    
})(); //Before IIFE function Semi colon is mandatory for previous function
//! Here ; (Semi colon is must, without semicolon compiler will treat both IIFE funstion as one entity)

//? IIFE using Annonymous function
(function (){
    console.log("IIFE using Arrow function")
})();


```


# Day 7 |  Higher Order function | MOST IMPORTANT

>The function which accepts another function as an arguments.  
> The function which returns Another Function

```js
//----------------------Best Example: Use this example in interviews-----------
function greet(name){
    return ()=>{
        console.log("Good Night" + name);
    }
}
let func = greet("JSP Students")
func();
```

```js
function operation(a,b,op){ //third parameter is accepting a function here
    console.log("We are about to perform some operation.")

    // console.log(op)
    // Output:
    // ƒ add(x,y){
    // console.log(x+y)
    //}

    // op(100, 200) //300

    op(a,b) //30 // We can pass parameters as arguments also.
}

function add(x,y){
    console.log(x+y)
}

operation(10, 20, add) //we are passing add function as arguments


//--------------------------------------------------------------------------
// Function which returns another function 
function add(a){
    return b=>{
        console.log(a+b);
    }
}
let res = add(10)
res(20) //Output : 30

```

## CallBack Function :
> the function which we pass as an argument to another function is called as callBack function  
> Same example of Higher order function can be used for CallBack function also
```js
//----------------------Best Example: Use this example in interviews-----------
function greet(name){
    return ()=>{
        console.log("Good Night" + name);
    }
}
let func = greet("JSP Students")
func();
```

# Nested function
>Function inside another function
```js
//Nested Function
function outer(){
    console.log("Outer Executed")
    function inner(){
        console.log("Inner function Executed");
        
    }
    inner()
}
outer()

//Output:
//Outer Executed
//Inner function Executed
```

## GEC : Global Execution Context | Important

>Browser understands only one laguage which is HTML.  
> chrome: v8 [Js Engine]  [internally chrome has v8 engine]  
> Edge: Checkra --> v8  
> firefox: SpiderMonkey  
> safari: Js Nitro

> JS file executes two times :  
> i. Declaration phase  
>ii. Code Execution phase

## FEC : Functions Execution Context
this are is called as local Area for function Participants.


# Day 8 | Closure | MOST IMPORTANT

```js
//Closure
function outer(){
    let name = "JSP"
    function inner(){
        return "Hello "+ name
    }
    return inner
}
let res = outer()
console.log(res())
console.log(res())
console.log(res())
```

```js
//Counter Example using Closure
function counter(){
    let count = 0
    return ()=>{
        console.log(count)
        count++
    }
}
let result = counter()
result()
result()
result()
result()
```

```js
let company = "JSpiders"
function institute(){
    let trainer = "Srinivas"
    function concept(){
        let topic = "Closure"
        console.log(topic);
        console.log(trainer);
        console.log(company);   
        console.log(`We are disscussing ${topic} in ${company} from ${trainer} sir.`);   
    }
    concept()
}
institute()

// Closure
// Srinivas
// JSpiders
// We are disscussing Closure in JSpiders from Srinivas sir.
```
---

# Arrays

It is a non premitive data type  
It stores both homogenous and heterogenous  
It is dynamic in nature(No fixed length)  
It is mutable in nature  
Stores data based on indices  
Index starts from 0

## Declaration 

```js
//Declaration
// 1. By using literals []
let arr = [10,20.5,true, null, undefined, {}, ()=>{}, [], 34.6, 45n, "Jspiders"]
console.log(arr)
console.log(arr.length);
console.log(arr[0]);
console.log(arr[10]);
console.log(arr[100]);

arr[0] = "HTML"
arr[5] = 1000
delete arr[0]
delete arr[10]
console.log(arr);


// 2. By using "new keyword"

// let arr2 = new Array(10) //when we pass one number, it will be treated as length of array
// let arr2 = new Array("10") //now it will be treated as element of array

let arr2 = new Array(true,10,30,50)
console.log(arr2);
console.log(arr2.length);

```

## Methods in Array
```js

//! Mutating Methods of Array: All these methods will affect my original Array

//?1. push : Adds element at the end of the original array
// return type of push method : length of the original Array

let arr = [10,20,30,40]
// arr.push(100,200,300,"js","abcd")
// console.log(arr.push(1000,2000,3000)) //returns length
console.log(arr);

//? 2. pop: Always removes from end | removes only one element at a time.
arr.pop()
arr.pop()
// arr.pop(5) //arguments are not allowed in pop method
console.log(arr);

//? 3. unshift : It always add the elements to the starting
arr.unshift(10000)
console.log(arr);

//? 4. shift : It always removes the elements from the starting
arr.shift()
console.log(arr);

//? 5. Splice
let arr = [10,20,30,40,50]
console.log(arr.splice(2));
// console.log(arr.splice(2,2));
// console.log(arr.splice(1,3,100,200,300,400,500));
// console.log(arr.splice(2,0,1000,2000,3000));
console.log(arr);


//? sort():
let names = ["Karthik", "Rahul", "Manjay", "Guudu", "Ronak", "Raj","Prem", "Ranjit"]
console.log(names.sort());

let nums = [1,20,100,3,50,500,7,9,1000,11]
console.log(nums.sort((a,b)=>a-b))
//console.log(nums.sort((a,b)=>b-a))

//? reverse():
console.log(names.sort().reverse())
console.log(nums.sort().reverse())
```

# Array Non Mutating Methods

```js

//! Array Non Mutating Methods
//? 1. indexOf()

//? 2. lastIndexOf()

//? 3. includes()

//? 4. slice()

//? 5. concat() 

//? 6. at() 

//? 7.flat()
//dont count outer array, only count inner arrays.

//flat the array when u dont know the depth. pass "Infinity" when u dont know the depth.

//? 8. join()
//converts array into strings

//split(String method) vs join(array method)


//Assignment: 

let str = "We will buy biryani to Sreenivas Sir"


console.log(str.split(" ").reverse().join(" "));
//o/p 1. Sir Sreenivas to biryani buy will We

console.log(str.split("").reverse().join(""));
//o/p 2. riS savineerS ot inayrib yub lliw eW

let res = str.split("").reverse().join("")
console.log(res.split(" ").reverse().join(" "));
//o/p 3. eW lliw yub inayrib ot savineerS riS

```

---

# Array Loops:
for of : to access elements of array or strings
for in: to access index values of arrya or strings

# Array Advanced methods:

## Common Points:
1. Every Advance method except argument as call back function ||  
Mainly we will prefer Arrow function  
this call back function will accept minimum three arguments: 
    element, index and array [index and array are optional]

2. Call back executes on each element

## lets see advanced methods 

## For Each Loop:
For Each Loop is used to perform only for iterating the elements.  
for each does not supprot return keyword.
if you still use return, then it will give undefined.  
it does not support chaining because we dont have return keyword.

## Find method:
It returns only firts matching element based on the given condition.
it does not support chaining because we dont have return type as array.

## Filter methd: [Important]
if we want multiple elements which are satisfying the given condition, then we will use Filter method  
it returns all those matching elements as new Array.  
if you dont provide condition, then it will filter the elements according to the truthy or falsy values. it will return  
truthy values   
the return type of filter method is elements.

## Some method
```
Some returns bollean values
at least one element should satisfy the given condition, then only it will return true, else false.
Some always check for one true value.

```

## Every method 
```
here the condition is all elements should satisfied the condition.
it returns false if atleast one element is not satisfying the condition.

```

## map [Important]
It is mailnly used to transform your original array to new array.

```js
let arr3 = [1,2,3,4,5]
console.log(arr.map((ele)=>{
    return ele*ele;
}));

//? [1,2,3,4,5] if ele is even cube it else square it
console.log(arr3.map(ele=>{
    if(ele%2 == 0){
        return ele**3
    }
    else{
        return ele**2
    }
}));
```

## reduce [Important]
```js
let arr4 = [10,20,30,40,50]
console.log(arr4.reduce((acc,ele)=>{
    return ele*ele
}));

//finding sum of square of elements
console.log(arr4.map(ele=>{
    return ele*ele 
}).reduce((acc,ele)=>{
    return acc+ele
}))

//finding sum of square of elements | Another way
console.log(arr4,reduce((acc,ele)=>{
    return acc+ (ele*ele)
},0));

//? Finding product of the square of the elements
console.log(arr4.reduce((acc,ele)=>{
    return acc * (ele*ele)
},1));

```
## Questions

```js
//find the occurrrences of each element in array
let values = [10,'a',20,'a', 10, 'c', 30, 'd', 'c', 20, 'd', 10, 'b']       
console.log(values.reduce((acc,ele)=>{
    acc[ele] = (acc[ele] || 0) + 1
    return acc
}, {})); //Initial value passed as object
//Output: {10: 3, 20: 2, 30: 1, a: 2, c: 2, d: 2, b: 1}
```

```js
//? Move all zeroes to the end of the array
let nums = [1,0,3,6,0,9,4,0,5,0,3,0,8]

let nonZeroes = nums.filter(el=>el!=0)
let zeroes = nums.filter(el=>el==0)
console.log(nonZeroes.concat(zeroes));

//Output: [1, 3, 6, 9, 4, 5, 3, 8, 0, 0, 0, 0, 0]
```

---

# Object

```js
//! Object

let student = {
    name: "Shraddha",
    course: "Java",
    duration: "6 Months",
    branch: "BTM"
}
console.log(student);
console.log(student.name);
console.log(student['duration']);

//Output:
// {name: 'Shraddha', course: 'Java', duration: '6 Months', branch: 'BTM'}
// one.js:9 Shraddha
// one.js:10 6 Months

//? Nested Object
let person = {
    name: "Nikhil",
    designation: "Developer",
    salary: 20000,
    address: { //Nested object
        state: "Bihar",
        city: "Patna",
        pincode: "745896"
    }
}

//! Accessing
//I want to access propeties of nested object:
console.log(person.address.city); //Patna
console.log(person.address.pincode); //745896

//! Modification
//? Performing basic crud operation on object
person.name = "jaiSurya"
person.address.state = "TamilNadu"
console.log(person);

//! Deleting the properties
delete person.address.state
delete person.address.pincode
console.log(person);

```

## Different ways to created Objects

### 1. By using literals

### 2. By using new keyword
```js

```

### 3. Constructor Functions : It is the old way to create objects
```js
// In case of creating multiple objects, this way is recommended
// this : It points the current object
function person1(name, age, phno, email){
    this.name = name
    this.age = age
    this.phno = phno
    this.email = email
}
let p1 = new person1("Prem", 22, 25689798556, 'premKumar@gmail.com')
console.log(p1);
// Output: person1 {name: 'Prem', age: 22, phno: 25689798556, email: 'premKumar@gmail.com'}

let p2 = new person1("Shraddha", 21, 25689888556, 'shraddha@gmail.com')
console.log(p2);
//Output: person1 {name: 'Shraddha', age: 21, phno: 25689888556, email: 'shraddha@gmail.com'}

```

### 4. By using class Keyword
```js
class test{
    constructor(name, age, phno,email){
        this.name = name
        this.age = age
        this.phno = phno
        this.email = email
    }
}
let t1 = new test("Raj", 22, 589756464, 'raj@gmail.com')
console.log(t1);
//Output: test {name: 'Raj', age: 22, phno: 589756464, email: 'raj@gmail.com'}
```



```js

```
