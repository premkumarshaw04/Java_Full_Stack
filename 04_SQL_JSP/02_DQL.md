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

> Selection is a way of retrieving the data present in rows and columns.

### 13. Write a query to display all the details of the employee earning salary greater than 2000.
```sql
SQL> SELECT * FROM EMP
  2  WHERE SAL > 2000;


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
      7839 KING       PRESIDENT            17-NOV-81       5000               10
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20

6 rows selected.
```
### 14. Display all the details of the employees where designation is 'Manager'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB = 'MANAGER';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10

```

### 15. Display all the details for employee Scott.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME = 'SCOTT';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20

```

### 16. Write a query to dsiplay all the details where department number is 20.
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO = 20;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20

```

### 17. Display all the details where designation(job) is 'Salesman', 'Analyst' and 'Clerk'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB IN ('SALESMAN', 'ANALYST', 'CLERK');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

10 rows selected.
```
>Another Approach

```SQL
SQL> SELECT * FROM EMP
  2  WHERE JOB = 'SALESMAN' OR JOB = 'ANALYST' OR JOB = 'CLERK';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

10 rows selected.
```

### 18. Display all the details where department no is 10, 20, 40 and 50.
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO IN (10,20,40,50);

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

8 rows selected.
```
>Another Approach 
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO = 10 OR DEPTNO = 20 OR DEPTNO = 40 OR DEPTNO = 50;


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800                    20
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
      7839 KING       PRESIDENT            17-NOV-81       5000                    10
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

8 rows selected.
```

### 19. Write a query to display employee details where working in the department no is 10, 30, 60, 90 and working in the designation 'Manager', 'Analyst' and 'Clerk' and earning salary less than two thousand .
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO IN (10, 30, 60, 90)
  3  AND JOB IN ('MANAGER', 'ANALYST', 'CLERK')
  4  AND SAL < 2000;


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

```

### 20. Display all the details where Salary is greater than 1000 and less than 3000. 
```sql
SQL> SELECT * FROM EMP
  2  WHERE SAL > 1000 AND SAL < 3000;



     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

9 rows selected.

```

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

### 21. write a query to display employee name, where employee name starting with character 'M'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE 'M%';

ENAME
----------
MARTIN
MILLER
```

### 22. Display emp name where employee name ending with chracter 'R'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%R';

ENAME
----------
TURNER
MILLER
```

### 23. Display employee details where employee name consisting four chracters.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '____';

ENAME
----------
WARD
KING
FORD
```

### 24. Display employee name where employee name contains four characters and first letter is 'F'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE 'F___';

ENAME
----------
FORD
```

### 25. Display employee name where employee name second character is 'A".
```sql
SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '_A%';

ENAME
----------
WARD
MARTIN
JAMES
```

### 26. Display employee name where the second last character of employee name is 'I'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%I_';

ENAME
----------
MARTIN
```

### 27. Display employee name where employee name contains two consequtive 'L' characters.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%LL%';

ENAME
----------
ALLEN
MILLER
```

### 28. Display employee name where employee name is starting with character 'M' and character 'J'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE 'M%' OR ENAME LIKE 'J%';

ENAME
----------
JONES
MARTIN
JAMES
MILLER
```

### 29. Display all the details of employee where employee hired in month 'Dec'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE HIREDATE LIKE '%DEC%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

```

### 30. Display all the details of employee where employee hired in the month Dec and Feb.
```sql
 SELECT * FROM EMP
  2  WHERE HIREDATE LIKE '%DEC%' OR HIREDATE LIKE '%FEB%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

```

### 31. Write a query to display employee name, where employee name not starting with character 'M'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME NOT LIKE 'M%';

ENAME
----------
SMITH
ALLEN
WARD
JONES
BLAKE
CLARK
SCOTT
KING
TURNER
ADAMS
JAMES
FORD
```

### 32. Display all the details of employee where employee name not ending with character 'R'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME NOT LIKE '%R';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

12 rows selected.
```

### 33. Display all the details where employee name not contains five characters.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME NOT LIKE '_____';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10

6 rows selected.
```

### 34. Display all the details where designation Last three letters is 'GER'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB LIKE '%GER';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10

```

### 35. Display employee details, where employee name not starting with character 'M' and 'J'.[Here we should not use OR]
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME NOT LIKE 'M%'
  3  AND ENAME NOT LIKE 'J%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

10 rows selected.
```

### 36. Display all the details of employee where employee not hired in the month 'Dec'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE HIREDATE NOT LIKE '%DEC%';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10

11 rows selected.
```

### 37. Display all the details where emp not hired in the month 'feb', 'dec' and 'Apr'.
```sql

SQL> SELECT * FROM EMP
  2  WHERE HIREDATE NOT LIKE '%DEC%' 
  3  AND HIREDATE NOT LIKE '%FEB%' 
  4  AND HIREDATE NOT LIKE '%APR%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10

7 rows selected.
```

### 38. Write a query to display all the details where employee name starting with vowels character.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME LIKE 'A%'
  3  OR ENAME LIKE 'E%'
  4  OR ENAME LIKE 'I%'
  5  OR ENAME LIKE 'O%'
  6  OR ENAME LIKE 'U%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20

```

### 39. Display all the details where employee name starting with consonant characters.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME NOT LIKE 'A%'
  3  AND ENAME NOT LIKE 'E%'
  4  AND ENAME NOT LIKE 'I%'
  5  AND ENAME NOT LIKE 'O%'
  6  AND ENAME NOT LIKE 'U%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10

12 rows selected.
```

### 40. Display all the details along with annual salary. [IMPORTANT]
```sql
SQL> SELECT EMP.*, SAL*12 AS "ANNUAL_SAL"
  2  FROM EMP;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO ANNUAL_SAL
