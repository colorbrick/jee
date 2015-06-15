<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원정보 관리 페이지</title>
</head>
<body>
	<fieldset>
		<legend>회원가입</legend>
			<table>
				<tr>
					<td>이름</td>
					<td>
					<%-- 	<%=request.getAttribute("name") %> --%>
						${name}
					</td>
				</tr>
				<tr>
					<td>ID</td>
					<td>
					<%-- 	<%=request.getAttribute("id") %> --%>
						${id}
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td>
					<%-- 	<%=request.getAttribute("age") %> 세 --%>
						${age}세
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
					<%-- 	<%=request.getAttribute("address") %> --%>
						${address}
					</td>
				</tr>

			</table>	
		</fieldset>
		
		<form action="<%=request.getContextPath()%>/model2/login.do" method="post">
		<fieldset>
		<legend>로그인</legend>
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" id="id" name="id" placeholder="ID입력" />
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" id="password" name="password"/>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="전 송"/></td>
				</tr>
			</table>	
		</fieldset>
	</form>
</body>
</html>