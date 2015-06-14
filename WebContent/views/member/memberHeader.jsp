<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>영화관</title>
	<style>
		@import url("<%=request.getContextPath()%>/cssPrimus/common.css");
	</style>
</head>
<body>
    <div id="wrapper" tabindex="-1">


<div id="header">
    <!-- top-container -->
    <div class="top-container">
            <div class="sub-bg"></div>
        <!-- top -->
        <div class="top">	
            <!-- 상단 menu -->
            <div id="logo">
                <h3>로고 삽입</h3>
            </div>
            <div id="gnb" tabindex="-1">
                <ul>
                        <li><span>메뉴1</span>
                    </li>
                        <li><span>메뉴2</span>
                    </li>
                        <li><span>메뉴3</span>
                    </li>
                        <li><span>메뉴4</span>
                    </li>
                </ul>
            </div>

              <!-- //gnb -->
            <!-- right -->
            <div class="right">
                <div class="right-sub">
                    <!-- login -->
                        <div id="login">
                            <dl class="logout">
                                <dt><label for="user-id" class="user-id">ID</label></dt>
                                <dd class="user-id"><div class="input-wrapper"><input type="text" id="user-id" title="아이디 입력"></div></dd>
                                <dt><label for="user-pw" class="user-pw">PW</label></dt>
                                <dd><div class="input-wrapper"><input type="password" id="user-pw" title="비밀번호 입력"></div></dd>
                            </dl>
                            <a class="img-logout" id="aCommonLogin" href="#;" title="로그인"><span>로그인&nbsp;</span></a>
                            <a class="img-logout" id="aCommonFINDPWD" href="#" title="아이디/비밀번호 찾기"><span>아이디/비밀번호찾기 </span></a> 
                    </div>                  
                    <div id="link">
                        <ul>
                            <li><a href="memberAgree.jsp" title="회원가입"><span>회원가입</span></a></li>
                            <li><a href="#" title="MY영화관"><span>MY영화관</span></a></li>
                            <li><a href="#" title="비회원예매/취소"><span>비회원예매/취소</span></a></li>
                            <li><a href="#" title="고객센터"><span>고객센터</span></a></li>
                        </ul>
                    </div>
                </div>
            </div>
                <!-- //상단 menu -->
            </div>
            <!-- //top -->
        </div>
        <!-- //top-container -->
    </div>
	<article>
		<section class="content">
			<h3>콘텐츠</h3>
		</section>
	</article>




    </div>


</body></html>	
	