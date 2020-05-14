SELECT * FROM EMPLOYEE;

--EMPLOYEE ���̺� ����

--CRUD : ������ ó�� ����
--CREATE : ������ �߰� / INSERT 
--READ 	 : ������ ��ȸ / SELECT
--UPDATE : ������ ���� / UPDATE
--DELETE : ������ ���� / DELETE


--�⺻ ���� ����
--EMPLOYEE ���̺��� ��� �����
--�����, �̸���, ����ó, �Ի��� ��ȸ�ϱ�
--EMP_NAME, EMAIL, PHONE, HIRE_DATE
SELECT EMP_NAME , EMAIL , PHONE , HIRE_DATE FROM EMPLOYEE; 

--�⺻ ���� ���� 2
--�μ��ڵ尡 D6�� �μ��� ��� ���� ���� ��ȸ�ϱ�
SELECT * FROM EMPLOYEE WHERE DEPT_CODE ='D6';

--������ 2�� �̻� �پ��� ���( AND, OR )
--�μ��ڵ尡 D6�̸鼭, �̸��� '�����'�� ����� ��� ���� ��ȸ�ϱ�
SELECT * FROM EMPLOYEE WHERE DEPT_CODE ='D6' AND EMP_NAME ='�����';
SELECT * FROM EMPLOYEE WHERE DEPT_CODE ='D6' OR EMP_NAME ='�����';


--�÷� �� ��Ī �ޱ�
--1. AS(alias) ǥ��
SELECT EMP_ID AS "�����ȣ", EMP_NAME AS "�����" FROM EMPLOYEE; 

--2. AS ����
--��Ī�� ()�� ���� ���� ���ڰ� �� ���
--�ݵ�� " "�� ���� ����� �Ѵ�.
SELECT EMP_ID "��� ��", EMP_NAME ����� FROM EMPLOYEE;


--�ǽ�����1
--EMPLOYEE ���̺��� ��� ��ȣ�� 205���� ����� �����, �̸���, �޿�, �Ի����ڸ� ��ȸ�Ͻÿ�
--(��, ��ȸ�ϴ� �÷��� ��Ī �ο�)
SELECT EMP_NAME �����, EMAIL �̸���, SALARY �޿�, HIRE_DATE �Ի����� FROM EMPLOYEE WHERE EMP_ID =205;

--�÷� ���� ����Ͽ� ���� ����
--�÷� ���� ���� NULL�̶�� � ������ ó���Ͽ��� ����� NULL
SELECT EMP_NAME "�����", (SALARY * 12) "����", BONUS "���ʽ�", (SALARY +(SALARY *BONUS ))*12 "��������" FROM EMPLOYEE;

--NVL() : ���� ���� ��ȸ�� ���� NULL�� ��� ������ ������ ������ ����
--NVL(�÷���, �⺻��)
SELECT EMP_NAME �����, (SALARY *12) ����, BONUS ���ʽ�, (SALARY +(SALARY * NVL(BONUS ,0)))*12 �������� FROM EMPLOYEE;


--�÷��� �Ϲݰ� ���
SELECT EMP_NAME ,SALARY *12 , '��' ���� FROM EMPLOYEE;


--DISTINCT : �ߺ� ����
--�ش��ϴ� ���� �÷��� ������ ���� �� ���
--�ߺ��� �����ϰ� �� ���� ��ȸ(NULL �� ����)
SELECT DEPT_CODE  FROM EMPLOYEE;
SELECT DISTINCT DEPT_CODE  FROM EMPLOYEE;


