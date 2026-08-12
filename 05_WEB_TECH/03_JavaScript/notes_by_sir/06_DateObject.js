//! DATE OBJECT:
// Date is a built-in JavaScript object
// Used to work with date and time
// Date internally stores time in milliseconds
// Reference date: Jan 1, 1970 

//? Creating Date Object (Current Date & Time)

// let date = new Date();
// console.log(date);
// console.log(date.toString());
// console.log(date.toDateString());
// console.log(date.toTimeString());

// ? Get Methods of Date Object

// console.log(date.getFullYear());       // Year (YYYY)
// console.log(date.getMonth());          // Month (0–11)
// console.log(date.getDate());           // Day of month (1–31)
// console.log(date.getDay());            // Day of week (0–6)
// console.log(date.getHours());          // Hours
// console.log(date.getMinutes());        // Minutes
// console.log(date.getSeconds());        // Seconds
// console.log(date.getMilliseconds());   // Milliseconds

//? Creating Date using String Format
// Format: "YYYY-MM-DD" or "YYYY/MM/DD"

// let date = new Date("2026-02-20");
// console.log(date);

//? Creating Date using number parameters
// new Date(year, month, day, hours, minutes, seconds)
// Month is 0-based (0 = January)

//? http://Date.now()
// Returns current time in milliseconds from Jan 1, 1970

// let date = http://Date.now();
// console.log(date);
// console.log(date / (1000 * 60 * 60 * 24 * 365)); // Convert to years

//? Set Methods of Date Object

// let setDate = new Date();
// console.log(setDate);

// setDate.setFullYear(2030);
// setDate.setMonth(1);
// setDate.setDate(1);
// setDate.setHours(12);
// setDate.setMinutes(1);

// console.log(setDate); 