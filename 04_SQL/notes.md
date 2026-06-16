>Users: scott, hr  
>Passowrd: tiger

# Basic SQL*Plus Commands

1. **show user** => It displays the current username.
2. **show pages** => It displays the page size.
3. **show lines** => It displays the line size.
4. **select * from tab;** =>It displays all the table name.
5. **select * from dept;** => It displays all the details of the dept (Department) table.
6. **set pages100 lines100** => Sets the page size to 100 rows and the line width to 100 characters for displaying output neatly in SQL*Plus.
7. **cl scr OR clear screen** => Used to clear the screen.
8. **exit** => Used to exit from SQL Plus.
9. **desc dept** => Displays the structure of the DEPT table, including column names, data types, and constraints.
10. If we want to switch one user to another user:
    ```sql
    conn
    enter username - hr
    enter password - tiger
    ```
11. **commit** => COMMIT permanently saves all pending transactions to the database.COMMIT permanently saves all pending transactions to the database.

---

```sql
Enter user-name: scott
Enter password:

Connected to:
Oracle Database 11g Enterprise Edition Release 11.1.0.6.0 - Production
With the Partitioning, OLAP, Data Mining and Real Application Testing options

SQL> show user  //Commands
USER is "SCOTT" //Output

SQL> show pages
pagesize 14

SQL> show lines
linesize 80

SQL> select * from tab;  //Commands
//Output
TNAME                          TABTYPE  CLUSTERID
------------------------------ ------- ----------
BIN$SOMbZNA5TGCFoTzsOq4H1g==$0 TABLE
BONUS                          TABLE
DEPT                           TABLE
EMP                            TABLE
MBM                            TABLE
MENSCLG                        TABLE
SALGRADE                       TABLE
SHADIDOTCOM                    TABLE
STUD                           TABLE

9 rows selected.

SQL> select * from dept;

    DEPTNO DNAME          LOC
---------- -------------- -------------
        10 ACCOUNTING     NEW YORK
        20 RESEARCH       DALLAS
        30 SALES          CHICAGO
        40 OPERATIONS     BOSTON

SQL> select * from emp;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7369 SMITH      CLERK           7902 17-DEC-80        800
        20

      7499 ALLEN      SALESMAN        7698 20-FEB-81       1600        300
        30

      7521 WARD       SALESMAN        7698 22-FEB-81       1250        500
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7566 JONES      MANAGER         7839 02-APR-81       2975
        20

      7654 MARTIN     SALESMAN        7698 28-SEP-81       1250       1400
        30

      7698 BLAKE      MANAGER         7839 01-MAY-81       2850
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7782 CLARK      MANAGER         7839 09-JUN-81       2450
        10

      7788 SCOTT      ANALYST         7566 19-APR-87       3000
        20

      7839 KING       PRESIDENT            17-NOV-81       5000
        10


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0
        30

      7876 ADAMS      CLERK           7788 23-MAY-87       1100
        20

      7900 JAMES      CLERK           7698 03-DEC-81        950
        30


     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM
---------- ---------- --------- ---------- --------- ---------- ----------
    DEPTNO
----------
      7902 FORD       ANALYST         7566 03-DEC-81       3000
        20

      7934 MILLER     CLERK           7782 23-JAN-82       1300
        10


14 rows selected.

SQL> set pages100 lines100;  //After set pages and lines as 100, now emp table will come in proper grid fromat.

SQL> select * from emp;

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


SQL> desc dept;

 Name                                                  Null?    Type
 ----------------------------------------------------- -------- ------------------------------------
 DEPTNO                                                NOT NULL NUMBER(2)
 DNAME                                                          VARCHAR2(14)
 LOC   

```

---

# Examples on Table Creation and Insertion:

## 1. Creating Student Table":

```sql
SQL> create table student(
  2  sid number primary key,
  3  name varchar(15) not null,
  4  dob date not null,
  5  phone number(10) );

Table created.

SQL> insert into student values(101, 'nithin', '12-nov-2004', 8240898175);
1 row created.

SQL> insert into student values(102, 'prem', '12-dec-2044', 8240895675);
1 row created.

SQL> insert into student values(103, 'priya', '12-jan-2005', 824085);
1 row created.

SQL> insert into student values(104, 'bahubali', '12-feb-2055', 824078);
1 row created.

SQL> select * from student;

       SID NAME            DOB            PHONE
---------- --------------- --------- ----------
       101 nithin          12-NOV-04 8240898175
       102 prem            12-DEC-44 8240895675
       103 priya           12-JAN-05     824085
       104 bahubali        12-FEB-55     824078

```

## 2. Marriage Bureau for Female:

```sql
SQL> create table mbf(
  2  sno number primary key,
  3  name varchar(15),
  4  age number(2) check(age >= 18) );

Table created.

SQL> insert into mbf values(1, 'Riya', 18);
1 row created.

SQL> insert into mbf values(2, 'Priya', 28);
1 row created.

SQL> insert into mbf values(3, 'Sriya', 25);
1 row created.

SQL> select * from mbf;

       SNO NAME                   AGE
---------- --------------- ----------
         1 Riya                    18
         2 Priya                   28
         3 Sriya                   25

```

## 3. Table for MENs College [Set a default value for gender as 'Male']:

```sql
SQL> create table mensCLG(
  2  sid number primary key,
  3  name varchar(15),
  4  gender varchar(10) default 'male');

Table created.

SQL> insert into mensCLG values(101, 'bheem', 'male');
1 row created.

SQL> insert into mensCLG values(102, 'kalia', default);
1 row created.

SQL> insert into mensCLG values(103, 'jaggu', default);
1 row created.

SQL> insert into mensCLG (sid, name) values(104, 'dholu');
1 row created.

SQL> select * from mensCLG;

       SID NAME            GENDER
---------- --------------- ----------
       101 bheem           male
       102 kalia           male
       103 jaggu           male
       104 dholu           male

```

## 4. Make a customer Table havig columns as [CID, name, email, phone(exact 10 digits)]

```sql
SQL> create table customer(
  2  cid number primary key,
  3  name varchar(15) not null,
  4  email varchar(25),
  5  phone number(10) check(length(phone) = 10));

Table created.

SQL> insert into customer values(101, 'prem', 'abc@gmail.com', 8240368156);
1 row created.

SQL> insert into customer values(102, 'riya', 'def@gmail.com', 8240364568);
1 row created.

SQL> insert into customer values(103, 'priya', 'ghi@gmail.com', 82403648);
insert into customer values(103, 'priya', 'ghi@gmail.com', 82403648)
*
ERROR at line 1:
ORA-02290: check constraint (SCOTT.SYS_C009691) violated  //Here the condition got violated.


SQL> select * from customer;

       CID NAME            EMAIL                          PHONE
---------- --------------- ------------------------- ----------
       101 prem            abc@gmail.com             8240368156
       102 riya            def@gmail.com             8240364568

```

## 5. Make a table for "Marriage Bureau for Male having columns as [sno, name, gender(it should only accept male), age(age >= 21 AND age <=45) ]:

```sql
SQL> create table MBM(
  2  sno number primary key,
  3  name varchar(20),
  4  gender char(1) check(gender = 'M'),
  5  age number(2) check(age >= 21 and age <= 45) );

Table created.

SQL> commit;

Commit complete.
```
