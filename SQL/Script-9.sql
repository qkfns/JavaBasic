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
where first_name = 'M';

-- 5. �̸�(FIRST_NAME)�� �� ��° ���ڰ� 'a'�� ����� �̸�(FIRST_NAME)�� ������ ��ȸ�϶�.

-- 6. ���� ���� ������������ �����϶�.