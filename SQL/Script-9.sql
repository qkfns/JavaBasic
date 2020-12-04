-- ��������B1
-- 1. ��� ����� �̸� (FIRST_NAME, LAST_NAME)�� ��ȸ�϶�.
select first_name , last_name 
from EMPLOYEES;

-- 2. ��� ����� ��� ������ ��ȸ�϶�.
select * from EMPLOYEES;

-- 3. ��� ���ø��� ��ȸ�϶�.
select city
from LOCATIONS;

-- 4. �̸�(FIRST_NAME)�� M���� �����ϴ� ����� ��� ������ ��ȸ�϶�.
select *
from EMPLOYEES
where first_name like 'M%';

-- 5. �̸�(FIRST_NAME)�� �� ��° ���ڰ� 'a'�� ����� �̸�(FIRST_NAME)�� ������ ��ȸ�϶�.

select first_name '����� �̸�', salary ����
from EMPLOYEES
where first_name like '_a%';

-- 6. ���� ���� ������������ �����϶�.

select city 
from LOCATIONS
order by city asc;

-- 7. �μ� ���� �������� �����϶�.
 
select department_name 
from DEPARTMENTS
order by department_name desc;

-- 8. ������ 7000 �̻��� ������� ��� ������ ������(��������)���� �����϶�.
 
select *
from EMPLOYEES
where salary >=7000
order by salary asc;
 
-- 9. �μ�Ƽ��(COMMISSION_PCT)�� ���� �ʴ� ������� ��� ������ ��ȸ�϶�.

select *
from EMPLOYEES
where commission_pct is NULL ;
 
-- 10. �μ�Ƽ��(COMMISSION_PCT)�� �޴� ������� ��� ������ ��ȸ�϶�.
 
select *
from EMPLOYEES
where commission_pct is not NULL;

-- 11. 2007�� 06�� 21�Ͽ� �Ի��� ����� �����ȣ, �̸�(FIRST_NAME, LAST_NAME) �׸��� �μ���ȣ�� ��ȸ�϶�.

select employee_id �����ȣ, first_name , last_name , department_id 
from EMPLOYEES
where hire_date like '%2007-06-21%';
 
-- 12. 2006�⿡ �Ի��� ����� �����ȣ�� �Ի����� ��ȸ�϶�.
 
select employee_id �����ȣ, hire_date �Ի��� 
from EMPLOYEES e2 
where hire_date like '%2006%';
 
-- 13. �̸�(FIRST_NAME)�� ���̰� 5���� �̻��� ����� ��ȸ�϶�.

select *
from EMPLOYEES
where first_name like '_____'

-- 14. ������ 5000 ���� 12000�� ���� �̿��� ������� LAST_NAME �� ������ ��ȸ����.

select last_name , salary 
from EMPLOYEES
where salary between 5000 and 12000;

-- 15. �����ȣ�� 176 �� ����� LAST_NAME �� �μ� ��ȣ�� ��ȸ�Ѵ�.

select last_name , department_id '�μ� ��ȣ'
from EMPLOYEES
where employee_id = 176;

-- 16. ������ 12000 �̻�Ǵ� �������� LAST_NAME �� ������ ��ȸ�Ѵ�.

select last_name , salary 
from EMPLOYEES
where salary >= 12000;

-- 17. 1994�⵵�� ���� ��� ������� LAST_NAME �� ������� ��ȸ�Ѵ�.

select last_name , hire_date 
from EMPLOYEES
where hire_date like '%1994%';

-- 18. �Ŵ����� ���� ������� LAST_NAME �� JOB_ID �� ��ȸ�Ѵ�.

select last_name , job_id 
from EMPLOYEES
where manager_id is NULL;
 
-- 19. Ŀ�̼��� ���� ��� ������� LAST_NAME, ���� �� Ŀ�̼��� ��ȸ�Ѵ�.
--     ��, ���� ����, Ŀ�̼� �������� �����Ѵ�. 

