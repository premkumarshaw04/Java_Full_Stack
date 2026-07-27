//! IIFE : Immedietely invoked Function expression 
// it will execute only once in its lifetime 
// the function which is wrapped inside paraenthesis and executes immedietly after its declaration, that function is known as IIFE function.
//? Syntax: ()()
//We have to terminate previous code by using ; (Semi colon) before IIfE function
//

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

