<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Member" %>

<jsp:useBean id="member" class="model.Member" scope="request"></jsp:useBean>
<jsp:setProperty property="address" name="member" value="영등포구"/>

<%
//	Member member = new Member();
//	request.setAttribute("member", member);
//	member.setAddress("영등포구");
	member.setId("globalin");
	member.setName("홍길동");
%>
<jsp:forward page="useBean.jsp"/>

<%-- 
	<jsp:useBean id="s1" class="Student" scope="request">
	javaBean : javaBean 규약에 맞춰 클래스로 생성한 객체
	id = "s1" : bean의 인스턴스 이름, ( Student s1 = new Student(); )
	class : bean 객체의 참조 클래스
	scope : 라이프사이클 ( 범위 ) => ( page, request, session, application )
	
	<jsp:setProperty> : 빈의 속성을 설정하는 액션 태그
	name : 속성을 지정하고자 하는 bean의 식별자 (id)
	property : 설정하고자 하는 bean의 속성 이름 ( setter )
	value : 설정하고자 하는 값
--%>