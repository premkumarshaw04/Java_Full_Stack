// //? Creating 

// let h1 = document.createElement(h1)
// h1.textContent = "DOM"
// //to create Attributes
// h1.setAttributes('id','dom')


// let p = document.createElement('p')
// p.textContent = "Document Object Model"
// // p.setAttribute('class', 'demo')
// // p.setAttribute('class', 'para')
// // p.setAttribute('class', 'test')

// //? to create class Attribute use: classList
// p.classList.add('demo')
// p.classList.add('para')
// p.classList.add('test')

// // p.classList.replace('test','fun')
// // p.classList.replace('test')

// console.log(p);
// // document.body.appendChild(p)
// // document.body.append(h1,p,"this is from js")

// document.body.append(h1,p)

// // document.body.prepend(h1,p,"this is from js")
// // document.body.before(h1,p,"this is from js")
// // document.body.after(h1,p,"this is from js")

// let div = document.createElement('div')
// div.setAttribute('id',"div")

// let p2 = document.createElement('p')
// p2.textContent = "i am para inside div tag"
// p2.setAttribute('id', 'para')
// p2.setAttribute('class', 'para1')
// // console.log(p2);

// let h3 = document.createElement('h3')
// h3.textContent = "i am h3 inside div tag"
// h3.setAttribute('id', 'heading')

// let span = document.createElement('span')
// span.textContent = "i am span inside div tag"
// span.setAttribute('id','span')

// //? CSS Styling:
// span.style.display = "none"

// div.append(p2,h3,span)
// // h3.remove()
// // p2.remove()
// document.body.append(div)

// let heading3 = document.querySelector(h3)
// heading3.style.backgroundColor = 'red'
// heading3.style.color = 'white'
// heading3.style.fontSize = '35px'
// heading3.style.fontFamily = 'sans-serif'



<!-- Create 50 heading tasks Create 100 paragraph tasks Create 500 button tagsand attach to the body by applying some css using class -->
```html
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>DOM Creation Tasks</title>

    <style>

        /* Common styling for all headings */
        .heading {
            color: blue;
            font-family: Arial, sans-serif;
            margin: 15px;
        }

        /* Common styling for all paragraphs */
        .paragraph {
            color: black;
            font-family: Arial, sans-serif;
            font-size: 16px;
            margin: 10px 15px;
        }

        /* Common styling for all buttons */
        .button {
            background-color: black;
            color: white;
            padding: 10px 20px;
            margin: 5px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        /* Button hover effect */
        .button:hover {
            background-color: gray;
        }

    </style>

</head>

<body>

    <script>

        // ============================================
        // CREATE 50 HEADING TAGS
        // ============================================

        for (let i = 1; i <= 50; i++) {

            let heading = document.createElement("h1");

            heading.innerText = "Heading Task " + i;

            heading.classList.add("heading");

            document.body.appendChild(heading);
        }


        // ============================================
        // CREATE 100 PARAGRAPH TAGS
        // ============================================

        for (let i = 1; i <= 100; i++) {

            let paragraph = document.createElement("p");

            paragraph.innerText = "Paragraph Task " + i;

            paragraph.classList.add("paragraph");

            document.body.appendChild(paragraph);
        }


        // ============================================
        // CREATE 500 BUTTON TAGS
        // ============================================

        for (let i = 1; i <= 500; i++) {

            let button = document.createElement("button");

            button.innerText = "Button " + i;

            button.classList.add("button");

            document.body.appendChild(button);
        }

    </script>

</body>

</html>
```
