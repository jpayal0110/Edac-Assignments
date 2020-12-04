create database assignment;
show databases;

/*1*/
create table Member(mem_id int(5) primary key , mem_name varchar(30), mem_address varchar(50),Acc_Open_Date Date, mem_type varchar(20),penalty_amt int(7));
create table Books1(Book_no int(6) , Book_Name varchar(30), Author_name varchar(50), Cost int(7), Category char(10));
create table Issue(Lib_id int(5) , Book_No int(6), mem_id int(5), issue_date Date, Return_date Date);
show tables;

/*2*/
desc member;
desc Books1;
desc Issue;

/*3*/
alter table Member drop column penalty_amt;
/*4, 5*/
insert into Member values(1, 'Richa Sharma', 'Pune', '2020/12/12', 'Lifetime');
insert into Member values(3, 'Garima Sen', 'Pune', curdate(), 'Annual');
insert into Member values(2, 'Arima Seth', 'Pune', '2020/11/18', 'Half Yearly');
insert into Member values(4, 'Meghna Sen', 'Thane', '2020/10/1', 'Quarterly');
insert into Member values(5, 'Sadhna Rathi', 'Nashik', '2020/6/12', 'Lifetime');
select mem_id,mem_name,mem_address as ma,date_format(Acc_Open_Date,'%d-%b-%y') as Acc_Open_Date,mem_type from member;
select * from member;

/*6*/
insert into Books1 values(101, 'Let us C', 'Denis Ritchie', 450, 'System');
insert into Books1 values(102, 'Oracle-Complete Ref', 'Loni', 550, 'Database');
insert into Books1 values(103, 'Mastering SQL', 'Loni', 250, 'Database');
insert into Books1 values(104, 'PL SQL-Ref', 'Scott Urman', 750, 'Database');
drop table Books1;
/*7*/
select * from Books1;
/*8*/
UPDATE Books1 SET Cost=300 WHERE Book_no = 103;
/*9*/
Drop table Issue;

/*10*/
create table Issue(Lib_id int(5) , Book_No int(6), mem_id int(5), issue_date Date, Return_date Date);
insert into Issue values(7001, 101, 1, '2006/12/10', null);
insert into Issue values(7002, 102, 2, '2006/10/10', null);
insert into Issue values(7003, 104, 1, '2006/1/15', null);
insert into Issue values(7004, 101, 1, '2006/4/10', null);
insert into Issue values(7005, 104, 2, '2006/11/10', null);
insert into Issue values(7006, 101, 3, '2006/10/15', null);
select Lib_id,Book_no,mem_id as ma,date_format(issue_date,'%d-%b-%y') as issue_date,Return_date from issue;

