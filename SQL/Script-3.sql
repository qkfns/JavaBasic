CREATE table REGIONS(
	region_id 		int 			primary key,
	region_name		varchar(30)
);

CREATE table COUNTRIES(
	country_id		char(3)			primary key,
	country_name	varchar(30),
	region_id		int,
	foreign key (region_id)
	references REGIONS (region_id)
);

CREATE table LOCATIONS(
	location_id		int 			primary key,
	street_address	varchar(40),
	postal_code		varchar(30),
	city			varchar(30),
	state_province	varchar(30),
	country_id		char(3),
	foreign key (country_id)
	references COUNTRIES (country_id)
);

CREATE table DEPARTMENTS(
	department_id	int				primary key,
	department_name	varchar(50),
	manager_id		int,
	location_id		int,
	foreign key (location_id)
	references LOCATIONS (location_id)
);
CREATE table JOBS(
	job_id			varchar(20) 	primary key,
	job_title		varchar(50),
	min_salary		int,
	max_salary		int
);

CREATE table EMPLOYEES(
	employee_id 	int				primary key,
	first_name		varchar(50),
	last_name 		varchar(50),
	email			varchar(20),
	phone_number	varchar(30),
	hire_date		datetime,
	job_id			varchar(20),
	salary			int,
	commission_pct	double,
	manager_id		int,
	department_id	int,
	foreign key (manager_id)
	references EMPLOYEES (employee_id),
	foreign	key (job_id)
	references JOBS (job_id),
	foreign key (department_id)
	references DEPARTMENTS (department_id)
);

CREATE table JOB_HISTORY(
	employee_id		int,
	start_date		datetime,
	end_date		datetime,
	job_id			varchar(20),
	department_id	int,
	foreign key (employee_id)
	references EMPLOYEES (employee_id),
	foreign key (job_id)
	references JOBS (job_id), 
	foreign key (department_id)
	references DEPARTMENTS (department_id)
);