---------- ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20        9600
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30      19200
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30      15000
      7566 JONES      MANAGER         7839 02-APR-81       2975       20       35700
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30      15000
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30       34200
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10       29400
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20       36000
      7839 KING       PRESIDENT            17-NOV-81       5000       10       60000
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30      18000
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20       13200
      7900 JAMES      CLERK           7698 03-DEC-81        950       30       11400
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20       36000
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10       15600

14 rows selected.
```

### 41. Display all the details where employee working as 'Salesman', 'Clerk', 'Manager', and hired in the month feb, apr, dec, june.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB IN ('SALESMAN', 'CLERK', 'MANAGER')
  3  AND (HIREDATE LIKE '%APR%' OR
  4  HIREDATE LIKE '%FEB%' OR
  5  HIREDATE LIKE '%DEC%' OR
  6  HIREDATE LIKE '%JUN%');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7900 JAMES      CLERK           7698 03-DEC-81        950       30

6 rows selected.
```

### 42. Display all the details where employee not working in dept no 30,60,90 and job not starting with characters 'MAN' and 'ANA'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO NOT IN (30,60,90)
  3  AND JOB NOT LIKE 'MAN%'
  4  AND JOB NOT LIKE 'ANA%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10

```

### 43. Display all the details where earning salary greater than 1000 and designation last second character is A, B.
```sql
SQL> SELECT * FROM EMP
  2  WHERE SAL > 1000
  3  AND (JOB LIKE '%A_' OR
  4  JOB LIKE '%B');

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30

```

### 44. Display all the details along with annual salary where annual salary is greater than 12000.
```sql
SQL> SELECT EMP.*, SAL*12 AS "ANNUAL_SAL"
  2  FROM EMP
  3  WHERE SAL*12 > 12000;


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO ANNUAL_SAL
---------- ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30      19200
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30      15000
      7566 JONES      MANAGER         7839 02-APR-81       2975       20       35700
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30      15000
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30       34200
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10       29400
      7788 SCOTT      ANALYST         7566 19-APR-87       3000       20       36000
      7839 KING       PRESIDENT            17-NOV-81       5000       10       60000
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30      18000
      7876 ADAMS      CLERK           7788 23-MAY-87       1100       20       13200
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20       36000
      7934 MILLER     CLERK           7782 23-JAN-82       1300       10       15600

12 rows selected.
```

### 45. Write a query to display all the details where employee hired in the year 81.
```sql
SQL> SELECT * FROM EMP
  2  WHERE HIREDATE LIKE '%81';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

10 rows selected.
```

### 46. Write a query to display all the details where employee not hired in the year 80, 82 and 87.
```sql
SQL> SELECT * FROM EMP
  2  WHERE HIREDATE NOT LIKE '%80'
  3  AND HIREDATE NOT LIKE '%82'
  4  AND HIREDATE NOT LIKE '%87';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300     30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500     30
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400     30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10
      7839 KING       PRESIDENT            17-NOV-81       5000       10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500     0          30
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

10 rows selected.
```

### 47. Write a query to display all the details where employee working in the department no 10, 20, 30, 40 and employee name starting with consonant character and not working in the designation 'Analyst', 'clerk' and earning salary greater than 500 and less than 600 and hired in the month Dec,Sep, May, Apr,Feb. [IMPORTANT] 
```sql
SQL> SELECT * FROM EMP
  2  WHERE DEPTNO IN (10,20,30,40)
  3  AND ENAME NOT LIKE 'A%'
  4  AND ENAME NOT LIKE 'E%'
  5  AND ENAME NOT LIKE 'I%'
  6  AND ENAME NOT LIKE 'O%'
  7  AND ENAME NOT LIKE 'U%'
  8  AND JOB NOT IN ('ANALYST', 'CLERK')
  9  AND SAL > 500 AND SAL < 600
 10  AND (HIREDATE LIKE '%DEC%'
 11  OR HIREDATE LIKE '%SEP%'
 12  OR HIREDATE LIKE '%MAY%'
 13  OR HIREDATE LIKE '%APR%'
 14  OR HIREDATE LIKE '%FEB%');

no rows selected
```
> Another Approach

```sql
SELECT * FROM EMP
WHERE DEPTNO IN (10,20,30,40)
AND ENAME NOT LIKE 'A%' 
AND ENAME NOT LIKE 'E%' 
AND ENAME NOT LIKE 'I%'
AND ENAME NOT LIKE 'O%' 
AND ENAME NOT LIKE 'U%'
AND JOB NOT IN ('ANALYST','CLERK')
AND SAL > 500 AND SAL < 600
AND TO_CHAR(HIREDATE,'MON') IN ('DEC','SEP','MAY','APR','FEB');
```

## Between

>by default low range act as ">=" and high range act as "<="

### sal >= 1250 and sal <= 3000
```sql
SQL> SELECT * FROM EMP
  2  WHERE SAL BETWEEN 1250 AND 3000;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

10 rows selected.
```

### sal > 1250 and sal < 3000
```SQL
SQL> SELECT * FROM EMP
  2  WHERE SAL BETWEEN 1251 AND 2999;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

6 rows selected.
```

### 48. Write a query to display employee, where employees earning commission.
```SQL
SQL> SELECT ENAME FROM EMP
  2  WHERE COMM IS NOT NULL;

ENAME
----------
ALLEN
WARD
MARTIN
TURNER

```

### 49. Display employee where employees not earning commission.
```SQL

