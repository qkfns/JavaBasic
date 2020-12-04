CREATE TABLE Books (
  bookid      INTEGER,
  bookname    VARCHAR(40),
  publisher   VARCHAR(40),
  price       INTEGER 
);

CREATE TABLE  BookMembers (
  custid      INTEGER PRIMARY KEY,  
  name        VARCHAR(40),
  address     VARCHAR(50),
  phone       VARCHAR(20)
);

CREATE TABLE BookOrders (
  orderid INTEGER,
  custid  INTEGER ,
  bookid  INTEGER ,
  saleprice INTEGER ,
  orderdate DATE
);

INSERT INTO Books VALUES
(1, '�౸�� ����', '�½�����', 7000)
,(2, '�౸�ƴ� ����', '������', 13000)
,(3, '�౸�� ����', '���ѹ̵��', 22000)
,(4, '���� ���̺�', '���ѹ̵��', 35000)
,(5, '�ǰ� ����', '�½�����', 8000)
,(6, '���� �ܰ躰���', '�½�����', 6000)
,(7, '�߱��� �߾�', '�̻�̵��', 20000)
,(8, '�߱��� ��Ź��', '�̻�̵��', 13000)
,(9, '�ø��� �̾߱�', '�Ｚ��', 7500)
,(10, 'Olympic Champions', 'Pearson', 13000);

INSERT INTO BookMembers VALUES 
(1, '������', '���� ��ü��Ÿ', '000-5000-0001')
,(2, '�迬��', '���ѹα� ����', '000-6000-0001') 
,(3, '��̶�', '���ѹα� ������', '000-7000-0001')
,(4, '�߽ż�', '�̱� Ŭ������', '000-8000-0001')
,(5, '�ڼ���', '���ѹα� ����',  NULL);

INSERT INTO BookOrders VALUES 
(1, 1, 1, 6000, STR_TO_DATE('2014-07-01','%Y-%m-%d'))
,(2, 1, 3, 21000, STR_TO_DATE('2014-07-03','%Y-%m-%d'))
,(3, 2, 5, 8000, STR_TO_DATE('2014-07-03','%Y-%m-%d'))
,(4, 3, 6, 6000, STR_TO_DATE('2014-07-04','%Y-%m-%d'))
,(5, 4, 7, 20000, STR_TO_DATE('2014-07-05','%Y-%m-%d'))
,(6, 1, 2, 12000, STR_TO_DATE('2014-07-07','%Y-%m-%d'))
,(7, 4, 8, 13000, STR_TO_DATE( '2014-07-07','%Y-%m-%d'))
,(8, 3, 10, 12000, STR_TO_DATE('2014-07-08','%Y-%m-%d'))
,(9, 2, 10, 7000, STR_TO_DATE('2014-07-09','%Y-%m-%d')) 
,(10, 3, 8, 13000, STR_TO_DATE('2014-07-10','%Y-%m-%d'));




-- ��������A1
-- 1) ��� ������ �̸��� ������ ��ȸ�ϼ���
select bookname ,price 
from Books ;

-- 1b) ��� ������ ����,�̸��� ��ȸ�ϼ���
select price, bookname
from Books;

-- 2) ��� ������ ��ȣ, �̸�, ���ǻ�, ������ ��ȸ�ϼ���
select bookid,bookname,publisher,price
from Books;
-- 2b) ��� ������ ������ ��ȸ�ϼ���
select * from Books;

-- 3) ��� ������ ���ǻ縦 ��ȸ�ϼ���
select publisher 
from Books;
-- 3b) ��� ������ ���ǻ縦 ��ȸ�ϼ��� (�ߺ�����)
select DISTINCT publisher 
from Books;
-- 4) ���� �̸�, ��ȭ��ȣ�� ��ȸ�ϼ��� ��, ��°���� �ʵ���� '�̸�,��ȭ��ȣ'�� �ٲ� ���

SELECT  name '�̸�', phone '��ȭ��ȣ'
FROM BookMembers;

-- 5) ���� �̸��� �ڵ�����ȣ�� ��ȸ�ϼ���
select name, phone 
from BookMembers;

