<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String name = request.getParameter("name");
	String value = request.getParameter("value");
	
	if(name != null & value != null){
		request.setAttribute(name, value);
	}
%>
    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JSP 기본 객체의 속성(Attribute)</title>
</head>
<body>
	<%
		if(name != null && value != null){
			%>
			application 기본 객체의 리퀘스트 설정:
				<%= name %> = <%= value %>
				<%
		} else {
			%>
			application 기본 객체의 리퀘스트 설정 안 함
			<%		
		}
	
	%>
	
	
</body>
</html>