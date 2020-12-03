CREATE table REGIONS(
	region_id 		int, 			
	region_name		varchar(30)
);

CREATE table COUNTRIES(
	country_id		char(3),	
	country_name	varchar(30),
	region_id		int
);

CREATE table LOCATIONS(
	location_id		int ,			
	street_address	varchar(40),
	postal_code		varchar(30),
	city			varchar(30),
	state_province	varchar(30),
	country_id		char(3)
);

CREATE table DEPARTMENTS(
	department_id	int	,			
	department_name	varchar(50),
	manager_id		int,
	location_id		int
);
CREATE table JOBS(
	job_id			varchar(20),	
	job_title		varchar(50),
	min_salary		int,
	max_salary		int
);

CREATE table EMPLOYEES(
	employee_id 	int,		
	first_name		varchar(50),
	last_name 		varchar(50),
	email			varchar(20),
	phone_number	varchar(30),
	hire_date		datetime,
	job_id			varchar(20),
	salary			int,
	commission_pct	double,
	manager_id		int,
	department_id	int
);

CREATE table JOB_HISTORY(
	employee_id		int,
	start_date		datetime,
	end_date		datetime,
	job_id			varchar(20),
	department_id	int
);

-- 기본키 제약 조건 추가(순서 상관없음)
alter table REGIONS 
add primary key (region_id);

alter table JOBS
add constraint pk_jb
primary key (job_id);

alter table COUNTRIES 
add constraint pk_con
primary key (country_id);

alter table LOCATIONS
add constraint pk_loca
primary key (location_id);

alter table DEPARTMENTS 
add constraint pk_dept
primary key (department_id);

alter table EMPLOYEES 
add constraint pk_emp
primary key (employee_id);

-- 외래키 제약 조건 추가 (순서 중요!)
alter table COUNTRIES 
add constraint fk_cntry_rgn
foreign key (region_id)
references REGIONS (region_id);

alter table LOCATIONS 
add constraint fk_loca_cntry
foreign key (country_id)
references COUNTRIES (country_id);

alter table DEPARTMENTS 
add constraint fk_dept_loc
foreign key (location_id)
references LOCATIONS (location_id);

alter table EMPLOYEES 
add foreign key (department_id)
references DEPARTMENTS (department_id);

alter table EMPLOYEES 
add constraint fk_emp_emp
foreign key (manager_id)
references EMPLOYEES (employee_id);

alter table EMPLOYEES 
add constraint fk_emp_jb
foreign key (job_id)
references JOBS (job_id);

alter table JOB_HISTORY
add constraint fk_jbh_dept
foreign key (department_id)
references DEPARTMENTS (department_id);

alter table JOB_HISTORY
add constraint fk_jbh_emp
foreign key (employee_id)
references EMPLOYEES (employee_id);

alter table JOB_HISTORY
add constraint fk_jbh_jb
foreign key (job_id)
references JOBS (job_id);




