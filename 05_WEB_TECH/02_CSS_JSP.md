# Day 3 | Pseudo Class and Element Selectors

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

---

# Day 4

## Attribute Selectors

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        h1[title]{
            background-color: red;
        }
        h1[title="good night"]{
            background-color: green;
        }
        input[type]{
            height: 30px;
        }
        input[type="text"]{
            width: 300px;
        }
        input[type="password"]{
            width: 200px
        }
        input[type = "email"]{
            width: 250px;
        }
        input[type=number]{
            width: 100px;
        }
    </style>
</head>
<body>
    <h1 title="good evening">Hello</h1>
    <h1 title="good night">Hello</h1>

    <form action="">
        <input type="text" placeholder="Username"> <br>
        <input type="password" placeholder="password"> <br>
        <input type="email" placeholder="email"> <br>
        <input type="number" placeholder="number"> <br>
    </form>

</body>
</html>
```
---

## Colors and their HEX code
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            height: 200px;
            width: 200px;
            /* background-color: red;
            background-color: rgb(213, 42, 42);
            background-color: rgba(50, 6, 6, 0.421); // in rgbs: a stands for alpha, which represents 
            opcaity of any color */
            
            /* background-color: #ff0000; [Hex code] */

            background: linear-gradient(90deg, black, red); 
            /* this will blend both the colors */

        }
    </style>
</head>
<body>
    <div></div>
</body>
</html>
```

---

## Units

```html
<!-- 
px (Pixel): A fixed CSS unit used to define an exact size on the screen.

% (Percentage): A relative unit where the value is calculated based on the size of the parent element.

vw (Viewport Width): A unit equal to 1% of the browser's viewport width.

vh (Viewport Height): A unit equal to 1% of the browser's viewport height.

em: A relative unit based on the font size of the parent element (or the element itself for some properties).

rem (Root em): A relative unit based on the font size of the root (html) element(html element has by default size as 16 px).

times (times in CSS animation): Refers to the number of times an animation repeats, controlled by the animation-iteration-count property.

deg (Degree): A unit used to specify angles, commonly with CSS functions like rotate(), linear-gradient(), and skew(). Example: rotate(45deg).
-->
```

## Difference Between em and rem

| em | rem |
|---|---|
| Relative to the font size of the parent element. | Relative to the font size of the root (html) element. |
| Changes when the parent's font size changes. | Remains consistent unless the root font size changes. |
| Can cause nested scaling because it inherits from parent elements. | Does not cause nested scaling. |
| Best used when you want an element to scale with its parent. | Best used for consistent sizing across the entire website. |

## One-line Answer

- **em**: A relative unit based on the parent element's font size.
- **rem**: A relative unit based on the root (html) element's font size.

---

# Day 5 | Box Model

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        div{
            height: 200px;
            width: 200px;
            background-color: red;
            color: white;

            /* PADDING  */
            /* padding-top: 10px;
            padding-right: 20px;
            padding-bottom: 30px;
            padding-left: 40px; */
            /* padding: 30px; */

            /* BORDER  */
            /* border-width: 3px;
            border-style: groove;
            border-color: red; */
            border: 3px solid green;

            /* BORDER RADIUS*/
            /* border-top-left-radius: 20px;
            border-top-right-radius: 40px;
            border-bottom-right-radius: 10px;
            border-bottom-left-radius: 15px; */
            /* border-radius: 10px 20px 30px 40px; */

            /* it will form a circle  */
            /* border-radius: 50%; */

            /* MARGIN  */
            /* margin: 100px 200px 250px 20px;  */
            
            /* auto will only work for left and right  */
            margin: auto;

            
        }
    </style>
</head>
<body>
    <h1>Box Model</h1>
    <div>hello</div>
</body>
</html>
```

## Designing a login form.

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
    <style>
        *{
            padding: 0;
            margin: 0;
            box-sizing: border-box;
            font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
        }
        body{
            height: 100vh;
            width: 100vw;
            background: linear-gradient(purple,blue);
        }
        form{
            height: 80vh;
            width: 30vw;
         background-color: #ffffff;
         margin: 80px auto;
         border-radius: 20px;
         box-shadow: 0px 0px 20px white;
        }
     
        #profile-container,#input-container{
            margin: auto;
        }
           #profile-container{
            height: 30%;
            width: 90%;
        }
        #input-container{
            height: 60%;
            width: 90%;
            margin-top: 50px;
        }
        #profile{
            height: 50%;
        }
        #profile img{
            height: 100%;
            margin:20px 150px;
        }
        #profile-container section>p{
            width: 100%;
            margin: 50px 140px;
            font-size: 18px;
            font-weight: 700;
        }
         #input-container input, #input-container button{
            height: 30px;
            width: 90%;
            margin:10px 20px;
            padding: 0px 10px;
         }
         #input-container button{
            background-color: blue;
            color: white;
            font-size: 18px;
            font-weight: 700;
            border: none;
         }
    </style>
</head>
<body>
    <form>
        <div id="profile-container">
            <section id="profile">
                <img src="https://i.pinimg.com/564x/57/00/c0/5700c04197ee9a4372a35ef16eb78f4e.jpg" alt="">
            </section>
            <section>
                <p>Please Login</p>
            </section>
        </div>
        <div id="input-container">
            <input type="text" placeholder="username">
            <br>
            <input type="password" placeholder="password">
            <br>
            <button>Login</button>
        </div>
    </form>
</bodzy>
</html>
```