--�ǽ�����2
--DEPARTMENT ���̺��� �����Ͽ�, �μ��� '�ؿܿ���2��'�� �μ��� �μ��ڵ带 ã�� 
--EMPLOYEE ���̺��� �ش� �μ��� ����� �� �޿��� 200�������� ���� �޴� ������
--���, �����, �޿��� ��ȸ
--1) '�ؿܿ���2��' �μ��� �ڵ�ã��
SELECT * FROM DEPARTMENT WHERE DEPT_TITLE ='�ؿܿ���2��'; --D6
--2) ��ȸ�� �μ��ڵ带 ����Ͽ� ����� �� �޿��� 200���� ���� ���� �޴� ������ȸ
SELECT EMP_ID ���, EMP_NAME �����, SALARY �޿� FROM EMPLOYEE WHERE SALARY > 2000000 AND DEPT_CODE ='D6';


--������ --
--���� ������ '||'
--���� �÷��� ����� ���� �ϳ��� �÷����� ���� �� ���
--EX) '���'�� ���� ����� �̸��� '������'�Դϴ�.
SELECT EMP_ID || '�� ���� ����� �̸��� ' || EMP_NAME || ' �Դϴ�.' FROM EMPLOYEE;

--�� ������
-- <, >, <=, >= : ũ�⸦ ��Ÿ���� �ε�ȣ
-- = : ����
-- != , ^=, <> : �����ʴ�.


--EMPLOYEE���� �μ��ڵ尡 D9�� �ƴ� �������� ��� ���� ��ȸ
SELECT * FROM EMPLOYEE WHERE DEPT_CODE != 'D9';  --OR DEPT_CODE IS NULL --NULL���� ���� ����Ѵ�.


--EMPLOYEE���� �޿��� 350���� �̻� 550���� ������ 
--������ ���, �����, �μ��ڵ�, �����ڵ�, �޿��� ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ� , JOB_CODE �����ڵ�, SALARY  �޿� 
FROM EMPLOYEE 
WHERE SALARY >=3500000 AND SALARY <= 5500000
--ORDER BY SALARY  ASC; --��������
ORDER BY SALARY  DESC; --��������


--BETWEEN A AND B
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ� , JOB_CODE �����ڵ�, SALARY  �޿� 
FROM EMPLOYEE 
WHERE SALARY BETWEEN 3500000 AND 5500000
ORDER BY SALARY  ASC;


--���� �Ȱ��� ���� ������ ��ȸ�ϴµ�
--350���� �̸�, 550���� �ʰ��� ���� ������ ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, DEPT_CODE �μ��ڵ� , JOB_CODE �����ڵ�, SALARY  �޿� 
FROM EMPLOYEE
--WHERE SALARY < 3500000 OR SALARY > 5500000;
WHERE SALARY NOT BETWEEN 3500000 AND 5500000;


--LIKE : ~ó�� 
--�Է��� ����, ���ڰ� ���Ե� ������ ��ȸ
--EMPLOYEE���� ����� �̸� ��� '��'�� ���� ��� ���� ��ȸ
--'_' : ������ �� ���ڸ� �ǹ�.
--'%' : ���ڸ� ���ڵ� �������. 
SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE '_��_';


--EMPLOYEE ���̺��� �ֹε�Ϲ�ȣ ���� ������ ����� ������ ��ȸ
SELECT * FROM EMPLOYEE WHERE EMP_NO LIKE '______-1%';
--SELECT * FROM EMPLOYEE WHERE EMP_NO LIKE '%-1%';


--��� �� �̸��� ���̵� 5���ڸ� �ʰ��ϴ� ����� �����, ���, �̸��� ������ ��ȸ
SELECT EMP_NAME �����, EMP_ID ���, EMAIL �̸��� FROM EMPLOYEE 
--WHERE EMAIL NOT LIKE '_____@%'; -- 5���ڰ� �ƴ� ��� ����� �ǹ�.
WHERE EMAIL LIKE '______%@%'; --5�ʰ��� ���ڵ��� �����´�.


--EMPLOYEE ���̺��� '��'�� ���� ���� ���� ��� ��ȸ�ϱ�
SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE '��%';


