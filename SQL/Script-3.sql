CREATE table REGIONS(
	region_id 		int 			primary key,
	region_name		varchar(19)
);

CREATE table COUNTRIES(
	country_id		char(3)			primary key,
	country_name	varchar(21),
	region_id		int,
	foreign key (region_id)
	references REGIONS (region_id)
);

CREATE table LOCATIONS(
	location_id		int 			primary key,
	street_address	varchar(40),
	postal_code		varchar(15),
	city			varchar(20),
	state_province	varchar(20),
	country_id		char(2),
	foreign key (country_id)
	references COUNTRIES (country_id)
);

CREATE table DEPARTMENTS(
	department_id	int				primary key,
	department_name	varchar(30),
	manager_id		int,
	location_id		int,
	foreign key (location_id)
	references LOCATIONS (location_id)
);
CREATE table JOBS(
	job_id			varchar(10) 	primary key,
	job_title		varchar(30),
	min_salary		int,
	max_salary		int
);

CREATE table EMPLOYEES(
	employee_id 	int				primary key,
	first_name		varchar(20),
	last_name 		varchar(20),
	email			varchar(10),
	phone_number	varchar(20),
	hire_date		datetime,
	job_id			varchar(11),
	salary			int,
	commission_pct	double,
	manager_id		int,
	department_id	int,
	foreign	key (job_id)
	references JOBS (job_id),
	foreign key (department_id)
	references DEPARTMENTS (department_id)
);

CREATE table JOB_HISTORY(
	employee_id		int,
	start_date		datetime,
	end_date		datetime,
	job_id			varchar(10),
	department_id	int,
	foreign key (employee_id)
	references EMPLOYEES (employee_id),
	foreign key (job_id)
	references JOBS (job_id), 
	foreign key (department_id)
	references DEPARTMENTS (department_id)
);