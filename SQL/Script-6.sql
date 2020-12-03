-- DML
-- ������ ���Թ� : insert
-- ���� : 	insert into ���̺�� values (�÷���, .....)
-- 			insert into ���̺�� (����÷�,  ...) values (����÷���, ....)

-- memeber ���̺� ȸ������ �Է�
-- ȸ�� ���̵� abc123�̰� ��й�ȣ�� xyz987�̰�
-- �̸��� ȫ�浿, ����� 'rookie', �������� 50000,
-- �������� '2021-12-03 12��12��12; �� ȸ�������� ����

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
('abc123', 'xyz987m', 'ȫ�浿', 'rookie', 50000, '2021-12-03 12:12:12');
-- ���̺� �� ���Խ� ���� ������ �÷��� ������ �����ؾ� ��

select * from member;

insert into member (userid, passwd, name, points) values ('def234', '123456', '�Ӳ���', 25000 );

insert into member (userid, passwd) values ('qkfns','rkspti');

insert into member values ('xyz456','123456','����',NULL,NULL,NULL);

-- ���̺� Ư���÷����� ������� �� ���Խ� values �տ� ��� �÷��� �����ؼ� ���� ������ ��ġ���Ѿ� ��

insert into member (userid, passwd, name) values ('xyz456','123456','����');

-- �뷮�� �����͸� insert �ϱ�
-- bulk insert
-- insert into ���̺�� values (��, ��, ...), (��, ��, ...), (��, ��, ...);

