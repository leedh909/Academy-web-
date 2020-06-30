<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>    

<%@ page import="com.mvc.dao.MVCBoardDao" %>
<%@ page import="com.mvc.dto.MVCBoardDto" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#updateform{
		display: none;
	}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	//수정버튼 클릭시 updateform 보여주기
	function updateFormView(){
		$("#detailform").hide();
		$("#updateform").show();
	}
	//취소버튼 클릭시 detailform 보여주기
	function detailFormView(){
		$("#detailform").show();
		$("#updateform").hide();
	}
</script>
</head>
<body>
<%
	MVCBoardDto dto = (MVCBoardDto)request.getAttribute("selectone");
	System.out.println(dto);
%>

	<div id="detailform">
		<h1>게시글 보기</h1>
		<table border="1">
			<tr>
				<th>NO</th>
				<td><%=dto.getSeq() %></td>
			</tr>
			<tr>
				<th>WRITER</th>
				<td><%=dto.getWriter() %></td>
			</tr>
			<tr>
				<th>DATE</th>
				<td><%=dto.getRegdate() %></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><%=dto.getTitle() %></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="10" cols="60" readonly="readonly"><%=dto.getContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="button" value="수정" onclick="updateFormView();">
					<input type="button" value="삭제" onclick="">
					<input type="button" value="목록" onclick="location.href='mycontroller.jsp?command=boardlist'">
				</td>
			</tr>
		</table>
	</div>
	
<!--------------------------------------------------------------------  -->	
<div id="updateform">
	<h1>게시글 수정</h1>
	<form action="boardupdate_res.jsp">
		<input type="hidden" name="seq" value="<%=dto.getSeq()%>">
		<table border="1">
			<tr>
				<th>NO</th>
				<td><%=dto.getSeq() %></td>
			</tr>
			<tr>
				<th>WRITER</th>
				<td><%=dto.getWriter() %></td>
			</tr>
			<tr>
				<th>DATE</th>
				<td><%=dto.getRegdate() %></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type="text" name="title" value="<%=dto.getTitle() %>"></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows="10" cols="60" name="content"><%=dto.getContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="수정완료">
					<input type="button" value="취소" onclick="detailFormView();">
				</td>
			</tr>
		</table>
	</form>
</div>
	
