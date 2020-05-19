-- SET OPERATOR --

--������
--UNION : �ߺ��Ǵ� �κ��� �����Ͽ� ��ģ��.
--UNION ALL : UNION �� �����ϳ� �ߺ��Ǵ� ����� �״�� �����ش�.

--������
--INTERSECT : ��ġ�� ����� ��ȸ

--������
--MINUS : �� �� �̻��� ���̺� ���� �� ���� �տ� ����� ����� �������� 
--		    �ߺ��� ������ �����̺��� ������� ��ȸ

-- JOIN --
--JOIN : �� �� �̻��� ���̺��� ����� �ϳ��� ���̺� ���·� ���ļ� ����ϴ� ���
--INNER JOIN : ��ġ���� ���̺��� �����͸� ������ ��� ��ġ�ϴ� ������ �������� ��ȸ
--OUTER JOIN : 
--	LEFT : ���� ���̺��� ������ ��� ����
--	RIGHT : ���� ���̺��� ������ ��� ����
--	FULL : ���� ���̺��� ��� ������ ����

--SUB QUERY : ���� �����ȿ� �� �ϳ��� ������ �߰�

--�ζ��κ�
--FROM ��ġ�� ���Ǵ� ��������
--���������� RESULT SET�� Ȱ���Ͽ� �����͸� ��ȸ�� �� ����� �� �ִ�.
--�̶� ������ ���̺��� ��ü�Ѵٴ� �ǹ̿���
--FROM ������ ���������� INLINE VIEW ��� �θ���.

SELECT *
FROM (
	SELECT EMP_ID, EMP_NAME ,DEPT_TITLE ,JOB_CODE 
	FROM EMPLOYEE 
	JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
	JOIN JOB USING(JOB_CODE)
);

-- TOP-N �м� ��ȸ
-- ���ִ� ���� ���� 5��
--���� ���� �ȸ� ���̽�ũ�� 6��
--���� ���ǿ� �����ϴ� ������ ����ȭ �Ͽ� Ư�� �������� ��ȸ�ϴ� ���

--ROWNUM : �����͸� ��ȸ�Ҷ� �� ���� ��ȣ�� �Ű��ִ� �Լ�
SELECT ROWNUM,EMP_NAME, SALARY
FROM EMPLOYEE
WHERE ROWNUM < 6;

--����
--�޿��������� ���� ���� �޿��� �޴� ���
--���� 5�� ��ȸ�Ͽ� ���, �����, �޿��� ���
SELECT ROWNUM, ���, �����, �޿�
FROM(
	SELECT EMP_ID ���, EMP_NAME �����, SALARY �޿�
	FROM EMPLOYEE 
	ORDER BY SALARY DESC 
)
WHERE ROWNUM <=5
;

--����� �ڵ�
SELECT ROWNUM, A.*
FROM (SELECT ROWNUM, EMP_ID , EMP_NAME , SALARY 
FROM EMPLOYEE
ORDER BY SALARY DESC) A	
WHERE ROWNUM < 6;


--RANK() : ������ �ű�� �Լ� <--> DENSE_RANK() : ������ �ű�� �Լ�
--1								1
--2								2
--2								2
--4								3

SELECT *
FROM(
	SELECT EMP_NAME , SALARY ,
 		RANK() OVER(ORDER BY SALARY DESC) ����
	FROM EMPLOYEE
	)
WHERE ���� < 4;

SELECT EMP_NAME, SALARY,
	DENSE_RANK() OVER(ORDER BY SALARY DESC)	����
FROM EMPLOYEE;


--�ǽ�5.
--EMPLOYEE ���̺���
--���ʽ��� ������ ������ ���� ���� ��� ���� 5����
--RNAK() �Լ��� Ȱ���Ͽ� ��ȸ
--���, �����, �μ���, ���޸�, �Ի���, ����(���ʽ� ����)
SELECT  *
FROM (
	SELECT E.EMP_ID ���, E.EMP_NAME �����, D.DEPT_TITLE �μ���, J.JOB_NAME ���޸�, E.HIRE_DATE �Ի���,
		TRUNC((E.SALARY + NVL((E.SALARY *E.BONUS),0))*12,-2)"����",
		RANK() OVER(ORDER BY TRUNC((E.SALARY + NVL((E.SALARY *E.BONUS),0))*12,-2) DESC) "��������"	
	FROM EMPLOYEE E
	JOIN DEPARTMENT D ON(DEPT_ID = DEPT_CODE)
	JOIN JOB J USING(JOB_CODE)) 