SQL> SELECT * FROM EMP
  2  WHERE COMM IS NULL;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
      7839 KING       PRESIDENT            17-NOV-81       5000               10
      7876 ADAMS      CLERK           7788 23-MAY-87       1100               20
      7900 JAMES      CLERK           7698 03-DEC-81        950               30
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

10 rows selected.
```

### 50. all the details of emp, where ename starts with consonant character and earning salary greater than 1000 and less than 5000 and employees not earning any commision and working in the designation Salesman, Analyst, Manager and Clerk.
```SQL
SQL> SELECT * FROM EMP
  2  WHERE ENAME NOT LIKE 'A%'
  3  AND ENAME NOT LIKE 'E%'
  4  AND ENAME NOT LIKE 'I%'
  5  AND ENAME NOT LIKE 'O%'
  6  AND ENAME NOT LIKE 'U%'
  7  AND SAL > 1000 AND SAL < 5000
  8  AND COMM IS NULL
  9  AND JOB IN ('SALESMAN', 'ANALYST', 'MANAGER', 'CLERK');


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

6 rows selected.
```

---

# Function

## Function Hierarchy

```
Function
│
├──── User Defined
│
└──── Pre Defined
          │
          ├──── Single Row Functions
          │              │
          │              ├──── Character Single Row Function
          │              │              │
          │              │              ├──── Case Manipulation
          │              │              │
          │              │              └──── Character Manipulation
          │              │
          │              ├──── Number Single Row Function
          │              │
          │              ├──── Date Single Row Function
          │              │
          │              ├──── General Single Row Function
          │              │
          │              └──── Conversion Single Row Function
          │
          └──── Multi Row Functions
```

# Single Row Functions

## Queries based on Character Single Row Function

---
### In Case Manipulation we have three functions:

>upper(argument)  
>lower(argument)  
>initcap(argument)

### Queries based on Case manipulation:

```sql
-- INPUT: prem 

SQL> SELECT UPPER('prem') FROM DUAL; --DUAL is the dummy table.

UPPE
----
PREM
```

```sql
-- INPUT: RAJU

SQL> SELECT LOWER('RAJU') FROM DUAL;

LOWE
----
raju
```

```sql
-- INPUT: i love your salary.
SQL> SELECT INITCAP('i love your salary') FROM DUAL;

