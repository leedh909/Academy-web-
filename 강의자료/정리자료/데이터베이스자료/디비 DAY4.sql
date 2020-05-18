
-- GROUP BY : �־��� ����� Ư�� �ұ׷����� ���� �� ����ϴ� ����
-- HAVING : �׷� ���� ������ ������ �� ����Ѵ�.

/*
	-���� ���� ����-
5	SELECT �÷���
1	FROM ���̺��
2	WHERE ���ǽ�
3	GROUP BY �÷���
4	HAVING �׷쳻�� ���ǽ�
6	ORDER BY ǥ����

*/


--�ǽ�1.
--EMPLOYEE ���̺��� ���޺� �׷��� ���Ͽ� 
--�����ڵ�, �޿��հ�, �޿����, �ο��� �� ��ȸ
--��, �ο����� 3���� �ʰ��ϴ� ���޸��� ��ȸ
SELECT JOB_CODE "�����ڵ�", TO_CHAR(SUM(SALARY),'L999,999,999') "�޿��հ�", TRUNC(AVG(SALARY),0)||'��' "�޿����", COUNT(*)||'��' "�ο���"
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING COUNT(*)>3;

--����� �ڵ�
SELECT JOB_CODE , SUM(SALARY), TRUNC(AVG(SALARY),-2), COUNT(*)
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING COUNT(*)>3
ORDER BY 4 DESC;


--DECODE()
--DECODE(�÷���, ���1, ��1[, ���2, ��2 ....], �⺻��)
SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO ,8,1),1,'����',2,'����' ) "����"
FROM EMPLOYEE;

-- SET OPERATOR --
--�ΰ� �̻��� SELECT �� ����� ��ġ�ų�, �ߺ��� ������ �����ϰų� �ϴ� 
--���� ������ ����� ��ȸ�ϴ� ��ɾ�

--������--
--UNION :
--�� �� �̻��� SELECT �� ����� ���ϴ� ��ɾ�,
--�ߺ��� ���� ��� �ߺ��Ǵ� ����� 1���� �����ش�.

--UNION ALL :
--�� �� �̻��� SELECT �� ����� �����ֵ�,
--�ߺ��� ���� ��� �״�� ��ȸ�Ͽ� �����ش�.

--������--
--INTERSECT : �� �� �̻��� ��� �� �ߺ��Ǵ� ����� �����ش�.

--������--
--MINUS : �� �� �̻��� ��� �� ù��° ������� ���� ������ �����ִ� ��ɾ�


--SELECT ����� A�� B�� �ϳ��� ��ġ�� ���
--A�� B�� �÷� ������ �ڷ����� ���ƾ� �Ѵ�.!! �ݵ��!!

--UNION (�ߺ� ����)
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE DEPT_CODE ='D5'
UNION
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY > 3000000;

--UNION ALL (�ߺ��� ��� ���)
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE DEPT_CODE ='D5'
UNION ALL
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY > 3000000;

--INTERSECT
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE DEPT_CODE ='D5'
INTERSECT
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY > 3000000;

--MINUS
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE DEPT_CODE ='D5'
MINUS
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY > 3000000;


--JOIN--
--�� �� �̻��� ���̺��� �ϳ��� ���ļ� ����ϴ� ���

--���࿡ 'J6'��� ������ ���� ������� �ٹ� �μ����� �ñ��ϴٸ�??
SELECT EMP_NAME,JOB_CODE,DEPT_CODE 
FROM EMPLOYEE
WHERE JOB_CODE ='J6'; --D8, D1

SELECT * FROM DEPARTMENT;

SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT
WHERE DEPT_ID IN('D1','D8');


--����Ŭ ���� ���� / ANSI ǥ�� ����
--����Ŭ ���� ����
--FROM ���� ',' ��ȣ�� �ٿ� ��ġ�� �� ���̺���� ����
--WHERE ������ ���ؼ� ��ĥ ���̺���� ���� ������ �ۼ�
SELECT EMP_ID , EMP_NAME ,DEPT_CODE , DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID;


