# DQL 

## Queries Based on Projection:

> Projection => It is a way of retrieving the data present in columns.

>We will Perform the Queries on **EMP**(Employee) Database:

```
SQL> SELECT * FROM EMP;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

14 rows selected.
```

### 1. Write a query to display distinct salary from emp.

```sql
SQL> SELECT DISTINCT SAL
  2  FROM EMP;

       SAL
----------
      2450
      5000
      1300
      1250
      2850
      2975
      1100
      3000
       800
      1600
      1500
       950

12 rows selected.
```

```
Explanation:

DISTINCT removes duplicate values — here, 1250 appears twice (WARD and MARTIN) and 3000 appears twice (SCOTT and FORD), so they show only once each.
Result: 12 distinct salary values out of 14 rows.
```

### 2. Write a query to display Annual Salary.

```sql
SQL> SELECT SAL*12 AS "ANNUAL SALARY" FROM EMP;

ANNUAL SALARY
-------------
         9600
        19200
        15000
        35700
        15000
        34200
        29400
        36000
        60000
        18000
        13200
        11400
        36000
        15600

14 rows selected.
```

### 3. Write a query to display half term (6 months) Salary.

```sql
SQL> SELECT SAL*6 AS "HALF_TERM_SAL"
  2  FROM EMP;

HALF_TERM_SAL
-------------
         4800
         9600
         7500
        17850
         7500
        17100
        14700
        18000
        30000
         9000
         6600
         5700
        18000
         7800

14 rows selected.
```

### 4. Write a query to display quarter salary.

```sql
SQL> SELECT SAL*3 AS "QUARTER_SAL"
  2  FROM EMP;

QUARTER_SAL
-----------
       2400
       4800
       3750
       8925
       3750
       8550
       7350
       9000
      15000
       4500
       3300
       2850
       9000
       3900

14 rows selected.
```

### 5. Write a query to display salary with bonus of 500.

```sql
SQL> SELECT SAL+500 AS "SAL_WITH_BONUS"
  2  FROM EMP;

SAL_WITH_BONUS
--------------
          1300
          2100
          1750
          3475
          1750
          3350
          2950
          3500
          5500
          2000
          1600
          1450
          3500
          1800

14 rows selected.
```

### 6. Write a query to display employee name, salary with increment of 10%.

```sql
SQL> SELECT ENAME, SAL+(SAL*10/100) AS "SAL_WITH_INCREMENT"
  2  FROM EMP;

ENAME      SAL_WITH_INCREMENT
---------- ------------------
SMITH                     880
ALLEN                    1760
WARD                     1375
JONES                  3272.5
MARTIN                   1375
BLAKE                    3135
CLARK                    2695
SCOTT                    3300
KING                     5500
TURNER                   1650
ADAMS                    1210
JAMES                    1045
FORD                     3300
MILLER                   1430

14 rows selected.
```
> HERE IS ANOTHER WAY TO WRITE **SAL+(SAL*10/100)**  
>WE CAN WRITE IT LIKE **SAL+(SAL*0.10)**. BOTH ARE SAME.

### 7. Write a query to display employee name, salary with decrement of 50%.

```sql
SQL> SELECT ENAME, SAL-(SAL*50/100) AS "SAL_WITH_DECREMENT"
  2  FROM EMP;

ENAME      SAL_WITH_DECREMENT
---------- ------------------
SMITH                     400
ALLEN                     800
WARD                      625
JONES                  1487.5
MARTIN                    625
BLAKE                    1425
CLARK                    1225
SCOTT                    1500
KING                     2500
TURNER                    750
ADAMS                     550
JAMES                     475
FORD                     1500
MILLER                    650

14 rows selected.
```

### 8. Write a query to display employee name, Annual salary with increment of 20%.

```sql
SQL> SELECT ENAME, (SAL*12)+(SAL*12*0.20) AS "ANNUAL_SAL_WITH_INCREMENT"
  2  FROM EMP;

ENAME      ANNUAL_SAL_WITH_INCREMENT
---------- -------------------------
SMITH                          11520
ALLEN                          23040
WARD                           18000
JONES                          42840
MARTIN                         18000
BLAKE                          41040
CLARK                          35280
SCOTT                          43200
KING                           72000
TURNER                         21600
ADAMS                          15840
JAMES                          13680
FORD                           43200
MILLER                         18720

14 rows selected.

```

### 9. Write a query to display employee name, Annual salary with decrement of 90%.

```sql
SQL> SELECT ENAME, (SAL*12)-(SAL*12*0.90)
  2  AS "ANNUAL_SAL_WITH_DECREMENT"
  3  FROM EMP;

ENAME      ANNUAL_SAL_WITH_DECREMENT
---------- -------------------------
SMITH                            960
ALLEN                           1920
WARD                            1500
JONES                           3570
MARTIN                          1500
BLAKE                           3420
CLARK                           2940
SCOTT                           3600
KING                            6000
TURNER                          1800
ADAMS                           1320
JAMES                           1140
FORD                            3600
MILLER                          1560

14 rows selected.
```