INITCAP('ILOVEYOUR
------------------
I Love Your Salary

```

---
### In Character Manipulation we have these functions:

> SUBSTR — extract part of a string  | Substring
> REPLACE — replace characters in a string  
> INSTR — find position of a character | Instring  
> REVERSE — reverse a string  
> CONCAT — join two strings  
> TRIM — remove spaces or characters 

## Queries based on Character Manipulation:

### 51. Write a query to display first letter from the employee name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME,1,1) AS "FIRST_LETTER"
  2  FROM EMP;

ENAME      F
---------- -
SMITH      S
ALLEN      A
WARD       W
JONES      J
MARTIN     M
BLAKE      B
CLARK      C
SCOTT      S
KING       K
TURNER     T
ADAMS      A
JAMES      J
FORD       F
MILLER     M

14 rows selected.
```

### 52. Write a query to display first two letters from the employye name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, 1 , 2) FROM EMP;

ENAME      SU
---------- --
SMITH      SM
ALLEN      AL
WARD       WA
JONES      JO
MARTIN     MA
BLAKE      BL
CLARK      CL
SCOTT      SC
KING       KI
TURNER     TU
ADAMS      AD
JAMES      JA
FORD       FO
MILLER     MI

14 rows selected.
```

### 53. Write a query to display first three letters from the employye name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, 1, 3) FROM EMP;

ENAME      SUB
---------- ---
SMITH      SMI
ALLEN      ALL
WARD       WAR
JONES      JON
MARTIN     MAR
BLAKE      BLA
CLARK      CLA
SCOTT      SCO
KING       KIN
TURNER     TUR
ADAMS      ADA
JAMES      JAM
FORD       FOR
MILLER     MIL

14 rows selected.
```

### 54. Write a query to display second letter from the employee name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, 2, 1) FROM EMP;

ENAME      S
---------- -
SMITH      M
ALLEN      L
WARD       A
JONES      O
MARTIN     A
BLAKE      L
CLARK      L
SCOTT      C
KING       I
TURNER     U
ADAMS      D
JAMES      A
FORD       O
MILLER     I

14 rows selected.
```

### 55. Write a query to display last letter from the employee name.[Important]
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, -1, 1) FROM EMP;

ENAME      S
---------- -
SMITH      H
ALLEN      N
WARD       D
JONES      S
MARTIN     N
BLAKE      E
CLARK      K
SCOTT      T
KING       G
TURNER     R
ADAMS      S
JAMES      S
FORD       D
MILLER     R

14 rows selected.
```

### 56. Write a query to display last two letters from the employee name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, -2, 2) FROM EMP;

ENAME      SU
---------- --
SMITH      TH
ALLEN      EN
WARD       RD
JONES      ES
MARTIN     IN
BLAKE      KE
CLARK      RK
SCOTT      TT
KING       NG
TURNER     ER
ADAMS      MS
JAMES      ES
FORD       RD
MILLER     ER

14 rows selected.
```

### 57. Write a query to display last 2nd letter from employee name.
```sql
SQL> SELECT ENAME, SUBSTR(ENAME, -2, 1) FROM EMP;

ENAME      S
---------- -
SMITH      T
ALLEN      E
WARD       R
JONES      E
MARTIN     I
BLAKE      K
CLARK      R
SCOTT      T
KING       N
TURNER     E
ADAMS      M
JAMES      E
FORD       R
MILLER     E

14 rows selected.
```

### 58. Input: PUSHPA | OUTPUT: USHA  [Use replace]
```sql
SQL> SELECT REPLACE ('PUSHPA', 'P') FROM DUAL; --DUAL IS A DUMMY TABLE.

REPL
----
USHA
```
how to make comments in SQLJun 24Claude responded: In Oracle SQL, there are two ways to write comments:In Oracle SQL, there are two ways to write comments:
1. Single line comment — using --
sql-- This is a single line comment
SELECT * FROM EMP; -- this fetches all employees
2. Multi line comment — using /* */
sql/* This is a
   multi line comment */
SELECT * FROM EMP;
Comments are ignored by the SQL engine — they are only for human readability and documentation purposes.You said: WHAT ARE THE CONVERSION SINGLE ROW FUNCTIONSWHAT ARE THE CONVERSION SINGLE ROW FUNCTIONSJun 24Claude responded: In Oracle SQL, Conversion Single Row Functions are used to convert a value from one data type to another.In Oracle SQL, Conversion Single Row Functions are used to convert a value from one data type to another.
There are 3 main conversion functions:
1. TO_CHAR — converts a Number or Date to a String
sqlSELECT TO_CHAR(HIREDATE, 'DD-MON-YYYY') FROM EMP;
SELECT TO_CHAR(SAL, '$9999') FROM EMP;
2. TO_NUMBER — converts a String to a Number
sqlSELECT TO_NUMBER('1234') FROM DUAL;
3. TO_DATE — converts a String to a Date
sqlSELECT TO_DATE('17-DEC-1980', 'DD-MON-YYYY') FROM DUAL;

Quick reference table:
FunctionConverts FromConverts ToTO_CHARNumber / DateStringTO_NUMBERStringNumberTO_DATEStringDate### 48. Write a query to display employee, where employees earning commission.
### 49. Display employee where employees not earning commission.
### 50. all the details of emp, where ename starts with consonant character and earning salary greater than 1000 and less than 5000 and employees not earning any commision and working in the designation Salesman, Analyst, Manager and Clerk.Jun 27Claude responded: SELECT *markdown### 48. Write a query to display employee, where employees earning commission.
```sql
SELECT *
FROM EMP
WHERE COMM IS NOT NULL AND COMM > 0;
```
 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO

  7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300         30
  7521 WARD       SALESMAN        7698 22-FEB-81       1250        500         30
  7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400         30

### 49. Display employee where employees not earning commission.
```sql
SELECT *
FROM EMP
WHERE COMM IS NULL OR COMM = 0;
```
 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO

  7369 SMITH      CLERK           7902 17-DEC-80        800                    20
  7566 JONES      MANAGER         7839 02-APR-81       2975                    20
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
  7839 KING       PRESIDENT            17-NOV-81       5000                    10
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
  7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
  7900 JAMES      CLERK           7698 03-DEC-81        950                    30
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

### 50. All the details of emp, where ename starts with consonant character and earning salary greater than 1000 and less than 5000 and employees not earning any commission and working in the designation Salesman, Analyst, Manager and Clerk.
```sql
SELECT *
FROM EMP
WHERE ENAME NOT LIKE 'A%' AND ENAME NOT LIKE 'E%' AND ENAME NOT LIKE 'I%'
AND ENAME NOT LIKE 'O%' AND ENAME NOT LIKE 'U%'
AND SAL > 1000 AND SAL < 5000
AND (COMM IS NULL OR COMM = 0)
AND JOB IN ('SALESMAN', 'ANALYST', 'MANAGER', 'CLERK');
```
 EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO

  7566 JONES      MANAGER         7839 02-APR-81       2975                    20
  7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
  7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10
  7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20
  7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
  7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
  7934 MILLER     CLERK           7782 23-JAN-82       1300                    10
### In Character Manipulation we have these functions:

>substring  
>replace  
>instring  
>reverse  
>concat  
>trim

## Queries based on Character Manipulation:

### 51. Write a query to display first letter from the employee name.
### 52. Write a query to display first two letters from the employye name.
### 53. Write a query to display first three letters from the employye name.
### 54. Write a query to display second letter from the employee name.
### 55. Write a query to display last letter from the employee name.
### 56. Write a query to display last two letters from the employee name.
### 57. Write a query to display last 2nd letter from employee name.
### 58. Input: PUSHPA | OUTPUT: USHA  [Use replace]
### 59. Input: manoj@gmail.com | find index value for '@'.
### 60. Find the index of first space in the given input. [Input: manoj a n]
### 61. Find the index of second space in the given input. [Input: manoj a m]
### 62. Find number of character 'A' in the given input. [Input: NAYANA].
(Solve it)Show more10:06 PMClaude responded: SELECT ENAME, SUBSTR(ENAME, 1, 1) AS FIRST_LETTERmarkdown### In Character Manipulation we have these functions:

> SUBSTR — extract part of a string  
> REPLACE — replace characters in a string  
> INSTR — find position of a character  
> REVERSE — reverse a string  
> CONCAT — join two strings  
> TRIM — remove spaces or characters

## Queries based on Character Manipulation:

### 51. Write a query to display first letter from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, 1, 1) AS FIRST_LETTER
FROM EMP;
```
ENAME      FIRST_LETTER

SMITH      S

ALLEN      A

WARD       W

JONES      J

MARTIN     M

BLAKE      B

CLARK      C

SCOTT      S

KING       K

TURNER     T

ADAMS      A

JAMES      J

FORD       F

MILLER     M

### 52. Write a query to display first two letters from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, 1, 2) AS FIRST_TWO
FROM EMP;
```
ENAME      FIRST_TWO

SMITH      SM

ALLEN      AL

WARD       WA

JONES      JO

MARTIN     MA

BLAKE      BL

CLARK      CL

SCOTT      SC

KING       KI

TURNER     TU

ADAMS      AD

JAMES      JA

FORD       FO

MILLER     MI

### 53. Write a query to display first three letters from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, 1, 3) AS FIRST_THREE
FROM EMP;
```
ENAME      FIRST_THREE

SMITH      SMI

ALLEN      ALL

WARD       WAR

JONES      JON

MARTIN     MAR

BLAKE      BLA

CLARK      CLA

SCOTT      SCO

KING       KIN

TURNER     TUR

ADAMS      ADA

JAMES      JAM

FORD       FOR

MILLER     MIL

### 54. Write a query to display second letter from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, 2, 1) AS SECOND_LETTER
FROM EMP;
```
ENAME      SECOND_LETTER

SMITH      M

ALLEN      L

WARD       A

JONES      O

MARTIN     A

BLAKE      L

CLARK      L

SCOTT      C

KING       I

TURNER     U

ADAMS      D

JAMES      A

FORD       O

MILLER     I

### 55. Write a query to display last letter from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, -1, 1) AS LAST_LETTER
FROM EMP;
```
ENAME      LAST_LETTER

SMITH      H

ALLEN      N

WARD       D

JONES      S

MARTIN     N

BLAKE      E

CLARK      K

SCOTT      T

KING       G

TURNER     R

ADAMS      S

JAMES      S

FORD       D

MILLER     R

### 56. Write a query to display last two letters from the employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, -2, 2) AS LAST_TWO
FROM EMP;
```
ENAME      LAST_TWO

SMITH      TH

ALLEN      EN

WARD       RD

JONES      ES

MARTIN     IN

BLAKE      KE

CLARK      RK

SCOTT      TT

KING       NG

TURNER     ER

ADAMS      MS

JAMES      ES

FORD       RD

MILLER     ER

### 57. Write a query to display last 2nd letter from employee name.
```sql
SELECT ENAME, SUBSTR(ENAME, -2, 1) AS SECOND_LAST_LETTER
FROM EMP;
```
ENAME      SECOND_LAST_LETTER

SMITH      T

ALLEN      E

WARD       R

JONES      E

MARTIN     I

BLAKE      K

CLARK      R

SCOTT      T

KING       N

TURNER     E

ADAMS      M

JAMES      E

FORD       R

MILLER     E

### 58. Input: PUSHPA | OUTPUT: USHA  [Use replace]
```sql
SELECT REPLACE(REPLACE('PUSHPA', 'P', ''), 'P', '') AS OUTPUT
FROM DUAL;
```
OUTPUT
USHA

> REPLACE removes all occurrences of 'P' from 'PUSHPA', giving 'USHA'.

### 59. Input: manoj@gmail.com | find index value for '@'.
```sql
SQL> SELECT INSTR('manoj@gmail.com', '@', 1, 1) FROM DUAL;
--Argument 1 is original String.
--Argument 2 is Character.
--Argument 3 is Position.
--Argument 4 is nth occurence.


INSTR('MANOJ@GMAIL.COM','@',1,1)
--------------------------------
                               6
```

```SQL
--ANOTHER APPROACH:
SQL> SELECT INSTR('manoj@gmail.com', '@') AS INDEX_OF_AT
  2  FROM DUAL;

INDEX_OF_AT
-----------
          6
```
> '@' is at position 6 in 'manoj@gmail.com'.

### 60. Find the index of first space in the given input. [Input: manoj a n]
```sql
SQL> SELECT INSTR('manoj a n', ' ', 1, 1) AS FIRST_SPACE
  2  FROM DUAL;

FIRST_SPACE
-----------
          6
```
> First Space is at Position 6.


### 61. Find the index of second space in the given input. [Input: manoj a m]
```sql

SQL> SELECT INSTR('manoj a m', ' ', 1, 2) AS SECOND_SPACE
  2  FROM DUAL;

SECOND_SPACE
------------
           8
```

### 62. Find number of character 'A' in the given input. [Input: NAYANA].
```sql
SQL> SELECT LENGTH('NAYANA') - LENGTH(REPLACE('NAYANA', 'A'))
  2  AS COUNT_OF_A
  3  FROM DUAL;

COUNT_OF_A
----------
         3
```
> Logic: total length of 'NAYANA' is 6.   
> After removing all 'A's, 'NYN' has length 3. So 6 - 3 = 3 occurrences of 'A'.


---

## Number Single Row Function
```
All number single row functions
1. mod function
2. abs function
3. power function
4. square root
5. round function [Important]
6. trunc function [Important]
```

## Date Single row function
```
All Date single row functions
1. extract function(day/month/year from column)
2. add_months('date1', no_of_months)
3. months_between('date1', 'date2')
4. last_day('date1')
```

## Queries based on Number Single row function and Date Single row function

```sql
-- Number Single row function
SQL> SELECT MOD(11,2) FROM DUAL;

 MOD(11,2)
----------
         1

SQL> SELECT ABS(-100) FROM DUAL;

 ABS(-100)
----------
       100

SQL> SELECT POWER(3,4) FROM DUAL;

POWER(3,4)
----------
        81

SQL> SELECT SQRT(100) FROM DUAL;

 SQRT(100)
----------
        10
```

```sql
--ROUND FUNCTION
SQL> SELECT ROUND(37.7547, 2) FROM DUAL;

ROUND(37.7547,2)
----------------
           37.75

SQL> SELECT ROUND(37.7567, 2) FROM DUAL;

ROUND(37.7567,2)
----------------
           37.76

SQL> SELECT ROUND (3476.123, -3) FROM DUAL;

ROUND(3476.123,-3)
------------------
              3000

SQL> SELECT ROUND (678.98, 1) FROM DUAL;

ROUND(678.98,1)
---------------
            679

SQL> SELECT ROUND (987.17, -3) FROM DUAL;

ROUND(987.17,-3)
----------------
            1000

SQL> SELECT ROUND (47.18, -2) FROM DUAL;

ROUND(47.18,-2)
---------------
              0

SQL> SELECT ROUND (78.764, 3) FROM DUAL;

ROUND(78.764,3)
---------------
         78.764

SQL> SELECT ROUND (78.764, -3) FROM DUAL;

ROUND(78.764,-3)
----------------
               0

```

```sql
--TRUNC FUNCTION
SP2-0734: unknown command beginning "TRUNC FUNC..." - rest of line ignored.
SQL> SELECT TRUNC (37.7547, 2) FROM DUAL;

TRUNC(37.7547,2)
----------------
           37.75

SQL> SELECT TRUNC (37.7567, 2) FROM DUAL;

TRUNC(37.7567,2)
----------------
           37.75

SQL> SELECT TRUNC (3476.123, -3) FROM DUAL;

TRUNC(3476.123,-3)
------------------
              3000

SQL> SELECT TRUNC (678.98, 1) FROM DUAL;

TRUNC(678.98,1)
---------------
          678.9

SQL> SELECT TRUNC (987.17, -3) FROM DUAL;

TRUNC(987.17,-3)
----------------
               0

SQL> SELECT TRUNC (47.18, -2) FROM DUAL;

TRUNC(47.18,-2)
---------------
              0

SQL> SELECT TRUNC (78.764, 3) FROM DUAL;

TRUNC(78.764,3)
---------------
         78.764

SQL> SELECT TRUNC (78.764, -3) FROM DUAL;

TRUNC(78.764,-3)
----------------
               0
```

```SQL
-- DATE SINGLE ROW FUNCTION
SQL> SELECT EXTRACT (MONTH FROM HIREDATE) FROM EMP;

EXTRACT(MONTHFROMHIREDATE)
--------------------------
                        12
                         2
                         2
                         4
                         9
                         5
                         6
                         4
                        11
                         9
                         5

EXTRACT(MONTHFROMHIREDATE)
--------------------------
                        12
                        12
                         1

14 rows selected.

SQL> SET PAGES 100 LINES 100
SQL> SELECT EXTRACT (MONTH FROM HIREDATE) FROM EMP;

EXTRACT(MONTHFROMHIREDATE)
--------------------------
                        12
                         2
                         2
                         4
                         9
                         5
                         6
                         4
                        11
                         9
                         5
                        12
                        12
                         1

14 rows selected.
```

```SQL
SQL> SELECT ADD_MONTHS('12-JUN-2027', 12) FROM DUAL;

ADD_MONTH
---------
12-JUN-28

SQL> SELECT ADD_MONTHS('12-JUN-2027', 6) FROM DUAL;

ADD_MONTH
---------
12-DEC-27
```

```SQL
SQL> SELECT MONTHS_BETWEEN ('12-JUN-2027', '12-JUN-2026') FROM DUAL;

MONTHS_BETWEEN('12-JUN-2027','12-JUN-2026')
-------------------------------------------
                                         12

```                                         

```SQL
SQL> SELECT LAST_DAY('10-FEB-2020') FROM DUAL;

LAST_DAY(
---------
29-FEB-20
```

### 63. Write a query to display details of employee where they are earning even salary.
```SQL
SQL> SELECT *
  2  FROM EMP
  3  WHERE MOD(SAL, 2) = 0;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
      7839 KING       PRESIDENT            17-NOV-81       5000               10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100               20
      7900 JAMES      CLERK           7698 03-DEC-81        950               30
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

13 rows selected.
```
### 64. Write a query to display details of employee where they are earning odd salary.
```SQL
SQL> set pages 100 lines 100;
SQL> SELECT *
  2  FROM EMP
  3  WHERE MOD(SAL, 2) != 0;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20

```
### 65. Display all the employee name, where employee name consisting even no of characters.
```SQL
SQL> SELECT * FROM EMP
  2  WHERE MOD(LENGTH(ENAME), 2) = 0;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30
      7839 KING       PRESIDENT            17-NOV-81       5000               10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10

6 rows selected.
```

### 66. Display all the employee name, where employee name consisting odd no of characters.
```SQL
SQL> SELECT ENAME
  2  FROM EMP
  3  WHERE MOD(LENGTH(ENAME), 2) != 0;

ENAME
----------
SMITH
ALLEN
JONES
BLAKE
CLARK
SCOTT
ADAMS
JAMES

8 rows selected.
```

### 67. find the square root for the employees salary.
```SQL
SQL> SELECT SQRT(SAL) AS SQRT_SAL
  2  FROM EMP;

  SQRT_SAL
----------
28.2842712
        40
35.3553391
54.5435606
35.3553391
53.3853913
49.4974747
54.7722558
70.7106781
38.7298335
33.1662479
  30.82207
54.7722558
36.0555128

14 rows selected.
```

### 68. Write a query to display emp name, employee hired year.
```SQL
SQL> SELECT ENAME, EXTRACT(YEAR FROM HIREDATE) AS HIRED_YEAR
  2  FROM EMP;

ENAME      HIRED_YEAR
---------- ----------
SMITH            1980
ALLEN            1981
WARD             1981
JONES            1981
MARTIN           1981
BLAKE            1981
CLARK            1981
SCOTT            1987
KING             1981
TURNER           1981
ADAMS            1987
JAMES            1981
FORD             1981
MILLER           1982

14 rows selected.
```

### 69. Write a query to display emp name, employee experience.
```SQL
SQL> SELECT ENAME, MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12
  2  AS EXPERIENCE_YEAR
  3  FROM EMP;

ENAME      EXPERIENCE_YEAR
---------- ---------------
SMITH           45.5321965
ALLEN           45.3574653
WARD             45.352089
JONES           45.2391857
MARTIN               44.75
BLAKE           45.1585406
CLARK           45.0537019
SCOTT           39.1934868
KING            44.6155298
TURNER            44.80639
ADAMS           39.0994008
JAMES           44.5698309
FORD            44.5698309
MILLER          44.4327341

14 rows selected.
```
>IF WE WANT TO ROUND OF THE YEARS:
```SQL
SQL> SELECT ENAME, TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12)
  2  AS EXPERIENCE_YEAR
  3  FROM EMP;

ENAME      EXPERIENCE_YEAR
---------- ---------------
SMITH                   45
ALLEN                   45
WARD                    45
JONES                   45
MARTIN                  44
BLAKE                   45
CLARK                   45
SCOTT                   39
KING                    44
TURNER                  44
ADAMS                   39
JAMES                   44
FORD                    44
MILLER                  44

14 rows selected.
```
```
SYSDATE is a built-in Oracle SQL function that returns the current date and time of the database server.

In this query:
MONTHS_BETWEEN(SYSDATE, HIREDATE)

This calculates how many months have passed from the employee's hire date up to today, then dividing by 12 converts months into years, and TRUNC removes the decimal part to give a whole number.

Example for SMITH:

HIREDATE = 17-DEC-1980
SYSDATE = today (28-JUN-2026)
Months between = ~satan545 months → divided by 12 → 45 years experience

So SYSDATE simply means "today's date" — it automatically updates every day without you needing to hardcode any date.
```

### 70. Display all the details of the employee along with the employees experience.
```SQL
SQL> SELECT EMP.*, MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12
  2  AS EXPERIENCE_YEAR
  3  FROM EMP;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
EXPERIENCE_YEAR
---------------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20
     45.5322188

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
     45.3574876

      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
     45.3521112

      7566 JONES      MANAGER         7839 02-APR-81       2975               20
      45.239208

      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30
          44.75

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
     45.1585629

      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
     45.0537241

      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
     39.1935091

      7839 KING       PRESIDENT            17-NOV-81       5000               10
     44.6155521

      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
     44.8064123

      7876 ADAMS      CLERK           7788 23-MAY-87       1100               20
     39.0994231

      7900 JAMES      CLERK           7698 03-DEC-81        950               30
     44.5698532

      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
     44.5698532

      7934 MILLER     CLERK           7782 23-JAN-82       1300               10
     44.4327564


14 rows selected.
```

### 71. Find last day from the column hiredate.
```SQL
SQL> SELECT ENAME, LAST_DAY(HIREDATE) AS LAST_DAY_OF_MONTH
  2  FROM EMP;

ENAME      LAST_DAY_
---------- ---------
SMITH      31-DEC-80
ALLEN      28-FEB-81
WARD       28-FEB-81
JONES      30-APR-81
MARTIN     30-SEP-81
BLAKE      31-MAY-81
CLARK      30-JUN-81
SCOTT      30-APR-87
KING       30-NOV-81
TURNER     30-SEP-81
ADAMS      31-MAY-87
JAMES      31-DEC-81
FORD       31-DEC-81
MILLER     31-JAN-82

14 rows selected.
```

### 72. find all the details along with the experience, where experience is greater than 30.
```SQL

SQL> SELECT EMP.*, MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12
  2  AS EXPERIENCE FROM EMP
  3  WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12 > 30;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO EXPERIENCE
---------- ---------- --------- ---------- --------- ---------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20 45.5322296
      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30 45.3574984
      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30 45.3521221
      7566 JONES      MANAGER         7839 02-APR-81       2975               20 45.2392188
      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30       44.75
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30 45.1585737
      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10  45.053735
      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20 39.1935199
      7839 KING       PRESIDENT            17-NOV-81       5000               10 44.6155629
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30 44.8064231
      7876 ADAMS      CLERK           7788 23-MAY-87       1100               20 39.0994339
      7900 JAMES      CLERK           7698 03-DEC-81        950               30  44.569864
      7902 FORD       ANALYST         7566 03-DEC-81       3000               20  44.569864
      7934 MILLER     CLERK           7782 23-JAN-82       1300               10 44.4327672

14 rows selected.
```
>ANOTHER APPROACH:
```SQL
SQL> SELECT EMP.*, TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12) AS EXPERIENCE_YEARS
  2  FROM EMP
  3  WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE) / 12) > 30;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
