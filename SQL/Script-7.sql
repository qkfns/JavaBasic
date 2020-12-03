create table sales_customers(
		scustid 		varchar(15),
		scustname		char(3),
		scustage		int				default		null,
		scustgrd		varchar(8)		default		'bronze',
		scustjob		varchar(10),
		scustmileage	int
);
alter table sales_customers
add primary key (scustid);

insert into sales_customers 
values ('apple', '����ȭ', 20,'gold','�л�',1000),('banana','�輱��',25,'vip','��ȣ��',2500),
('carrot','���',28,'gold','����',4500),('orange','����',22,'silver','�л�',0),
('melon','������',35,'gold','ȸ���',5000),('peach','������',null,'silver','�ǻ�',300),
('pear','ä����',31,'silver','ȸ���',500);

select * from sales_customers ;

create table sales_products(
		sprdid			char(3)			primary key,
		sprdname		varchar(10),
		invent			int,
		sprdprice		int,
		sprdmaker		char(4)
);

insert into sales_products value
('p01','�׳ɸ���',5000,4500,'���ѽ�ǰ'),('p02','�ſ��̸�',2500,5500,'�α�Ǫ��'),
('p03','��������',3600,2600,'�Ѻ�����'),('p04','�������ݸ�',1250,2500,'�Ѻ�����'),
('p05','��ū���',2200,1200,'���ѽ�ǰ'),('p06','����쵿',1000,1550,'�α�Ǫ��'),
('p07','���޺�Ŷ',1650,1500,'�Ѻ�����');

select * from sales_products;

create table sales_orders(
		ordno		char(3)			primary key,
		scustid		varchar(15),
		sprdid		char(3),
		ordstatus	int,
		ordadress	varchar(20),
		orddate		date,
		foreign key (scustid)
		references sales_customers (scustid),
		foreign key (sprdid)
		references sales_products (sprdid)
);

insert into sales_orders value
('o01','apple','p03',10,'����� ������','2019-01-01'),('o02','melon','p01',5,'��õ�� ��籸','2019-01-01'),
('o03','banana','p06',45,'��⵵ ��õ��','2019-01-11'),('o04','carrot','p02',8,'�λ�� ������','2019-02-01'),
('o05','melon','p06',36,'��⵵ ���ν�','2019-02-20'),('o06','banana','p01',19,'��û�ϵ� ������','2019-03-02'),
('o07','apple','p03',22,'����� ��������','2019-03-15'),('o08','pear','p02',50,'������ ��õ��','2019-04-10'),
('o09','banana','p04',15,'���󳲵� ������','2019-04-11'),('o10','carrot','p03',20,'��⵵ �Ⱦ��','2019-05-22');

select * from sales_orders;
