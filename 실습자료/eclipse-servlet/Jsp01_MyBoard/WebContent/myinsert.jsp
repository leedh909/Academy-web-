<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 한글 깨지는걸 방지해준다. -->
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글쓰기</h1>
	<form action="myinsert_res.jsp" method="post">
		<table>
			<tr>
				<th>NAME: </th>
				<td><input type="text" name="myname"></td>
				<!-- 데이터가 넘어갈때 name을 지정해줘야 같이 넘어갈 수 있다. -->
			</tr>
			<tr>
				<th>TITLE: </th>
				<td><input type="text" name="mytitle"></td>
			</tr>
			<tr>
				<th>CONTENT: </th>
				<td><textarea rows="10" cols="40" name="mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">			
					<input type="submit" value="입력">
					<input type="button" value="취소" onclick="location.href='mylist.jsp'">
				</td>
			</tr>
		</table>
	
	</form>
	
	
	
	
	
	
	
	
	
</body>
</html>