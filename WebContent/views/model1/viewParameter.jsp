<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%-- <%@ page import="java.util.*" %> --%>
    
<% 
	request.setCharacterEncoding("UTF-8");
%>

<!-- request.getParameter() 는 낱개 파라미터 키값과 밸류값을 리턴
	request.getParameterValues() 는 키값 없이 밸류값만 리턴 (체크박스)
	request.getParameterNames() 는 키값만 리턴 (쓸모없음)
	request.getParameterMap() 는 파라미터 밸류가 복구인 경우 (로그인)
  -->

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>폼 값을 받은 페이지</title>
</head>
<body>
<div>
	<b>request.getParameter() 메서드 사용</b> <br />
	name 파라미터 = <%= request.getParameter("name") %> <br />
	address 파라미터 = <%= request.getParameter("address") %>
	<p></p>
	<b>request.getParameterValues() 메서드 사용</b> <br />
	<%
		String[] values = request.getParameterValues("pet");
		if(values != null) {
			for(int i=0; i < values.length; i++){
				%>
				넘어온 밸류 : <%= values[i]  %> <br />
				<%
			}
		}
	%>
		<%
		String[] valuess = request.getParameterValues("gender");
		if(valuess != null) {
			for(int i=0; i < valuess.length; i++){
				%>
				넘어온 밸류 : <%= valuess[i]  %> <br />
				<%
			}
		}
	%>
	<p></p>
	<b>request.getParameterNames() 메서드 사용</b> <br />
	<%
		Enumeration paramEnum = request.getParameterNames();
		while(paramEnum.hasMoreElements()){
			String name = (String)paramEnum.nextElement();
			%>
			<%= name %>
			<%
		}
	%>
	<p></p>
	<b>request.getParameterMap() 메서드 사용</b> <br />
	<%
		Map parameterMap = request.getParameterMap();
		String[] nameParam = (String[])parameterMap.get("name");
		if(nameParam != null){
			%>
			이 름 = <%= nameParam[0] %>
			<%
		}
	%>
</div>	
</body>
</html>