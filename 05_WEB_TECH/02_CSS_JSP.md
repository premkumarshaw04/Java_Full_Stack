# Day 3

```html
<!-- Pseudo Class Selector  -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1:first-of-type{
            background-color: red;
        }
        h1:last-of-type{
            background-color: aqua;
        }
        h1:nth-of-type(4){
            background-color: blue;
        }
    </style>
</head>
<body>
    <div>
        <h1>Hello</h1>
        <h1>Hello</h1>
        <h1>Hello</h1>
        <h1>Hello</h1>
        <h1>Hello</h1>
        <h1>Hello</h1>
        <h1>Hello</h1>
    </div>
</body>
</html>
```

```html
<!-- Pseudo Element Selector -->
 <!DOCTYPE html>
 <html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        p::first-letter{
            color: orange;
            font-size: 30px;
        }
        p::first-line{
            color: green;
        }
        p::before{
            content: "Added ";
        }
        p::after{
            content: " End";
        }
        input{
            color: blue;
        }
        input::placeholder{
            color: red;
        }
        ol li{
            color: green;
        }
        ol li::marker{
            color: blue;
        }
        ul li::marker{
            color: red;
            content: "=> ";
        }
        p::selection{
            background-color: red;
            color: white;
        }
    </style>
 </head>
 <body>
    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Facere doloribus dolore sapiente? Iusto, commodi eligendi voluptates, consectetur similique veritatis tempore assumenda accusantium magni beatae soluta quasi at deserunt possimus nostrum sint doloremque adipisci delectus dolor explicabo nihil non ab. Necessitatibus porro inventore impedit fugit dolor eveniet voluptas. Magni, praesentium natus.
    Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ad officia ducimus corrupti necessitatibus commodi nam, debitis placeat porro quisquam, quidem repellat! Quidem porro mollitia in, non doloribus maiores aliquid ab est nam alias ipsa laborum iure, fugiat, recusandae illum officia earum labore! Dolores fuga dignissimos vero quidem iste pariatur totam!
    </p>

    <input type="text" placeholder="Enter text">

    <ol>
        <li>Hello</li>
        <li>Hello</li>
        <li>Hello</li>
        <li>Hello</li>
        <li>Hello</li>
    </ol>

    <ul>
        <li>Hii</li>
        <li>Hii</li>
        <li>Hii</li>
        <li>Hii</li>
    </ul>
 </body>
 </html>
```