EXPERIENCE_YEARS
----------------
      7369 SMITH      CLERK           7902 17-DEC-80        800               20
              45

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300    30
              45

      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500    30
              45

      7566 JONES      MANAGER         7839 02-APR-81       2975               20
              45

      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400    30
              44

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850               30
              45

      7782 CLARK      MANAGER         7839 09-JUN-81       2450               10
              45

      7788 SCOTT      ANALYST         7566 19-APR-87       3000               20
              39

      7839 KING       PRESIDENT            17-NOV-81       5000               10
              44

      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0    30
              44

      7876 ADAMS      CLERK           7788 23-MAY-87       1100               20
              39

      7900 JAMES      CLERK           7698 03-DEC-81        950               30
              44

      7902 FORD       ANALYST         7566 03-DEC-81       3000               20
              44

      7934 MILLER     CLERK           7782 23-JAN-82       1300               10
              44


14 rows selected.

```

---

## General Single row function

>nvl(argument1, argument2)  |    (Null value logic)  
>nvl2(argument1, argument2, argument3)   |     (Null value logic 2)

>Note:   
>100 + null => null  
>100 * null => null  

```sql
SQL> SELECT ENAME, SAL, COMM, SAL+NVL(COMM,0)
  2  FROM EMP;

ENAME             SAL       COMM SAL+NVL(COMM,0)
---------- ---------- ---------- ---------------
SMITH             800                        800
ALLEN            1600        300            1900
WARD             1250        500            1750
JONES            2975                       2975
MARTIN           1250       1400            2650
BLAKE            2850                       2850
CLARK            2450                       2450
SCOTT            3000                       3000
KING             5000                       5000
TURNER           1500          0            1500
ADAMS            1100                       1100

