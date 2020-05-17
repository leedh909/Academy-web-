--��¥ ó�� �Լ� 
--SYSDATE : ���� ��ǻ���� ��¥�� ��ȯ�ϴ� �Լ�
SELECT SYSDATE FROM DUAL;

--MONTHS_BETWEEN(��¥1, ��¥2) : �� ��¥ ������ ���� ��
SELECT HIRE_DATE �Ի���, MONTHS_BETWEEN(SYSDATE, HIRE_DATE) "�Ի� �� ���� ��"
FROM EMPLOYEE;

--ADD_MONTHS(��¥, ���� ��)
SELECT ADD_MONTHS(SYSDATE,6) FROM DUAL; 

--EXTRACT(YEAR | MONTH | DAY FROM ��¥ ������)
--������ ���� ���� ��¥ ���� ���� �ϴ� �Լ�
SELECT EXTRACT(YEAR FROM HIRE_DATE) ��,
EXTRACT (MONTH FROM HIRE_DATE) ��,
EXTRACT (DAY FROM HIRE_DATE) ��
FROM EMPLOYEE;

--����ȯ �Լ�
--DATE <--> CHAR <--> NUMBER
--TO_DATE(), TO_CHAR(), TO_NUMBER()
--��¥�� ��ȯ, ���ڷ� ��ȯ, ���ڷ� ��ȯ

--TO_CHAR()--
--��¥ ���� ����
SELECT HIRE_DATE, TO_CHAR(HIRE_DATE,'YYYY-MM-DD'), TO_CHAR(HIRE_DATE ,'YY-MON-DD') FROM EMPLOYEE;

--TO_NUMBER()--
--���� ���� ����
-- 9: ���� ��ĭ�� ǥ������ �ʴ´�.
-- 0: ���� �� ĭ�� 0���� ǥ��
-- L: ��ȭ��ȣ(��,��,����,�޷�)
SELECT SALARY , 
TO_CHAR(SALARY,'L999,999,999') "����1", 
TO_CHAR(SALARY,'000,000,000') "����2",
TO_CHAR(SALARY, 'L999,999') "����3"
FROM EMPLOYEE;

--TO_DATE()--
SELECT 20200515, TO_DATE(20200515,'YYYYMMDD'),
TO_DATE(20200515,'YYYY/MM/DD') 
FROM DUAL;

--DECODE()--
--JAVA���� 3�׿�����
--����? �� : ����

--���� �ٹ��ϴ� �������� ������ ��, ���� ���� ����
SELECT EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO,8,1),'1','��','��') ����
FROM EMPLOYEE
ORDER BY ����;

--�ǽ�1
--EMPLOYEE ���̺��� 
--��� ������ ���, �����, �μ��ڵ�, �����ڵ�, �ٹ�����, �����ڿ���
--��ȸ�ϵ� ���� �ٹ����ΰ� 'Y'�����, 'N'�ٹ���, 
--	�����ڻ��(MANAGER_ID) ������ '���', ������ '������' �� �ۼ��Ͽ� ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ�, JOB_CODE �����ڵ�,
DECODE(ENT_YN,'Y','�����','N','�ٹ���')  �ٹ�����,DECODE(MANAGER_ID,NULL,'������','���')  �����ڿ���
FROM EMPLOYEE;
--DECODE(NVL(MANAGER_ID,0),0,'������','���') �� ó���ϴ� ����� �ִ�.

--CASE ��  
--JAVA�� IF, SWITCH ó�� ����� �� �ִ� �Լ� ǥ����
--CASE
--WHEN (���ǽ�1) THEN �����1
--WHEN (���ǽ�2) THEN �����2
--ELSE �����3
--END
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ�, JOB_CODE �����ڵ�,
CASE 
	WHEN ENT_YN = 'Y' THEN '�����'
	ELSE '�ٹ���'
END "�ٹ�����",
CASE
	WHEN MANAGER_ID IS NULL THEN '������'
	ELSE '���'
END "�����ڿ���"
FROM EMPLOYEE;


