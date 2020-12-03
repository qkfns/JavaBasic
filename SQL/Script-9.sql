-- 연습문제B1
-- 1. 모든 사원의 이름 (FIRST_NAME, LAST_NAME)을 조회하라.
select first_name , last_name 
from EMPLOYEES;

-- 2. 모든 사원의 모든 정보를 조회하라.
select * from EMPLOYEES;

-- 3. 모든 도시명을 조회하라.
select city
from LOCATIONS;

-- 4. 이름(FIRST_NAME)이 M으로 시작하는 사원의 모든 정보를 조회하라.
select *
from EMPLOYEES
where first_name = 'M';

-- 5. 이름(FIRST_NAME)의 두 번째 글자가 'a'인 사원의 이름(FIRST_NAME)과 연봉을 조회하라.

-- 6. 도시 명을 오름차순으로 정렬하라.