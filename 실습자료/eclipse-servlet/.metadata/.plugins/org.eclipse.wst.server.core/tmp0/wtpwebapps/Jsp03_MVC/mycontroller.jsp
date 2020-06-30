<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="com.mvc.dto.MVCBoardDto" %>
<%@ page import="com.mvc.dao.MVCBoardDao" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String command = request.getParameter("command");
	
	System.out.println("[command: "+command+"]");
	
	MVCBoardDao dao = new MVCBoardDao();
	
	if(command.equals("boardlist")){
		
		List<MVCBoardDto> list = dao.selectAll();
		
		request.setAttribute("allList", list);
		pageContext.forward("boardlist.jsp");

		/*
			페이지의 흐름을 제어
			-포워드 : request, response가 유지
				1) requestDispatcher 이용
				2) <jsp:forward>
				3) pageContext.forward()
			-리다이렉트 : 새로운 request, response
				1) response.sendRedirect()
		*/
		
	}else if(command.equals("boarddetail")){
		//1. 파라미터로 넘어오는 seq 처리
		//2. dao를 이용하여 data처리
		//3. 페이지 처리(boarddetail.jsp : jsp02의 detail페이지와 같은 양식으로 작성)
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		MVCBoardDto dto = dao.selectone(seq);
		
		request.setAttribute("selectone", dto);
		pageContext.forward("boarddetail.jsp");
		
		
	}
	
	
	
%>	
	
	
	
</body>
</html>