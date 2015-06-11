<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>헤더 샘플</title>
	<style>
	@import url("<%=request.getContextPath()%>/css/header.css");
	</style>
</head>
<body>
	<div id="wrap">  <!-- wrap, wrapper 의미로 주어지는 클래스나 아이디는 body 바로 밑
	최상위 div 에게 보통 주어진다. 문법적 의미는 없다. -->
		<header id="top">
			<div id="login">
				<a href="#"> login</a> |
				<a href="#"> join </a>
			</div>
			<div class="clear"></div>
			<div id="logo">
				<a href="http://www.naver.com" target="_blank">
					<img src="../../images/Hydrangeas.jpg" width="250px" height="60px" alt="" />
				</a>
			</div>
			<nav id="topMenu">
				<ul>
					<li><a href="#">HOME</a></li>
					<li><a href="#">COMPANY</a></li>
					<li><a href="#">SOLUTION</a></li>
					<li><a href="#">CUSTOMER CENTER</a></li>
					<li><a href="#">CONTACT US</a></li>
				</ul>
			</nav>
		</header>
		<div class="clear"></div>
	</div>  <!-- wrap end -->
	<footer>
		<hr />
		<div>
			<pre> 웹문서 수집 및 삭제 정책 사이트/지도 검색등록 검색광고 안내 지역정보 광고안내 통합검색 고객센터 유해게시물신고
			</pre>
		</div>
	</footer>
	
	
</body>
</html>