--NVL2( �÷���|������, NULL�� �ƴҰ�� ��, NULL�� ��� �� )
SELECT EMP_ID ���, EMP_NAME �����, BONUS ���ʽ�,
NVL(TO_CHAR(BONUS),'X') "NVL�Լ�",
NVL2(BONUS ,TO_CHAR(BONUS,'0.99'),'X' ) "NVL2�Լ�"
FROM EMPLOYEE


--���� ������ �Լ�--
--ABS() : ���밪 ǥ��
SELECT ABS(10), ABS(-10) FROM DUAL;

--MOD() : �־��� �÷��̳� ���� ���� �������� ��ȯ�ϴ� �Լ�
SELECT MOD(10,3), MOD(10,2), MOD(10,7) FROM DUAL;

--ROUND() : ������ ���ڸ� �ݿø� �ϴ� �Լ�
SELECT ROUND(123.456,0), 
ROUND(123.456,1), ROUND(123.456,2), ROUND(123.456,-2)
FROM DUAL;

--CEIL() : �Ҽ��� ù° �ڸ����� �ø�
--FLOOR() : �Ҽ��� ���� �ڸ��� ����
--TRUNC() : ������ ��ġ���� ���ڸ� ����
SELECT CEIL(123.456), FLOOR(123.456), 
TRUNC(123.456,0),TRUNC(123.456,1),TRUNC(123.456,-2)
FROM DUAL;


--�ǽ�2
--EMPLOYEE ���̺��� �Ի��� ���� ���ڰ� Ȧ�� ����
--������ ���, �����, �Ի��� ������ ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, HIRE_DATE �Ի���
FROM EMPLOYEE
WHERE MOD(TO_NUMBER(SUBSTR(HIRE_DATE,4,2)),2) = 1
ORDER BY �Ի���;


--��¥ ������
--SYSDATE, MONTHS_BETWEEN, ADD_MONTHS,
--EXTRACT, LAST_DAY, NEXT_DAY

--SYSDATE, SYSTIMESTAMP
SELECT SYSDATE, SYSTIMESTAMP FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH:MI:SS') ,
TO_CHAR(SYSTIMESTAMP, 'YYYY-MM-DD HH:MI:SSFF' ) 
FROM DUAL;

--NEXT_DAY(��¥, ���ϸ�)
--������ �ٰ��� ���� ����� ������ ��ȯ�ϴ� �Լ�
SELECT NEXT_DAY(SYSDATE,'�����'), 
NEXT_DAY(SYSDATE,'��'),
NEXT_DAY(SYSDATE,7) --1:�Ͽ��� ~ 7:�����
--NEXT_DAY(SYSDATE,'SATURDAY') 
FROM DUAL;

--�����ͻ���(������ ��ųʸ�)
--���� ������ ������ ������ DB�� ���̺� ���·� �����ϴ� ���̺�
--�⺻������ �ý����� �����ڸ� ���� ����
--��, ����� ������ ������ ������ ���� ����, ���� �� ������ �ϸ� �ʱ�ȭ
SELECT  * FROM V$NLS_PARAMETERS;
ALTER SESSION SET NLS_LANGUAGE = AMERICAN;
--������ ���� ��ȸ
SELECT  NEXT_DAY(SYSDATE, 'SATURDAY') FROM DUAL; 
ALTER SESSION SET NLS_LANGUAGE = KOREAN;

--LAST_DAY() : �־��� ��¥�� ������ ���ڸ� ��ȸ
SELECT LAST_DAY(SYSDATE) FROM DUAL; 

--��¥ �������� ���� �ֱ� ��¥�� ���� ���� �� ū ������ �Ǵ�
-- +,- ���� ����
SELECT (SYSDATE-10) "��¥1",
TRUNC(SYSDATE - TO_DATE('20/03/01','RR/MM/DD')) "��¥2",
TRUNC(TO_DATE('20/03/01','RR/MM/DD')-SYSDATE ) "��¥3"
FROM DUAL;

--�ǽ�3
--EMPLOYEE ���̺���
--�ٹ� ����� 20�� �̻��� ������� 
--��� ����� �μ��ڵ� �Ի����� ��ȸ�Ͻÿ�
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ�, HIRE_DATE �Ի���
FROM EMPLOYEE
WHERE (SYSDATE - TO_DATE(HIRE_DATE,'RR/MM/DD') ) >= 20*365 ; 
--ADD_MONTHS(HIRE_DATE,240) <= SYSDATE
--MONTHS(SYSDATE,HIRE_DATE)>=240


