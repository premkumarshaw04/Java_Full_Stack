// BOM (BROWSER OBJECT MODEL):
// BOM (Browser Object Model) allows JavaScript to communicate with the browser.
// The window object is the main entry point for accessing BOM features.
// It provides objects that let us:
// Control browser window
// Read browser information
// Navigate between pages
// Display dialogs (alert, prompt, confirm, etc.).
// Control timers

// NOTE: BOM is provided by the browser, not JavaScript.

// All BOM objects exist inside window object.
// console.log(window);

//? Window Properties:
//? document:
// document represents the HTML page loaded in the browser.
// When the browser loads a web page, it converts HTML into a DOM tree, and that tree is accessible using document.
// By using this, we can make changes in the HTML page.
// document belongs to DOM but it is accessed through BOM.

//? screen:
// It provides the basic information about the user's screen like height, width, orientation, etc…
// console.log(screen.width); //How wide the monitor is
// console.log(screen.height); //How wide the monitor is

// Note: We cannot change these values because they belong to the hardware, not the browser.

//? history:
// It will keep a track of web pages you opened and it will store as history. We
// can perform forward() , back() operations using this.
// returns undefined if page is not available

// history.back();     // Go to previous page
// history.forward();  // Go to next page
// history.go(-2);     // jump 2 pages back
// history.go(2);     // jump 2 pages front

//? location:
// It provides the basic information about the current location like path, hostname, href, etc.,
// console.log(location.href);  // full URL
// To redirect:
// location.href = "https://www.google.com"; // This tells the browser to open google page.

//? innerHeight & innerWidth:
// These represent the visible area of the webpage.
// Ex:
// console.log(window.innerWidth);
// console.log(window.innerHeight);

// This tells:
// How much space is available to show your website
// Used in responsive design.

//? outerHeight & outerWidth:
// These represent the full browser window size, including: Tabs, Address bar, Borders
// Ex:
// console.log(window.outerWidth);
// console.log(window.outerHeight);

// ! Window methods:
// ? also called as Dialog Methods:
//? alert():
// Displays a simple message box with an OK button.
// Show information
// Warning messages
// Notifications
//? Syntax:
// alert(message);
// Ex: alert("Shivam look here");
//  ! Note:
// Stops execution until user clicks OK
// No return value

//?  prompt()
// Takes input from the user.
// Syntax
// prompt(message, defaultValue);4
// Returns:
// string → if user enters value
// null → if user clicks Cancel

// Ex 1: Without default value
// let a = Number(prompt("Value of a"));
// console.log(a);
// console.log(typeof a);
//? Input is always string, so we convert it using Number().

// Ex 2: With default value
// let b = Number(prompt("Value of a", "234"));
// console.log(b);

//? confirm()
// Asks user to confirm an action.

// Syntax:
// confirm(message);
// Returns:
// true → OK
// false → Cancel
// Ex:
// let value = confirm("Are you sure you want to exit?");
// console.log(value);

// Commonly used before delete, logout, exit actions.

//? Timer Methods
// Timers are used to delay execution or repeat tasks.

//? setTimeout()
// Executes a function once after a delay.

// Syntax:
// setTimeout(callback, delay);
// Ex:
// setTimeout(() => {
//   console.log("I am setTimeout");
// }, 3000);
// Runs after 3 seconds

//? clearTimeout()

// Stops a setTimeout() before execution.
// Syntax:
// clearTimeout(timeout_Id);

// Ex:
// let timeId=setTimeout(() => {
//   console.log("I am setTimeout");
// }, 3000);

// clearTimeout(timeId);

//? setInterval()
// Executes a function repeatedly at fixed intervals.
//? Syntax:
// setInterval(callback, interval);
// Ex:
// setInterval(() => {
//   console.log("I am setInterval");
// }, 1000);
// Runs every 1 second

// ? clearInterval()
// Stops a running interval.
// ?Syntax:
// clearInterval(interval_Id);
// Ex:
// let interval = setInterval(() => {
//   console.log("I am setInterval");
// }, 1000);
// clearInterval(interval)  