-- 6) ������ 20000�̸��� ������ ��ȸ�ϼ���
select * 
from Books 
where price < 20000;

-- 7) ������ 15000�̻� ~25000������ ������ ������ ��ȸ�ϼ���
select bookname
from Books
where price BETWEEN 15000 and 25000;

-- 8) å�̸��� '�౸�� ����' �Ǵ� '�ǰ� ����'�� ������ ���ǻ縦 ��ȸ�ϼ���
select publisher as ���ǻ�
FROM Books
where bookname = '�౸�� ����' or bookname = '�ǰ� ����';

select bookname, publisher 
from Books
where bookname in ('�౸�� ����', '�ǰ� ����');

-- 9) '�౸'�� �����ϴ� ���� �̸��� ��ȸ�ϼ���.
select bookname
from Books
where bookname like '�౸%';

-- 9b) '�౸'�� ������ ���� �̸��� ��ȸ�ϼ���
select bookname
from Books
where bookname like '%�౸';

-- 9c) '�౸'�� �����ϴ� ���� �̸��� ��ȸ�ϼ���
select bookname
from Books
where bookname like '%�౸%';

-- 9d) �����̸� �߿� '��'�� �����ϴ� å��?

select bookname
from Books
where bookname like '%��%';

-- 10) '����'�� �����ϰ� ������ 30000�̻��� ���� �̸��� ��ȸ�ϼ���

select bookname 
from Books
where bookname like '%����%' and price >= 30000;

-- 11) ���̸��� �����ټ����� �������� �����ϰ�
-- �̸��� ������ �ּҷ� �������� �����ؼ� ��ȸ�ϼ���

select name , address 
from BookMembers
order by name asc , address desc;

-- 11b) ������ ������ ������������, 
-- ������ ������ ���ǻ��̸����� �������� �����ؼ� ��ȸ�ϼ���

select price , publisher 
from Books
order by price desc , publisher asc;

-- 12) ���� �ֹ��� ������ ��, ���, �ְ�, 
-- ���� �Ǹž��� ��ȸ�ϼ���

select sum(saleprice) '�� �Ǹž�', avg(saleprice) ���, max(saleprice) �ְ�, min(saleprice) ����
from BookOrders;

-- 13b) ���ǻ纰 ������ �� ���� ��ȸ�ϼ���

select publisher ,count(bookid) 
from Books 
group by publisher

--  14) ���ǻ纰 ������ �� ������ 2���̻��� ���ǻ� ��ȸ�ϼ���
 
select publisher , count(bookid)
from Books
group by publisher 
HAVING count(bookid)>=2;

--  14b) ������ 8000�̻��� ������ ������ ����
--  �ֹ� ������ �� ������ ���ϼ���
 
select custid, count(bookid)
from BookOrders
where saleprice >= 8000
group by custid;


--  14b) ������ 8000�̻��� ������ ������ ����
--  �ֹ� ������ �� ������ ���ϼ��� 
--  ��, ���� 2���̻� �ֹ��� ���� ������� �Ѵ�

select custid, count(bookid) 
from BookOrders bo 
where saleprice >= 8000
group by custid
having count(bookid)>=2;

--  15) �ֹ��� ����ȣ,���̸��� �ֹ��ݾ�,�ּҸ� ��ȸ�ϼ���
-- �� ���̺�� �ֹ����̺��� �����ؾ� ��ȸ ����
-- ��, �ܷ�Ű ������ �ִ� �÷��� ������� ����

--  15b) ������ ���� �ֹ��ݾ�,�ּ�,�ֹ����ڸ� ��ȸ�ϼ���
 

--  16) �ֹ��� �����̸�,�ֹ��ݾ�,�ֹ����ڸ� ��ȸ�ϼ���
 

--  19) ������ 20000�� ������ �ֹ��� �� �̸� ��ȸ�ϼ���


--  20) �ֹ��� ���̸�, �����̸�, �ֹ����� ����ϼ���



--  21) ������ �������� ���� ���� �����Ͽ�
--     ���̸��� �ֹ��� ������ �Ǹűݾ��� ��ȸ�ϼ���
	



























