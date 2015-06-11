<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%
		String id = request.getParameter("memberId");  /* request는 정보를 가져옴 */
		if (id.equals("admin")){
			response.sendRedirect("now.jsp");   
			/* response 는 어디로 갈지 결정해준다. 무조건 jsp */
		} else {
	%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 페이지</title>
</head>
<body>	
	잘못된 아이디 입니다.
	<%	
		}
	%> 
   

	
</body>
</html>