WHERE �������� < 6;

--����� �ڵ�
--�������� ���� ���
SELECT *
FROM (SELECT EMP_ID , EMP_NAME , DEPT_TITLE, JOB_NAME, HIRE_DATE , (SALARY +(SALARY)*(NVL(BONUS,0)))*12 ����,
	RANK() OVER(ORDER BY (SALARY +(SALARY)*(NVL(BONUS,0)))*12 DESC) "����"
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID)
JOIN JOB USING(JOB_CODE))
WHERE ���� <6 ;

--WITH AS ����
--������ ���������� �ߺ��ؼ� ����Ҷ� �̸� ��Īȭ �Ͽ� ����ϵ��� �ϴ� ����
--������� : WITH ��Ī AS (��������)
--**�ζ��� �信���� ����
WITH TOP_N_SAL AS (
	SELECT EMP_NAME, SALARY
	FROM EMPLOYEE
	ORDER BY SALARY DESC
) 
SELECT *
FROM TOP_N_SAL;



-- �μ� �� �޿� �հ谡 ��ü �μ� �޿� ������ 
-- 20%���� ���� �μ��� �μ���� , �μ��޿� �հ踦 ��ȸ
--1) �Ϲ� ������ ��������
-- ��ü �μ��� �޿� �հ� 20% ��ȸ �� ��
SELECT DEPT_CODE , SUM(SALARY)
FROM EMPLOYEE
GROUP BY DEPT_CODE 
HAVING SUM(SALARY) > (SELECT SUM(SALARY)*0.2 FROM EMPLOYEE);
--2) �ζ��� �� Ȱ���Ͽ� �ذ�
SELECT DEPT_CODE , SUMSAL
FROM ( 
		SELECT DEPT_CODE , SUM(SALARY) SUMSAL
		FROM EMPLOYEE
		GROUP BY DEPT_CODE
	)
WHERE  SUMSAL > (SELECT SUM(SALARY)*0.2 FROM EMPLOYEE );

--3) WITH AS�� �̿�
WITH SUM_SAL_VIEW AS(
		SELECT DEPT_CODE , SUM(SALARY) SUMSAL
		FROM EMPLOYEE
		GROUP BY DEPT_CODE)
SELECT *
FROM SUM_SAL_VIEW
WHERE SUMSAL > (SELECT SUM(SALARY)*0.2 FROM EMPLOYEE );


--WITH AS ������ ����Ͽ� ���
WITH SUM_SAL AS(SELECT SUM(SALARY) FROM EMPLOYEE),
	 AVG_SAL AS(SELECT AVG(SALARY) FROM EMPLOYEE)
SELECT * FROM SUM_SAL
UNION ALL
SELECT * FROM AVG_SAL
UNION ALL 
SELECT * FROM SUM_SAL;

--��ȣ ���� ���� : ��� ����
--�Ϲ������� ���������� ��������, ���������� ���������� ����� �޾Ƽ� �����ϴ� ��İ� �ٸ���
--���� ������ ����ϴ� �÷���, ���� ���� ���������� �����Ͽ� 
--�������� ���� �� ���� ������ ���� �Բ� ��� �ϴ� ���

-- ����� ���޿� ���� �޿� ��� ���� ���� �޴� ����� ������ ��ȸ
SELECT JOB_CODE , TRUNC(AVG(SALARY),-3) 
FROM EMPLOYEE
GROUP BY JOB_CODE ;

SELECT EMP_ID, EMP_NAME, JOB_CODE, SALARY
FROM EMPLOYEE E
WHERE SALARY > (
				SELECT TRUNC(AVG(SALARY),-3) 
				FROM EMPLOYEE E2
				WHERE E.JOB_CODE = E2.JOB_CODE
				);

--��Į�� ��������
--���� �� �������� + ��ȣ���� ��������
--SELECT , WHERE, ORDER BY ���� ���
--������ SELECT�� ���� ����ϱ� ������ SELECT LIST��� �Ѵ�.
SELECT EMP_ID, EMP_NAME, MANAGER_ID, NVL((SELECT EMP_NAME FROM EMPLOYEE M WHERE E.MANAGER_ID = M.EMP_ID),'����') "�������̸�"
FROM EMPLOYEE E
ORDER BY �������̸�, EMP_ID;


--�����ͻ���
--������ ���̽��ȿ��� ����� �������� ������ �����ϴ� ���̺�






