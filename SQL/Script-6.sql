-- DML
-- 데이터 삽입문 : insert
-- 문법 : 	insert into 테이블명 values (컬럼값, .....)
-- 			insert into 테이블명 (대상컬럼,  ...) values (대상컬럼값, ....)

-- memeber 테이블에 회원정보 입력
-- 회원 아이디가 abc123이고 비밀번호가 xyz987이고
-- 이름은 홍길동, 등급은 'rookie', 적립금은 50000,
-- 가입일은 '2021-12-03 12ㅣ12ㅣ12; 인 회원정보를 삽입

create table member(
	userid		varchar(18),
	passwd		varchar(18),
	name		varchar(10),
	grade		varchar(10)		default		'bronze',
	points		int				default		1000,
	regdate		timestamp	
				default		current_timestamp
);

insert into member values
('abc123', 'xyz987m', '홍길동', 'rookie', 50000, '2021-12-03 12:12:12');
-- 테이블에 값 삽입시 값의 갯수는 컬럼의 갯수와 동일해야 함

select * from member;

insert into member (userid, passwd, name, points) values ('def234', '123456', '임꺽정', 25000 );

insert into member (userid, passwd) values ('qkfns','rkspti');

insert into member values ('xyz456','123456','지현',NULL,NULL,NULL);

-- 테이블에 특정컬럼들을 대상으로 값 삽입시 values 앞에 대상 컬럼을 나열해서 값의 갯수를 일치시켜야 함

insert into member (userid, passwd, name) values ('xyz456','123456','지현');

-- 대량의 데이터를 insert 하기
-- bulk insert
-- insert into 테이블명 values (값, 값, ...), (값, 값, ...), (값, 값, ...);

