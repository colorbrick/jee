create table member (
    name varchar2(10),   -- 회원 이름 --
    birthday varchar2(10), -- 생일 --
    birthday_radio varchar2(10), -- 생일 양력/음력 --
    gender varchar2(10) -- 성별 남성/여성 --
	user_id varchar2(20), -- 회원 아이디 --
	user_pw varchar2(20), -- 회원 비밀번호 --
	email varchar2(40), -- 회원 이메일 --
	phone varchar2(20), -- 회원 전화번호 --
	admin_id varchar2(20), -- 관리자 아이디 --
	admin_pw varchar2(20) -- 관리자 비밀번호 --
);
commit;