SELECT * FROM EMPLOYEE;
SELECT * FROM JOB;
--�÷����� ������ ��� ��Ī�� ����Ͽ� �������ش�.
SELECT *
FROM EMPLOYEE E, JOB J
WHERE E.JOB_CODE = J.JOB_CODE ;


SELECT *
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID;

--------------------------
--ANSI ǥ�� ����
--���� �ϰ��� �ϴ� ���̺��� FROM ���� ������
--JOIN ���̺�� ON() | USING() ������ ����Ͽ�
--�� �� �̻��� ���̺��� �ϳ��� ��ġ�� ���

--�� ���� ���̺��� ���� �÷��� �̸��� �ٸ� ���
SELECT EMP_ID ,EMP_NAME ,DEPT_CODE ,DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(EMPLOYEE.DEPT_CODE=DEPARTMENT.DEPT_ID );
--(EMPLOYEE.)DEPT_CODE=(DEPARTMENT.)DEPT_ID --���������ϴ�.

--�� ���� ���̺��� ���� �÷��� �̸��� ���� ���
SELECT EMP_ID , EMP_NAME , JOB_CODE , JOB_NAME
FROM EMPLOYEE
--JOIN JOB ON(EMPLOYEE.JOB_CODE = JOB.JOB_CODE);
JOIN JOB USING(JOB_CODE);


--�ǽ�2.
--EMPLOYEE ���̺��� ���� �޿� ������ SAL_GRADE�� �޿� ����� ���ļ�
--���, �����, �޿����, ��� ���� �ּұ޿�, �ִ�޿��� ��ȸ

--����Ŭ ����
SELECT EMP_ID "���", EMP_NAME "�����", 
E.SAL_LEVEL "�޿����", MIN_SAL "��� ���� �ּұ޿�", MAX_SAL "��� ���� �ִ�޿�"
FROM EMPLOYEE E, SAL_GRADE S
WHERE E.SAL_LEVEL = S.SAL_LEVEL ;

--ANSI ����
SELECT EMP_ID "���", EMP_NAME "�����", 
SAL_LEVEL "�޿����", MIN_SAL "��� ���� �ּұ޿�", MAX_SAL "��� ���� �ִ�޿�"
FROM EMPLOYEE 
JOIN SAL_GRADE USING(SAL_LEVEL);

--�ǽ�3.
--DEPARTMENT ���̺��� ��ġ ����
--LOCATION ���̺��� �����Ͽ�
--�� �μ��� �ٹ��� ��ġ�� ��ȸ
--�μ��ڵ�, �μ���, �ٹ��� �ڵ�, �ٹ��� ��ġ

--ORACLE
SELECT DEPT_ID "�μ��ڵ�", DEPT_TITLE "�μ���", LOCATION_ID "�ٹ��� �ڵ�", LOCAL_NAME "�ٹ��� ��ġ"
FROM DEPARTMENT , LOCATION 
WHERE LOCATION_ID = LOCAL_CODE ;

--ANSI
SELECT DEPT_ID "�μ��ڵ�", DEPT_TITLE "�μ���", LOCATION_ID "�ٹ��� �ڵ�", LOCAL_NAME "�ٹ��� ��ġ"
FROM DEPARTMENT
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID);


-- INNER JOIN / OUTER JOIN --
--�� �� �̻��� ���̺��� ��ĥ��
--INNER JOIN�� �� ��� ��ġ�ϴ� �����͸� ��ġ��, 
--OUTER JOIN�� �� �� �ϳ�, Ȥ�� �� ��ΰ� ���� ��� ���� ��ĥ�� ���

--INNER JOIN 
SELECT DISTINCT DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
ORDER BY 1;

--OUTER JOIN
--LEFT [OUTER] JOIN : �� ���̺� �� ����(����) ���̺��� ������ ��� �����Ͽ� ��ȸ
--RIGHT [OUTER] JOIN : �� ���̺� �� JOIN�� ����� ���̺��� ������ ��� �����Ͽ� ��ȸ
--FULL [OUTER] JOIN : �� ���̺��� ���� ������ �� ���ΰ� ������ ���� ���̶� ��� �����Ͽ� ��ȸ