select last_name ,salary , commission_pct 
from EMPLOYEES
where commission_pct is not null
order by salary asc,commission_pct asc;

-- 20. LAST_NAME �� �׹�° ���ڰ� a �� ������� LAST_NAME �� ��ȸ�Ѵ�.

select last_name 
from EMPLOYEES 
where last_name like '___a%';

-- 21. LAST_NAME �� a ��(OR) e ���ڰ� �ִ� ������� LAST_NAME �� ��ȸ�Ѵ�.

select last_name 
from EMPLOYEES
where last_name like '%a%' or last_name like '%e%';

-- 22. ������ 2,500, 3,500, 7000 �� �ƴϸ� ������ SA_REP �̳� ST_CLERK �� ������� ��ȸ�Ѵ�.

select *
from EMPLOYEES
where salary <> 2500 and salary <> 3500 and salary <> 7000 and job_id = 'SA_REP' or job_id = 'ST_CLERK';

-- 23. ȸ�� ��ü�� �ִ� ����, �ּ� ����, ���� �� �� �� ��� ������ �ڿ����� �����Ͽ� ��ȸ�Ѵ�.

select max(salary) '�ִ� ����', min(salary) '�ּ� ����', sum(salary) '���� ����', ROUND(AVG(salary)) '��� ����'
from EMPLOYEES;
 
-- 24. �� JOB_ID ��, �ִ� ����, �ּ� ����, ���� �� �� �� ��� ������ �ڿ����� �����Ͽ� ��ȸ�Ѵ�.

select job_id, max(salary)'�ִ� ����' , min(salary)'�ּ� ����', sum(salary) '���� �� ��', ROUND(AVG(salary)) '��� ����'
from EMPLOYEES
group by job_id; 

-- 25. ������ ������ ���� ������� �� ���� ��ȸ�Ѵ�.

select job_id, count(employee_id) '�������� ��� �Ѽ�' 
from EMPLOYEES
group by job_id;
 
-- 26. �Ŵ����� �ٹ��ϴ� ������� �� ���� ��ȸ�Ѵ�.

select count(DISTINCT(manager_id)) '�Ŵ����� �ٹ��ϴ� ��� ��'
from EMPLOYEES;
 
-- 27. �系�� �ִ� ���� �� �ּ� ������ ���̸� ��ȸ�Ѵ�.

select (max(salary) - min(salary))
from EMPLOYEES

-- 28. �Ŵ����� ��� �� �� �Ŵ��� �� ����� �� �ּ� ������ �޴� ����� ������ ��ȸ�Ѵ�.
--     �Ŵ����� ���� ������� �����Ѵ�.
--     �ּ� ������ 6000 �̸��� ���� �����Ѵ�.
--     ���� ���� �������� ��ȸ�Ѵ�.

select manager_id ,min(salary)
from EMPLOYEES
where salary >= 6000
group by manager_id
having manager_id is not null
order by min(salary) asc;
 
-- 29. �μ� ��, ��ġ ID, �� �μ� �� ��� �� ��, �� �μ� �� ��� ������ ��ȸ�Ѵ�.
--     ��� ������ �Ҽ��� 2 �ڸ������� ǥ���Ѵ�.

select department_id , COUNT(employee_id) ,ROUND(AVG(salary),2) 
from EMPLOYEES 
group by department_id 

 
-- 30. �� ��� �� �� 2005, 2006, 2007, 2008 �⵵ �� ���� ������� �� ���� ������ ���� ��ȸ�Ѵ�.


-- 31. �μ���ȣ�� ������� ��ȸ�϶�. (�μ���ȣ �������� ����)
 
select department_id �μ���ȣ, count (employee_id) '�μ���ȣ�� �����'
from EMPLOYEES
group by department_id 
having department_id is not null
order by count (employee_id) asc;

-- 32.  �� �μ��� �� ���� �� ���� �� �� �� �� �μ��� ���� �� ���� ��ȸ�Ѵ�. 

select department_id , job_id ,sum(salary) 
from EMPLOYEES
group by department_id , job_id
having department_id is not null;
