<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Right Content Frame</title>
	<style>
		@IMPORT url("<%=request.getContextPath()%>/css/rightContent.css");
	</style>
</head>
<body>
	<header>
		<h3>머릿말</h3>
		<nav>
			<ul class="topMenu">   <!-- ul>li*3  -->
				<li>네비게이터 메뉴1</li>
				<li>네비게이터 메뉴2</li>
				<li>네비게이터 메뉴3</li>
			</ul>
		</nav>
	</header>
	<aside>
		<section class="leftSide">
			<h3>사이드바</h3>
			<ul>
				<li>메뉴1</li>
				<li>메뉴2</li>
				<li>메뉴3</li>
			</ul>
		</section>
	</aside>
	
	<article>
		<section class="rightContent">
			<hgroup>
				<h2>JEE 모델 2(MVC 모델)</h2>
			</hgroup>
			<figure>
				<img src="" alt="" />
				<figcaption>상대경로로 이미지 호출</figcaption>
			</figure>
			<p id="mvcDetail"> MVC 모델은 3 파트로 구분하여 개발합니다. <br />  <!-- 줄바꿈 -->
				[1] <mark>Model</mark> : 순수자바파일(DB와 연결, 데이터 전송&연산) <br />
				[2] <mark>View</mark> : JSP(HTML) + CSS + Javascript + XML <br />
				[3] <mark>Controller</mark> : 서블릿(Vire 에서 넘어온 데이터를 주고 받는 Java 파일) <br /> 
			</p>
			
		</section>
	</article>
	<footer>
		꼬릿말
	</footer>
</body>
</html>