--LEFT JOIN
--ANSI ǥ��
SELECT DEPT_CODE , EMP_NAME , DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--ORACLE
SELECT DEPT_CODE , EMP_NAME , DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+);


--RIGHT JOIN 
--ANSI ǥ��
SELECT DEPT_CODE, DEPT_ID, EMP_NAME
FROM EMPLOYEE
RIGHT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--ORACLE
SELECT DEPT_CODE, DEPT_ID, EMP_NAME
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE(+) = DEPT_ID;

--FULL JOIN
--ANSI ǥ��
SELECT DEPT_CODE , DEPT_ID, EMP_NAME 
FROM EMPLOYEE
FULL JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE);

--ORACLE
--ORACLE ���������� FULL JOIN�� �������� �ʴ´�.


--CROSS JOIN
--ī�׽þ� ��
SELECT EMP_NAME, NATIONAL_CODE
FROM EMPLOYEE 
CROSS JOIN NATIONAL;

--SELF JOIN
--�ڱ� �ڽ��� �����ϴ� ���
--�����̺��� ���� �� �� �񱳰� �ʿ��� �������� ����Ͽ� ��ȸ�ϴ� ���

--������ ������ ������ �����ϴ� �Ŵ����� ������ ��ȸ
--ANSI --
SELECT *
FROM EMPLOYEE E
JOIN EMPLOYEE M ON(E.MANAGER_ID = M.EMP_ID );

--ORACLE
SELECT E.EMP_ID ���, E.EMP_NAME �����, E.MANAGER_ID "������ ���", M.EMP_NAME �����ڸ�
FROM EMPLOYEE E , EMPLOYEE M
WHERE E.MANAGER_ID = M.EMP_ID ;

--���� JOIN --
--���� ���� ���̺��� JOIN �ϴ°�
--�Ϲ� ���ΰ� �������� ������, �ռ� ������ ����� �������� 
--���Ŀ� ������ ���̺��� ���� ���´�.
--���� ���� ������ �ݵ�� �����ؾ� �Ѵ�.

--ANSI ǥ��
SELECT EMP_NAME , DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID);

--ORACLE
SELECT EMP_NAME , DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE , DEPARTMENT  , LOCATION 
WHERE DEPT_CODE = DEPT_ID AND LOCAL_CODE = LOCATION_ID ;


--�ǽ�4.
--������ �븮�̸鼭, �ƽþ� �������� �ٹ��ϴ� ��� ��ȸ
--���, �����, ���޸�, �μ���, �ٹ�������, �޿�

--ANSI
SELECT EMP_ID ���,EMP_NAME �����, JOB_NAME ���޸�, DEPT_TITLE �μ���, LOCAL_NAME �ٹ�������, SALARY �޿�
FROM EMPLOYEE 
JOIN JOB USING(JOB_CODE)
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID)
WHERE JOB_NAME = '�븮' AND LOCAL_NAME LIKE 'ASIA%';
--������ڵ�
SELECT EMP_ID ���,EMP_NAME �����, JOB_NAME ���޸�, DEPT_TITLE �μ���, LOCAL_NAME �ٹ�������, SALARY �޿�
FROM EMPLOYEE E 
JOIN JOB J ON(E.JOB_CODE = J.JOB_CODE AND JOB_NAME ='�븮')
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE AND LOCAL_NAME LIKE 'ASIA%');

--ORACLE
SELECT EMP_ID ���,EMP_NAME �����, JOB_NAME ���޸�, DEPT_TITLE �μ���, LOCAL_NAME �ٹ�������, SALARY �޿�
FROM EMPLOYEE E, JOB J , DEPARTMENT D, LOCATION L
WHERE E.JOB_CODE = J.JOB_CODE AND D.DEPT_ID = E.DEPT_CODE 
	AND L.LOCAL_CODE = D.LOCATION_ID AND J.JOB_NAME ='�븮' AND L.LOCAL_NAME LIKE 'ASIA%';


