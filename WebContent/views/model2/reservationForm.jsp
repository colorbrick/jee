<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>예약 폼</title>
</head>
<body>
	<div>
		<% 
	    int floor=3;
    	int room=5;
    	String[][] name = new String[3][5]; // 투숙객 이름
    	%>
		***************  호텔의 투숙상태 ***************** <br />
		<%
        // 중첩for if문
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                if (name[i][j] == null) {
                    %>
                	<%=i + 1%> 0 <%=j + 1 %> 호 <%="□"%>
                    <%
                	 /* System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
                            + " □\t" + "\t"); */
                } else {
                	%>
                    <%=i + 1%> 0 <%=j + 1 %> 호 <%="■"%> ${name[i][j]}
                            <%
                    /* System.out.print("" + (i + 1) + "0" + (j + 1) + "호"
                            + " ■\t" + name[i][j] + "\t"); */ 
                }
            }
            %>
            <br />
            <%
        }
	
        %>
	</div>
</body>
</html>