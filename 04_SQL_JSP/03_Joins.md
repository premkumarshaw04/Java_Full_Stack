# Joins

# 1. Cross Join

```sql
--ANSI Syntax:
SELECT * FROM TABLE1 CROSS JOIN TABLE2

--ORACLE Syntax:
SELECT * FROM TABLE1, TABLE2;
```

```sql
SQL> SELECT ENAME, LOC FROM EMP CROSS JOIN DEPT; --ANSI

ENAME      LOC
---------- -------------
SMITH      NEW YORK
ALLEN      NEW YORK
WARD       NEW YORK
JONES      NEW YORK
MARTIN     NEW YORK
BLAKE      NEW YORK
CLARK      NEW YORK
SCOTT      NEW YORK
KING       NEW YORK
TURNER     NEW YORK
ADAMS      NEW YORK
JAMES      NEW YORK
FORD       NEW YORK
MILLER     NEW YORK
SMITH      DALLAS
ALLEN      DALLAS
WARD       DALLAS
JONES      DALLAS
MARTIN     DALLAS
BLAKE      DALLAS
CLARK      DALLAS
SCOTT      DALLAS
KING       DALLAS
TURNER     DALLAS
ADAMS      DALLAS
JAMES      DALLAS
FORD       DALLAS
MILLER     DALLAS
SMITH      CHICAGO
ALLEN      CHICAGO
WARD       CHICAGO
JONES      CHICAGO
MARTIN     CHICAGO
BLAKE      CHICAGO
CLARK      CHICAGO
SCOTT      CHICAGO
KING       CHICAGO
TURNER     CHICAGO
ADAMS      CHICAGO
JAMES      CHICAGO
FORD       CHICAGO
MILLER     CHICAGO
SMITH      BOSTON
ALLEN      BOSTON
WARD       BOSTON
JONES      BOSTON
MARTIN     BOSTON
BLAKE      BOSTON
CLARK      BOSTON
SCOTT      BOSTON
KING       BOSTON
TURNER     BOSTON
ADAMS      BOSTON
JAMES      BOSTON
FORD       BOSTON
MILLER     BOSTON

56 rows selected.

SQL> SELECT ENAME, LOC FROM EMP, DEPT; --ORACLE

ENAME      LOC
---------- -------------
SMITH      NEW YORK
ALLEN      NEW YORK
WARD       NEW YORK
JONES      NEW YORK
MARTIN     NEW YORK
BLAKE      NEW YORK
CLARK      NEW YORK
SCOTT      NEW YORK
KING       NEW YORK
TURNER     NEW YORK
ADAMS      NEW YORK
JAMES      NEW YORK
FORD       NEW YORK
MILLER     NEW YORK
SMITH      DALLAS
ALLEN      DALLAS
WARD       DALLAS
JONES      DALLAS
MARTIN     DALLAS
BLAKE      DALLAS
CLARK      DALLAS
SCOTT      DALLAS
KING       DALLAS
TURNER     DALLAS
ADAMS      DALLAS
JAMES      DALLAS
FORD       DALLAS
MILLER     DALLAS
SMITH      CHICAGO
ALLEN      CHICAGO
WARD       CHICAGO
JONES      CHICAGO
MARTIN     CHICAGO
BLAKE      CHICAGO
CLARK      CHICAGO
SCOTT      CHICAGO
KING       CHICAGO
TURNER     CHICAGO
ADAMS      CHICAGO
JAMES      CHICAGO
FORD       CHICAGO
MILLER     CHICAGO
SMITH      BOSTON
ALLEN      BOSTON
WARD       BOSTON
JONES      BOSTON
MARTIN     BOSTON
BLAKE      BOSTON
CLARK      BOSTON
SCOTT      BOSTON
KING       BOSTON
TURNER     BOSTON
ADAMS      BOSTON
JAMES      BOSTON
FORD       BOSTON
MILLER     BOSTON

56 rows selected.
```
---
# 2. INNER JOIN [IMPORTANT]

```sql
--ANSI Syntax:
SELECT * FROM TABLE INNER JOIN TABLE
ON CONDITION 
WHERE CONDITION;

--ORACLE Syntax:
SELECT * FROM TABLE N1, TABLE N2
WHERE CONDITION;
```

