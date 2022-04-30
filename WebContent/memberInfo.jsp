<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="model.Member"/>
<jsp:setProperty name="member" property="*" />
<%-- 파라미터중에 member 의 필드명과 일치하는 파라미터가 있으면 모두 가져와서 
해당 속성으로 설정 
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	memberID : <%=member.getId() %>
	memberPassword : <%=member.getPassword() %>
	memberName : <%=member.getName() %>
	memberEmail : <%=member.getEmail() %>
</body>
</html>