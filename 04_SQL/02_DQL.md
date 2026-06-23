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

### 1. Write a query to display all the details of the employee earning salary greater than 2000.
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
### 2. Display all the details of the employees where designation is 'Manager'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB = 'MANAGER';


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975                    20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850                    30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450                    10

```

### 3. Display all the details for employee Scott.
```sql
SQL> SELECT * FROM EMP
  2  WHERE ENAME = 'SCOTT';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7788 SCOTT      ANALYST         7566 19-APR-87       3000                    20

```

### 4. Write a query to dsiplay all the details where department number is 20.
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

### 5. Display all the details where designation(job) is 'Salesman', 'Analyst' and 'Clerk'.
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

### 6. Display all the details where department no is 10, 20, 40 and 50.
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

### 7. Write a query to display employee details where working in the department no is 10, 30, 60, 90 and working in the designation 'Manager', 'Analyst' and 'Clerk' and earning salary less than two thousand .
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

### 8. Display all the details where Salary is greater than 1000 and less than 3000. 
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

### 1. write a query to display employee name, where employee name starting with character 'M'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE 'M%';

ENAME
----------
MARTIN
MILLER
```

### 2. Display emp name where employee name ending with chracter 'R'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%R';

ENAME
----------
TURNER
MILLER
```

### 3. Display employee details where employee name consisting four chracters.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '____';

ENAME
----------
WARD
KING
FORD
```

### 4. Display employee name where employee name contains four characters and first letter is 'F'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE 'F___';

ENAME
----------
FORD
```

### 5. Display employee name where employee name second character is 'A".
```sql
SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '_A%';

ENAME
----------
WARD
MARTIN
JAMES
```

### 6. Display employee name where the second last character of employee name is 'I'.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%I_';

ENAME
----------
MARTIN
```

### 7. Display employee name where employee name contains two consequtive 'L' characters.
```sql
SQL> SELECT ENAME FROM EMP
  2  WHERE ENAME LIKE '%LL%';

ENAME
----------
ALLEN
MILLER
```

### 8. Display employee name where employee name is starting with character 'M' and character 'J'.
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

### 9. Display all the details of employee where employee hired in month 'Dec'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE HIREDATE LIKE '%DEC%';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 SMITH      CLERK           7902 17-DEC-80        800       20
      7900 JAMES      CLERK           7698 03-DEC-81        950       30
      7902 FORD       ANALYST         7566 03-DEC-81       3000       20

```

### 10. Display all the details of employee where employee hired in the month Dec and Feb.
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

### 11. Write a query to display employee name, where employee name not starting with character 'M'.
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

### 12. Display all the details of employee where employee name not ending with character 'R'.
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

### 13. Display all the details where employee name not contains five characters.
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

### 14. Display all the details where designation Last three letters is 'GER'.
```sql
SQL> SELECT * FROM EMP
  2  WHERE JOB LIKE '%GER';

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7566 JONES      MANAGER         7839 02-APR-81       2975       20
      7698 BLAKE      MANAGER         7839 01-MAY-81       2850       30
      7782 CLARK      MANAGER         7839 09-JUN-81       2450       10

