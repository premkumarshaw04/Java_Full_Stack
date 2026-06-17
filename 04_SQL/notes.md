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
---

# Queries Based On Foreign Keys:

## 1. Example of Director and Movie table

```sql
SQL> create table director(
  2  dir_id char(3) primary key,
  3  dir_name varchar(15) not null,
  4  dir_age number );

Table created.

SQL> create table movie(
  2  m_id number primary key,
  3  m_name varchar(20),
  4  rel_date date,
  5  dir_id char(3),
  6  foreign key(dir_id) references director(dir_id) );

Table created.

SQL> insert into director values('D01', 'Rajamouli', 16);
1 row created.

SQL> insert into director values('D02', 'RGV', 46);
1 row created.

SQL> insert into director values('D03', 'Prashant', 35);
1 row created.

SQL> insert into director values('D04', 'Manoj', 34);
1 row created.

---------------------

SQL> insert into movie values(1, 'Bahubali', '12-jan-2017', 'D01');
1 row created.

SQL> insert into movie values(2, 'KGF', '12-feb-2022', 'D03');
1 row created.

SQL> insert into movie values(3, 'Salaar', '15-apr-2023', 'D03');
1 row created.

SQL> insert into movie values(4, 'SQL', '15-june-2026', 'D04');
1 row created.

//-----Here you will get error because we do not have any Director having director id as D05
SQL> insert into movie values(5, 'Java', '15-july-2026', 'D05');
insert into movie values(5, 'Java', '15-july-2026', 'D05')
*
ERROR at line 1:
ORA-02291: integrity constraint (SCOTT.SYS_C009699) violated - parent key not
found

----------------

SQL> select * from movie;

      M_ID M_NAME               REL_DATE  DIR
---------- -------------------- --------- ---
         1 Bahubali             12-JAN-17 D01
         2 KGF                  12-FEB-22 D03
         3 Salaar               15-APR-23 D03
         4 SQL                  15-JUN-26 D04

SQL> select * from director;

DIR DIR_NAME           DIR_AGE
--- --------------- ----------
D01 Rajamouli               16
D02 RGV                     46
D03 Prashant                35
D04 Manoj                   34
```

## 2.  Table for Countries and their Regions

```sql
SQL> create table regions(
  2  region_id char(2) primary key,
  3  region_name varchar(15));

Table created.

SQL> create table countries(
  2  country_id number primary key,
  3  country_name varchar(15),
  4  region_id char(2),
  5  foreign key(region_id) references regions(region_id) );

Table created.

SQL> insert into regions values('R1', 'Asia');
1 row created.

SQL> insert into regions values('R2', 'Europe');
1 row created.

SQL> insert into regions values('R3', 'Middle East');
1 row created.

SQL> select * from regions;

RE REGION_NAME
-- ---------------
R1 Asia
R2 Europe
R3 Middle East

---------------

SQL> insert into countries values(1, 'India', 'R1');
1 row created.

SQL> insert into countries values(2, 'China', 'R1');
1 row created.

SQL> insert into countries values(3, 'Iran', 'R3');
1 row created.

SQL> insert into countries values(4, 'Oman', 'R3');
1 row created.

SQL> insert into countries values(5, 'Saudi Arabia', 'R3');
1 row created.

SQL> select * from countries;

COUNTRY_ID COUNTRY_NAME    RE
---------- --------------- --
         1 India           R1
         2 China           R1
         3 Iran            R3
         4 Oman            R3
         5 Saudi Arabia    R3
```

## 3. Customers  -> Orders (One-to-Many)
```
customers
•	customer_id (PK)
•	customer_name
•	country
orders
•	order_id (PK)
•	customer_id (FK → customers.customer_id)
•	amount
•	order_date
```

```sql
SQL> create table customers(
  2  customer_id number primary key,
  3  customer_name varchar(15),
  4  country varchar(20)
  5  );

Table created.


SQL> create table orders(
  2  order_id number primary key,
  3  customer_id number,
  4  amount number(10, 2),
  5  order_date date,
  6  foreign key(customer_id) references customers(customer_id)
  7  );

Table created.

```

## 4. Users → User_Profile (One-to-One)
```
users
•	user_id (PK)
•	username
user_profile
•	profile_id (PK)
•	user_id (FK → users.user_id & UNIQUE)
•	phone
•	address
```

```sql
SQL> create table users(
  2  user_id number primary key,
  3  username varchar(20)
  4  );

Table created.

SQL> create table user_profile(
  2  profile_id number primary key,
  3  user_id number unique,
  4  phone varchar(15),
  5  address varchar(50),
  6  foreign key(user_id) references users(user_id)
  7  );

Table created.
```
>The key here is **user_id number unique** — this prevents a second profile from being linked to the same user.

