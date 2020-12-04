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

-- 6. 문자열 부분 검색
-- like 키워드를 이용해서 문자열을 대상으로
-- 부분적으로 일치하는 데이터를 조회할 수 있음
-- % : 0개 이상의 문자열 일치
-- _ : 1개 문자열 일치
-- '문자열%'
-- '%문자열'
-- '%문자열%'
-- '문자열_'
-- '___문자열'
-- '%문자___'
-- '%___문자' 

-- 10) 고객 테이블에서 성이 김씨인 고객의 이름, 나이, 등급, 적립금을 조회하세요

SELECT scustname ,scustage ,scustgrd ,scustmileage 
from sales_customers
where scustname like '김__';

-- 11) 고객 테이블에서 고객 아이디가 5자인 고객의 아이디, 이름, 등급을 조회하세요

SELECT scustname, scustid, scustgrd
from sales_customers
where scustid like '_____';

-- 7. 조회결과 정렬
-- order by 절을 이용하면 조회겨로가를 특정컬럼 기준으로 내림/오른차순으로 출력할 수 있음.
-- 오름차순 (1,2,3, ....) : asc
-- 내림차순 (9,8,7, ....) : desc

-- 12) 고객 테이블에서 고객이름, 등급, 나이를 조회하되 나이를 기준으로 내림차순 정렬하세요

select scustname ,scustgrd ,scustage 
from sales_customers  
order by scustage desc;

-- 13) 주문 테이블에서 수량이 10개이상 주문한 고객의 주문고객, 주문제품, 수량, 주문일자를 조회하세요 단, 주문제품을 기준으로 오름차순 정렬, 동일제품인 경우 수량을 기준으로 내림차순 정렬하세요.

select scustid ,ordno, sprdid ,ordstatus ,orddate
from sales_orders
where ordstatus >= 10
order by sprdid asc, ordstatus desc;

-- 8. 집계 조회
-- 특정컬럼을 기준으로 통계적 결과를 조회할 때 사용 
-- 통계적(집계) 함수 : 갯수(count), 합계(SUM), 평균(AVG), 최대/최소
-- 집계함수는 null 값은 제외하고 적용됨
-- 집계함수는 select 또는 having 절에 사용가능

-- 14) 제품테이블에서 모든 제품의 평균 단가를 조회하세요

SELECT avg(sprdprice) as '평균단가' 
from sales_products;

SELECT ROUND(avg(sprdprice),1) as '평균단가'   -- 반올림
from sales_products;

SELECT FLOOR(avg(sprdprice)) as '평균단가'     -- 무조건 내림
from sales_products;

SELECT ceil(avg(sprdprice)) as '평균단가'      -- 무조건 올림 
from sales_products;

-- 15) 한빛제과에서 제조한 제품의 재고량의 합계를 조회하세요

SELECT sum(invent) as '재고량 합계'
FROM sales_products sp 
where sprdmaker ='한빛제과';

-- 16) 고객 테이블에 몇명의 고객이 가입되어 있는지 조회하세요

SELECT count(scustid) as '가입회원수' 
FROM sales_customers;

-- 17) 제품테이블에서 제조업체수를 조회하세요

SELECT COUNT(DISTINCT sprdmaker) 
FROM  sales_products ;

-- 9. 그룰 별 조회
-- group by 절을 이용해서 특정 컬럼의 값이 
-- 동일한 데이터들을 모아 그룹을 만들고 조회할 수 있음
-- 단, 그룹으로 만든 상태에서 조건 검색을 하려면 having 절을 사용해야 함

-- 18) 주문테이블에서 주문제품별 수량의 합계를 조회하세요
select sprdid, count(ordno) as 주문총수량
from sales_orders 
group by sprdid;


-- 19) 제품테이블에서 제조업체별로 제조한 제품의 갯수와 제품의 가장 비싼 단가를 조회하세요. 단, 제품의갯수는 '제품수'로 비싼 단가는 '최고가'라는 별칭으로 사용해서 출력.
select sprdmaker,count(sprdid) as '제품수',max(sprdprice) as '최고가'
from sales_products 
group by sprdmaker 
order by max(sprdprice) desc; 

-- 20) 제품테이블에서 제품을 3개이상 제조한 제조업체별로 제품의 갯수와 가장 비싼 단가를 조회하세요.
select  sprdmaker ,count(sprdid) 제조제품수,max(sprdprice)
from sales_products
group by sprdmaker
having 제조제품수 >= 3;

-- 21) 고객테이블에서 적립금 평균이 1000이상인 등급에 대해 등급별 고객수와 적립금 평균을 조회하세요
select scustgrd '등급' ,count(scustid) '등급별 고객수', avg(scustmileage) '적립금 평균'
from sales_customers
group by scustgrd 
having AVG(scustmileage) >=1000;

-- 22) 주문 테이블에서 각 주문고객이 주문한 제품의 총주문수량을 주문제품별로 조회하세요
select scustid 주문고객, sprdid '주문한 제품', sum(ordstatus) 주문수량
from sales_orders 
group by scustid , sprdid;




























