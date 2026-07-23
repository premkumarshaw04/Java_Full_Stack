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