### 10. Write a query to alias name as popstar.

```sql
SQL> SELECT ENAME AS "POPSTAR"
  2  FROM EMP;

POPSTAR
----------
SMITH
ALLEN
WARD
JONES
MARTIN
BLAKE
CLARK
SCOTT
KING
TURNER
ADAMS
JAMES
FORD
MILLER

14 rows selected.
```

### 11. Write a query to display employee name, Annual salary with bonus of 700.

```sql
SQL> SELECT ENAME, (SAL*12)+700 AS "ANNUAL_SAL_WITH_BONUS"
  2  FROM EMP;

ENAME      ANNUAL_SAL_WITH_BONUS
---------- ---------------------
SMITH                      10300
ALLEN                      19900
WARD                       15700
JONES                      36400
MARTIN                     15700
BLAKE                      34900
CLARK                      30100
SCOTT                      36700
KING                       60700
TURNER                     18700
ADAMS                      13900
JAMES                      12100
FORD                       36700
MILLER                     16300

14 rows selected.
```

### 12. Write a query to display employee name, halfterm salary with bonus of 300.

```sql
SQL> SELECT ENAME, (SAL*6)+300 AS "HALFTERM_SAL_WITH_BONUS"
  2  FROM EMP;

ENAME      HALFTERM_SAL_WITH_BONUS
---------- -----------------------
SMITH                         5100
ALLEN                         9900
WARD                          7800
JONES                        18150
MARTIN                        7800
BLAKE                        17400
CLARK                        15000
SCOTT                        18300
KING                         30300
TURNER                        9300
ADAMS                         6900
JAMES                         6000
FORD                         18300
MILLER                        8100

14 rows selected.
```
---

## Queries Based on Selection:

> It is a way of retrieving the data present in rows and columns.

### 1. Write a query to display all the details of the employee earning salary greater than 2000
2. Display all the details of the employees where designation is 'Manager'.
3. Display all the details for employee Scott.
4. Write a query to dsiplay all the details where department number is 20.
5. Display all the details where designation(job) is 'Salesman', 'Analyst' and 'Clerk'.
6. Display all the details where department no is 10, 20, 40 and 50.
7. Write a query to display employee details where working in the department no is 10, 30, 60, 90 and working in the designation 'Manager', 'Analyst' and 'Clerk' and earning salary less than two thousand .
8. Display all the details where Salary is greater than 1000 and less than 3000. 

---

# Operators

> Operators are symbols used to perform a specific task.

```
Here is the list of operators:
=> Arithmetic operator
=> Logical operator
=> Relational operator
=> Concatination operator
=> Special operator
=> Set operator
=> Sub query operator
```

## Queries Based on Operators:

1. write a query to display employee name, where employee name starting with character 'M'.
2. Display emp name where employee name ending with chracter 'R'.
3. Display employee name where employee name consisting four chracters.
4. Display employee name where employee name contains four characters and first letter is 'F'.
5. Display employee name where employee name second character is 'A".
6. Display employee name where the second last character of employee name is 'I'.
7. Display employee name where employee name contains two consequtive 'L' characters.
8. Display employee name where employee name is starting with character 'M' and character 'J'.
9. Display all the details of employee where employee hired in month 'Dec'.
10. Display all the details of employee where employee hired in the month Dec and Feb.
11. Write a query to display employee name, where employee name not starting with character 'M'.
12. Display all the details of employee where employee name not ending with character 'R'.
13. Display all the details where employee name not contains five characters.
14. Display all the details where designation Last three letters is 'GER'.
15. Display employee details, where employee name not starting with character 'M' and 'J'.[Here we should not use OR]
16. Display all the details of employee where employee not hired in the month 'Dec'.
17. Display all the details where emp not hired in the month 'feb', 'dec' and 'Apr'.
18. Write a query to display all the details where employee name starting with vowels character.
19. Display all the details where employee name starting with consonant characters.
20. Display all the details along with annual salary.
21. Display all the details where employee working as 'Salesman', 'Clerk', 'Manager', and hired in the month 
feb, apr, dec, june.
22. Display all the details where employee not working in dept no 30,60,90 and job not starting with characters 'MAN' and 'ANA'.
23. Display all the details where earning salary greater than 1000 and designation last second character is A, B.
24. Display all the details along with annual salary where annual salary is greater than 12000.
25. Write a query to display all the details where employee hired in the year 81.
26. Write a query to display all the details where employee not hired in the year 80, 82 and 87.
27. Write a query to display all the details where employee working in the department no 10, 20, 30, 40 and 
employee name starting with consonant character and not working in the designation 'Analyst', 'clerk' and earning salary greater than 500 and less than 600 and hired in the month dec,sep, may,apr,feb. 
