create table CUSTOMERS(
	customer_id			int,
	cust_first_name		varchar(255),
	cust_last_name		varchar(255),
	cust_address		varchar(255),
	phone_numbers		varchar(255),
	nls_language		varchar(255),
	nls_territory		varchar(255),
	credit_limit		int,
	cust_email			varchar(100),
	account_mgr_id		int,
	cust_geo_location	varchar(255),
	date_of_birth		datetime,
	marital_status		varchar(255),
	gender				varchar(100),
	income_level		varchar(255)
);

create table ORDERS(
	order_id			int,
	order_date			datetime,
	order_mode			varchar(255),
	customer_id			int,
	order_status		int,
	order_total			double,
	promotion_id		varchar(255),
	sales_rep_id		int
);
create table ORDER_ITEMS(
	order_id			int,
	line_item_id		int,
	product_id			int,
	unit_price			double,
	quantity			int
);

create table PRODUCT_INFORMATION(
	product_id			int,
	product_name		varchar(255),
	product_description	varchar(255),
	category_id			int,
	weight_class		int,
	warranty_period		varchar(255),
	supplier_id			int,
	product_status		varchar(255),
	list_price			int,
	min_price			int,
	catalog_url			varchar(255)
);

create table PRODUCT_DESCRIPTIONS(
	product_id			int,
	language_id			varchar(255),
	translated_name		varchar(255),
	translated_description	varchar(255)
);

create table INVENTORIES(
	product_id			int,
	warehouse_id		int,
	quantity_on_hand	int
);

CREATE table WAREHOUSES(
	warehouse_id		int,
	warehouse_spec		varchar(255),
	warehouse_name		varchar(255),
	location_id			varchar(255),
	wh_geo_location		varchar(255)
);

alter table CUSTOMERS 
add constraint pk_custid primary key (customer_id);

alter table ORDERS
add constraint pk_ordid	primary key (order_id);

alter table PRODUCT_INFORMATION 
add constraint pk_prodid primary key (product_id);

alter table WAREHOUSES 
add constraint pk_wareid primary key (warehouse_id);

alter table CUSTOMERS 
add constraint fk_acmgrid
foreign key (account_mgr_id)
references EMPLOYEES (employee_id);

alter table ORDERS 
add constraint fK_orderid
foreign key (customer_id)
references CUSTOMERS (customer_id);

alter table ORDERS
add constraint fk_ordersales
foreign key (sales_rep_id)
references EMPLOYEES (employee_id);

alter table ORDER_ITEMS
add constraint fk_ordit_ord
foreign key (order_id)
references ORDERS (order_id);

alter table ORDER_ITEMS 
add constraint fk_ordit_prdinfo
foreign key (product_id)
references PRODUCT_INFORMATION (product_id);

alter table PRODUCT_DESCRIPTIONS 
add constraint fk_prddesc_prdinfo
foreign key (product_id)
references PRODUCT_INFORMATION (product_id);

alter table INVENTORIES 
add constraint fk_invtr_prdinfo
foreign key (product_id)
references PRODUCT_INFORMATION (product_id);

alter table INVENTORIES 
add constraint fk_invtr_whs
foreign key (warehouse_id)
references WAREHOUSES (warehouse_id);

