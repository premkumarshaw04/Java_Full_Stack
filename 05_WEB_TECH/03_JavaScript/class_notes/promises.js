//? Promise:

// let promi=new Promise((resolve,reject)=>{
//     let a=100
//     if(a==10){
//         resolve("Promise Resolved")
//     }else{
//         reject("Promise Rejected")
//     }
// })


// console.log(promi)
// promi.then(msg=>{
//     console.log(msg)
// }).catch(msg=>{
//     console.log(msg)
// })

// let prmi2=new Promise (res=>{
//     setTimeout(()=>{
//         res("Promise Resolved")

//     },2000);
// }).then(msg=>console.log(msg))
// ? Promise Methods:

// ?Promise.all():

// let promi1=Promise.reject("promise rejected")
// let promi2=Promise.reject("promise rejected")
// let promi3=Promise.resolve("promise resolved")

// Promise.all([promi1,promi2,promi3])
// .then(msg=>console.log(msg))
// .catch(msg=>console.log(msg))

// ? Promise.any(): checks for any one resolved promise if not not then return all promise is rejected.
// Promise.any([promi1,promi2,promi3])
// .then(msg=>console.log(msg))
// .catch(msg=>console.log(msg))

// ?promise.allSettled()
// Promise.allSettled([promi1,promi2,promi3])
// .then(msg=>console.log(msg))
// .catch(msg=>console.log(msg))

// ?promise.race()

// let car=new Promise(res=>{
//     setTimeout(()=>{
//         res("car is win")
//     },4000);

// })

// let bike=new Promise(res=>{
//     setTimeout(()=>{
//         res("bike is win")
//     },5000);

// })
// let horse=new Promise(res=>{
//     setTimeout(()=>{
//         res("horse is win")
//     },1000);

// })
// Promise.race([car,bike,horse])
// .then(msg=>console.log(msg))
// .catch(msg=>console.log(msg))