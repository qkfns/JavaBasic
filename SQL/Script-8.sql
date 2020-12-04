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

-- 6. ���ڿ� �κ� �˻�
-- like Ű���带 �̿��ؼ� ���ڿ��� �������
-- �κ������� ��ġ�ϴ� �����͸� ��ȸ�� �� ����
-- % : 0�� �̻��� ���ڿ� ��ġ
-- _ : 1�� ���ڿ� ��ġ
-- '���ڿ�%'
-- '%���ڿ�'
-- '%���ڿ�%'
-- '���ڿ�_'
-- '___���ڿ�'
-- '%����___'
-- '%___����' 

-- 10) �� ���̺��� ���� �达�� ���� �̸�, ����, ���, �������� ��ȸ�ϼ���

SELECT scustname ,scustage ,scustgrd ,scustmileage 
from sales_customers
where scustname like '��__';

-- 11) �� ���̺��� �� ���̵� 5���� ���� ���̵�, �̸�, ����� ��ȸ�ϼ���

SELECT scustname, scustid, scustgrd
from sales_customers
where scustid like '_____';

-- 7. ��ȸ��� ����
-- order by ���� �̿��ϸ� ��ȸ�ܷΰ��� Ư���÷� �������� ����/������������ ����� �� ����.
-- �������� (1,2,3, ....) : asc
-- �������� (9,8,7, ....) : desc

-- 12) �� ���̺��� ���̸�, ���, ���̸� ��ȸ�ϵ� ���̸� �������� �������� �����ϼ���

select scustname ,scustgrd ,scustage 
from sales_customers  
order by scustage desc;

-- 13) �ֹ� ���̺��� ������ 10���̻� �ֹ��� ���� �ֹ���, �ֹ���ǰ, ����, �ֹ����ڸ� ��ȸ�ϼ��� ��, �ֹ���ǰ�� �������� �������� ����, ������ǰ�� ��� ������ �������� �������� �����ϼ���.

select scustid ,ordno, sprdid ,ordstatus ,orddate
from sales_orders
where ordstatus >= 10
order by sprdid asc, ordstatus desc;

-- 8. ���� ��ȸ
-- Ư���÷��� �������� ����� ����� ��ȸ�� �� ��� 
-- �����(����) �Լ� : ����(count), �հ�(SUM), ���(AVG), �ִ�/�ּ�
-- �����Լ��� null ���� �����ϰ� �����
-- �����Լ��� select �Ǵ� having ���� ��밡��

-- 14) ��ǰ���̺��� ��� ��ǰ�� ��� �ܰ��� ��ȸ�ϼ���

SELECT avg(sprdprice) as '��մܰ�' 
from sales_products;

SELECT ROUND(avg(sprdprice),1) as '��մܰ�'   -- �ݿø�
from sales_products;

SELECT FLOOR(avg(sprdprice)) as '��մܰ�'     -- ������ ����
from sales_products;

SELECT ceil(avg(sprdprice)) as '��մܰ�'      -- ������ �ø� 
from sales_products;

-- 15) �Ѻ��������� ������ ��ǰ�� ����� �հ踦 ��ȸ�ϼ���

SELECT sum(invent) as '��� �հ�'
FROM sales_products sp 
where sprdmaker ='�Ѻ�����';

-- 16) �� ���̺� ����� ���� ���ԵǾ� �ִ��� ��ȸ�ϼ���

SELECT count(scustid) as '����ȸ����' 
FROM sales_customers;

-- 17) ��ǰ���̺��� ������ü���� ��ȸ�ϼ���

SELECT COUNT(DISTINCT sprdmaker) 
FROM  sales_products ;

-- 9. �׷� �� ��ȸ
-- group by ���� �̿��ؼ� Ư�� �÷��� ���� 
-- ������ �����͵��� ��� �׷��� ����� ��ȸ�� �� ����
-- ��, �׷����� ���� ���¿��� ���� �˻��� �Ϸ��� having ���� ����ؾ� ��

-- 18) �ֹ����̺��� �ֹ���ǰ�� ������ �հ踦 ��ȸ�ϼ���
select sprdid, count(ordno) as �ֹ��Ѽ���
from sales_orders 
group by sprdid;


-- 19) ��ǰ���̺��� ������ü���� ������ ��ǰ�� ������ ��ǰ�� ���� ��� �ܰ��� ��ȸ�ϼ���. ��, ��ǰ�ǰ����� '��ǰ��'�� ��� �ܰ��� '�ְ�'��� ��Ī���� ����ؼ� ���.
select sprdmaker,count(sprdid) as '��ǰ��',max(sprdprice) as '�ְ�'
from sales_products 
group by sprdmaker 
order by max(sprdprice) desc; 

-- 20) ��ǰ���̺��� ��ǰ�� 3���̻� ������ ������ü���� ��ǰ�� ������ ���� ��� �ܰ��� ��ȸ�ϼ���.
select  sprdmaker ,count(sprdid) ������ǰ��,max(sprdprice)
from sales_products
group by sprdmaker
having ������ǰ�� >= 3;

-- 21) �����̺��� ������ ����� 1000�̻��� ��޿� ���� ��޺� ������ ������ ����� ��ȸ�ϼ���
select scustgrd '���' ,count(scustid) '��޺� ����', avg(scustmileage) '������ ���'
from sales_customers
group by scustgrd 
having AVG(scustmileage) >=1000;

-- 22) �ֹ� ���̺��� �� �ֹ����� �ֹ��� ��ǰ�� ���ֹ������� �ֹ���ǰ���� ��ȸ�ϼ���
select scustid �ֹ���, sprdid '�ֹ��� ��ǰ', sum(ordstatus) �ֹ�����
from sales_orders 
group by scustid , sprdid;




























