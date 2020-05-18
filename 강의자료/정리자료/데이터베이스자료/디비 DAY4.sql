
-- GROUP BY : 주어진 결과를 특정 소그룹으로 편성할 때 사용하는 문법
-- HAVING : 그룹 내의 조건을 설정할 때 사용한다.

/*
	-쿼리 실행 순서-
5	SELECT 컬럼명
1	FROM 테이블명
2	WHERE 조건식
3	GROUP BY 컬럼명
4	HAVING 그룹내의 조건식
6	ORDER BY 표현식

*/


--실습1.
--EMPLOYEE 테이블에서 직급별 그룹을 편성하여 
--직급코드, 급여합계, 급여평균, 인원수 를 조회
--단, 인원수는 3명을 초과하는 직급만을 조회
SELECT JOB_CODE "직급코드", TO_CHAR(SUM(SALARY),'L999,999,999') "급여합계", TRUNC(AVG(SALARY),0)||'원' "급여평균", COUNT(*)||'명' "인원수"
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING COUNT(*)>3;

--강사님 코딩
SELECT JOB_CODE , SUM(SALARY), TRUNC(AVG(SALARY),-2), COUNT(*)
FROM EMPLOYEE
GROUP BY JOB_CODE
HAVING COUNT(*)>3
ORDER BY 4 DESC;


--DECODE()
--DECODE(컬럼명, 결과1, 값1[, 결과2, 값2 ....], 기본값)
SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO ,8,1),1,'남성',2,'여성' ) "성별"
FROM EMPLOYEE;

-- SET OPERATOR --
--두개 이상의 SELECT 한 결과를 합치거나, 중복을 별도로 제거하거나 하는 
--집합 형태의 결과로 조회하는 명령어

--합집합--
--UNION :
--두 개 이상의 SELECT 한 결과를 구하는 명령어,
--중복이 있을 경우 중복되는 결과는 1번만 보여준다.

--UNION ALL :
--두 개 이상의 SELECT 한 결과를 보여주되,
--중복이 있을 경우 그대로 조회하여 보여준다.

--교집합--
--INTERSECT : 두 개 이상의 결과 중 중복되는 결과만 보여준다.

--차집합--
--MINUS : 두 개 이상의 결과 중 첫번째 결과만이 가진 내용을 보여주는 명령어


--SELECT 결과인 A와 B를 하나로 합치는 경우
--A와 B의 컬럼 개수와 자료형은 같아야 한다.!! 반드시!!

--UNION (중복 제거)
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE DEPT_CODE ='D5'
UNION
SELECT EMP_ID , EMP_NAME , DEPT_CODE , SALARY 
FROM EMPLOYEE
WHERE SALARY > 3000000;

--UNION ALL (중복도 모두 출력)
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
--두 개 이상의 테이블을 하나로 합쳐서 사용하는 명령

--만약에 'J6'라는 직급을 가진 사원들의 근무 부서명이 궁금하다면??
SELECT EMP_NAME,JOB_CODE,DEPT_CODE 
FROM EMPLOYEE
WHERE JOB_CODE ='J6'; --D8, D1

SELECT * FROM DEPARTMENT;

SELECT DEPT_ID, DEPT_TITLE
FROM DEPARTMENT
WHERE DEPT_ID IN('D1','D8');


--오라클 전용 문법 / ANSI 표준 문법
--오라클 전용 문법
--FROM 절에 ',' 기호를 붙여 합치게 될 테이블들을 나열
--WHERE 조건을 통해서 합칠 테이블들의 공통 사항을 작성
SELECT EMP_ID , EMP_NAME ,DEPT_CODE , DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID;


SELECT * FROM EMPLOYEE;
SELECT * FROM JOB;
--컬럼명이 동일한 경우 별칭을 사용하여 구분해준다.
SELECT *
FROM EMPLOYEE E, JOB J
WHERE E.JOB_CODE = J.JOB_CODE ;


SELECT *
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID;

--------------------------
--ANSI 표준 문법
--조인 하고자 하는 테이블을 FROM 구문 다음에
--JOIN 테이블명 ON() | USING() 구문을 사용하여
--두 개 이상의 테이블을 하나로 합치는 방법

--두 개의 테이블에서 공통 컬럼의 이름이 다를 경우
SELECT EMP_ID ,EMP_NAME ,DEPT_CODE ,DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(EMPLOYEE.DEPT_CODE=DEPARTMENT.DEPT_ID );
--(EMPLOYEE.)DEPT_CODE=(DEPARTMENT.)DEPT_ID --생략가능하다.

--두 개의 테이블에서 공통 컬럼의 이름이 같은 경우
SELECT EMP_ID , EMP_NAME , JOB_CODE , JOB_NAME
FROM EMPLOYEE
--JOIN JOB ON(EMPLOYEE.JOB_CODE = JOB.JOB_CODE);
JOIN JOB USING(JOB_CODE);


