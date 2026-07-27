//! Characteristics of Arrow functions:
//? 1. In case of no parameters: 
// ()=>{}

//? 2. In case of single parameter, parenthesis are optional
// a=>{}

//? 3. In case of multiple parameters, parenthesis are mandatory
// let arrow3 = (a,b) => {console.log(a+b)}
// arrow3(10, 20)

//? 4. Implicit return: It will work only when you have one line expression
// let arrow4 = (a,b) => a+b
// console.log(arrow4(10, 20))

//? 5. Explicit return (When we want to use return keyword manually): it should must be enclosed with in curly braces [Most Important]
// let arrow5 = (a,b) => {
//     console.log(a);
//     console.log(b);
//     return a+b;
// }
// console.log(arrow5(10,20));

//! Drawbacks/Failure/Limitations of Arrow Functions  
//1. Arrow function can not use this keyword
//? Use of this keyword: Point to the current object 

//We can not use arrow functions as Constructors
//arrow functions will not support arrow functions.


//? How to find the length of the function
// let arrow5 = (a,b) => { //no fo parameters will be the length of the function
//     //If you have default values thenit will not considered as length 
//     console.log(a);
//     console.log(b);
//     return a+b;
// }
// console.log(arrow5(10,20));
// console.log(arrow5.length); //2// beacuse we have a, b as patrameters




