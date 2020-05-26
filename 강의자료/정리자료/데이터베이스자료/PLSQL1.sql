--PL/SQL--
--(PROCEDURAL LANGUAGE EXTENSION TO SQL)

--���: ��������, �� ó��, �ݺ� ó��

--PL/SQL�� ����
--�����, �����, ����ó����
--�����: DECLARE, ���� ���� �ϴ� �κ�
--�����: BEGIN, ���/�ݺ��� ���� �ۼ��ϴ� �κ�
--����ó����: EXCEPTION, ���� �߻��� ó���ϴ� ���� �ۼ��ϴ� �κ�

--����θ� ����ؼ� ������ ���� ���
BEGIN
	DBMS_OUTPUT.PUT_LINE('HELLO WORLD');
	--DBMS_OUTPUT��Ű���� PUT_LINE �̶�� ���ν����� �̿��Ͽ� ȣ��
END;
/

--ȭ�鿡 ���̵��� ����
SET SERVEROUTPUT ON;


--���� ����� �ʱ�ȭ, ���
--[1] �Ϲ� ����
DECLARE
	vid NUMBER;
BEGIN
	SELECT EMP_ID
	INTO vid       --������ ��ȸ�� ���� ����
	FROM EMPLOYEE
	WHERE EMP_NAME='������';

	DBMS_OUTPUT.PUT_LINE('ID='||vid);
EXCEPTION
	WHEN NO_DATA_FOUND THEN DBMS_OUTPUT.PUT_LINE('NO DATA!!!!!');
END;
/

DECLARE
	v_empno NUMBER(4);
	v_empname VARCHAR2(10);
	test_num NUMBER(5) := 10*20;  --������ �� �� �ִ�.
BEGIN
	v_empno := 1001;
	v_empname := '�̴���';
	DBMS_OUTPUT.PUT_LINE(v_empno||'   '||v_empname||'     '||test_num);
END;
/

--[2] ���۷��� ����
-- (1) %TYPE : �� �÷��� �ڷ����� �޾� �ö� ����ϴ� �ڷ��� Ÿ��
DECLARE
	EMP_ID EMPLOYEE.EMP_ID%TYPE;
	EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
	SALARY EMPLOYEE.SALARY%TYPE;
BEGIN
	SELECT EMP_ID, EMP_NAME, SALARY
	INTO EMP_ID, EMP_NAME,SALARY
	FROM EMPLOYEE
	WHERE EMP_NAME='������';
	DBMS_OUTPUT.PUT_LINE(EMP_ID||'  '||EMP_NAME||'  '||SALARY);
END;
/

-- (2) %ROWTYPE : �� ���̺��� ��� �÷��� �ڷ����� ������ �� ����ϴ� Ÿ��
DECLARE
	myrow EMPLOYEE%ROWTYPE;
BEGIN
	SELECT EMP_ID, EMP_NAME
	INTO myrow.emp_id, myrow.emp_name
	FROM EMPLOYEE
	WHERE EMP_NAME ='������';
	DBMS_OUTPUT.PUT_LINE(myrow.emp_id||', '||myrow.emp_name);
END;
/

-- IF �� --
--1. IF ~ THEN ~ END IF 
/*
 	IF ���� THEN ������ ������ ��� ó������;
 	END IF;
 */
BEGIN
	IF '��â��'='��â��' THEN
		DBMS_OUTPUT.PUT_LINE('��â���̳�?');
	END IF;
END;
/

--2. IF ~ THEN ~ ELSE ~ END IF
BEGIN
	IF '��â��'='��â��' THEN
		DBMS_OUTPUT.PUT_LINE('��â���̳�?');
	ELSE DBMS_OUTPUT.PUT_LINE('�ƴϳ�....');
	END IF;
END;
/

--3. IF ~ THEN ~ ELSIF ~ ELSE ~ END IF;
/*
 	IF ����1 THEN ����1;
 	ESLIF ����2 THEN ����2;
 	ELSE ��� ���� �������� ������;
 	END IF;
 */
DECLARE
	NAME VARCHAR2(30) := '��â��';
BEGIN
	IF NAME='��â��' THEN DBMS_OUTPUT.PUT_LINE('��â���̳�....');
	ELSIF NAME ='�嵿��' THEN DBMS_OUTPUT.PUT_LINE('�嵿���̱���...');
	ELSE DBMS_OUTPUT.PUT_LINE('������?..??');
	END IF;
END;
/

--4. CASE ��
-- CASE ~ END CASE;
/*
 	CASE
 		WHEN ǥ����1 THEN ���๮1;
 		WHEN ǥ����2 THEN ���๮2;
 		ELSE �⺻���๮3;
 	END CASE;
 */

DECLARE
	NUM NUMBER(10) := 5;
