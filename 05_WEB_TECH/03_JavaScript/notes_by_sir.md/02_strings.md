# Strings

```js
String:
A string is a primitive data type in JavaScript used to store and manipulate the sequence of characters, essentially text.

Strings are immutable
Stored inside quotes: ' ', " ", or ` `
Indexing starts from 0
JavaScript automatically converts strings to objects when calling methods, which leads to auto-boxing

Auto-boxing is the process where JavaScript automatically converts a primitive value into its corresponding object when you try to access properties or methods on it.
Happens only when accessing properties or methods. After execution, the object is destroyed

Ex:
let name = "JavaScript"
let name2 = 'JavaScript'

let name3 = `JavaScript is 
		     scripting and
		     programming language`

To find the length of the string, we have to use length property

console.log(name3.length)

String Methods:
All string methods return a new string, and they do not change the original one.

1. toLowerCase()
	Converts string to lowercase

	let sub="JAVASCRIPT"
	console.log(sub.toLowerCase())

	"HELLO".toLowerCase(); // "hello"

2. toUpperCase()
	Converts string to uppercase

	let sub2="html"
	console.log(sub2.toUpperCase())

3. toString()
	Converts a value into a string
	Works on numbers, booleans, arrays, objects
	Returns a new string
	Does not modify original string
	Ex:
	let num = 123;
	console.log(num.toString());   // "123"
		or
	console.log((123).toString())

	let bool = true;
	console.log(bool.toString());  // "true"

	let arr = [1, 2, 3];
	console.log(arr.toString())

Note: We should not used toString() with null and undefined. It causes an error.

4. trimStart()
	Removes spaces from start only
	let str4 = "   hi";
	console.log(str4.trimStart());

5. trimEnd()
	Removes spaces from end only
	let str5 = "hi   ";
	console.log(str5.trimEnd());

6. trim()

	Removes spaces from both ends
	let str6 = "   hi   ";
	console.log(str6.trim());

7. replace(searchValue, newValue)

	Replaces first occurrence only
	Case-sensitive

	let str7 = "Java Java";
	let result7 = str7.replace("Java", "JS");
	console.log(result7);

8. replaceAll(searchValue, newValue)
	Replaces all occurrences
	Case-sensitive

	let str8 = "Java Java";
	let result8 = str8.replaceAll("Java", "JS");
	console.log(result8);
	

9.  slice(startIndex, endIndex) 
	Extracts part of a string based on index
	end index is not included
	Supports negative indexes
	Most preferred method

	let str11 = "JavaScript";
	let result11 = str11.slice(-6);
	console.log(result11);
```