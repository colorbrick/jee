<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isErrorPage = "true" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>에러 발생</title>
</head>
<body background="<%=request.getContextPath() %>/images/image30.png" >
	에러타입 : <%= exception.getClass().getName() %> <br />
	에러메시지 : <%= exception.getMessage() %> <br />
	<%-- <img src="<%=request.getContextPath() %>/images/image30.png" alt="" /> --%>
	
	
</body>
</html>