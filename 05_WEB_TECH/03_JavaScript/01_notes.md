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


# Day 5 

## Arrow function

Simplest Shortest function  
Invoke it by storing it in a variable.  
introduced in ES-6 version in 2015  
Itr will best for call backs

## Characteristics of Arrow functions: 