```sql
--ANSI
SQL> SELECT ENAME, LOC FROM EMP INNER JOIN DEPT
  2  ON EMP.DEPTNO = DEPT.DEPTNO;

ENAME      LOC
---------- -------------
CLARK      NEW YORK
KING       NEW YORK
MILLER     NEW YORK
JONES      DALLAS
FORD       DALLAS
ADAMS      DALLAS
SMITH      DALLAS
SCOTT      DALLAS
WARD       CHICAGO
TURNER     CHICAGO
ALLEN      CHICAGO
JAMES      CHICAGO
BLAKE      CHICAGO
MARTIN     CHICAGO

14 rows selected.

--ORACLE
SQL> SELECT ENAME, LOC FROM EMP, DEPT
  2  WHERE EMP.DEPTNO = DEPT.DEPTNO;

ENAME      LOC
---------- -------------
CLARK      NEW YORK
KING       NEW YORK
MILLER     NEW YORK
JONES      DALLAS
FORD       DALLAS
ADAMS      DALLAS
SMITH      DALLAS
SCOTT      DALLAS
WARD       CHICAGO
TURNER     CHICAGO
ALLEN      CHICAGO
JAMES      CHICAGO
BLAKE      CHICAGO
MARTIN     CHICAGO

14 rows selected.
```

## Queries: 

### 1. Display emp name, sal, location where sal is greater than 2000.
```sql

```

### 2. WAQ to display emp name, location where location is Chicago and New York.
```sql

```

### 3. WAQ to display emp name, job, location where job is Salesman and Clerk.
```sql

```
### 4. WAQ to display number of employees working in each location.
```sql

```
### 5. WAQ to display maximum salary present in each location.
```sql

```
### 6. Display manager name, manager location.
```sql

```
### 7. Display all the details of employee along with location.
```sql

```
### 8. Display all the details of dept along with empname.
```sql

```
### 9. Display empname, sal, grade.
```sql

```
### 10. Display manager name, manager sal, manager script.
```sql

```
### 11. Display emp name, sal, grade, loc.
```sql

```
### 12. Display mgr name, mgr sal, mgr grade, mgr location.
```sql

```
---

## Command to chnage User: 

```sql
SQL> show user;
USER is "SCOTT"

SQL> conn
Enter user-name: hr
Enter password:
Connected.

SQL> show user
USER is "HR"
```

## Here we have Another Schema:
## Username: hr
## Password: tiger

>In this User hr we have these tables:

```sql

SQL> select * from tab;

TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
COUNTRIES                      TABLE
DEPARTMENTS                    TABLE
EMPLOYEES                      TABLE
EMP_DETAILS_VIEW               VIEW
JOBS                           TABLE
JOB_HISTORY                    TABLE
LOCATIONS                      TABLE
REGIONS                        TABLE

8 rows selected.
```

> **SCHEMAS OF THE ABOVE TABLES: **

> **EMPLOYEES TABLE** : EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID

> **DEPARTMENTS TABLE** : DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID  

> **LOCATIONS TABLE**: LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, CO [CO stands for COUNTRY_ID]

> **COUNTRIES TABLE** : CO [CO stands for COUNTRY_ID], COUNTRY_NAME, REGION_ID

> **REGIONS TABLE** : REGION_ID, REGION_NAME

> **JOBS TABLE** : JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY

---

# Queries based on hr(User) Schema:

### 1. WAQ to display emp first name, dept name.
```sql

```
### 2. WAQ to display city with its country name.
```sql

```
### 3. WAQ to display country name with its region name.
```sql

```
### 4. WAQ to display city, country name, region name.
```sql

```
### 5. WAQ to display emp first name, job title.
```sql

```
### 6. WAQ to display emp first name, dept name, city.
```sql

```
### 7. WAQ to display emp first name, dept name, country name.
```sql

```
### 8. WAQ to display emp first name, region name.
```sql

```
### 9. WAQ to display emp first name, job title, country name, region name.
```sql

```
### 10. Find no of employees working in each job title.
```sql

```
### 11. Find no of employees working in each country.
```sql

```
### 12. Find no of employees working in each region.
```sql

```
### 13. Display emp first name, job title, dept name, city, country, region name.
```sql

```
### 14. Find the no of countries present in the each region.
```sql

```
### 15. Find no of cities present in the each country.

