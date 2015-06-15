<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>카우프 지수 구하기</title>
	<style>
	@IMPORT url("<%=request.getContextPath()%>/css/model2/kaup.css");
	</style>
</head>

<body>
		<table>
			<tr>
				<td>키</td>
				<td>
					<%=request.getAttribute("height")%>
				</td>
			</tr>
			<tr>
				<td>몸무게</td>
				<td>
					<%=request.getAttribute("weight")%>
				</td>
			</tr>
			<tr>
				<td colspan="2">
			<!-- 	카우푸지수는 몇이고 정상 입니다. -->
					카우푸지수는 <%=request.getAttribute("idx")%> 이고, <br />
					<%=request.getAttribute("result")%> 입니다. 
				</td>
			</tr>
		</table>	
</body>
</html>