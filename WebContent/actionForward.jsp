<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<%-- 
	넘어온 파라미터의 값에 따라서 적절한 페이지로 포워딩
	<jsp:forward>	
 --%>
 <% 
 	// 파라미터 받아오기
 	String color = request.getParameter("color");
 	
 	// 이동할 페이지의 주소
 	String url = null;
 	
 	if(color.equals("red")){
 		url = "red.jsp";
 	} else if (color.equals("blue")) {
 		url = "color/blue.jsp";
 	} else if (color.equals("yellow")) {
 		url = "yellow.jsp";
 	}
 	
 	// 이게 파라미터 정보를 가지고 페이지를 이동하는 방법
 	//RequestDispatcher dispatcher = request.getRequestDispatcher(url);
 	//dispatcher.forward(request, response);
 	
 %>
 <jsp:forward page="<%=url %>">
 	<jsp:param value="홍길동" name="name"/>
 </jsp:forward>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>