---

# 3. Natural Join

```sql
--ANSI Syntax:
SELECT * FROM TABLE1 NATURAL JOIN TABLE2
WHERE CONDITION;

--It has no ORACLE Syntax.

```

## Queries based on Natural join:

### 1. Waq to display emp name, location.
```sql

```
### 2. WAQ to display emp name, salary, location where salary is greater than 2000.
```sql

```
### 3. Display emp name, job, location where job is Salesman.
```sql

```
### 4. Display no of employees working in each location.
```sql

```
### 5. Display emp name, salary, grade. 
```sql

```

---
# 4. Self Join [IMPORTANT]

```sql
--ANSI Syntax:
SELECT * FROM TABLE T1 JOIN TABLE T2
ON CONDITION 
WHERE CONDITION;

--ORACLE Syntax:
SELECT * FROM TABLE T1, TABLE T2
WHERE CONDITION;
```

```SQL
--ANSI
SQL> SELECT E1.ENAME, E2.ENAME
  2  FROM EMP E1 JOIN EMP E2
  3  ON E1.MGR = E2.EMPNO;

ENAME      ENAME
---------- ----------
FORD       JONES
SCOTT      JONES
TURNER     BLAKE
ALLEN      BLAKE
WARD       BLAKE
JAMES      BLAKE
MARTIN     BLAKE
MILLER     CLARK
ADAMS      SCOTT
BLAKE      KING
JONES      KING
CLARK      KING
SMITH      FORD

13 rows selected.

-- ORACLE:
SQL> SELECT E1.ENAME, E2.ENAME MANAGER
  2  FROM EMP E1, EMP E2
  3  WHERE E1.MGR = E2.EMPNO;

ENAME      MANAGER
---------- ----------
FORD       JONES
SCOTT      JONES
TURNER     BLAKE
ALLEN      BLAKE
WARD       BLAKE
JAMES      BLAKE
MARTIN     BLAKE
MILLER     CLARK
ADAMS      SCOTT
BLAKE      KING
JONES      KING
CLARK      KING
SMITH      FORD

13 rows selected.

```

## Queries:

### 1. Display emp name, emp salary, manager name, manager salary where employee earning salary is greater than manager salary.
```sql

```

### 2. Display emp name, employee job, manager name, manager job where employee's job is Salesman and Clerk.
```sql

```

### 3. Display employee name, emp salary, emp job, manager name, manager sal, manager job where manager job is manager.
```sql

```

### 4. Display emp name, emp commission, manager name, manager commission where emp is not earning any commission (include 0 also).
```sql

```

### 5. Display emp name, emp dept no, manager name, manager dept no, where manager's dept no is 20.
```sql

```

### 6. Display emp name, emp location, manager name, manager location.
```sql

```

### 7. Display emp name, emp salary, emp grade, manager name, manager salary, manager's grade.
```sql

```

### 8. Display emp name, emp location, emp salary, emp grade, manager name, manager location, manager grade.
```sql

```

### 9. Display emp name, manager name and their manager name.
```sql

```

### 10. Display emp name, emp location, manager name, manager location and their manager location.
```sql

```

### 11. Display emp name, salary, grade, manager name, manager salary, manger grade and their manager name, salary grade.
```sql

```

### 12. Display emp name, salary, grade, location,  manager name, salary, grade, location and their manager name, salary, grade, location.
```sql

```



---
# 5. Outer Join [IMPORTANT]

```sql
--Types of Outer Join:
1. Left Outer Join
2. Right Outer Join
3. Full Outer Join
```

> We will perform the above three outer joins on the below tables (Subject and Student).