--��� �� �̸��� 4��° �ڸ��� '_'�� ����� ���� ��ȸ
SELECT * FROM EMPLOYEE WHERE EMAIL LIKE '___#_%@%' ESCAPE '#';


--IN ������
--IN(��1,��2,��3,...)
--�ȿ� �ִ� ���� �� �ϳ��� ��ġ�ϴ� ��� �ش��ϴ� ���� ��ȸ

--�μ��ڵ尡 D1, D6�� �μ��� ���� ������ ��ȸ
--WHERE DEPT_CODE = 'D1' OR DEPT_CODE ='D6'
SELECT * FROM EMPLOYEE WHERE DEPT_CODE IN('D1','D6');

--�μ��ڵ尡 D1�� D6�� �ƴ� �μ��� ������ ��ȸ
SELECT * FROM EMPLOYEE WHERE DEPT_CODE NOT IN('D1','D6');

-- �������� �켱 ����
-- 0.()
-- 1. ��� ������(+,-,*,/)
-- 2. ���� ������
-- 3. �� ������
-- 4. IS NULL / IS NOT NULL / LIKE, IN / NOT IN
-- 5. BETWEEN A AND B
-- 6. NOT
-- 7. AND
-- 8. OR


--���� �ǽ� ����1
--������ 'J2'�̸鼭 200���� �̻� �޴� ���� �̰ų�,
--������ 'J7'�� ����� ���, �����, �����ڵ�, �޿� ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, JOB_CODE �����ڵ�, SALARY �޿� FROM EMPLOYEE 
WHERE (JOB_CODE ='J2'AND SALARY >=2000000) OR JOB_CODE ='J7';

--���� �ǽ� ����2
--������ 'J7' �̰ų� 'J2'�̸鼭 �޿��� 200���� �̻� �޴�
--������ ���, �����, �����ڵ�, �޿��� ��ȸ
SELECT EMP_ID ���, EMP_NAME �����, JOB_CODE �����ڵ�, SALARY �޿� FROM EMPLOYEE
--WHERE (JOB_CODE IN('J7','J2')) AND SALARY >=2000000;
WHERE (JOB_CODE ='J7' OR JOB_CODE ='J2') AND SALARY >=2000000;


-- �Լ�(FUNCTION) --

--���� ���� �Լ�
--LENGTH
--���ڿ��� ���̸� ����ϴ� �Լ�
SELECT LENGTH('Hello') FROM DUAL;    --DUAL �̶�� ������ ���̺�

-- DUAL : �ӽ����̺�(������ ���̺�)
--SELECT ������ ���ͷ��� Ȱ���� ������ �׽�Ʈ �ϰ��� �Ҷ� ����ϴ� �ӽ� ���̺�

SELECT LENGTH('��â��'), LENGTHB('��â��'), LENGTH('Hello'), LENGTHB('Hello') FROM DUAL;
-- ����Ŭ ���� 10 ���� ���� �ѱ��� 3����Ʈ�� ����.


--INSTR : �־��� ������ ���ϴ� ���ڰ� ���°���� ã�� ��ȯ�ϴ� ����
SELECT INSTR('ABCDE','A'), INSTR('ABCDE','C'), INSTR('ABCDE','Z')FROM DUAL; 


--SUBSTR(�÷���|��,���ۼ���[,������ ����])
--�־��� ���ڿ����� Ư���κи� �������� �Լ�
SELECT 'HELLO WORLD', SUBSTR('HELLO WORLD',7), SUBSTR('HELLO WORLD',1,5) FROM DUAL; 


--�ǽ�3
--EMPLOYEE ���̺��� ����� �̸�, �̸��� ��ȸ
--�̸����� ���̵�κи� ��ȸ�ϱ�
--��ȸ���
--ȫ�浿 Hong_gd

--1. �̸��� �̸��� ��ȸ
SELECT EMP_NAME , EMAIL FROM EMPLOYEE;
--2. @��ġ ã��
SELECT INSTR(EMAIL , '@') FROM EMPLOYEE;
--3. ���
SELECT EMP_NAME , SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1) FROM EMPLOYEE;


