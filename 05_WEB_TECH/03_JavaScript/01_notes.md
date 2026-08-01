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

```