```sql

SQL> CREATE TABLE SUBJECT(
  2  SUB_ID CHAR(2) PRIMARY KEY,
  3  SUB_NAME VARCHAR (10));

Table created.

SQL> CREATE TABLE STUDENT(
  2  SID NUMBER PRIMARY KEY,
  3  NAME VARCHAR(10),
  4  SUB_ID CHAR(2),
  5  FOREIGN KEY(SUB_ID) REFERENCES SUBJECT(SUB_ID));

Table created.

SQL> INSERT INTO SUBJECT VALUES('S1', 'JAVA');
SQL> INSERT INTO SUBJECT VALUES('S2', 'PYTHON');
SQL> INSERT INTO SUBJECT VALUES('S3', 'SQL');
SQL> INSERT INTO SUBJECT VALUES('S4', 'WEB');

SQL> INSERT INTO STUDENT VALUES(1, 'RAJU', 'S1');
SQL> INSERT INTO STUDENT VALUES(2, 'DOLU', NULL);
SQL> INSERT INTO STUDENT VALUES(3, 'RANI', 'S2');
SQL> INSERT INTO STUDENT VALUES(4, 'BHEEM', 'S1');
SQL> INSERT INTO STUDENT(SID, NAME) VALUES (5, 'JAGGU'); -- Another way of inserting values.


SQL> SELECT * FROM SUBJECT;

SU SUB_NAME
-- ----------
S1 JAVA
S2 PYTHON
S3 SQL
S4 WEB

SQL> SELECT * FROM STUDENT;

       SID NAME       SU
---------- ---------- --
         1 RAJU       S1
         2 DOLU
         3 RANI       S2
         4 BHEEM      S1
         5 JAGGU

```

```sql
-- LEFT OUTER JOIN

--ANSI Syntax:
SQL> SELECT * FROM STUDENT LEFT JOIN SUBJECT
  2  ON STUDENT.SUB_ID = SUBJECT.SUB_ID;

       SID NAME       SU SU SUB_NAME
---------- ---------- -- -- ----------
         1 RAJU       S1 S1 JAVA
         2 DOLU
         3 RANI       S2 S2 PYTHON
         4 BHEEM      S1 S1 JAVA
         5 JAGGU


-- Oracle Syntax:
SQL> SELECT * FROM STUDENT S, SUBJECT SB
  2  WHERE S.SUB_ID = SB.SUB_ID(+);

       SID NAME       SU SU SUB_NAME
---------- ---------- -- -- ----------
         1 RAJU       S1 S1 JAVA
         2 DOLU
         3 RANI       S2 S2 PYTHON
         4 BHEEM      S1 S1 JAVA
         5 JAGGU
```

```sql
--  RIGHT OUTER JOIN

--ANSI Syntax:
SQL> SELECT * FROM STUDENT RIGHT JOIN SUBJECT
  2  ON STUDENT.SUB_ID = SUBJECT.SUB_ID;

       SID NAME       SU SU SUB_NAME
---------- ---------- -- -- ----------
         1 RAJU       S1 S1 JAVA
         3 RANI       S2 S2 PYTHON
         4 BHEEM      S1 S1 JAVA
                         S4 WEB
                         S3 SQL

-- Oracle Syntax:
SQL> SELECT * FROM STUDENT S, SUBJECT SB
  2  WHERE S.SUB_ID(+) = SB.SUB_ID;

       SID NAME       SU SU SUB_NAME
---------- ---------- -- -- ----------
         1 RAJU       S1 S1 JAVA
         3 RANI       S2 S2 PYTHON
         4 BHEEM      S1 S1 JAVA
                         S4 WEB
                         S3 SQL
```

```sql
-- FULL OUTER JOIN

--ANSI Syntax:
SQL> SELECT * FROM STUDENT FULL JOIN SUBJECT
  2  ON STUDENT.SUB_ID = SUBJECT.SUB_ID;

       SID NAME       SU SU SUB_NAME
---------- ---------- -- -- ----------
         1 RAJU       S1 S1 JAVA
         2 DOLU
         3 RANI       S2 S2 PYTHON
         4 BHEEM      S1 S1 JAVA
         5 JAGGU
                         S4 WEB
                         S3 SQL

7 rows selected.

-- There is no oracle Syntax for Full Join.
```

## Queries based On Outer Join:

### 1. Display all the student name with subject name, consider the student even if he is not registered to any subject also.
```sql

```

### 2. Display student name, Subject name and consider the subject even if no students are registered also.
```sql

```

### 3. Find the student name where student is not registered to any subject.
```sql

```

### 4. Find the subjects where no students are registered.
```sql

```