--실습2.
--EMPLOYEE 테이블의 직원 급여 정보와 SAL_GRADE의 급여 등급을 합쳐서
--사번, 사원명, 급여등급, 등급 기준 최소급여, 최대급여를 조회

--오라클 전용
SELECT EMP_ID "사번", EMP_NAME "사원명", 
E.SAL_LEVEL "급여등급", MIN_SAL "등급 기준 최소급여", MAX_SAL "등급 기준 최대급여"
FROM EMPLOYEE E, SAL_GRADE S
WHERE E.SAL_LEVEL = S.SAL_LEVEL ;

--ANSI 문법
SELECT EMP_ID "사번", EMP_NAME "사원명", 
SAL_LEVEL "급여등급", MIN_SAL "등급 기준 최소급여", MAX_SAL "등급 기준 최대급여"
FROM EMPLOYEE 
JOIN SAL_GRADE USING(SAL_LEVEL);

--실습3.
--DEPARTMENT 테이블의 위치 정보
--LOCATION 테이블을 조인하여
--각 부서별 근무지 위치를 조회
--부서코드, 부서명, 근무지 코드, 근무지 위치

--ORACLE
SELECT DEPT_ID "부서코드", DEPT_TITLE "부서명", LOCATION_ID "근무지 코드", LOCAL_NAME "근무지 위치"
FROM DEPARTMENT , LOCATION 
WHERE LOCATION_ID = LOCAL_CODE ;

--ANSI
SELECT DEPT_ID "부서코드", DEPT_TITLE "부서명", LOCATION_ID "근무지 코드", LOCAL_NAME "근무지 위치"
FROM DEPARTMENT
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID);


-- INNER JOIN / OUTER JOIN --
--두 개 이상의 테이블을 합칠때
--INNER JOIN은 둘 모두 일치하는 데이터만 합치고, 
--OUTER JOIN은 둘 중 하나, 혹은 둘 모두가 가진 모든 값을 합칠때 사용

--INNER JOIN 
SELECT DISTINCT DEPT_CODE, DEPT_TITLE
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
ORDER BY 1;

--OUTER JOIN
--LEFT [OUTER] JOIN : 두 테이블 중 원본(좌측) 테이블의 정보를 모두 포함하여 조회
--RIGHT [OUTER] JOIN : 두 테이블 중 JOIN에 명시한 테이블의 정보를 모두 포함하여 조회
--FULL [OUTER] JOIN : 두 테이블이 가진 데이터 중 서로가 가지지 않은 값이라도 모두 포함하여 조회

--LEFT JOIN
--ANSI 표준
SELECT DEPT_CODE , EMP_NAME , DEPT_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--ORACLE
SELECT DEPT_CODE , EMP_NAME , DEPT_TITLE
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE = DEPT_ID(+);


--RIGHT JOIN 
--ANSI 표준
SELECT DEPT_CODE, DEPT_ID, EMP_NAME
FROM EMPLOYEE
RIGHT JOIN DEPARTMENT ON(DEPT_CODE = DEPT_ID);

--ORACLE
SELECT DEPT_CODE, DEPT_ID, EMP_NAME
FROM EMPLOYEE, DEPARTMENT
WHERE DEPT_CODE(+) = DEPT_ID;

--FULL JOIN
--ANSI 표준
SELECT DEPT_CODE , DEPT_ID, EMP_NAME 
FROM EMPLOYEE
FULL JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE);

--ORACLE
--ORACLE 구문에서는 FULL JOIN을 지원하지 않는다.


--CROSS JOIN
--카테시안 곱
SELECT EMP_NAME, NATIONAL_CODE
FROM EMPLOYEE 
CROSS JOIN NATIONAL;

--SELF JOIN
--자기 자신을 조인하는 방법
--한테이블의 정보 중 값 비교가 필요한 정보들을 계산하여 조회하는 방식

--직원의 정보와 직원을 관리하는 매니저의 정보를 조회
--ANSI --
SELECT *
FROM EMPLOYEE E
JOIN EMPLOYEE M ON(E.MANAGER_ID = M.EMP_ID );

--ORACLE
SELECT E.EMP_ID 사번, E.EMP_NAME 사원명, E.MANAGER_ID "관리자 사번", M.EMP_NAME 관리자명
FROM EMPLOYEE E , EMPLOYEE M
WHERE E.MANAGER_ID = M.EMP_ID ;

--다중 JOIN --
--여러 개의 테이블을 JOIN 하는것
--일반 조인과 선언방식은 같으나, 앞서 조인한 결과를 기준으로 
--이후에 조인할 테이블을 연결 짓는다.
--따라서 조인 순서에 반드시 주의해야 한다.

