<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <select> 태그를 이용해서 값을 하나 선택하도록 한다.
	빨강, 노랑, 파랑 색중에 선택을 해서 
	해당 색깔에 매칭되는 페이지로 이동
 --%>
	<form action="actionForward.jsp">
		<select name="color"> <%-- name 속성 꼭 정해주기!! (받을때 써야함.) --%>
			<option value="red">빨강</option>
			<option value="blue">파랑</option>
			<option value="yellow">노랑</option>
		</select>
		<input type="submit" value="이동">
	</form>
</body>
</html>