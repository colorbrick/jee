<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>관리자 페이지</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/member/searchAllMembers.do" method="get" name="frmAdmin">
		<fieldset>
		<legend>회원관리</legend>
			<table>
				<tr>
					<td>전체회원 목록 보기</td>
					<td>
						<!-- <input type="text" id="id" name="id" placeholder="ID입력" /> -->
					</td>
				</tr>
				<tr>
					<td>ID로 회원검색</td>
					<td>
<!-- 						<input type="password" id="password" name="password"/> -->
					</td>
				</tr>
				<tr>
					<td>이름으로 회원검색(동명이인 허용)</td>
					<td>
<!-- 						<input type="password" id="password" name="password"/> -->
					</td>
				</tr>
				<tr>
					<td>회원 삭제</td>
					<td>
<!-- 						<input type="password" id="password" name="password"/> -->
					</td>
				</tr>
				<tr>
					<td colspan="2">
					<input type="submit" value="전 송"/>
					<%-- <img src="<%=request.getContextPath()%>/images/login.gif" style="cursor:pointer" alt="" onclick="return login()"/> --%>
					</td>
				</tr>
			</table>	
		</fieldset>
	</form>
</body>
</html>