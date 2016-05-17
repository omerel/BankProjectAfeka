BEGIN
    CREATE SCHEMA USER;

create table bank
	(
		accountID int,
		id int
	);
create table person
	( 
		id int primary key,
		 name varchar(20)
	);
	END;
create table customer
	(
		id int,
		accountId int
	);
create table banker
	(
		id int,
		type varchar(20),
		user varchar(20),
		password varchar(20)
	);
create table account
	(
		accountId int primary key,
		 balance double
	);
create table loan
	(
		loanId int primary key,
		 accountId int,
		 amount double,
		 monthPayment double,
		 interest varchar(40)
	);
create table savings
	(
		savingId int primary key,
		accountId int,
		balance double,
		ratio double
	);
create table operations
	(
		operationId int primary key,
		accountId int,
		type varchar(20),
		day date,
		amount double,
		description varchar(40)
	);