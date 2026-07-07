# DML

> While Performing **UPDATE** and **DELETE**, we need to add where condition. If not then all the rows will be updated or deleted.

```sql
SQL> CREATE TABLE EMPCOPY AS (SELECT * FROM EMP);

Table created.

SQL> SET LINES100 PAGES100;
SQL> SELECT * FROM EMPCOPY;

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

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SQL> UPDATE EMPCOPY SET ENAME = 'RAMESH'
  2  WHERE EMPNO = 7839;

1 row updated.

SQL> SELECT * FROM EMPCOPY;

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
      7839 RAMESH     PRESIDENT            17-NOV-81       5000                    10
      7844 TURNER     SALESMAN        7698 08-SEP-81       1500          0         30
      7876 ADAMS      CLERK           7788 23-MAY-87       1100                    20
      7900 JAMES      CLERK           7698 03-DEC-81        950                    30
      7902 FORD       ANALYST         7566 03-DEC-81       3000                    20
      7934 MILLER     CLERK           7782 23-JAN-82       1300                    10

14 rows selected.

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SQL> UPDATE EMPCOPY SET ENAME = 'KING'
  2  WHERE EMPNO = 7839;

1 row updated.

SQL> SELECT * FROM EMPCOPY;

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

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

--IF WE ARE NOT ADDING WHERE CONDITION THEN WHAT HAPPENS: ALL THE RECORDS WILL BE UPDATED.

SQL> UPDATE EMPCOPY SET ENAME = 'MANOJ';

14 rows updated.

SQL> SELECT * FROM EMPCOPY;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7369 MANOJ      CLERK           7902 17-DEC-80        800                    20
      7499 MANOJ      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 MANOJ      SALESMAN        7698 22-FEB-81       1250        500         30
      7566 MANOJ      MANAGER         7839 02-APR-81       2975                    20
      7654 MANOJ      SALESMAN        7698 28-SEP-81       1250       1400         30
      7698 MANOJ      MANAGER         7839 01-MAY-81       2850                    30
      7782 MANOJ      MANAGER         7839 09-JUN-81       2450                    10
      7788 MANOJ      ANALYST         7566 19-APR-87       3000                    20
      7839 MANOJ      PRESIDENT            17-NOV-81       5000                    10
      7844 MANOJ      SALESMAN        7698 08-SEP-81       1500          0         30
      7876 MANOJ      CLERK           7788 23-MAY-87       1100                    20
      7900 MANOJ      CLERK           7698 03-DEC-81        950                    30
      7902 MANOJ      ANALYST         7566 03-DEC-81       3000                    20
      7934 MANOJ      CLERK           7782 23-JAN-82       1300                    10

14 rows selected.

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SQL> DELETE FROM EMPCOPY WHERE EMPNO = 7369;

1 row deleted.

SQL> SELECT * FROM EMPCOPY;

     EMPNO ENAME      JOB              MGR HIREDATE         SAL       COMM     DEPTNO
---------- ---------- --------- ---------- --------- ---------- ---------- ----------
      7499 MANOJ      SALESMAN        7698 20-FEB-81       1600        300         30
      7521 MANOJ      SALESMAN        7698 22-FEB-81       1250        500         30
      7566 MANOJ      MANAGER         7839 02-APR-81       2975                    20
      7654 MANOJ      SALESMAN        7698 28-SEP-81       1250       1400         30
      7698 MANOJ      MANAGER         7839 01-MAY-81       2850                    30
      7782 MANOJ      MANAGER         7839 09-JUN-81       2450                    10
      7788 MANOJ      ANALYST         7566 19-APR-87       3000                    20
      7839 MANOJ      PRESIDENT            17-NOV-81       5000                    10
      7844 MANOJ      SALESMAN        7698 08-SEP-81       1500          0         30
      7876 MANOJ      CLERK           7788 23-MAY-87       1100                    20
      7900 MANOJ      CLERK           7698 03-DEC-81        950                    30
      7902 MANOJ      ANALYST         7566 03-DEC-81       3000                    20
      7934 MANOJ      CLERK           7782 23-JAN-82       1300                    10

13 rows selected.

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SQL> DELETE FROM EMPCOPY; --All the records are deleted.

13 rows deleted.

SQL> SELECT * FROM EMPCOPY;

no rows selected

--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

SQL> ROLLBACK; --All the records are retrieved

Rollback complete.

SQL> SELECT * FROM EMPCOPY;

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
--++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
```