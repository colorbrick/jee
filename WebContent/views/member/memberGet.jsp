<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입 결과</title>
</head>
<body>
	<div>
		이름 : <%=request.getAttribute("name") %>	<br />
		생일 : <%=request.getAttribute("birth") %><br />
		양력/음력 : <%=request.getAttribute("birth_radio") %><br />	
		남성/여성 : <%=request.getAttribute("gender_radio") %><br />
		아이디 : <%=request.getAttribute("id") %><br />
		비밀번호 : <%=request.getAttribute("password") %><br />
		비밀번호 확인 : <%=request.getAttribute("password_Conf") %><br />
		이메일 : <%=request.getAttribute("email") %><br />	
		폰번호 : <%=request.getAttribute("phone") %><br />
	
	</div>
</body>
</html>