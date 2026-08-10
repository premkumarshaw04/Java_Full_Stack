```js
// ? Arrays:
// let arr=[10,20,true,null,undefined,{},()=>{},[],34.6,45n,"Jspiders"]
// console.log(arr)
// console.log(arr.length)
// console.log(arr[0])
// console.log(arr[10])
// console.log(arr[100])

// arr[0]="HTML"
// arr[6]=1000
// console.log(arr)

// delete arr[0]
// delete arr[10]
// console.log(arr)

// let arr2=new Array("true",10,30,50)
// console.log(arr2)

// let arr3=new Array(10) // treats it as a length of array
// console.log(arr3)
// console.log(arr3.length)

// ? Mutating Methods of Array:
// ?1. push(): to add elements at the end of the array
// let arr=[10,20,30,40]
// arr.push(100,200,300,"js","abcd")
// console.log(arr.push(1000,2000,3000)) // returns length
// console.log(arr)

// ?2.pop(): removes last element from array
// removes only one element at a time
// arr.pop()
// arr.pop()
// console.log(arr)

// ?3. unshift():
// arr.unshift("a","b","c")
// console.log(arr)

// ?4. shift()
// arr.shift()
// arr.shift()
// console.log(arr)

// ?5.  splice():
// let arr=[10,20,30,40,50]
// console.log(arr.splice(2))
// console.log(arr.splice(2,2))
// console.log(arr.splice(1,3,100,200,300,400,500))
// console.log(arr.splice(2,0,1000,2000,3000))
// console.log(arr)

// ? sort():
// let names=['Karthik','Rahul','Rathore','Pandey','Rona','Nisha','Sriram','Neha','Sneha','Sreenivas']
// console.log(names.sort())

// let nums=[1,20,100,3,50,500,7,9,1000,11]
// console.log(nums.sort((a,b)=>a-b))
// console.log(nums.sort((a,b)=>b-a))
// ? reverse():
// console.log(names.sort().reverse())
// console.log(nums.sort().reverse())

// ?Non-Mutating Methods of Array:
// ?1. indexOf():
// let arr=[10,20,30,40,50,30,10]
// console.log(arr.indexOf(30))
// console.log(arr.indexOf(50))
// console.log(arr.indexOf(10))
// console.log(arr.indexOf(100))
// ?lastIndexOf():
// console.log(arr.lastIndexOf(30)) //5
// console.log(arr.lastIndexOf(50)) //4
// console.log(arr.lastIndexOf(10)) //6
// console.log(arr.lastIndexOf(100))//-1

// ?includes()
// console.log(arr.includes(30))
// console.log(arr.includes(50))
// console.log(arr.includes(10))
// console.log(arr.includes(100))  

// ?slice(SI,EI):
// console.log(arr.slice(1))
// console.log(arr.slice(2,6))
// console.log(arr.slice(10))
// console.log(arr.slice(100))

// ?concat()
// let fname=["raj"]
// let lname=['singh']
// console.log(fname.concat(lname,["rathore"],[10,20,30]))

// ?at()
// console.log(http://arr.at(2))
// console.log(http://arr.at(4))
// console.log(http://arr.at(14))

// ?flat():
// let nested=[10,[20,[30,[40],50],60,70],80]
// console.log(nested)
// console.log(nested.flat())
// console.log(nested.flat(1))
// console.log(nested.flat(2))
// console.log(nested.flat(3))
// console.log(nested.flat(Infinity)) // when we don't know depth

// ? join():
// let arr=[10,20,30,40,50,30,10]
// console.log(arr.join())
// console.log(arr.join(""))
// console.log(arr.join(" "))
// console.log(arr.join("@"))
// console.log(arr.join("JS"))

// split vs join 

// ? We will buy biryani to Sreenivas Sir
// reverse it
// let str="We will buy biryani to Sreenivas Sir"
// console.log(str.split(" ").reverse().join(" "))
// o/p:1 Sir Sreenivas to biryani buy will We

// console.log(str.split("").reverse().join(""))
// o/p:2 riS savineerS ot inayrib yub lliw eW

// let res=str.split("").reverse().join("")
// console.log(res.split(" ").reverse().join(" "))
// o/p:3 eW lliw yub inayrib ot savineerS riS


// ? Array Loops:
// for of: to access elements of array or strings
// for in: to access indices of array or strings

let arr=[10,20,30,40,50]
// for (const ele of arr) {
//     console.log(ele)
// }

// for (const index in arr) {
//     console.log(index)
// }

// let str="We will buy biryani to Sreenivas Sir"

// for (const ele of str) {
//     console.log(ele)
// }

// for (const index in str) {
//     console.log(index)
// }


// ? Array Advance Methods:
let arr1=[1,201,30,40,50]
// ?forEach(callback)
// arr1.forEach((ele,ind,arr)=>{
//     console.log(ele)
//     console.log(ind)
//     console.log(arr)
    // return ele // it won't support
// })

// ?find(callback):
// console.log(arr1.find((ele)=>ele%2==0))
// console.log(arr1.find((ele)=>ele%2==1))
// console.log(arr1.find((ele)=>ele>1000))

// ?filter(callback):
// console.log(arr1.filter((ele)=>ele%2==0))
// console.log(arr1.filter((ele)=>ele%2==1))
// console.log(arr1.filter((ele)=>ele>10))
// console.log(arr1.filter((ele)=>ele>1000))


// let values=[10,'a',null,"jaiSurya",false,'Rahul',undefined,30,0,"",[],{},()=>{},30n,true]

// console.log(values.filter((ele)=>ele))
// console.log(values.filter((ele,index)=>index))

// ? some(callback):
// let nums=[11,9,5,7,1,13,19,21]
// console.log(nums.some(ele=>ele%2==0))

// console.log([].some(ele=>ele%2==0))

// ? every(callback):
// console.log(nums.every(ele=>ele%2==0))
// console.log(nums.every(ele=>ele%2==1))

// console.log([].every(ele=>ele%2==0)) 

Aug 04 - 4:20 pm
Guys, can anyone share me the coding questions in arrays which we solved in class. 

Aug 05 - 3:19 pm
10. split(separator)

	Converts string to array
	Uses a separator to split
	Returns a new array
	Original string does not change

	let str12 = "ap&ple,ban&ana,man&go";
	let result12 = str12.split(",");
	console.log(result12);
	console.log(str12.split("&"));

11. concat()

	string1.concat(string2, string3, ...)
	joins multiple strings
	Returns a new string
	+ operator or template literals are more commonly used

	let a = "Hello";
	let b = "JS";
	let result13 = a.concat(" ", b);
	console.log(result13);

12. indexOf()

	string.indexOf(searchValue)
	Returns first occurrence index
	Returns -1 if not found
	Case-sensitive
	Searches from left to right

	let str14 = "JavaScript";
	console.log(str14.indexOf("a")); // returns the index of first occured 'a'
	console.log(str14.indexOf("r")); 

13. lastIndexOf(): 
	string.lastIndexOf(searchValue)
      	Returns the last occurrence index
	Returns -1 if not found
	Case-sensitive
	Searches from right to left	

	let str15 = "banana";
	console.log(str15.lastIndexOf("a")); // returns index value of last occured 'a'

14. includes()
	string.includes(searchValue)
	Checks if string contains a specified value or not
	Returns true or false
	Case-sensitive
	
	let str16 = "I love JavaScript";
	console.log(str16.includes("JavaScript"));
	console.log(str16.includes("Java"))
	console.log(str16.lastIndexOf("a"))

15. charAt(index)
	Returns the character at given index
	Returns empty string if index is negative or not found

	let str17 = "JavaScript";
	console.log(str17.charAt(0));
	console.log(str17.charAt(5));

16. startsWith()
	string.startsWith(searchString)
	Checks whether a string starts with a specified value.
	Returns boolean (true / false)
	Case-sensitive

	Ex:
		let str = "JavaScript";
		console.log(str.startsWith("Java")); // true
		console.log(str.startsWith("Script")); // false

17. endsWith()
	string.endsWith(searchString)
	Checks whether a string ends with a given value.
	Returns boolean (true / false)
	Case-sensitive

	Ex: 
	let str = "JavaScript";
	console.log(str.endsWith("Script")); // true
	console.log(str.endsWith("Java")); // false

18. repeat():
	The repeat() method creates a new string by repeating the original string a specified number of times.
	The original string does not change

	Syntax : string.repeat(count)
	count → the number of times the string should be repeated.
	Must be integer ≥ 0.
	Ex:
	Examples
	let str = "Hi! ";

	console.log(str.repeat(3)); // "Hi! Hi! Hi! "
	console.log("abc".repeat(5)); // "abcabcabcabcabc"

	if count = 0 → returns an empty string
	count is negative → throws RangeError
	count is a decimal → converted to integer
 

Aug 10 - 4:31 pm
Array:
In JS, an array is a non-primitive data type.
An array is a collection of homogeneous and heterogeneous types of data.
Used to store multiple values in a single variable
In JS, arrays are dynamic in nature; that means the length and data types are not restricted. 
Arrays are mutable and Stored as objects internally.
Values are stored in indexed order
The index starts from 0.


Arrays can be created in 2 ways: 
1. Using Literals 
2. Using new Keyword

1. Using Literals 
Syntax: var arr = [element1, element2, ..., elementN]; 
Example: 
var arr = [10, 20, 30, 40, 50]; 
console.log(arr);

2. Using new Keyword 
Syntax: var arr1 = new Array(); 
Example: 
var arr2 = new Array(); // Creates an empty array 
console.log(arr2);
var arr3 = new Array(10, 20, 30, 40, 50); // Creates an array with elements 
console.log(arr3);

Note: 
Single-value issue
let arr4 = new Array(5); // creates empty array of length 5.

Insertion in Arrays :
Insertion is the process of adding elements into an array.
var arr5 = [ ]
arr5[0] = 10; // Inserts 10 at index 0 
arr5[1] = 20; // Inserts 20 at index 1 
arr5[2] = 30; // Inserts 30 at index 2 
console.log(arr5);

Modification in Arrays: 
Modification is the process of updating the elements present in an array.
arr5[1] = 200; // Modify element at index 1 
arr5[2] = 300; // Modify element at index 2 
arr5[4] = 500; // Modify element at index 4 
console.log(arr5);

Deletion in Arrays:
Deletion is the process of removing elements from an array.
delete arr5[1]; // Delete element at index 1 
delete arr5[2]; // Delete element at index 2
console.log(arr5);

Mutating methods of Array:

push():
Adds one or more elements to the end of the array
Modifies the original array
Returns the new length of array
Can add multiple elements
Ex:
let arr = [1, 2];
arr.push(3, 4);
console.log(arr);
arr.push("apple", "banana", "mango");
console.log(arr);

pop():
Removes the last element of the array.
Modifies original array
Returns removed element
Returns undefined if array is empty
accepts no arguments and ignored if passed
Ex:
let removed = arr.pop();
let removed2=arr.pop()
console.log(arr);     
console.log(removed); 

unshift():
Adds elements at the beginning of the array
Modifies original array
Returns new length
Slower than push() (reindexes array)
Ex:
arr.unshift(100, 200);
console.log(arr)

shift():
Removes the first element of the array
Modifies original array
Returns removed element
Slower than pop()
accepts no arguments and ignored if passed
Ex:
arr.shift();
console.log(arr);

splice():
Add, remove, or replace elements at any index of the array.
It accepts three or more args: first: starting index, second: delete count; and third and more to 
add the elements in the array.  
Modifies original array
Returns array of removed elements
Syntax:
array.splice(start, deleteCount, item1, item2...)
Ex:
let removed = arr.splice(1, 2, 9, 8);
console.log(arr);     
console.log(removed)

sort():
Sorts the elements of an array.
Modifies original array
Returns the sorted array
Converts elements to strings by default and sorts 
Syntax:
array.sort(compareFunction)
Ex:
let arr4=["apple","ball","zomato","swiggy","instagram","zepto","minutes"]
console.log(arr4.sort())

let arr5=["Apple",{},"apple",()=>{},"Ball",10,"ball",30,"zomato","swiggy",40,"Instagram","zepto","Minutes"]
console.log(arr5.sort())

Note: For numbers, a compare function is needed
Ex:
let arr4=[100,10,3,420,5];
console.log(arr4.sort((a,b)=>a-b)); //ascending order
console.log(arr4.sort((a,b)=>b-a))  //descending order

reverse()

Reverses the order of elements in an array.
Modifies original array
Returns the reversed array
Does NOT create a new array
Syntax:
array.reverse()
Ex:
let arr = [10, 20, 30, 40, 50];
console.log(arr.reverse());

let arr = ["abc", "def", "ghi", "jkl", "mno"];
console.log(arr.reverse());

// ! reverse a string 
// "i am indian"  --> "indian am i"
let str = "I am indian";
// let arr = str.split(' ')
// console.log(arr); // ['I', 'am', 'indian']
// arr.reverse()
// console.log(arr);
// let revString = arr.join(' ')
// console.log(revString);

// ! shorter way
// let str1 = str.split(' ').reverse().join(' ')
// console.log(str1);

//! "i am indian"  --> "naidni ma i"
// let revChar = str.split('').reverse().join('')
// console.log(revChar);

//! "i am indian"  --> "i ma naidni"
// let str3 = revChar.split(' ').reverse().join(' ')
// console.log(str3);


Non-mutating methods of Array:
These methods do NOT change the original array.

arr.indexOf(element) 

Returns first occurrence index
Returns -1 if not found

console.log(arr.indexOf(40)); //3 
console.log(arr.indexOf(100)); //-1 

lastIndexOf(element) 
it will return the index of last occurrence of the element 
console.log(arr.lastIndexOf(10));

includes()
array.includes(searchValue, startIndex)
Checks if array contains a specified value or not
Returns true or false
console.log(arr.includes(20)); // true
console.log(arr.includes(50)); // false

concat() 
// Syntax: array.concat(array1, array2, ..., arrayN) 
Combines two or more arrays and returns a new array. 
Ex:
let arr1 = [1, 2]; 
let arr2 = [3, 4]; 
let newArr = arr1.concat(arr2); 
console.log(newArr);

slice() 
Syntax: array.slice(startIndex, endIndex) 
Returns a copy of a portion of an array. 
It will always exclude the ending index 
Supports negative indexes

Example: 
let arr = [1, 2, 3, 4]; 
let sliced = arr.slice(1, 3); // Extracts elements from index 1 to 2 
console.log(sliced);

join():
Converts array elements into a string by using a custom separator.
Syntax: array.join(separator)
Returns string
Default separator is ,
Does not modify array
Custom separator allowed
More flexible than toString()
Ex:
let arr = [1, 2, 3];
console.log(arr.join()); //default separator --->  "1,2,3"

let arr = ["H", "I"];
console.log(arr.join("")); // empty string separator --->  "HI"

let arr = [1, 2, 3];
console.log(arr.join(0)); //numeric separator ---> "10203"

Note:
Nested arrays call toString()
let arr = [1, [2, 3], 4];
console.log(arr.join("-")); // "1-2,3-4"

join() treats empty slots, undefined, and null all as empty strings
let arr = [1, , 3];
console.log(arr.join("-")); // "1--3"

flat():
It creates a new array by flattening nested arrays.
array.flat(depth)
Default depth = 1
Removes empty slots
Flattens only up to given depth
we can use Infinity as depth when we don't know exact depth
Ex:
let arr = [1, [2, 3]];
console.log(arr.flat()); // [1, 2, 3]

let arr = [1, [2, [3]]];
console.log(arr.flat()); // default depth ----> [1, 2, [3]]

console.log(arr.flat(2)); // custom depth----> [1, 2, 3]

console.log(arr.flat(Infinity)); // when we don't know depth

let arr = [1, , 2, [ , 3]];
console.log(arr.flat()); //removes empty slots----> [1, 2, 3]


Array Loops:

for of():
Direct access to values
Cannot directly access index
we can use it on Iterating arrays and strings
Ex:
let snacks = ["Biscuit", "Chips", "Chocolate"];

for (let items of snacks) {
  console.log("Eating:", items);
}

let name = "RAM";
for (let letter of name) {
  console.log(letter);
}

for in():
Direct access to indexes, not values
Can be used on arrays but NOT recommended
The index is returned as a string

Ex:
let snacks = ["Biscuit", "Chips", "Chocolate"];

for (let items in snacks) {
  console.log("Eating:", items);
}

let name = "RAM";
for (let letter in name) {
  console.log(letter);
}


Advance Methods of Array:

forEach():
forEach() accepts a callback function as argument
Callback function receives 3 parameters: value, index, and array
execute a callback function for every element.
Index and array parameters are optional
Used for side effects like logging, updating DOM, modifying variables, etc.
return is not allowed if used; then it always returns undefined instead of values.
Empty elements are skipped.
It does not return a new array.

Syntax: 
array.forEach((element, index, array) => {
  	// logic
});
Ex:
let arr = ["JS", "HTML", "CSS"];
arr.forEach((value, index) => {
  console.log(index, value);
});

Ex-2: 
let arr2 = [1, 2, 3, 4];
let sum = 0;
arr2.forEach(value => {
  sum += value;
});
console.log(sum); // 10

find()
It accepts callback function as argument with upto 3 parameters: element, index, and array
Index and array parameters are optional
Callback must return true or false
Returns the FIRST element that satisfies a condition
Stops after first match
Returns undefined if not found
Returns value, not array 
Does not modify array

Syntax:
array.find((element, index, array) => {
  return condition;
});

Ex: Find first even Number?

let arr = [1, 3, 4, 6];
let result = arr.find(n => n % 2 === 0);
console.log(result); // 4

Ex:2 Find first number greater than 10

let arr2 = [5, 8, 12, 20];
let res = arr2.find(n => n > 10);
console.log(res); // 12

some():
some() accepts a callback function as argument
Callback function receives value, index, and array
Index and array parameters are optional
Callback must return true or false
some() checks whether at least ONE element in the array satisfies a given condition.
Returns true if at least one element satisfies condition
Returns false if no element satisfies condition
Stops immediately after first true
Does not modify the array
Skips empty slots

Syntax:
array.some((value, index, array) => {
  return condition;
});

Ex-1: check if any even number exists
let arr = [1, 3, 5, 8];
let result = arr.some(n => n % 2 === 0);
console.log(result);

Ex-2: Checking presence of element
let arr2 = [10, 20, 30];
let exists = arr2.some(n => n === 20);
console.log(exists); // true

Note:
[ ].some(n => n > 0);
some() on empty arrays always returns false because there is no single element which satisfies the condition

every():
every() accepts a callback function first argument
Callback function receives value, index, and array
Index and array parameters are optional
Callback must return true or false
every() checks whether ALL elements in the array satisfy a given condition.
Returns true if all elements satisfy condition
Returns false if any element fails condition
Stops immediately on first false
Does not modify the array
Skips empty slots

Syntax:
array.every((value, index, array) => {
  return condition;
});

Ex-1: check if all numbers are even
let arr = [2, 4, 6];
let result = arr.every(n => n % 2 === 0);
console.log(result); 

Ex-2: When one element fails
let arr2 = [2, 3, 6];
let result = arr2.every(n => n % 2 === 0);
console.log(result); 

Note:
[ ].every(n => n > 0);
every() on empty arrays always returns true because there is no element which fails the condition.  

filter():
filter() accepts a callback function first argument
Callback function receives value, index, and array
Index and array parameters are optional
Callback must return true or false
filter() is used to select all the elements from an array that satisfies the condition.
Returns a new array.
Returns empty array if no match
Length ≤ original array.
Does not modify the original array
Skips empty slots

Syntax:
array.filter((value, index, array) => {
  return condition; 
});

Ex-1: filter all even numbers
let arr = [1, 2, 3, 4, 5];
let even = arr.filter(n => n % 2 === 0);
console.log(even); 

Ex-2: When no element matches returns empty array
let arr2 = [1, 3, 5];
let result = arr2.filter(n => n % 2 === 0);
console.log(result);

map():
map() accepts a callback function as argument
Callback function receives value, index, and array
Index and array parameters are optional
map() is used to transform each element of an array 
returns a new array of the same length.
Does not modify original array
Syntax:
http://array.map((value, index, array) => {
  return newValue;
});

Ex-1: double each element of array
let arr = [1, 2, 3];
let result = http://arr.map(n => n * 2);
console.log(result); 
console.log(arr);    

Ex-2: Transform array of strings to upperCase
let names = ["ram", "sam"];
let upperNames = http://names.map(name => name.toUpperCase());
console.log(upperNames);

Ex-3: Chaining Example
let arr2 = [1, 2, 3, 4];
let result = http://arr2.map(n => n * 2).filter(n => n > 4);
console.log(result); 

reduce():
reduce() accepts a callback function and initial value as arguments
Initial value is optional but recommended
Callback function receives accumulator, currentValue, index, and array
Index and array parameters are optional
reduce() is used to reduce an array into a single value by repeatedly applying a callback function.
Iteration happens from left to right
The final value can be: number, string, object, array, boolean
Throws TypeError on empty array without initialValue

Syntax:
array.reduce((accumulator, currentValue, index, array) => {
  return updatedAccumulator;
}, initialValue);

How reduce() Works (Core Idea)
Start with initialValue
For each element: Update accumulator
After last element → return accumulator

Ex-1: Sum of array of elements
let arr = [1, 2, 3, 4];
let sum = arr.reduce((acc, curr) => {
  return acc + curr;
}, 0);
console.log(sum); 

Ex-2: Without initial value (Important)
let arr2 = [1, 2, 3];
let sum = arr2.reduce((acc, curr) => acc + curr);
console.log(sum);

// If initial value is not provided then accumulator will take first element of array as initial value and cur will be next element of array
i.e., acc = 1 and curr = 2

Ex-3: Find Maximum Value
let arr = [10, 5, 20, 8];
let max = arr.reduce((acc, curr) => {
  return curr > acc ? curr : acc;
});
console.log(max); 

Ex-4: Reduce to a String
let arr = ["J","A","V","A", "S", "C", "R", "I", "P", "T"];
let result = arr.reduce((acc, cur) => acc + cur, "");
console.log(result)

Ex-5: Frequency count each element
let arr = ["a", "b", "a", "c"]; or let arr = [1,3,5,6,3,8,5,3,0,6,0]

let freq = arr.reduce((acc, cur) => {
  acc[cur] = (acc[cur] || 0) + 1;
  return acc;
}, {});
console.log(freq); 
```