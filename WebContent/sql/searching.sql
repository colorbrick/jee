-- 직원 ID 가 101번인 직원 검색
select *
from EMPLOYEES
where employee_id = 101;

-- 직원 ID가 101번인 직원 이름만 출력
select first_name || last_name full_name  -- ||는 컬럼 결합, full_name 컬럼명 생성
from EMPLOYEES
where employee_id = 101;

-- 성과 이름을 띄어쓰기 + 구매부(30번) 직원중 급여가 10000불 이하인 직원의 급여와 부서번호
select first_name || ' ' || last_name 이름, salary 월급, department_id 부서번호
from EMPLOYEES 
where department_id = 30
    and salary < 10000;
    
-- 구매부(30번) 직원중 입사연도가 2006년 이전이면서, 급여가 10000불 이하인 직원의 급여와 부서번호
select first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where department_id = 30 and salary < 10000 and hire_date < '06/01/01';

-- 구매부 이거나 전산부인 직원
select first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES
where department_id = 30
or department_id = 60;

-- 구매부 이면서 10000불 이하인 직원과 전산부이거나  5000불 이상인 직원
select first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where department_id = 30 and salary < 10000
or department_id = 60 and salary > 5000;

-- [범위 조건] 직원 ID 가 110 이상 120 이하인 직원들
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where employee_id between 110 and 120;

-- [범위 조건] 직원 ID 가 110 이상 120 이하가 아닌 직원들
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where employee_id not between 110 and 120;  -- not 첨부

-- 2005년 1월1일부터 2009년 12월 31일까지 입사한 직원
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where hire_date between '05/01/01' and '09/12/31';

-- 구매부 이거나 전산부 이거나 총무부인 직원들
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where department_id in(30,60,90);

-- 서브쿼리, 부서번호가 30,60,90 어디에도 속하지 않는 직원들
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where department_id not in(
    select department_id
    from DEPARTMENTS -- 부서테이블인 department 에서 검색
    where department_id in(30,60,90)
);

-- 위 서브쿼리는 아래와 같은 결과이다.
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  department_id 부서번호
from EMPLOYEES 
where department_id not in(30,60,90);

-- [like] 문법 .. 국번이 미국으로 515번인 직원
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  
department_id 부서번호, phone_number 전화번호
from EMPLOYEES
where phone_number like '515%';

-- 전화번호 중간번호가 123인 직원.. %가 양쪽으로 있는 경우
select employee_id 사원번호, first_name ||' '|| last_name 이름, salary 월급,  
department_id 부서번호, phone_number 전화번호
from EMPLOYEES
where phone_number like '%123%';

-- 도 (state_province) 가 널이 아닌 지역
select location_id 지역ID, street_address 도로명, city 도시, state_province 주
from LOCATIONS 
where state_province like '%';

-- 윗 쿼리는 아래 쿼리와 동일함
select location_id 지역ID, street_address 도로명, city 도시, state_province 주
from LOCATIONS 
where state_province is not null;

-- 도 (state_province) 가 null 값까지 포함된 전체 지역
select location_id 지역ID, street_address 도로명, city 도시, state_province 주
from LOCATIONS; 

-- 도 (state_province) 가 null인 지역
select location_id 지역ID, street_address 도로명, city 도시, state_province 주
from LOCATIONS 
where state_province is null;
