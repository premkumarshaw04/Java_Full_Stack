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