--LPAD / RPAD
--��ĭ�� ä���
SELECT LPAD(EMAIL, 20, '#') FROM EMPLOYEE ;
SELECT RPAD(EMAIL, 20, '-') FROM EMPLOYEE ;
--���÷� �ֹε�Ϲ�ȣ�� �����ö� ���ڸ��� *�� ä��°��̴�.


--LTRIM / RTRIM
--���� �ο��� �÷� ���̳�, Ư�� ������ ���� Ư�� ���ڸ� ã�� �����ִ� �Լ�
SELECT LTRIM('      HELLO'), LENGTH(LTRIM('      HELLO')) FROM DUAL;
SELECT RTRIM('HELLO       '), LENGTH(RTRIM('HELLO       ')) FROM DUAL;
SELECT RTRIM('       HI') FROM DUAL;
SELECT LTRIM('012345','0'), LTRIM('111234','1'), LTRIM('22234234','2'), LTRIM('012345','1') FROM DUAL; 


--TRIM
--�־��� ���ڿ����� �糡�� �������� Ư�� ���ڸ� �����ִ� �Լ�
--�⺻����
SELECT TRIM('    ���� ���          ') FROM DUAL;
--������ Ư������ ������� �Ҷ�
SELECT TRIM('0' FROM '00001230000') FROM DUAL;

SELECT TRIM(LEADING '0' FROM '00012300')FROM DUAL;
SELECT TRIM(TRAILING '0' FROM '00012300')FROM DUAL;
SELECT TRIM(BOTH '0' FROM '00012300')FROM DUAL;


--LOWER / UPPER / INITCAP
--�־��� ���ڿ��� �ҹ���, �빮��, �ձ��ڸ� �빮�� �������� �������ִ� �Լ�
SELECT LOWER('NICE TO MEET YOU'), UPPER('nice to meet you') , INITCAP('nice to meet you') FROM DUAL; 


--CONCAT : ���� ���ڿ��� �ϳ��� ���ڿ��� ��ġ�� �Լ�
SELECT CONCAT('����Ŭ ','�ʹ� ��վ��^^;;;') FROM DUAL;
SELECT '����Ŭ '||'�������:)' FROM DUAL;


-- REPLACE : �־��� ������ Ư�� ���ڸ� ������ �� ����ϴ� �Լ�
SELECT REPLACE('HELLO WORLD','HELLO','BYE') FROM DUAL;


-- �ǽ� 4
-- EMPLOYEE ���̺��� ����� �ֹι�ȣ�� Ȯ���Ͽ�
-- ���� ������ ���� ��ȸ�Ͻÿ�.
-- �̸� | ���� | ���� |  ���� 
-- ȫ�� | 00��| 00��| 00��
SELECT EMP_NAME �̸�, SUBSTR(EMP_NO ,1,2)||'��' ����,SUBSTR(EMP_NO ,3,2)||'��' ����,SUBSTR(EMP_NO ,5,2)||'��' ���� FROM EMPLOYEE;
SELECT EMP_NAME "�̸�", CONCAT(SUBSTR(EMP_NO ,1,2),'��') "��",CONCAT(SUBSTR(EMP_NO ,3,2),'��') "��",CONCAT(SUBSTR(EMP_NO ,5,2),'��') "��" FROM EMPLOYEE;


--SUBSTR�� Ȱ���ϸ� ��¥ �����͵� ������ �ִ�.
-- ��¥�� 1990���� �ƴ϶� 90������ �������� ���̴�.
-- ��¥ ���´� '19/03/15'�� ���´� --> 19 / 03 / 15
SELECT EMP_NAME �̸�, CONCAT(SUBSTR(HIRE_DATE,1,2),'��') "�Ի�⵵" , HIRE_DATE FROM EMPLOYEE


