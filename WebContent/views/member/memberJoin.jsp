<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
@import url("<%=request.getContextPath()%>/cssPrimus/common.css");
</style>

<article>
	<div id="main-shortCut">
		<div class="sub-main-section">
			<!-- 컨텐츠 작성 -->

			<div class="sub-main-section layout c91500000">
                <!-- 컨텐츠 작성 -->

                <div class="page-type3">
                    <h2>
                        <p>JOIN</p>
                        <span>회원가입 신청서</span>
                    </h2>
                </div>

                <div class="input-section">
                    <h4 class="margin-top45 margin-bottom10"><b>회원정보</b></h4>
                    <p> 회원가입 후 아이디, 이름은 수정하실 수 없습니다.</p>
                    <div class="clear_both"></div>
                    <div class="line-ccc margin-top5"></div>

					<form action="<%=request.getContextPath()%>/member.do" method="post">                        
						<fieldset>
                            <legend>회원가입 양식폼</legend>
                            <div class="input-box">
                                <dl>
                                    <dt class="essential dt-margin-top1">
                                        <label for="Name">이름</label></dt>
                                    <dd>
                                        <input name="name" title="가입 이름" class="input-box id_txt" id="name" type="text" value="" data-val-required="이름을 입력하세요" >                                       
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
                                <dl class="margin-top15">
                                    <dt class="essential dt-valign-top">
                                        <label for="birth_radio">생년월일</label></dt>
                                    <dd>
                                         <input id="birthday" name="birthday" type="date" />                                      
                                    </dd>
                                    <dd>
                                        <input name="birth_radio" title="양력" class="radio-common" id="birth_solar" type="radio" checked="checked" value="양력"><label for="birth_solar">양력</label>
                                        <input name="birth_radio" title="음력" class="radio-common" id="birth_lunar" type="radio" value="음력"><label for="birth_lunar">음력</label>
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
                                                                <dl class="margin-top15">
                                    <dt class="essential dt-valign-top">
                                        <label for="gender_radio">성별</label></dt>

                                    <dd>
                                        <input name="gender_radio" title="남성" class="radio-common" id="gender_male" type="radio" checked="checked" value="남자"><label for="gender_male">남성</label>
                                        <input name="gender_radio" title="여성" class="radio-common" id="gender_female" type="radio" value="여자"><label for="gender_female">여성</label>
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
                                <dl>
                                    <dt class="essential dt-valign-top">
                                        <label for="Id">아이디</label></dt>
                                    <dd>
                                        <p>영문/숫자 혼용 6~20자리 이내</p>
                                    </dd>
                                    <dd>
                                        <input name="Id" title="가입 아이디" class="input-box id_txt" id="Id" type="text" value="" data-val-required="아이디을 입력하세요" data-val-regex-pattern="^(?=([a-zA-Z]+[0-9]+[a-zA-Z0-9]*|[0-9]+[a-zA-Z]+[a-zA-Z0-9]*)$).{6,20}" data-val-regex="아이디는 영문숫자 조합이여야 합니다." data-val-length-min="6" data-val-length-max="20" data-val-length="아이디는 6~20자리 이내 입니다." data-val="true">
                                        <a title="아이디 중복확인 하기(새창열림)" class="button h30 w85 white " id="aPopId" href="javascript:popup_id();" target=""><b>중복확인</b></a>
                                        <span class="field-validation-valid" style="color: red;" data-valmsg-replace="true" data-valmsg-for="Id"></span>
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
                                <dl>
                                    <dt class="essential dt-valign-top">
                                        <label for="Password">비밀번호</label></dt>
                                    <dd>
                                        <p>
					                        영문자, 숫자, 특수문자 모두 최소 1가지 이상 조합하여 8~12자리로 설정 가능합니다.
                                        </p>
                                    </dd>
                                    <dd>
                                        <input name="Password" title="비밀번호" class="input-box pwd_txt" id="Password" type="password" data-val-required="패스워드을 입력하세요" data-val-regex-pattern=".{8,12}" data-val-regex="영문자, 숫자, 특수문자 모두 최소 1가지 이상 조합하여 8~12자리로 설정 가능합니다." data-val="true" data-val-remote-url="/Member/ValidationPassWord" data-val-remote-additionalfields="*.Password,*.Id" data-val-remote="패스워드는 영문숫자특수 조합이여야 하며 아이디를 포함할수 없습니다.">
                                        <span class="field-validation-valid" style="color: red;" data-valmsg-replace="true" data-valmsg-for="Password"></span>
                                    </dd>
                                </dl>
                                <div class="dotted-line-c9c9c9"></div>
                                <dl>
                                    <dt class="essential">
                                        <label for="Password_Conf">비밀번호확인</label></dt>
                                    <dd>
                                        <input name="Password_Conf" title="비밀번호 확인" class="input-box pwd_conf_txt" id="Password_Conf" type="password" data-val-required="패스워드 확인을 입력하세요" data-val-regex-pattern=".{8,12}" data-val-regex="영문자, 숫자, 특수문자 모두 최소 1가지 이상 조합하여 8~12자리로 설정 가능합니다." data-val="true" data-val-remote-url="/Member/ValidationPassWord2" data-val-remote-additionalfields="*.Password_Conf,*.Password" data-val-remote="패스워드확인은 영문숫자특수문자 조합이여야 하며 패스워드항목과 일치하여야 합니다.">
                                        <span class="field-validation-valid" style="color: red;" data-valmsg-replace="true" data-valmsg-for="Password_Conf"></span>
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
                                <dl>
                                    <dt class="essential dt-valign-top">
                                        <label for="email">이메일</label></dt>
                                    <dd>
										<input id="email" type="email" placeholder="sample@email.com" required name="email" />
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
       
                                <dl>
                                    <dt class="essential">
                                        <label for="phone">휴대폰번호</label></dt>
                                    <dd>
 										
										<input id="phone" type="phone" placeholder="01099991111" required name="phone" />
                                    </dd>
                                    <dd>
                                        <span class="field-validation-valid" style="color: red;" data-valmsg-replace="true" data-valmsg-for="HandPhoneCenter"></span>
                                        <span class="field-validation-valid" style="color: red;" data-valmsg-replace="true" data-valmsg-for="HandPhoneTail"></span>
                                    </dd>
                                </dl>
                                <div class="line-e2e2e2"></div>
       
                            </div>

                             <input type="submit" value="가입 완료" />
                             <%-- <div class="center-btn margin-top40"><a href="<%=request.getContextPath()%>/member.do" id="a_auth_redirect" class="button h30 w100 gray " title="가입완료"><b>가입완료</b></a></div> --%>

						
                        </fieldset>
					</form>
					        
                    
                </div>

	 			


            </div>
		</div>
	</div>
</article>
