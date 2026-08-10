# FUNCTIONS:
```js
A function is a block of reusable code used to perform a specific operation.
Instead of writing the same code again and again, we write it once and reuse it.
That block of code will be executed only when we call it. 
We can call the same function multiple times in order to execute the same block of code. 

Basic Function Syntax
function functionName() {
  // code
}

Ex:
function greet() {	// Function Declaration
  console.log("Hello JavaScript");	// Function body
}
greet(); // Function invocation

Parameters: Variables used in function definition
Act as placeholders

Arguments:
Actual values passed during function invocation

Ex:
function add(a, b) {   // parameters
  console.log(a + b);
}

add(10, 20); // arguments

Default Parameters 
If an argument is missing, it defaults to undefined, but you can set a default parameter value. 
function sum(x, y = 10) {   
return x + y;   
} 
console.log(sum(5)); 

return Statement:
Sends value back to caller
If no value is returned, the function returns undefined.
Stops function execution
Code after return will NOT execute

Ex:
function sum(a, b) {
  return a + b;
}
let result = sum(5, 10);
console.log(result);

Types of Functions:

Normal function/named function:
	The function, which is declared by using function keyword and identifier is called normal function.
	We have to use the same identifier with parentheses to invoke the function.
	arguments object can be used here
*****	Function hosting is allowed for only normal functions/named functions. 
Ex:1
function demo() { 
console.log("I am demo function")
} 
demo()

Ex:2
function sum(a, b) { 
console.log(arguments)
return a + b; 
} 
console.log(sum(10, 20))

Anonymous Function:
A function declared without an identifier (function name) is known as anonymous function. 
It needs to be stored in a variable for execution. 

Syntax: 
var variableName = function (params) { 
	// code to execute
}; 
variableName(args);

Ex:
var add = function (a, b) { 
return a + b; 
}; 
console.log(add(10, 20))
```

```js
Arrow Function:
An arrow function is a shorter and cleaner syntax for writing functions in JavaScript, introduced in ES6 (2015).
Best for callbacks

Syntax:
const functionName = (parameters) => {
  // function body
};

=> fat arrow

Ex-1:
let arrow = ()=>{
console.log("arrow function")
}
arrow()

Ex-2:
const add = (a, b) => {
  return a + b;
};
add(20,30)

Characteristics:
1. No arguments:
()=>{ 
// function body
}

2. Only One argument:
let square = a=>{ 
console.log(a*a)
}
square(2)

3.More than One argument:
const add = (a, b) => {
  console.log(a + b);
};
add(20,30)

4. Implicit Return: If the function body has only one expression(one line code) , it automatically returns it.
const square = x => x * x;
square(3)

5. Explicit Return: when we want to use return keyword explicitly or if we have more than one line code then we have to use { }
const add = (a, b) => {
  return a + b;
};
console.log(add(50,60)
// or
const greet = (name) => {
  console.log("Hello");
  console.log(name);
};

greet("John");

Limitations:
Arrow functions do not have their own "this" keyword.
Arrow functions cannot be used as constructors.
Arrow functions do not have arguments object. 
```

```js
IIFE (Immediately Invoked Function Expression):
A function that executes immediately after it is defined
No need to call it separately
Runs only once

Note:
IIFE must be wrapped in ( )
Semicolon before IIFE is mandatory to avoid errors.

Syntax:
(function (params) {
  // code
})(arguments);

Ex:
(function () {
  console.log("IIFE executed");
})();

Higher Order Function (HOF):
A function that accepts another function as argument OR returns a function

Ex:1

function calculate(a, b, operation) {
  return operation(a, b);
}

function add(x, y) {
  return x + y;
}

console.log(calculate(10, 5, add));

Ex :2

function mul(a) {
  return function (b) {
    return a* b;
  };
}

let double = mul(2);
double(5); // 10

Callback Function:
A function passed as an argument to another function
It will be executed later by another function

Ex:
function greet(name, callback) {
  console.log("Hello", name);
  callback();
}

function bye() {
  console.log("Bye");
}

greet("Rahul", bye); 
```

```js
GEC: GLOBAL EXECUTION CONTEXT:

Variable & Function Execution in Call Stack:

When JavaScript starts, a Global Execution Context (GEC) is created and pushed into the Call Stack.
Every javascript file executes in two phases.
1. Memory allocation phase
2. Execution phase

In the memory allocation phase:
var variables are hoisted and initialized with undefined.
let and const are hoisted but remain uninitialized (Temporal Dead Zone - TDZ).
Functions are fully hoisted and stored in memory with their complete definitions.

In the execution phase:
Code executes line by line.
Variables are assigned actual values.
let and const get initialized when execution reaches them.
Function declarations are already available in memory due to hoisting, so no execution happens at declaration.

When a function is invoked:
A new Function Execution Context (FEC) is created.
It is pushed on top of the GEC.

Inside the function:
Memory phase runs → local variables are hoisted, parameters are initialized, inner functions are stored.
Execution phase runs → function code executes line by line.

After function execution:
The Function Execution Context is popped from the Call Stack.
Control returns to the previous context (usually GEC).
The Call Stack follows LIFO (Last In First Out).

After all code execution completes:
The Global Execution Context is removed from the Call Stack and Call Stack becomes empty. 
```

```js
Nested Function?

A function written inside another function
Inner function can access outer function variables
An inner function is accessible only inside its outer function.

Ex:1 Basic Nested Function:
function outer() {
  console.log("Outer function");

  function inner() {
    console.log("Inner function");
  }

  inner(); // calling inner
}

outer();

Ex: 2
function outer() {
    let name = "John"; // Outer function variable

    function inner() {
        console.log("Hello " + name);
    }

    inner(); // Output: "Hello John"
}

outer();

Note:
inner() is written inside outer()
So it can access name present in outer function
This is a closure

Closure:
A closure is a function that remembers and has access to the declarations of its outer function, even after the outer function has finished executing. 
closure will generate for outer function, only when inner function is accessing outer function declarations 

Ex: 2 Creating counter using nested functions
function outer() {
  let count = 0;

  function inner() {
    count++;
    return count;
  }

  return inner;
}

let counter = outer();

counter(); // 1
counter(); // 2

Explanation:
outer() runs once
inner() is returned
count is still remembered because of closure
```
