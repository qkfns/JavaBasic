-- ������ ��ȸ : select
-- ���� : select �÷��̸� from ���̺��̸�;

-- 1) �����̺��� ���̵�, �̸�, ����� ��ȸ�ϼ���.

select scustid,scustname,scustgrd from sales_customers;

-- 2) �����̺��� ��� �÷��� ��ȸ�ϼ���

select * from sales_customers ;

-- 3) ��ǰ���̺��� ������ü�� ��ȸ�ϼ���

select sprdmaker from sales_products;

-- 4) ��ǰ���̺��� ��ǰ��� ������ ��ȸ�ϵ� �÷����� �ѱ۷� �ٲ� ����ϼ���

select sprdname as ��ǰ��, sprdprice as '��ǰ �ܰ�'
from sales_products;

-- 3.������� �̿��� �˻�
-- select ���� ��������ڸ� �̿��ؼ� ��ȸ�� �� �ִ�.
-- select ����� from ���̺��;

-- 5) ��ǰ���̺��� ��ǰ��� ������ ��ȸ�ϵ� ���ݿ� 500���� ���� 2021�ܰ���� ��Ī�� ����� ����ϼ���.

select sprdname ,sprdprice ,sprdprice + 500 as '2021�ܰ�' from sales_products;

-- 5-2) ��� ȸ���� �������� 1000���� �߰����־����� ����� �˾ƺ����� �Ѵ�. ������ ���ǹ��� �ۼ��ϼ���.

select 
scustname as �̸�,
scustmileage as ���ϸ���,
scustmileage + 1000 as ���ϸ���1000���߰� 
from sales_customers ;

-- 4. ���ǽ��� �̿��� �˻�
-- ������ �����ϴ� ������ ���� �˻�. where ��� ���� �̿��ϰ� �񱳿�����, �������ڵ����� ������ ���ǽ� �ʿ�
-- select �÷��� from ���̺�� where ���ǽ�;

-- 6) ��ǰ���̺��� �Ѻ� ������ ������ ��ǰ�� ��ǰ�� ,��� ,�ܰ��� ��ȸ�ϼ���

select sprdname, sprdprice, invent from sales_products where sprdmaker = '�Ѻ�����';

-- 7) �ֹ����̺��� apple �̶�� ���� 15���̻� �ֹ��� �ֹ���ǰ, ����, �ֹ����ڸ� ��ȸ�ϼ���.

select scustid ,sprdid ,ordstatus ,orddate 
from sales_orders 
where scustid = 'apple' and ordstatus >= 15;

-- 7-2) �ֹ����̺��� apple�̶�� ���� �ֹ��߰ų� 15�� �̻� �ֹ��� �ֹ���ǰ, ����, �ֹ����ڸ� ��ȸ�ϼ���.

select scustid ,sprdid ,ordstatus ,orddate 
from sales_orders 
where scustid = 'apple' or ordstatus >= 15;

-- 8) ��ǰ���̺��� �ܰ��� 2000���̻��̰� 3000�������� ��ǰ�� ��ǰ��,�ܰ�, ������ü�� ��ȸ�ϼ���
select sprdname ,sprdprice ,sprdmaker
from sales_products
where sprdprice > 2000 and sprdprice < 3000;

-- where a between x and y
select sprdname ,sprdprice ,sprdmaker
from sales_products
where sprdprice between 2000 and 3000;

-- 5. NULL �˻�
-- �ش� �÷��� ���� NULL ������ ��ȸ�� ���� is NULL/is not NULL �̶�� ������ ����ؾ� �Ѵ�.

-- 9) �� ���̺��� ���̰� �Էµ��� ���� ���� ��ȸ�ϼ���.
SELECT scustname 
FROM sales_customers
where scustage is NULL;