--ANSI 표준
SELECT EMP_NAME , DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID);

--ORACLE
SELECT EMP_NAME , DEPT_TITLE, LOCAL_NAME
FROM EMPLOYEE , DEPARTMENT  , LOCATION 
WHERE DEPT_CODE = DEPT_ID AND LOCAL_CODE = LOCATION_ID ;


--실습4.
--직급이 대리이면서, 아시아 지역에서 근무하는 사원 조회
--사번, 사원명, 직급명, 부서명, 근무지역명, 급여

--ANSI
SELECT EMP_ID 사번,EMP_NAME 사원명, JOB_NAME 직급명, DEPT_TITLE 부서명, LOCAL_NAME 근무지역명, SALARY 급여
FROM EMPLOYEE 
JOIN JOB USING(JOB_CODE)
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID)
WHERE JOB_NAME = '대리' AND LOCAL_NAME LIKE 'ASIA%';
--강사님코드
SELECT EMP_ID 사번,EMP_NAME 사원명, JOB_NAME 직급명, DEPT_TITLE 부서명, LOCAL_NAME 근무지역명, SALARY 급여
FROM EMPLOYEE E 
JOIN JOB J ON(E.JOB_CODE = J.JOB_CODE AND JOB_NAME ='대리')
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCATION_ID = LOCAL_CODE AND LOCAL_NAME LIKE 'ASIA%');

--ORACLE
SELECT EMP_ID 사번,EMP_NAME 사원명, JOB_NAME 직급명, DEPT_TITLE 부서명, LOCAL_NAME 근무지역명, SALARY 급여
FROM EMPLOYEE E, JOB J , DEPARTMENT D, LOCATION L
WHERE E.JOB_CODE = J.JOB_CODE AND D.DEPT_ID = E.DEPT_CODE 
	AND L.LOCAL_CODE = D.LOCATION_ID AND J.JOB_NAME ='대리' AND L.LOCAL_NAME LIKE 'ASIA%';


--실습5.
--한국(KO)과 일본(JP)에 근무하는 근무 직원들의 정보를 조회하시오.
--사원명, 부서명, 지역명, 국가명

--ANSI
SELECT EMP_NAME 사원명, DEPT_TITLE 부서명, LOCAL_NAME 지역명, NATIONAL_NAME 국가명
FROM EMPLOYEE
JOIN DEPARTMENT ON(DEPT_ID = DEPT_CODE)
JOIN LOCATION ON(LOCAL_CODE = LOCATION_ID)
JOIN NATIONAL USING(NATIONAL_CODE) 
WHERE NATIONAL_CODE IN ('KO','JP')
ORDER BY 4 DESC, 1;
--ORACLE
SELECT EMP_NAME 사원명, DEPT_TITLE 부서명, LOCAL_NAME 지역명, NATIONAL_NAME 국가명
FROM EMPLOYEE , DEPARTMENT , LOCATION L,NATIONAL N
WHERE DEPT_CODE = DEPT_ID AND LOCAL_CODE = LOCATION_ID 
	AND L.NATIONAL_CODE = N.NATIONAL_CODE AND L.NATIONAL_CODE IN('KO','JP')
ORDER BY 4 DESC, 1;


-- Sub Query --
--주가 되는 메인 쿼리 안에서 조건이나 하나의 검색을 위한 다른 쿼리를 추가하는 기법

--단일행 서브쿼리
--결과값이 1개 나오는 서브쿼리
--EX) 최소 급여를 받는 사원의 정보 조회
SELECT MIN(SALARY) FROM EMPLOYEE;
SELECT * FROM EMPLOYEE WHERE SALARY =1380000;

SELECT * FROM EMPLOYEE WHERE SALARY =(SELECT MIN(SALARY) FROM EMPLOYEE);

-- 다중 행 서브쿼리
--결과 값이 여러 줄 나오는 서브쿼리

--각 직급별 최소 급여
SELECT JOB_CODE , MIN(SALARY)
FROM EMPLOYEE 
GROUP BY JOB_CODE;

SELECT *
FROM EMPLOYEE
WHERE SALARY IN (SELECT MIN(SALARY)
					FROM EMPLOYEE 
					GROUP BY JOB_CODE);
		
--다중 열 다중 행 서브쿼리
--여러 컬럼과 여러 줄을 가진 서브쿼리를 사용하여 결과를 조회
SELECT *
FROM EMPLOYEE
WHERE (JOB_CODE , SALARY) IN (SELECT JOB_CODE ,MIN(SALARY)
								FROM EMPLOYEE 
								GROUP BY JOB_CODE);

--다중 행 다중 열 서브쿼리     와     일반 단일 행 서브쿼리 차이
--EX) 퇴사한 여직원과 같은 직급, 같은 부서에 근무하는 직원들의 정보를 조회
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