--���� �� �Լ�(Single Row Function)
--����� ã�Ƽ� ����� ������ ���࿡ �Լ��� ����

--���� �� �Լ�(Multiple ROW Function)
--�������� �����ϴ� ��� ���� �� ã�� ���� �ѹ��� ����

--�׷� �Լ�(Group Function)
--SUM(), AVG(), MAX(), MIN(), COUNT()
--SUM() : �ش� �÷����� �հ踦 ���
SELECT SUM(SALARY) FROM EMPLOYEE;
--AVG() : �ش� �÷����� ����� ���
SELECT AVG(SALARY) FROM EMPLOYEE;
--MAX(), MIN() : �ش� �÷����� �� �� �ִ밪/�ּҰ�
SELECT MAX(SALARY), MIN(SALARY) FROM EMPLOYEE;


-- �ǽ�5
--EMPLOYEE ���̺��� '�ؿܿ���1��'�� �ٹ��ϴ� ��� ����� ��� �޿�, ���� ���� �޿�, ���� ���� �޿�, �޿��հ� ��ȸ
SELECT EMP_NAME, AVG(SALARY) "��ձ޿�", MAX(SALARY) "��������޿�", MIN(SALARY) "���峷���޿�", SUM(SALARY)  "�޿��հ�" FROM EMPLOYEE WHERE DEPT_CODE ='D5';
--���� �ڵ忡�� EMP_NAME�� ���� ������ ���µ� �ٸ� �׷��Լ����� ���� �ϳ� ���� ������ ������ ���� ���̴�.
SELECT AVG(SALARY) "��ձ޿�", MAX(SALARY) "��������޿�", MIN(SALARY) "���峷���޿�", SUM(SALARY)  "�޿��հ�" FROM EMPLOYEE WHERE DEPT_CODE ='D5';


--COUNT() : �ش� �ϴ� ���� ����
--NULL���� ������ ��� �̸� ������� �ʴ´�.
SELECT COUNT(*) FROM EMPLOYEE;
SELECT COUNT(*), COUNT(DEPT_CODE), COUNT(DISTINCT DEPT_CODE) FROM EMPLOYEE;
SELECT DEPT_CODE FROM EMPLOYEE; --NULL���� ����� Ȯ��
SELECT DISTINCT DEPT_CODE FROM EMPLOYEE; --�ߺ��ϴ� ���� � �ִ��� Ȯ��


--�ǽ� 6
--EMPLOYEE ���̺���
--��� ����� ���, �����, �̸���, �ֹι�ȣ�� ��ȸ�Ͽ� ��� ���ǥ�� ������� �Ѵ�.
--�̶�, �̸����� '@' ������, �ֹι�ȣ�� 7��° �ڸ� ���� '*' ó���� �Ͽ� ��ȸ�Ͻÿ�.
SELECT EMP_ID ���, EMP_NAME �����, SUBSTR(EMAIL,1,INSTR(EMAIL,'@')-1) �̸���, RPAD(SUBSTR(EMP_NO,1,8),13,'*') �ֹι�ȣ FROM EMPLOYEE;


--�ǽ� 7
--EMPLOYEE ���̺��� ���� �ٹ��ϴ� ���� ����� ���, �����, �����ڵ带 ��ȸ�Ͻÿ�.
--**ENT_YN : ���� �ٹ� ���� �ľ��ϴ� �÷�(��� ����)
SELECT EMP_ID ���, EMP_NAME �����, JOB_CODE �����ڵ� FROM EMPLOYEE WHERE ENT_YN ='N' AND SUBSTR(EMP_NO,8,1)='2' ;
SELECT EMP_NAME , EMP_NO FROM EMPLOYEE WHERE SUBSTR(EMP_NO,8,1)='2';




SELECT COUNT(DEPT_CODE IS NULL) FROM EMPLOYEE;




