<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>리스트 태그 2</title>
	<style>
	@IMPORT url("<%=request.getContextPath()%>/css/listTag2.css");
	</style>
</head>
<body>
	<h3> 리스트형 태그 3가지 종류</h3>
	<div class="listTag"> 
		<h3>순서 없는 리스트 태그</h3>
		<!-- ul>li*3 -->
		<ul>
			<li>UL 목록1</li>
			<li>UL 목록2</li>
			<li>UL 목록3</li>
		</ul>
	</div>
	<div class="listTag">
		<h3>순서 있는 리스트 태그</h3>
		<!-- ol>li*3 -->
		<ol type="i">
			<li>OL 목록1</li>
			<li>OL 목록2</li>
			<li>OL 목록3</li>
		</ol>
	</div>
	<div class="listTag">
		<h3>집합 리스트 태그</h3>
		<!-- dl>dt*3 -->
		<dl>
			<dt>DL 목록1</dt>
			<dt>DL 목록2</dt>
			<dt>DL 목록3</dt>
		</dl>
	</div>
	
</body>
</html>