--����ȯ
/*
	YYYY �⵵ ǥ��(4�ڸ�)    YY �⵵ ǥ��(2�ڸ�)
	MM ���� ���ڷ�
	DAY ���� ǥ��
 */

SELECT TO_CHAR(SYSDATE, 'PM HH24:MI:SS') "1",
TO_CHAR(SYSDATE, 'MON DY, YYYY') "2",
TO_CHAR(SYSDATE, 'YYYY-MM-DD DAY') "3",
TO_CHAR(SYSDATE,'YEAR, Q') 
FROM DUAL;


--Y/R
SELECT TO_CHAR(TO_DATE('200315','YYMMDD'),'YYYY') "���1",
TO_CHAR(TO_DATE('200315','RRMMDD'),'RRRR') "���2",
TO_CHAR(TO_DATE('800315','YYMMDD'),'YYYY' ) "���3",
TO_CHAR(TO_DATE('800315','RRMMDD'),'RRRR' ) "���4"
FROM DUAL;

--�տ� �Է� 4�ڸ� �ѹ��� �Է� ���� ��� ����X
--�տ� �Է� 2�ڸ� �Է� ���� ���
--YY�� �� ���� ���� -- 80 --> 2080
--RR�� �� ���� ���� -- 51~99 --> 1900��� , 00~50 -->2000���


SELECT '123'+'456' FROM DUAL;
SELECT '123'+'456ABC' FROM DUAL;


--SELECT ���� �������
/*
 5.	SELECT �÷��� AS ��Ī, ���, �Լ���
 1.	FROM ���̺��
 2.	WHERE ����
 3.	GROUP BY �׷��� ���� �÷���
 4.	HAVING �׷쿡 ���� ���ǽ�, �Լ���
 6.	ORDER BY �÷�|��Ī|���� 
 */

--ORDER BY--
SELECT EMP_ID , EMP_NAME �̸�, SALARY , DEPT_CODE 
FROM EMPLOYEE
--ORDER BY EMP_ID ; -- ���� �⺻ ���� �������� ASC
--ORDER BY EMP_NAME DESC ; -- �������� DESC
ORDER BY DEPT_CODE ,EMP_ID ;


--GROUP BY ������ ����--
--�μ��� ���
SELECT TRUNC(AVG(SALARY),-3) FROM EMPLOYEE;

--D1 ��� �޿�
SELECT TRUNC(AVG(SALARY),-3) FROM EMPLOYEE WHERE DEPT_CODE ='D1';

--GROUP BY--
--Ư�� �÷�, ������ �ϳ��� �׷����� ����
--�����̺� ������ �ұ׷� ���� ��ȸ�ϰ��� �Ҷ� �����ϴ� ����
SELECT DEPT_CODE ,TRUNC(AVG(SALARY),-3)
FROM EMPLOYEE
GROUP BY DEPT_CODE 
ORDER BY 1;


--�ǽ�4
--EMPLOYEE ���̺���
--�μ� �� �� �ο�, �޿� �հ�, �޿� ���, �ִ� �޿�, �ּ� �޿��� 
--��ȸ�Ͽ� �μ��ڵ� �������� �������� �����Ͻÿ�.
--��, �޿� ��� �����ʹ� 100�� �ڸ������� ó��
SELECT DEPT_CODE "�μ�",COUNT(*) "�μ� �� �� �ο�", SUM(SALARY) "�޿� �հ�", 
TRUNC(AVG(SALARY),-2) "�޿� ���", MAX(SALARY) "�ִ� �޿�", MIN(SALARY) "�ּ� �޿�" 
FROM EMPLOYEE
GROUP BY DEPT_CODE
ORDER BY DEPT_CODE ASC;


--���� �ڵ� �� ���ʽ��� �޴� ����� ���� ��ȸ
SELECT JOB_CODE �����ڵ�,COUNT(BONUS)
FROM EMPLOYEE
GROUP BY JOB_CODE
ORDER BY 1 DESC; 


