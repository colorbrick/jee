<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>테스트 폼</title>
</head>
<body>
<div>
<!-- 
(method) get 방식과 post 방식의 차이점은 전송 방식에 있다.
get 방식은 URL의 뒷 부분에 물음표(?)와 함께 파라미터를 붙여서 전송한다.
get 방식은 웹브라우저, 웹서버 또는 웹컨테이너(WAS - 톰캣, 제우스..)에 따라
전송할 수 있는 길이에 제한이 있다.

post 방식은 데이터 영역을 이용해서 데이터를 전송하기 때문에
웹 브라우저나 웹서버 등에 상관없이 전송할 수 있는 파라미터 길이에 제한이 없다.
 -->

	폼에 데이터를 입력한 후 '전송' 버튼을 클릭하세요.
	<form action="viewParameter.jsp" method="post">
		이름: <input type="text" name="name" size="10" /> <br />
		주소: <input type="text" name="address" size="30"/> <br />
		좋아하는 동물:
		<input type="checkbox" name="pet" value="dog" />강아지
		<input type="checkbox" name="pet" value="cat" />고양이
		<input type="checkbox" name="pet" value="pig" />돼지 <br />
		성별:
		<input type="radio" name="gender" value="male" />남자
		<input type="radio" name="gender" value="female" />여자
		<br />
		<input type="submit" value="전 송" />
	</form>
</div>
</body>
</html>