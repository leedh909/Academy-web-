DROP SEQUENCE BOARDNOSQ;
DROP SEQUENCE GROUPNOSQ;
DROP TABLE ANSWERBOARD;


--글 번호 시퀀스(PRIMARY KEY)
CREATE SEQUENCE BOARDNOSQ NOCACHE;
--그룹번호 시퀀스(새로운 글 등록할때만)
CREATE SEQUENCE GROUPNOSQ NOCACHE;

--글번호, 그룹번호, 그룹순서, 제목탭,
--제목, 내용, 작성자, 작성일

CREATE TABLE ANSWERBOARD(
	BOARDNO NUMBER PRIMARY KEY,
	GROUPNO NUMBER NOT NULL,
	GROUPSQ NUMBER NOT NULL,
	TITLETAB NUMBER NOT NULL,	--답글이 달릴때 들여쓰기를 몇번할지 알기위해 만들어놈.
	TITLE VARCHAR2(2000) NOT NULL,   
	CONTENT VARCHAR2(4000) NOT NULL,
	WRITER VARCHAR2(1000) NOT NULL,
	REGDATE DATE NOT NULL
);


SELECT * FROM ANSWERBOARD ORDER BY GROUPNO DESC, GROUPSQ;
--SELECT * FROM ANSWERBOARD ORDER BY GROUPNO DESC, BOARDNO;

--첫번째 글 작성
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, GROUPNOSQ.NEXTVAL,1,0,'첫번째 글','1번 글입니다.','유저1',SYSDATE)

--두번째 글 작성
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, GROUPNOSQ.NEXTVAL,1,0,'두번째 글','2번 글입니다.','유저2',SYSDATE)

--1번글 답글작성
--부모와 같은 GROUPNO
--부모의 GROUPSQ+1, 부모의 TITLETAB+1
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, (SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=1),(SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=1)+1,
	(SELECT TITLETAB FROM ANSWERBOARD WHERE BOARDNO=1)+1, 'RE:첫번째 글','1번 글의 답글입니다.','유저2',SYSDATE);	

--세번째 글 작성
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, GROUPNOSQ.NEXTVAL,1,0,'세번째 글','3번 글입니다.','유저3',SYSDATE)

--두번째 답글 작성
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, (SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=2),(SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=2)+1,
	(SELECT TITLETAB FROM ANSWERBOARD WHERE BOARDNO=2)+1, 'RE:두번째 글','2번 글의 답글1입니다.','유저1',SYSDATE);	

--답글 작성(RE: 두번째글 - no.5)
--부모와 같은 GROUPNO
--부모의 GROUPSQ+1, QNAHDML TITLETAB+1
INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, (SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=5),(SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=5)+1,
	(SELECT TITLETAB FROM ANSWERBOARD WHERE BOARDNO=5)+1, 'RE:RE:두번째 글','2번 글의 답글1의 답글입니다.','유저2',SYSDATE);	


--답글 작성(두번째 글 - NO.2)
--이미 들어와 있는 게시글의 GROUPSQ를 +1해야 겹치지 않기 때문에 UPDATE해야한다.
UPDATE ANSWERBOARD SET GROUPSQ = GROUPSQ+1 
WHERE GROUPNO=(SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=2)
AND GROUPSQ > (SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=2);

INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, (SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=2),(SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=2)+1,
	(SELECT TITLETAB FROM ANSWERBOARD WHERE BOARDNO=2)+1, 'RE:두번째 글','2번 글의 답글2입니다.','유저3',SYSDATE);	

	
	
--답변 작성 (RE: 두번째글 -NO.7)
UPDATE ANSWERBOARD SET GROUPSQ = GROUPSQ+1 
WHERE GROUPNO=(SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=7)
AND GROUPSQ > (SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=7);

INSERT INTO ANSWERBOARD VALUES(BOARDNOSQ.NEXTVAL, (SELECT GROUPNO FROM ANSWERBOARD WHERE BOARDNO=7),(SELECT GROUPSQ FROM ANSWERBOARD WHERE BOARDNO=7)+1,
	(SELECT TITLETAB FROM ANSWERBOARD WHERE BOARDNO=7)+1, 'RE:RE:두번째 글','2번 글의 답글2의 답글입니다.','유저2',SYSDATE);	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