--�ǽ�5.
--�ѱ�(KO)�� �Ϻ�(JP)�� �ٹ��ϴ� �ٹ� �������� ������ ��ȸ�Ͻÿ�.
--�����, �μ���, ������, ������

--ANSI
SELECT EMP_NAME �����, DEPT_TITLE �μ���, LOCAL_NAME ������, NATIONAL_NAME ������
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID)
JOIN NATIONAL USING(NATIONAL_CODE) 
WHERE NATIONAL_CODE IN ('KO','JP')
ORDER BY 4 DESC, 1;
--ORACLE
SELECT EMP_NAME �����, DEPT_TITLE �μ���, LOCAL_NAME ������, NATIONAL_NAME ������
FROM EMPLOYEE , DEPARTMENT , LOCATION L,NATIONAL N
WHERE DEPT_CODE = DEPT_ID AND LOCAL_CODE = LOCATION_ID 
	AND L.NATIONAL_CODE = N.NATIONAL_CODE AND L.NATIONAL_CODE IN('KO','JP')
ORDER BY 4 DESC, 1;


-- Sub Query --
--�ְ� �Ǵ� ���� ���� �ȿ��� �����̳� �ϳ��� �˻��� ���� �ٸ� ������ �߰��ϴ� ���

--������ ��������
--������� 1�� ������ ��������
--EX) �ּ� �޿��� �޴� ����� ���� ��ȸ
SELECT MIN(SALARY) FROM EMPLOYEE;
SELECT * FROM EMPLOYEE WHERE SALARY =1380000;

SELECT * FROM EMPLOYEE WHERE SALARY =(SELECT MIN(SALARY) FROM EMPLOYEE);

-- ���� �� ��������
--��� ���� ���� �� ������ ��������

--�� ���޺� �ּ� �޿�
SELECT JOB_CODE , MIN(SALARY)
FROM EMPLOYEE 
GROUP BY JOB_CODE;

SELECT *
FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY)
					FROM EMPLOYEE 
					GROUP BY JOB_CODE);
		
--���� �� ���� �� ��������
--���� �÷��� ���� ���� ���� ���������� ����Ͽ� ����� ��ȸ
SELECT *
FROM EMPLOYEE
WHERE (JOB_CODE , SALARY) IN (SELECT JOB_CODE ,MIN(SALARY)
								FROM EMPLOYEE 
								GROUP BY JOB_CODE);

--���� �� ���� �� ��������     ��     �Ϲ� ���� �� �������� ����
--EX) ����� �������� ���� ����, ���� �μ��� �ٹ��ϴ� �������� ������ ��ȸ
SELECT *
FROM EMPLOYEE
WHERE ENT_YN ='Y';

SELECT * FROM EMPLOYEE 
WHERE DEPT_CODE IN (SELECT DEPT_CODE 
					FROM EMPLOYEE
					WHERE ENT_YN ='Y')
	AND JOB_CODE IN (SELECT JOB_CODE
					FROM EMPLOYEE
					WHERE ENT_YN ='Y')
	AND EMP_NAME <> (SELECT EMP_NAME FROM EMPLOYEE WHERE ENT_YN ='Y');

--���� �� ���� �� ���������� ����
SELECT * FROM EMPLOYEE 
WHERE (DEPT_CODE , JOB_CODE ) = (SELECT DEPT_CODE, JOB_CODE 
					FROM EMPLOYEE
					WHERE ENT_YN ='Y') 
	AND EMP_NAME != (SELECT EMP_NAME FROM EMPLOYEE WHERE ENT_YN ='Y');
							

--���� ������ ��� ��ġ
--SELECT , FROM , WHERE , GROUP BY , HAVING , ORDER BY , JOIN
--DML : INSERT, UPDATE, DELETE
--DDL : CREATE TABLE, CREATE VIEW
--��� ��ġ�� ��� �� �� �ִ�.							
							
--Inline View(�ζ��� ��)
							
							