## 5. Categories → Products (One-to-Many)
```
categories
•	category_id (PK)
•	category_name
products
•	product_id (PK)
•	product_name
•	price
•	category_id (FK → categories.category_id)
```
>Same One-to-Many pattern — one category can have many products.

```sql
SQL> create table categories(
  2  category_id number primary key,
  3  category_name varchar(20)
  4  );

Table created.

SQL> create table products(
  2  product_id number primary key,
  3  product_name varchar(20),
  4  price number(10,2),
  5  category_id number,
  6  foreign key(category_id) references categories(category_id)
  7  );

Table created.
```
```
number(10, 2) means:
10 → total digits allowed
2 → digits after decimal point

So it can store values like 99999999.99 (8 digits before + 2 after decimal).
```

## 6. Teachers → Classes (One-to-Many)

```
teachers
•	teacher_id (PK)
•	teacher_name
classes
•	class_id (PK)
•	class_name
•	teacher_id (FK → teachers.teacher_id)
```

```sql
SQL> create table teachers(
  2  teacher_id number primary key,
  3  teacher_name varchar(20)
  4  );

Table created.

SQL> create table classes(
  2  class_id number primary key,
  3  class_name varchar(15),
  4  teacher_id number,
  5  foreign key(teacher_id) references teachers(teacher_id)
  6  );

Table created.

```

## 7. Doctors → Patients (One-to-Many)

```
doctors
•	doctor_id (PK)
•	doctor_name
•	specialization
patients
•	patient_id (PK)
•	patient_name
•	doctor_id (FK → doctors.doctor_id)
```
>One Doctor can have many patients.

```sql
SQL> create table doctors(
  2  doctor_id number primary key,
  3  doctor_name varchar(15),
  4  specialization varchar(15)
  5  );

Table created.

SQL> create table patients(
  2  patient_id number primary key,
  3  patient_name varchar(15),
  4  doctor_id number,
  5  foreign key(doctor_id) references doctors(doctor_id)
  6  );

Table created.

```

## 8. Flights → Tickets (One-to-Many)
```
flights
•	flight_id (PK)
•	flight_name
•	source
•	destination
tickets
•	ticket_id (PK)
•	flight_id (FK → flights.flight_id)
•	passenger_name
```

>One flight can have many tickets.

```sql
SQL> create table flights(
  2  flight_id number primary key,
  3  flight_name varchar(15),
  4  source varchar(15),
  5  destination varchar(15)
  6  );

Table created.

SQL> create table tickets(
  2  ticket_id number primary key,
  3  flight_id number,
  4  passenger_name varchar(15),
  5  foreign key(flight_id) references flights(flight_id)
  6  );

Table created.

```

## 9. Hotels → Rooms (One-to-Many)
```
hotels
•	hotel_id (PK)
•	hotel_name
•	city
rooms
•	room_id (PK)
•	hotel_id (FK → hotels.hotel_id)
•	room_type
•	price_per_night
```

>One hotel can have many rooms.

```sql
SQL> create table hotels(
  2  hotel_id number primary key,
  3  hotel_name varchar(15),
  4  city varchar(15)
  5  );

Table created.

SQL> create table rooms(
  2  room_id number primary key,
  3  hotel_id number,
  4  room_type varchar(15),
  5  price_per_night number(10,2),
  6  foreign key(hotel_id) references hotels(hotel_id)
  7  );

Table created.
```

## 10. Suppliers → Products (One-to-Many)
```
suppliers
•	supplier_id (PK)
•	supplier_name
•	contact_no
products
•	product_id (PK)
•	product_name
•	supplier_id (FK → suppliers.supplier_id)
•	unit_price

```

```sql
```

## 11. Employees ↔ Projects (Many-to-Many)
```
employees
•	emp_id (PK)
•	emp_name
•	department
projects
•	project_id (PK)
•	project_name
employee_project
•	emp_id (FK → employees.emp_id)
•	project_id (FK → projects.project_id)
•	(Composite PK: emp_id + project_id
```

```sql
```

## 12. Libraries → Books (One-to-Many) 
```
libraries
•	library_id (PK)
•	library_name
•	address
library_books
•	book_id (PK)
•	library_id (FK → libraries.library_id)
•	title
•	category
```

```sql
```

## 13. Banks → Accounts (One-to-Many)

```
banks
•	bank_id (PK)
•	bank_name
•	branch_location
accounts
•	account_id (PK)
•	bank_id (FK → banks.bank_id)
•	account_holder
•	balance
```
> Create two tables — **customers** first (since **orders** references it), then orders with a foreign key.

```sql

```
