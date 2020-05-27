--�ε���--
--SQL ��ɾ� ��ȸ ó�� �ӵ��� ����Ű�� ���� ��ü

--���� : 	�˻� �ӵ��� ���
--���� : 	�ε����� �����ϴ� ���̺��� ������ ���� ����Ǵ� ���̺��̶��
--		�ε����� �Ź� �ٽ� ����Ͽ� ������ �ϱ� ������ ������ ������ ���� �� �� �ִ�.
--		�ε����� �����ϱ� ���� ������ ������ �Ҵ�
--(������ �����ϴ��� ������ �ش�ȭ�Ǳ� ������ ����Ѵ�.)

--�ε��� �������
--CREATE [UNIQUE] INDEX �ε�����
--ON ���̺��(�÷�[,�÷��� | �Լ���])

--�ε����� �����ϴ� ������ ����
SELECT * FROM USER_IND_COLUMNS;

SELECT ROWID, EMP_ID, EMP_NAME FROM EMPLOYEE ;
--ROWID
--���̺� ���� �� ������ �߰��ÿ� ����Ŭ���� �ش� ��ü�� �����ϱ� ����
--�������� ����, �ý��ۿ��� ���� �����ϱ� ������ ����ڰ� �Ժη� ���� �Ұ�


--�ε����� ����
--1. �����ε���(UNIQUE INDEX)
--2. ������ε���(NOUNIQUE INDEX)
--3. �����ε���(SINGLE INDEX)
--4. �����ε���(COMPOSITE INDEX)
--5. �Լ���� �ε���(FUNCTION BASE INDEX)

--�����ε���--
--�ε��� ���� �� �������� �������� �����ϴ� �ε���
--PRIMARY KEY ���������� ����ϸ� �ڵ����� �����ϴ� �ε���
--(�̹� ������� �ε����� �� ���� �� ����.)
CREATE UNIQUE INDEX IDX_EMP_NO
ON EMPLOYEE(EMP_NO);

SELECT * FROM USER_IND_COLUMNS
WHERE TABLE_NAME ='EMPLOYEE';

--�÷��� ���� �ߺ��� ������ ��� UNIQUE INDEX ������ �� ����.
CREATE UNIQUE INDEX IDX_DEPT_CODE
ON EMPLOYEE(DEPT_CODE);

-- NON-UNIQUE INDEX 
-- ���� ���� ����ϴ� �÷��� �ε����� �����Ͽ� �˻� �ӵ��� ����Ű�� ���� �ε���
CREATE INDEX IDX_DEPT_CODE
ON EMPLOYEE(DEPT_CODE);

SELECT EMP_NAME, DEPT_CODE, JOB_CODE
FROM EMPLOYEE WHERE DEPT_CODE='D6';

SELECT * FROM USER_IND_COLUMNS 
WHERE TABLE_NAME='EMPLOYEE';


-- ���� �ε��� --
--���� �÷��� �ϳ��� ���� ���� �ε���
CREATE INDEX IDX_DEPT
ON DEPARTMENT(DEPT_ID,DEPT_TITLE);

SELECT * FROM DEPARTMENT ;

SELECT DEPT_ID, DEPT_TITLE FROM DEPARTMENT 
WHERE DEPT_ID !='D1' AND DEPT_TITLE !='���������';


--�Լ� ��� �ε���
--��ȸ �� ���� ����ϴ� �Լ����� �ִٸ� �ش� �Լ����� 
--�ε��� ������ �ݿ��Ͽ� �˻��� ����ϴ� �ε���

SELECT EMP_ID, EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ((SALARY*NVL(BONUS,0)+SALARY)*12)>10000000;

CREATE INDEX IDX_EMP_SAL_CAL
ON EMPLOYEE((SALARY*NVL(BONUS,0)+SALARY)*12);

--�ε��� ���ΰ�ħ
ALTER INDEX IDX_DEPT REBUILD;

--�ε��� ����
DROP INDEX IDX_DEPT;


--���� ����
--1. SYS / �ֻ��� ������
--2. SYSTEM / �Ϲ� ������
--3. SCOTT / ������ ���ð���
--4. HR / ������ ���ð���
--


--PL/SQL �� �� ����--
--ORACLE--
--DBMS
--�����͸� ȿ�������� �����ϱ� ���� �ý���

--DDL: ������ ���Ǿ�
--CREATE, ALTER, DROP

--DBMS ��ü : USER, TABLE, VIEW, INDEX, SEQUENCE

--DML: ������ ���۾�
--CRUD
--CREATE : INSERT
--READ : SELECT
--UPDATE : UPDATE
--DELETE : DELETE


--SELECT ����--
--5.SELECT
--1.FROM
--2.WHERE
--3.GROUP BY
--4.HAVING
--6.ORDER BY

--SET OPERATOR, JOIN
--SET OPERATOR
--UNION, UNION ALL, MINUS, INTERSECT

--JOIN
--INNER JOIN : �ΰ� �̻��� ���̺��� ���� ������ ��� ��� ���� ����� ���� ���
--OUTER JOIN : ���� �ٸ� ���� �����ϱ� ���� ���
--    LEFT, RIGHT, FULL

--TABLE
-- ����� �����͸� ǥ�� ���·� ǥ���Ͽ� �����ϴ� DB��ü
--VIEW
-- ��ȸ�� SELECT ������ ����, �ʿ�� ������ ����� �� �ִ� ���� ���̺�
--SEQUENCE
-- 1,2,3,4,5 .. ���� ������ �ڵ����� �������� ���ڵ����͸� ���� �� �ִ� DB��ü
--INDEX
-- ���̺��� Ư�� �����͸� �˻��� ��, ȿ�����̰� ������ �˻��ϱ� ���� ��ü

