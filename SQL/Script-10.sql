CREATE table book(
	booknum			int,
	bookname		varchar(255),
	price			int,
	bookmaker		varchar(255)
);



-- 연습문제A1
-- 1) 모든 도서의 이름과 가격을 조회하세요
select bookname, price
from book;

-- 1b) 모든 도서의 가격,이름을 조회하세요
select price, bookname
from book;

-- 2) 모든 도서의 번호, 이름, 출판사, 가격을 조회하세요
select booknum,bookname,bookmaker,price
from book;
-- 2b) 모든 도서의 정보를 조회하세요
select * from book;

-- 3) 모든 도서의 출판사를 조회하세요
select bookmaker
from book;
-- 3b) 모든 도서의 출판사를 조회하세요 (중복제거)

-- 4) 고객의 이름, 주민번호를 조회하세요 단, 출력결과의 필드명을 '이름,주민번호'로 바꿔 출력
select cust_last_name as 이름
from CUSTOMERS;

-- 5) 고객의 이름과 핸드폰번호를 조회하세요
select cust_first_name, cust_last_name, phone_numbers
from CUSTOMERS;

-- 6) 가격이 20000미만인 도서를 조회하세요
select * 
from book 
where price < 20000;

-- 7) 가격이 15000이상 ~25000이하인 도서의 제목을 조회하세요
select bookname
from book
where price BETWEEN 15000 and 25000;

-- 8) 책이름이 '축구의 역사' 또는 '피겨 교본'인 도서의 출판사를 조회하세요
select bookmaker as 출판사
FROM book
where bookname = '축구의 역사' or bookname = '피겨 교본';

-- 10) 


























