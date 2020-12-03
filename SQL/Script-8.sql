-- 데이터 조회 : select
-- 문법 : select 컬럼이름 from 테이블이름;

-- 1) 고객테이블에서 아이디, 이름, 등급을 조회하세요.

select scustid,scustname,scustgrd from sales_customers;

-- 2) 고객테이블에서 모든 컬럼을 조회하세요

select * from sales_customers ;

-- 3) 제품테이블에서 제조업체를 조회하세요

select sprdmaker from sales_products;

-- 4) 제품테이블에서 제품명과 가격을 조회하되 컬럼명을 한글로 바꿔 출력하세요

select sprdname as 제품명, sprdprice as '제품 단가'
from sales_products;

-- 3.산술식을 이용한 검색
-- select 사용시 산술연산자를 이용해서 조회할 수 있다.
-- select 산술식 from 테이블명;

-- 5) 제품테이블에서 제품명과 가격을 조회하되 가격에 500원을 더해 2021단가라는 별칭을 사용해 출력하세요.

select sprdname ,sprdprice ,sprdprice + 500 as '2021단가' from sales_products;

-- 5-2) 모든 회원의 적립금을 1000원씩 추가해주었을때 결과를 알아보려고 한다. 적절한 질의문을 작성하세요.

select 
scustname as 이름,
scustmileage as 마일리지,
scustmileage + 1000 as 마일리지1000점추가 
from sales_customers ;

-- 4. 조건식을 이용한 검색
-- 조건을 만족하는 데이터 만을 검색. where 라는 예약어를 이용하고 비교연산자, 논리연산자등으로 구성된 조건식 필요
-- select 컬럼명 from 테이블명 where 조건식;

-- 6) 제품테이블에서 한빛 제과가 제조한 제품의 제품명 ,재고량 ,단가를 조회하세요

select sprdname, sprdprice, invent from sales_products where sprdmaker = '한빛제과';

-- 7) 주문테이블에서 apple 이라는 고객이 15개이상 주문한 주문제품, 수량, 주문일자를 조회하세요.

select scustid ,sprdid ,ordstatus ,orddate 
from sales_orders 
where scustid = 'apple' and ordstatus >= 15;

-- 7-2) 주문테이블에서 apple이라는 고객이 주문했거나 15개 이상 주문된 주문제품, 수량, 주문일자를 조회하세요.

select scustid ,sprdid ,ordstatus ,orddate 
from sales_orders 
where scustid = 'apple' or ordstatus >= 15;

-- 8) 제품테이블에서 단가가 2000원이상이고 3000원이하인 제품의 제품명,단가, 제조업체를 조회하세요
select sprdname ,sprdprice ,sprdmaker
from sales_products
where sprdprice > 2000 and sprdprice < 3000;

-- where a between x and y
select sprdname ,sprdprice ,sprdmaker
from sales_products
where sprdprice between 2000 and 3000;

-- 5. NULL 검색
-- 해당 컬럼의 값이 NULL 인지를 조회할 때는 is NULL/is not NULL 이라는 구문을 사용해야 한다.

-- 9) 고객 테이블에서 나이가 입력되지 않은 고객을 조회하세요.
SELECT scustname 
FROM sales_customers
where scustage is NULL;































