<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	서블릿 하나 더만들어서 회원가입 처리 해보기 
	회원가입 하면 loginForm.jsp 로 보내서
	loginForm에서 로그인 할수 있도록 수정
	session.setAttribute()
--%>
	<form action="regist" method="post">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="password"> <br>
		이름 : <input type="text" name="name"> <br>
		이메일 : <input type="text" name="email"> <br>
		<input type="submit" value="회원가입">
	</form>
</body>
</html>