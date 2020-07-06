<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="com.el.score.Score" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Score score = (Score)request.getAttribute("score");
%>
	<h1>EL Page</h1>
	<table border="1">
		<tr>
			<th colspan="2"> ${score.name}님의 점수는...</th>	
			<!-- import와 객체를 생성하지 않고도 request의 매개변수를 사용할 수 있다. -->
		</tr>
		<tr>
			<th>국어</th>
			<td><%=score.getKor() %></td>
		</tr>
		<tr>
			<th>영어</th>
			<td>${score.eng}</td>
		</tr>
		<tr>
			<th>수학</th>
			<td>${score.math}</td>
		</tr>
		<tr>
			<th>총합</th>
			<td>${score.sum}</td>
		</tr>
		<tr>
			<th>평균</th>
			<td>${(score.kor + score.eng + score.math)/3}</td>
		</tr>
		<tr>
			<th>성적</th>
			<td>${score.grade}</td>
		</tr>
	</table>

</body>
</html>