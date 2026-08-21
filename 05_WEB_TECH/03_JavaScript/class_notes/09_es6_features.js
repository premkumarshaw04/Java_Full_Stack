// ? ES6 features

// ? Destructuring:

// *
// let arr=[10,20,40,30,50]

// let [a,b,d,c,e]=arr
// console.log(a)
// console.log(b)
// console.log(c)
// console.log(d)
// console.log(e)

// * nested array:

// let arr2 = [10, [20, [30, [40, [100], 50], 60], 70], 80]
// arr2 = [a, [b, [c, [d, [e], f], g], h], i]

// console.log(a)
// console.log(b)
// console.log(c)
// console.log(d)
// console.log(e)

// * object

let person={
    name:"dheeraj",
    age:"23",
    salary:35000,
    email:"dheeraj@gmail.com",
    address:{
        state:'AP',
        city:'Chittor',
        pincode:'1234567'
    }

}

let person1={
    name:"raj",
    age:"22",
    salary:35000,
    email:"raj@gmail.com",
    address:{
        state:'UP',
        city:'Varanasi',
        pincode:'1234567'
    }

}
// let {email,address,address:{state,city}}=person

// console.log(email)
// console.log(state)

// ? REST OPERATOR:

// *...args

// let arr=[10,20,40,30,50]

// let[a,b,...args]=arr

// console.log(a)
// console.log(b)
// console.log(args)


// let {name,email,...details}=person

// console.log(name)
// console.log(email)
// console.log(details)

// ? SPREAD OPERATOR:

// * ...array/objects

//  let arr=[10,20,40,30,50]

//  console.log(...arr)
//  console.log(...person)

// function demo(a){
//     console.log(a)

// }
// demo(...arr)

//? Merging two differnt object using Spread Operator

let obj1 = {
    name : "Prem",
    email: "prem@gmail.com"
}

let obj2 = {
    address : "KA",
    branch: "btm"
}

let mergedObj = {...obj1,...obj2}
console.log(mergedObj);



