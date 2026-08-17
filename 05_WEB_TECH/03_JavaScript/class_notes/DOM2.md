# Creting Table with the help of DOM Manipulation

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        table{
            border-collapse: collapse;
            width: 100%;
        }
        th,td{
            border: 1px solid red;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Table</h1>

    <script>
    //Creting Table with the help of DOM Manipulation

    let table = document.createElement('table')

    let tr = document.createElement('tr')
    let th = document.createElement('th')
    th.textContent = "Name"
    let th2 = document.createElement('th')
    th2.textContent = "Role"
    let th3 = document.createElement('th')
    th3.textContent = "Salary"

    let tr2 = document.createElement('tr')
    let td1 = document.createElement('td')
    td1.textContent = "Karthik"
    let td2 = document.createElement('td')
    td2.textContent = "Developer"
    let td3 = document.createElement('td')
    td3.textContent = 25000

    tr.append(th,th2,th3)
    tr2.append(td1, td2, td3)

    table.append(tr,tr2)
    document.body.append(table)
    </script>
</body>
</html> 
```

# Dynamic table Creation using Array Data

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <style>
        table{
            border-collapse: collapse;
            width: 100%;
        }
        th,td{
            border: 1px solid red;
            padding: 8px;
            text-align: left;
        }
    </style>
    
</head>
<body>
    
    <script>
        //Dynamic table Creation using Array Data
        let tableData = [
            ["name","age","gender"],
            ["Prem","23","Male"],
            ["Prem","23","Male"],
            ["Prem","23","Male"],
            ["Prem","23","Male"],
            ["Prem","23","Male"],
            ["Prem","23","Male"]
        ];

        let table = document.createElement('table')
        tableData.forEach((rows, index)=>{
            let tr = document.createElement('tr')
            rows.forEach(data=>{
                let cell = document.createElement(index == 0 ? 'th': 'td')
                cell.textContent = data
                tr.append(cell)
            })
            table.append(tr)

        })
        document.body.append(table)
</script>
    
</body>
</html>
```