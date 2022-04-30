<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="blue">
	여기는 blue.jsp
	색깔 파라미터 : <%=request.getParameter("color") %><br>
	새로 추가한 jsp:param <%=request.getParameter("name") %>
</body>
</html>