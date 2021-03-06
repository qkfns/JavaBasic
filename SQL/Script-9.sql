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
where first_name like 'M%';

-- 5. 이름(FIRST_NAME)의 두 번째 글자가 'a'인 사원의 이름(FIRST_NAME)과 연봉을 조회하라.

select first_name '사원의 이름', salary 연봉
from EMPLOYEES
where first_name like '_a%';

-- 6. 도시 명을 오름차순으로 정렬하라.

select city 
from LOCATIONS
order by city asc;

-- 7. 부서 명을 내림차순 정렬하라.
 
select department_name 
from DEPARTMENTS
order by department_name desc;

-- 8. 연봉이 7000 이상인 사원들의 모든 정보를 연봉순(오름차순)으로 정렬하라.
 
select *
from EMPLOYEES
where salary >=7000
order by salary asc;
 
-- 9. 인센티브(COMMISSION_PCT)를 받지 않는 사원들의 모든 정보를 조회하라.

select *
from EMPLOYEES
where commission_pct is NULL ;
 
-- 10. 인센티브(COMMISSION_PCT)를 받는 사원들의 모든 정보를 조회하라.
 
select *
from EMPLOYEES
where commission_pct is not NULL;

-- 11. 2007년 06월 21일에 입사한 사원의 사원번호, 이름(FIRST_NAME, LAST_NAME) 그리고 부서번호를 조회하라.

select employee_id 사원번호, first_name , last_name , department_id 
from EMPLOYEES
where hire_date like '%2007-06-21%';
 
-- 12. 2006년에 입사한 사원의 사원번호와 입사일을 조회하라.
 
select employee_id 사원번호, hire_date 입사일 
from EMPLOYEES e2 
where hire_date like '%2006%';
 
-- 13. 이름(FIRST_NAME)의 길이가 5글자 이상인 사원을 조회하라.

select *
from EMPLOYEES
where first_name like '_____'

-- 14. 연봉이 5000 에서 12000의 범위 이외인 사람들의 LAST_NAME 및 연봉을 조회힌다.

select last_name , salary 
from EMPLOYEES
where salary between 5000 and 12000;

-- 15. 사원번호가 176 인 사람의 LAST_NAME 과 부서 번호를 조회한다.

select last_name , department_id '부서 번호'
from EMPLOYEES
where employee_id = 176;

-- 16. 연봉이 12000 이상되는 직원들의 LAST_NAME 및 연봉을 조회한다.

select last_name , salary 
from EMPLOYEES
where salary >= 12000;

-- 17. 1994년도에 고용된 모든 사람들의 LAST_NAME 및 고용일을 조회한다.

select last_name , hire_date 
from EMPLOYEES
where hire_date like '%1994%';

-- 18. 매니저가 없는 사람들의 LAST_NAME 및 JOB_ID 를 조회한다.

select last_name , job_id 
from EMPLOYEES
where manager_id is NULL;
 
-- 19. 커미션을 버는 모든 사원들의 LAST_NAME, 연봉 및 커미션을 조회한다.
--     단, 연봉 역순, 커미션 역순으로 정렬한다. 

select last_name ,salary , commission_pct 
from EMPLOYEES
where commission_pct is not null
order by salary asc,commission_pct asc;

-- 20. LAST_NAME 의 네번째 글자가 a 인 사원들의 LAST_NAME 을 조회한다.

select last_name 
from EMPLOYEES 
where last_name like '___a%';

-- 21. LAST_NAME 에 a 및(OR) e 글자가 있는 사원들의 LAST_NAME 을 조회한다.

select last_name 
from EMPLOYEES
where last_name like '%a%' or last_name like '%e%';

-- 22. 연봉이 2,500, 3,500, 7000 이 아니며 직업이 SA_REP 이나 ST_CLERK 인 사람들을 조회한다.

select *
from EMPLOYEES
where salary <> 2500 and salary <> 3500 and salary <> 7000 and job_id = 'SA_REP' or job_id = 'ST_CLERK';

-- 23. 회사 전체의 최대 연봉, 최소 연봉, 연봉 총 합 및 평균 연봉을 자연수로 포맷하여 조회한다.

select max(salary) '최대 연봉', min(salary) '최소 연봉', sum(salary) '연봉 총합', ROUND(AVG(salary)) '평균 연봉'
from EMPLOYEES;
 
-- 24. 각 JOB_ID 별, 최대 연봉, 최소 연봉, 연봉 총 합 및 평균 연봉을 자연수로 포맷하여 조회한다.

select job_id, max(salary)'최대 연봉' , min(salary)'최소 연봉', sum(salary) '연봉 총 합', ROUND(AVG(salary)) '평균 연봉'
from EMPLOYEES
group by job_id; 

-- 25. 동일한 직업을 가진 사원들의 총 수를 조회한다.

select job_id, count(employee_id) '직업군별 사원 총수' 
from EMPLOYEES
group by job_id;
 
-- 26. 매니저로 근무하는 사원들의 총 수를 조회한다.

select count(DISTINCT(manager_id)) '매니저로 근무하는 사원 수'
from EMPLOYEES;
 
-- 27. 사내의 최대 연봉 및 최소 연봉의 차이를 조회한다.

select (max(salary) - min(salary))
from EMPLOYEES

-- 28. 매니저의 사번 및 그 매니저 밑 사원들 중 최소 연봉을 받는 사원의 연봉을 조회한다.
--     매니저가 없는 사람들은 제외한다.
--     최소 연봉이 6000 미만인 경우는 제외한다.
--     연봉 기준 역순으로 조회한다.

select manager_id ,min(salary)
from EMPLOYEES
where salary >= 6000
group by manager_id
having manager_id is not null
order by min(salary) asc;
 
-- 29. 부서 명, 위치 ID, 각 부서 별 사원 총 수, 각 부서 별 평균 연봉을 조회한다.
--     평균 연봉은 소수점 2 자리까지만 표현한다.

select department_id , COUNT(employee_id) ,ROUND(AVG(salary),2) 
from EMPLOYEES 
group by department_id 

 
-- 30. 총 사원 수 및 2005, 2006, 2007, 2008 년도 별 고용된 사원들의 총 수를 다음과 같이 조회한다.


-- 31. 부서번호별 사원수를 조회하라. (부서번호 오름차순 정렬)
 
select department_id 부서번호, count (employee_id) '부서번호별 사원수'
from EMPLOYEES
group by department_id 
having department_id is not null
order by count (employee_id) asc;

-- 32.  각 부서별 각 직업 별 연봉 총 합 및 각 부서별 연봉 총 합을 조회한다. 

select department_id , job_id ,sum(salary) 
from EMPLOYEES
group by department_id , job_id
having department_id is not null;