--다중 열 다중 행 서브쿼리로 변경
SELECT * FROM EMPLOYEE 
WHERE (DEPT_CODE , JOB_CODE ) = (SELECT DEPT_CODE, JOB_CODE 
					FROM EMPLOYEE
					WHERE ENT_YN ='Y') 
	AND EMP_NAME != (SELECT EMP_NAME FROM EMPLOYEE WHERE ENT_YN ='Y');
							

--서브 쿼리의 사용 위치
--SELECT , FROM , WHERE , GROUP BY , HAVING , ORDER BY , JOIN
--DML : INSERT, UPDATE, DELETE
--DDL : CREATE TABLE, CREATE VIEW
--어느 위치든 사용 할 수 있다.							
							
--Inline View(인라인 뷰)
							
							

-- COMM 의 값이 NULL이 아닌 정보 조회
SELECT * FROM EMP WHERE COMM IS NOT NULL;

-- 커미션을 받지 못하는 직원 조회
SELECT * FROM EMP WHERE COMM IS NULL;

-- 관리자가 없는 직원 정보 조회
SELECT * FROM EMP WHERE MGR IS NULL;

-- 급여를 많이 받는 직원 순으로 조회
SELECT * FROM EMP ORDER BY SAL DESC;

-- 급여가 같을 경우 커미션을 내림차순 정렬 조회
SELECT * FROM EMP ORDER BY SAL DESC, COMM DESC;

-- EMP 테이블에서 사원번호, 사원명,직급, 입사일 조회
-- 단 입사일을 오름차순 정렬 처리함.
SELECT EMPNO 사원번호, ENAME 사원명, JOB 직급, HIREDATE 입사일 FROM EMP ORDER BY HIREDATE ;

-- EMP 테이블로 부터 사원번호, 사원명 조회
-- 사원번호 기준 내림차순 정렬
SELECT EMPNO 사원번호, ENAME 사원명 FROM EMP ORDER BY EMPNO DESC;

-- 사번, 입사일, 사원명, 급여 조회
-- 부서번호가 빠른 순으로, 같은 부서번호일 때는 최근 입사일순으로 처리
SELECT EMPNO 사원,HIREDATE 입사일, ENAME 사원명, SAL 급여
FROM EMP ORDER BY DEPTNO , HIREDATE ;


/***** 함수 *****/
-- 시스템으로 부터 오늘 날짜에 대한 정보를 얻고자 할 때
SELECT SYSDATE FROM DUAL; 

-- EMP 테이블로 부터 사번, 사원명, 급여 조회
-- 단, 급여는 100단위 까지의 값만 출력 처리함.
-- 급여 기준 내림차순 정렬함.
SELECT EMPNO 사번, ENAME 사원명, TRUNC(SAL,-2) 급여 FROM EMP ORDER BY SAL DESC;

-- EMP 테이블로 부터 사원번호가 홀수인 사원들을 조회							
SELECT * FROM EMP WHERE MOD(EMPNO,2)=1; 


/* 문자 처리 함수*/  
-- EMP 테이블로 부터 사원명, 입사일 조회
-- 단, 입사일은 년도와 월을 분리 추출해서 출력
SELECT ENAME 사원명, SUBSTR(HIREDATE,1,2)||'년도 '||SUBSTR(HIREDATE,4,2)||'월' 입사일 FROM EMP

-- EMP 테이블로 부터 9월에 입사한 직원의 정보 조회
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'MM')=9; 

-- EMP 테이블로 부터 '81'년도에 입사한 직원 조회
SELECT * FROM EMP WHERE TO_CHAR(HIREDATE,'YY')=81;

-- EMP 테이블로 부터 이름이 'E'로 끝나는 직원 조회
SELECT * FROM EMP WHERE ENAME LIKE '%E'; 

-- emp 테이블로 부터 이름의 세번째 글자가 'R'인 직원의 정보 조회
-- LIKE 연산자를 사용
SELECT * FROM EMP WHERE ENAME LIKE '__R%';
-- SUBSTR() 함수 사용
SELECT * FROM EMP WHERE SUBSTR(ENAME,3,1)='R' ;


/************ 날짜 처리 함수 **************/
-- 입사일로 부터 40년 되는 날짜 조회
SELECT ADD_MONTHS(HIREDATE ,480) FROM EMP 

-- 입사일로 부터 33년 이상 근무한 직원의 정보 조회
SELECT * FROM EMP WHERE TO_CHAR(SYSDATE,'YYYY') - TO_CHAR(ADD_MONTHS(HIREDATE ,396),'YYYY') >0

-- 오늘 날짜에서 년도만 추출
SELECT TO_CHAR(SYSDATE,'YYYY') FROM DUAL; 


