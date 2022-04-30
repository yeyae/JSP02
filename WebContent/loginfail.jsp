<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 실패!</h1>
	<h2>실패 이유 : <%=request.getAttribute("msg") %></h2>
</body>
</html>