BEGIN
	CASE NUM
		WHEN 1 THEN DBMS_OUTPUT.PUT_LINE(NUM||' �Դϴ�.');
		WHEN 2 THEN DBMS_OUTPUT.PUT_LINE(NUM||' �Դϴپ�.');
		WHEN 3 THEN DBMS_OUTPUT.PUT_LINE(NUM||' �Բ���?.');
		ELSE DBMS_OUTPUT.PUT_LINE('����???');
	END CASE;
END;
/

SELECT * FROM EMPLOYEE ;


--�����ȣ�� ���� ��ȸ�� ������ �����ڵ�� ��ǥ, �ӿ���, �Ϲ������� �����ϴ� ������ CASE�� ����
DECLARE
	JOB_CODE EMPLOYEE.JOB_CODE%TYPE;
	EMP_TEAM VARCHAR2(15);
BEGIN
	SELECT JOB_CODE
	INTO JOB_CODE
	FROM EMPLOYEE
	WHERE EMP_ID ='211';
	CASE JOB_CODE
		WHEN 'J1' THEN EMP_TEAM :='��ǥ';
		WHEN 'J2' THEN EMP_TEAM :='�ӿ���';
		ELSE EMP_TEAM :='�Ϲ�����';
	END CASE;
	DBMS_OUTPUT.PUT_LINE('�Ҽ�: '||EMP_TEAM);
END;
/



--PL/SQL �ݺ���   
-- LOOP --
DECLARE
	E EMPLOYEE%ROWTYPE;
BEGIN
	SELECT *
	INTO E
	FROM EMPLOYEE;
	DBMS_OUTPUT.PUT_LINE(E.EMP_ID);
END;
/
--���� �ڵ��� ������ ���.
--�Ϲ������� PLSQL�� �ϳ��� ������ ó���ϱ� �����̴�.

--LOOP, FOR, WHILE

--�Ϲ� LOOP��
/*
 	LOOP
 		�ݺ���ų ����
 		IF �ݺ� ���� ����
 			EXIT;
 		END IF;
 		�Ǵ�
 		EXIT [WHEN ���� ����]
 	END LOOP;
 */

DECLARE
	N INT := 5;
BEGIN
	LOOP
		DBMS_OUTPUT.PUT_LINE(N);
		N := N-1;
		EXIT WHEN N=0;
	END LOOP;
END;
/

--FOR �ݺ���--
--ī��Ʈ�� ������ �ڵ� ����, ī��Ʈ ���� �ڵ����� 1�� ����, REVERSE 1�� ����
/*
	FOR ī��Ʈ���� IN [REVERSE] ���۰�..���ᰪ LOOP
		�ݺ��� ����;
	END LOOP;
 */

BEGIN
	FOR N IN 1..5 LOOP
		DBMS_OUTPUT.PUT_LINE(N);
	END LOOP;
END;
/

--FOR���� �ݴ�� ����
BEGIN
	FOR N IN REVERSE 1..5 LOOP
		DBMS_OUTPUT.PUT_LINE(N);
	END LOOP;
END;
/

--FOR���� ���� INSERT ���
CREATE TABLE TB_FOR(
	NO NUMBER(10),
	TEST_DATE DATE
);

BEGIN 
	FOR X IN 1..10 LOOP
		INSERT INTO TB_FOR VALUES(X,SYSDATE+X);
	END LOOP;
END;
/

SELECT * FROM TB_FOR;
SELECT * FROM EMPLOYEE e ;


--PL/SQL�� FOR �ݺ����� �̿��Ͽ� EMPLOYEE ���̺��� 
--200�� ���� 210�������� ����� ���̵�, �����, �̸����� ���.

DECLARE 
	EMP_ID EMPLOYEE.EMP_ID%TYPE;
	EMP_NAME EMPLOYEE.EMP_NAME%TYPE;
	EMAIL EMPLOYEE.EMAIL%TYPE;	
BEGIN
	FOR X IN 200..210 LOOP
		SELECT EMP_ID, EMP_NAME, EMAIL
		INTO EMP_ID, EMP_NAME, EMAIL
		FROM EMPLOYEE
		WHERE EMP_ID = X;
		DBMS_OUTPUT.PUT_LINE(EMP_ID||' '||EMP_NAME||'  '||EMAIL);
	END LOOP;	
END;
/

DECLARE
	E EMPLOYEE%ROWTYPE;
BEGIN
	FOR X IN 200..210 LOOP
		SELECT EMP_ID, EMP_NAME, EMAIL
		INTO E.EMP_ID, E.EMP_NAME, E.EMAIL
		FROM EMPLOYEE
		WHERE EMP_ID =X;
		DBMS_OUTPUT.PUT_LINE(E.EMP_ID||', '||E.EMP_NAME||', '||E.EMAIL);
	END LOOP;
END;
/