-- COMM �� ���� NULL�� �ƴ� ���� ��ȸ
SELECT * FROM EMP WHERE COMM IS NOT NULL;

-- Ŀ�̼��� ���� ���ϴ� ���� ��ȸ
SELECT * FROM EMP WHERE COMM IS NULL;

-- �����ڰ� ���� ���� ���� ��ȸ
SELECT * FROM EMP WHERE MGR IS NULL;

-- �޿��� ���� �޴� ���� ������ ��ȸ
SELECT * FROM EMP ORDER BY SAL DESC;

-- �޿��� ���� ��� Ŀ�̼��� �������� ���� ��ȸ
SELECT * FROM EMP ORDER BY SAL DESC, COMM DESC;

-- EMP ���̺��� �����ȣ, �����,����, �Ի��� ��ȸ
-- �� �Ի����� �������� ���� ó����.
SELECT EMPNO �����ȣ, ENAME �����, JOB ����, HIREDATE �Ի��� FROM EMP ORDER BY HIREDATE ;

-- EMP ���̺�� ���� �����ȣ, ����� ��ȸ
-- �����ȣ ���� �������� ����
SELECT EMPNO �����ȣ, ENAME ����� FROM EMP ORDER BY EMPNO DESC;

-- ���, �Ի���, �����, �޿� ��ȸ
-- �μ���ȣ�� ���� ������, ���� �μ���ȣ�� ���� �ֱ� �Ի��ϼ����� ó��
SELECT EMPNO ���,HIREDATE �Ի���, ENAME �����, SAL �޿�
FROM EMP ORDER BY DEPTNO , HIREDATE ;


/***** �Լ� *****/
-- �ý������� ���� ���� ��¥�� ���� ������ ����� �� ��
SELECT SYSDATE FROM DUAL; 

-- EMP ���̺�� ���� ���, �����, �޿� ��ȸ
-- ��, �޿��� 100���� ������ ���� ��� ó����.
-- �޿� ���� �������� ������.
SELECT EMPNO ���, ENAME �����, TRUNC(SAL,-2) �޿� FROM EMP ORDER BY SAL DESC;

-- EMP ���̺�� ���� �����ȣ�� Ȧ���� ������� ��ȸ							
SELECT * FROM EMP WHERE MOD(EMPNO,2)=1; 


/* ���� ó�� �Լ�*/  
-- EMP ���̺�� ���� �����, �Ի��� ��ȸ
-- ��, �Ի����� �⵵�� ���� �и� �����ؼ� ���
SELECT ENAME �����, SUBSTR(HIREDATE,1,2)||'�⵵ '||SUBSTR(HIREDATE,4,2)||'��' �Ի��� FROM EMP

-- EMP ���̺�� ���� 9���� �Ի��� ������ ���� ��ȸ
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'MM')=9; 

-- EMP ���̺�� ���� '81'�⵵�� �Ի��� ���� ��ȸ
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'YY')=81;

-- EMP ���̺�� ���� �̸��� 'E'�� ������ ���� ��ȸ
SELECT * FROM EMP WHERE ENAME LIKE '%E'; 

-- emp ���̺�� ���� �̸��� ����° ���ڰ� 'R'�� ������ ���� ��ȸ
-- LIKE �����ڸ� ���
SELECT * FROM EMP WHERE ENAME LIKE '__R%';
-- SUBSTR() �Լ� ���
SELECT * FROM EMP WHERE SUBSTR(ENAME,3,1)='R' ;


/************ ��¥ ó�� �Լ� **************/
-- �Ի��Ϸ� ���� 40�� �Ǵ� ��¥ ��ȸ
SELECT ADD_MONTHS(HIREDATE ,480) FROM EMP 

-- �Ի��Ϸ� ���� 33�� �̻� �ٹ��� ������ ���� ��ȸ
SELECT * FROM EMP WHERE TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(ADD_MONTHS(HIREDATE ,396),'YYYY') >0

-- ���� ��¥���� �⵵�� ����
SELECT TO_CHAR(SYSDATE,'YYYY') FROM DUAL; 


