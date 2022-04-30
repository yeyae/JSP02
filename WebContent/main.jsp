<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<%=session.getAttribute("userid") %>님 반갑습니다.<br>
	<button onclick="location.href='logout'">로그 아웃</button>
</body>
</html>