--�ǽ�5
--EMPLOYEE ���̺���
--���������� ���������� ���� ��ȸ�Ͻÿ�
--GROUP BY ���� �־��� �÷� ���� �ƴ� �Լ��ĵ� ��� ����
SELECT DECODE(SUBSTR(EMP_NO ,8,1),1,'����',2,'����') ����, COUNT(*)||'��' ������
FROM EMPLOYEE
GROUP BY SUBSTR(EMP_NO ,8,1);
--GROUP BY DECODE(SUBSTR(EMP_NO ,8,1),1,'����',2,'����');


--HAVING ����
--GROUP BY �� �� �ұ׷쿡 ���� ������ ���� �Ҷ�
--�׷��Լ��� �Բ� ����ϴ� ����
SELECT DEPT_CODE , TRUNC(AVG(SALARY),-2) ��� 
FROM EMPLOYEE
WHERE SALARY > 3000000    --�׷����� ���� �� ������ ����
GROUP BY DEPT_CODE ;

SELECT DEPT_CODE , TRUNC(AVG(SALARY),-2) ���
FROM EMPLOYEE
GROUP BY DEPT_CODE 
HAVING AVG(SALARY) >3000000    --�׷����� ���� �� ������ ����
ORDER BY 1;


--�ǽ�6
--�μ��� �׷��� �޿� �հ� �� 900������ �ʰ��ϴ� 
--�μ��� �ڵ�� �޿� �հ踦 ��ȸ
SELECT DEPT_CODE "�μ��ڵ�", SUM(SALARY) "�޿� �հ�"
FROM EMPLOYEE
GROUP BY DEPT_CODE 
HAVING SUM(SALARY) > 9000000
ORDER BY 1;


--�ǽ�7
--�޿� �հ谡 ���� ���� �μ��� ã��,
--�ش� �μ��� �μ� �ڵ�� �޿� �հ踦 ��ȸ�Ͻÿ�.
--1)�޿� �հ谡 ���� ���� �μ��� �޿���
SELECT MAX(SUM(SALARY)) FROM EMPLOYEE GROUP BY DEPT_CODE; --17700000
--2)�޿� �հ谡 ���� ���� �޿� �հ�� ���� �μ�
SELECT DEPT_CODE , SUM(SALARY) FROM EMPLOYEE 
GROUP BY DEPT_CODE HAVING SUM(SALARY) = 17700000;

--SUB QUERY -- ������
SELECT DEPT_CODE , SUM(SALARY) FROM EMPLOYEE 
GROUP BY DEPT_CODE 
HAVING SUM(SALARY) = 
(SELECT MAX(SUM(SALARY)) FROM EMPLOYEE GROUP BY DEPT_CODE);


--��������1
SELECT EMP_NAME ������, RPAD(SUBSTR(EMP_NO,1,8),14,'*')   
FROM EMPLOYEE;

--��������2
SELECT EMP_NAME ������, JOB_CODE �����ڵ�, TO_CHAR((SALARY +(NVL(SALARY * BONUS,0) ))*12,'L999,999,999')  "����(��)"
FROM EMPLOYEE;

--��������3
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ�, HIRE_DATE 
FROM EMPLOYEE
WHERE DEPT_CODE IN('D5','D9') AND TO_CHAR(HIRE_DATE,'YYYY')='2004';  

--��������4
SELECT EMP_NAME ������, HIRE_DATE �Ի���, TRUNC(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12*365,0)||'��' "�ٹ��ϼ�" 
FROM EMPLOYEE;

--��������5
SELECT EMP_NAME ������, DEPT_CODE �μ��ڵ�,
SUBSTR(EMP_NO,1,2)||'��'||SUBSTR(EMP_NO,3,2)||'��'||SUBSTR(EMP_NO,5,2)||'��' "�������",
(TO_CHAR(SYSDATE,'YYYY')-TO_CHAR(TO_DATE(SUBSTR(EMP_NO,1,2),'RR'),'RRRR')) "����"
FROM EMPLOYEE;


--��������6
SELECT TO_CHAR(HI)
FROM EMPLOYEE;



COUNT(*) ��ü������ 










