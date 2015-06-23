-- DDL 테이블 생성
create table member2(
    name varchar2(10) not null,  -- 회원 이름
	user_id varchar2(20), -- primary key, -- 간편하게 추가하는데 비추
	user_pw varchar2(20), -- unique, -- 회원 비밀번호
	email varchar2(40), -- 회원 이메일
	addressid varchar2(10),
	constraint member_pk primary key(user_id),
	constraint member_fk_address foreign key(addressid) references ADDRESS(addressid)
);
create table ADDRESS(
	addressid varchar2(10)
	constraint address_pk primary key(addressid)
);
commit;

-- DDL 테이블 삭제
drop table member; commit;

-- DML 데이터 삽입(1)
insert into member(name, user_id, user_pw, email)
values('허성조', 'colorbrick', 'colorbrick', 'colorbrick@naver.com');commit;

-- DML 데이터 삽입(2)
insert into member
values('허성조', 'colorbrick2', 'colorbrick2', 'colorbrick2@naver.com');commit;

-- DML 데이터 삽입(3) .. null 인 값이 있을 경우
insert into member(name, user_id, user_pw)
values('허성조', 'colorbrick', 'colorbrick');commit;

-- DML 데이터 조회
select * from member;

-- DML 데이터 조회 (where 절 사용 )
select * from member 
where user_id = 'colorbrick';

-- DML 두가지 조건을 가지고 검색
select * from member
where name = '임현우' and email = 'jang@naver.com';

select * from member
where name = '임현우' or email = 'jang@naver.com';

-- DML null값 검색
select * from member
where email is null;

-- DML null이 아닐경우
select * from member
where email is not null;

-- DML 조건검색 like
select * from member
where name like '허%';

select * from member
where email like '%naver%';

-- DML 정렬
select * from member
where email like '%naver%';
order by email asc;  -- ㄱ.ㄴ.ㄷ.. 오름차순

select * from member
where email like '%naver%';
order by email desc;  -- ㅎ.ㅌ.ㅋ.. 내림차순

-- DML 중복 정렬
select * from member
order by name asc, memberid asc

-- DML 내장된 함수
select count(*) from member;
-- count() 은 인스턴스(row)의 수량을 출력함.
-- 그런데 파라미터 자리에 * count(*) 이 오면
-- 전체 갯수를 리턴

-- DML 데이터 수정
update member
set name = '허허허'
where user_id = 'colorbrick2' and email is not null;

update member
set email = 'jii@naver.com', user_id = 'eunji', user_pw = 'eunji'
where user_id = 'kim' and user_pw is not null;

-- 테이블 삭제 drop 이고, 데이터 삭제 delete (ex.회원탈퇴) 입니다.
-- 차이는 클래스를 제거하든지 인스턴스를 제거하는지 차이

delete from member
where user_id = 'colorbrick2'; 
commit;

-- DDL 테이블 수정
-- 컬럼을 추가하는 구분
alter table member
add age number;
commit;

-- 컬럼을 삭제하는 구문
alter table member
drop column age;
commit;

-- 컬럼의 유형을 변경
alter table member
modify age varchar2(10);
commit;

-- 컬럼 출력
desc member;

-- primary key 추가하기
alter table member2
add constraint member2_pk primary key(user_id);
commit;

-- pk 삭제
alter table member2
drop primary key;

-- pk 조회
select table_name, constraint_name, constraint_type 
from user_constraints
where table_name = 'MEMBER';  -- 주의!! 대문자



 


