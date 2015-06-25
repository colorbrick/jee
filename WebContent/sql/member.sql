create table member (
    name varchar2(16),   -- 회원 이름 --
    birthday varchar2(10), -- 생일 --
    birthday_radio varchar2(5), -- 생일 양력/음력 --
    gender varchar2(5) -- 성별 남성/여성 --
	user_id varchar2(12), -- 회원 아이디 --
	user_pw varchar2(20), -- 회원 비밀번호 --
	email varchar2(40), -- 회원 이메일 --
	phone varchar2(15), -- 회원 전화번호 --
	admin_id varchar2(12), -- 관리자 아이디 --
	admin_pw varchar2(20) -- 관리자 비밀번호 --
	constraint member_pk primary key(user_id)
);
commit;