ENAME             SAL       COMM SAL+NVL(COMM,0)
---------- ---------- ---------- ---------------
JAMES             950                        950
FORD             3000                       3000
MILLER           1300                       1300

14 rows selected.


SQL> SET PAGES 100 LINES 100;
SQL> SELECT ENAME, SAL, COMM, NVL2(COMM, 'EARNING COMMISION', 'NO COMMISION') STATUS
  2  FROM EMP;

ENAME             SAL       COMM STATUS
---------- ---------- ---------- -----------------
SMITH             800            NO COMMISION
ALLEN            1600        300 EARNING COMMISION
WARD             1250        500 EARNING COMMISION
JONES            2975            NO COMMISION
MARTIN           1250       1400 EARNING COMMISION
BLAKE            2850            NO COMMISION
CLARK            2450            NO COMMISION
SCOTT            3000            NO COMMISION
KING             5000            NO COMMISION
TURNER           1500          0 EARNING COMMISION
ADAMS            1100            NO COMMISION
JAMES             950            NO COMMISION
FORD             3000            NO COMMISION
MILLER           1300            NO COMMISION

14 rows selected.
```

# Multi Row Functions

```
Multi Row Functions:
  Maximum
  Minimum
  Average
  Sum
  Count
```
## Queries based on Multi row functions.

### 73. Write a query to find maximum salary.
### 74. Write a query to find minimum salary.
### 75. Write a query to find Average salary.
### 76. Write a query to find total salary.
### 77. Write a query to find number of rows(records).
### 78. Write a query to find maximum salary present in the department 10.
### 79. Write a query to find total salary where designation is Salesman and Analyst.
### 80. Find the average salary from the hired year 81.
### 81. Find the no of employees present in the department no 30.
### 82. Find the no of employees working as a clerk and Salesman.
### 83. Write a query to find no of employees where emp name starting with vowel character.
### 84. Find maximum, minimum, average and total salary.
### 85. Find maximum salary, employee name.
### 86. Find minimum salary, employee name.
### 87. Find maximum salary, where maximum salary is greater than 3000.
### 88. Find no of employees who is hired in the month feb, dec, april.
### 89. Find no of employees who is hired in the year 80, 82, 87.
### 90. Find the no of employees who is earning salary greater than 1000 and less than 3000.
### 91. Find maximum salary from the hired year 81.
### 92. Find the minimum salary from the hired year 81.
### 93. Find maximum and minimum salary where dept no is 20 and employee name starting with consonant character.

---

# Group By

> Order Of Execution:  
> i. from  
> ii. where (executes row by row)  
> iii. group by (executes row by row)  
> iv. select

## Queries based on Group By.

### 94. Write a query to find no of employees working in the each department except department 10.
### 95. Find maximum salary in each department.
### 96. Find total salary present in the each designation except President.
### 97. Find the employees working in the each department where emp name starting with consonant characters.
### 98. Write a query to find no of employees in each designation only if they hired in the year 81.

## Having 

> Having is a SQL clause used to filter the group records.  
> Having executes group by group.  
>Multi row functions are allowed in having clause.  
> having executes after group by.

```
Order of Execution:
  from  
  where (row by row execution)  
  group by(row by row execution)  
  having (group by group execution)
  select
