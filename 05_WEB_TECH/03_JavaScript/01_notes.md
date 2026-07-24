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
