<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>회원가입 및 로그인 폼</title>
	<style>
	@IMPORT url("<%=request.getContextPath()%>/css/model2/kaup.css");
	</style>

<script type="text/javascript">
	function join() {
			document.frmJoin.submit();
	}
		
	function login() {
			document.frmLogin.submit();
	}




</script>
</head>
<body>
	<form action="<%=request.getContextPath()%>/model2/join.do" method="post" name="frmJoin">
		<fieldset>
		<legend>회원가입</legend>
			<table>
				<tr>
					<td>이름</td>
					<td>
						<input type="text" id="name" name="name" placeholder="이름을 입력하세요" />
					</td>
				</tr>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" id="id" name="id" placeholder="ID 값을 입력하세요" />
					</td>
				</tr>
				<tr>
				<tr>
					<td>Password</td>
					<td>
						<input type="password" id="password" name="password" />
					</td>
				</tr>
				<tr>
					<td>나이</td>
					<td>
						<input type="text" id="age" name="age" placeholder="나이를 입력하세요" />
					</td>
				</tr>
				<tr>
					<td>주소</td>
					<td>
						<input type="text" id="address" name="address" placeholder="주소를 입력하세요." />
					</td>
				</tr>
				<tr>
					<td colspan="2">
					<!-- <input type="submit" value="전 송"/> -->
					<img src="<%=request.getContextPath()%>/images/signup.gif" style="cursor:pointer" alt="" onclick="return join()"/>
					</td>
				</tr>
			</table>	
		</fieldset>
	</form>
	
	<form action="<%=request.getContextPath()%>/model2/login.do" method="post" name="frmLogin">
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
					<td colspan="2">
					<!-- <input type="submit" value="전 송"/> -->
					<img src="<%=request.getContextPath()%>/images/login.gif" style="cursor:pointer" alt="" onclick="return login()"/>
					</td>
				</tr>
			</table>	
		</fieldset>
	</form>
</body>
</html>