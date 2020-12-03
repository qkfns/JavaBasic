CREATE table book(
	booknum			int,
	bookname		varchar(255),
	price			int,
	bookmaker		varchar(255)
);



-- ��������A1
-- 1) ��� ������ �̸��� ������ ��ȸ�ϼ���
select bookname, price
from book;

-- 1b) ��� ������ ����,�̸��� ��ȸ�ϼ���
select price, bookname
from book;

-- 2) ��� ������ ��ȣ, �̸�, ���ǻ�, ������ ��ȸ�ϼ���
select booknum,bookname,bookmaker,price
from book;
-- 2b) ��� ������ ������ ��ȸ�ϼ���
select * from book;

-- 3) ��� ������ ���ǻ縦 ��ȸ�ϼ���
select bookmaker
from book;
-- 3b) ��� ������ ���ǻ縦 ��ȸ�ϼ��� (�ߺ�����)

-- 4) ���� �̸�, �ֹι�ȣ�� ��ȸ�ϼ��� ��, ��°���� �ʵ���� '�̸�,�ֹι�ȣ'�� �ٲ� ���
select cust_last_name as �̸�
from CUSTOMERS;

-- 5) ���� �̸��� �ڵ�����ȣ�� ��ȸ�ϼ���
select cust_first_name, cust_last_name, phone_numbers
from CUSTOMERS;

-- 6) ������ 20000�̸��� ������ ��ȸ�ϼ���
select * 
from book 
where price < 20000;

-- 7) ������ 15000�̻� ~25000������ ������ ������ ��ȸ�ϼ���
select bookname
from book
where price BETWEEN 15000 and 25000;

-- 8) å�̸��� '�౸�� ����' �Ǵ� '�ǰ� ����'�� ������ ���ǻ縦 ��ȸ�ϼ���
select bookmaker as ���ǻ�
FROM book
where bookname = '�౸�� ����' or bookname = '�ǰ� ����';

-- 10) 


