```

### 99. Find the no of employees working in each department where more than one employee working in the each department.
### 100. find the total salary present in each job, where total salary is greater than 5700.
### 101. Find maximum salary present in the each department where maximum salary is greater than 2900.
### 102. Find number of employees working(hired) in the each job where they are hired in the year 81 where at least two employees are working in each job.
### 103. find the duplicate salary.
### 104. Find the duplicate employee name.
### 105. Find the unique designation.
### 106. Find the unique salary.
### 107. Find the no of employees working in each department where employees are not earning any commision and atleast two employees are working in each department.
### 108. find the no employees hired in the each year.
### 109. Find the number of employees hired in the each month.
### 110. Find the first highest salary.
### 111. Find the first lowest salary.
### 112. find the first hiredate.
### 113. Find the last hiredate.
### 114. Find the no of employees hired in the each month, where more than one employee hired in the each month.

---

# Order By

> Queries based on Order by:

### 115. Write a query to display employee name and order the employee name is ascending.
### 116. Display employee name, salary , Order the salary in descending.
### 117. Write a query to display all the details and order the hiredate in ascending.
### 118. Write a query to display all the details of employee where employee name starting with consonant character and not earning any commision and order the salary in ascending.
### 119. Write a query to display no of employees working in each department, order the department no in ascending.
### 120. Write a query to display total salary present in each job and order the job in descending.
### 121. Write a query to display no of employees working in each job where at least two employees are working in each job and order the job in ascending.
### 122. Write a query to display no of employees working in each department where employees hired in the year 81 and more than two employees are working in the department and order the deptno in ascending.
### 123. Display all the details of employee along with annual salary, order the annual salaray in descending.
### 124. Write a query to display all the details where employee name consisting odd characters and order the employee name in ascending.