```

### 15. Display employee details, where employee name not starting with character 'M' and 'J'.[Here we should not use OR]
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

### 16. Display all the details of employee where employee not hired in the month 'Dec'.
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

### 17. Display all the details where emp not hired in the month 'feb', 'dec' and 'Apr'.
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

### 18. Write a query to display all the details where employee name starting with vowels character.
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

### 19. Display all the details where employee name starting with consonant characters.
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

### 20. Display all the details along with annual salary. [IMPORTANT]
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

### 21. Display all the details where employee working as 'Salesman', 'Clerk', 'Manager', and hired in the month feb, apr, dec, june.
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

### 22. Display all the details where employee not working in dept no 30,60,90 and job not starting with characters 'MAN' and 'ANA'.
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

### 23. Display all the details where earning salary greater than 1000 and designation last second character is A, B.
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

### 24. Display all the details along with annual salary where annual salary is greater than 12000.
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

### 25. Write a query to display all the details where employee hired in the year 81.
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

### 26. Write a query to display all the details where employee not hired in the year 80, 82 and 87.
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

### 27. Write a query to display all the details where employee working in the department no 10, 20, 30, 40 and employee name starting with consonant character and not working in the designation 'Analyst', 'clerk' and earning salary greater than 500 and less than 600 and hired in the month Dec,Sep, May, Apr,Feb. [IMPORTANT] 
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

### 28. Write a query to display employee, where employees earning commission.
### 29. Display employee where employees not earning commission.
### 30. all the details of emp, where ename starts with consonant character and earning salary greater than 1000 and less than 5000 and employees not earning any commision and working in the designation Salesman, Analyst, Manager and Clerk.

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

## Queries based on Character Single Row Function
### In Case Manipulation we have three functions:

>upper(argument)  
>lower(argument)  
>initcap(argument)

### In Character Manipulation we have these functions:

>substring  
>replace  
>instring  
>reverse  
>concat  
>trim

## Queries based on Character Manipulation:

### 1. Write a query to display first letter from the employee name.
### 2. Write a query to display first two letters from the employye name.
### 3. Write a query to display first three letters from the employye name.
### 4. Write a query to display second letter from the employee name.
### 5. Write a query to display last letter from the employee name.
### 6. Write a query to display last two letters from the employee name.
### 7. Write a query to display last 2nd letter from employee name.
### 8. Input: PUSHPA | OUTPUT: USHA  [Use replace]
### 9. Input: manoj@gmail.com | find index value for '@'.
### 10. Find the index of first space in the given input. [Input: manoj a n]
### 11. Find the index of second space in the given input. [Input: manoj a m]
### 12. Find number of character 'A' in the given input. [Input: NAYANA].


```

SQL*Plus: Release 11.1.0.6.0 - Production on Tue Jun 23 11:15:32 2026

Copyright (c) 1982, 2007, Oracle.  All rights reserved.

Enter user-name: scott
Enter password:

Connected to:
Oracle Database 11g Enterprise Edition Release 11.1.0.6.0 - Production
With the Partitioning, OLAP, Data Mining and Real Application Testing options

SQL> NUMBER SINGLE ROW FUNCTIONS
SP2-0734: unknown command beginning "NUMBER SIN..." - rest of line ignored.
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

SQL> ROUND FUNCTION
SP2-0734: unknown command beginning "ROUND FUNC..." - rest of line ignored.
SQL> SELECT ROUND(37.7547, 2);
SELECT ROUND(37.7547, 2)
                       *
ERROR at line 1:
ORA-00923: FROM keyword not found where expected


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

SQL> TRUNC FUNCTION
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

SQL> DATE SINGLE ROW FUNCTION
SP2-0734: unknown command beginning "DATE SINGL..." - rest of line ignored.
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

SQL> SELECT ADD_MONTHS('12-JUN-2027', '12-JUN-2026') FROM DUAL;
SELECT ADD_MONTHS('12-JUN-2027', '12-JUN-2026') FROM DUAL
                                 *
ERROR at line 1:
ORA-01722: invalid number


SQL> SELECT ADD_MONTHS('12-JUN-2027', 12) FROM DUAL;

ADD_MONTH
---------
12-JUN-28

SQL> SELECT ADD_MONTHS('12-JUN-2027', 6) FROM DUAL;

ADD_MONTH
---------
12-DEC-27

SQL> SELECT MONTHS_BETWEEN ('12-JUN-2027', '12-JUN-2026') FROM DUAL;

MONTHS_BETWEEN('12-JUN-2027','12-JUN-2026')
-------------------------------------------
                                         12

SQL> SELECT LAST_DAY('10-FEB-2020') FROM DUAL;

LAST_DAY(
---------
29-FEB-20

SQL>
```