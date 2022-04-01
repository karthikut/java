create table train_Details(
train_no INT (20),
name VARCHAR(50) NOT NULL,
noOfClass INT DEFAULT 3,
ticketPrice FLOAT (20),
start_place VARCHAR(50),
Destination_place VARCHAR(50),
start_datetime DATETIME UNIQUE,
destination_datetime DATETIME UNIQUE,
type VARCHAR(30) 
);

INSERT INTO train_Details VALUE(
45322,'chennamma EXPRESS',3,50.00,'dwd','banglore','2022-03-14 02:30:00','2022-03-15 11:00:00','EXPRESS'),
(65223,'shatabdi passenger',4,40.00,'HUBLI','kolluru','2022-03-14 01:30:00','2022-03-15 08:00:00','passenger'),
(14524,'siddaganga passenger',5,30.00,'belgaum','tumkur','2022-03-15 04:30:00','2022-03-16 09:00:00','passenger'),
(54321,'HUBLI EXPRESS',4,30.00,'HUBLI','BANGLORE','2022-03-13 01:30:00','2022-03-16 10:00:00','EXPRESS')
(15425,'bangalore EXPRESS',6,60.00,'haveri','BANGLORE','2022-03-16 05:30:00','2022-03-17 10:30:00','EXPRESS');


use train;

select *FROM train_Details;

select *FROM train_Details where noofclass>=4;
select *FROM train_Details where noofclass<=4;

select *FROM train_Details where ticketprice>=40.00;

select *FROM train_Details where ticketprice<=40.00;


select *FROM train_Details where start_place='HUBLI';

select *FROM train_Details where destination_place='banglore';

select *FROM train_Details where start_place='HUBLI' and destination_place ='banglore';

select *FROM train_Details where start_place='HUBLI' or destination_place ='banglore';

select *FROM train_Details where start_place='banglore' or destination_place ='kolluru';

select *FROM train_Details;

select *FROM train_Details where start_place='hubli' or destination_place ='kolluru' or destination_place ='banglore';

select *FROM train_Details where start_place in ('belgaum','haveri','dwd');

select *FROM train_Details where start_datetime between '2022-03-14 12:30:00' and '2022-03-16 20:30:00';

select *FROM train_Details where destination_datetime between '2022-03-15 12:30:00' and '2022-03-17 20:30:00';

select *FROM train_Details where ticketprice between 30 and 50;

select *FROM train_Details where ticketprice between 20 and 40;

select *FROM train_Details where ticketprice between 10 and 30;

select *FROM train_Details where noofclass between 3 and 5;

select *FROM train_Details where noofclass between 4 and 5;

select *FROM train_Details where traintype='express';

select *FROM train_Details where traintype='passenger';

select train_no,name from train_details where type='express';

select  train_no,name,traintype  from train_details  where traintype='express';

select distinct start_place  from train_details;
select distinct destination_place  from train_details;
select distinct noofclass from train_details;
select distinct ticketPrice   from train_details;

select start_place  from train_details;  

select distinct destination_place  from train_details; 

select destination_place  from train_details; 

select  *from train_details  order by ticketprice;
select  *from train_details  order by name;

select  *from train_details  where  ticketprice>=40 order by  ticketprice;

select  *from train_details  where  noofclass>=4 order by  ticketprice;

select  *from train_details  where  noofclass<4 order by  ticketprice;

select  *from train_details   order by  name;

select  *from train_details   order by  name desc;

select  *from train_details  where  noofclass>4 order by  name;

select  *from train_details limit 2;

select  *from train_details order by train_no desc limit 5;

use train;

select  *from train_details;

INSERT INTO train_Details VALUE(
46332,'chennamma EXPRESS',7,50.00,'dwd','tumkur','2022-03-18 04:30:00','2022-03-19 01:00:00','EXPRESS'),
(61523,'shatabdi passenger',7,80.00,'HUBLI','sirsi','2022-03-24 06:30:00','2022-03-25 11:00:00','passenger'),
(145452,'vasco passenger',6,15.00,'belgaum','goa','2022-03-11 01:30:00','2022-03-12 09:00:00','passenger');

select  *from train_details;

alter table train_details modify column type varchar(30);

alter table train_details modify column start_place varchar(30);

describe train_details;

alter table train_details modify column ticketPrice double;

alter table train_details modify column ticketPrice double not null;

alter table train_details rename column type to traintype;

alter table train_details add column compartment int after name;

alter table train_details drop column compartment;

INSERT INTO train_Details VALUE(
42332,'chennamma EXPRESS',7,90.00,'','','2022-03-19 06:30:00','2022-03-19 09:00:00','EXPRESS'),
(61523,'shatabdi passenger',6,60.00,'','','2022-03-26 06:30:00','2022-03-27 11:00:00','passenger');

select *from train_details;

update train_details set start_place='goa' where train_no='42332';

update train_details set destination_place='panaji' where train_no='42332';

update train_details set ticketPrice=95 where train_no='42332';

update train_details set ticketPrice=50 where train_no='42332';

update train_details set ticketPrice=50.00 where noOfClass=7;

use train;

select *from train_details;

select *from train_details where name like '%express';
select *from train_details where name like '%nger';
select *from train_details where name like 'bang%';
select *from train_details where name like 'hub%';
select *from train_details where  train_no like '%21';
select *from train_details where  train_no like '%523';
select *from train_details where  train_no like '61%';
select *from train_details where  name like 'h_%';
select *from train_details where  name like 'ba__a%';
alter table train_details rename column  traintype to type;

INSERT INTO train_Details (train_no,name,noOfClass,ticketPrice,type)VALUE(
12332,'delhi EXPRESS',2,45.00,'EXPRESS'),
(21523,'chigari passenger',3,20.00,'passenger');

select *from train_details where start_place is  null;
select *from train_details where start_place is not null;

select max(ticketPrice) from train_details;
select min(ticketPrice) from train_details;
select max(ticketPrice)as high_ticketPrice from train_details;
select min(ticketPrice)as low_ticketPrice from train_details;
select avg(ticketPrice) from train_details;
select avg(ticketPrice)as average_ticketPrice from train_details;
select sum(ticketPrice)as total_ticketPrice from train_details;

select count(train_no)as noof_trains from train_details;

select count(train_no)as noof_trains from train_details where start_place  = 'HUBLI';

select *from train_details;

select count(*)as noof_trains from train_details;

select count(distinct name)as noof_trains from train_details;

select curdate()as present_date;

select current_time() as present_time;

select now() as present_datetime;

update train_details set start_datetime =now() where train_no='12332';

use train;
select *from train_details;

select DATE(Start_datetime) from train_details where start_place='hubli';

select DATE(destination_datetime) from train_details where start_place='hubli'; 

select count (train_no) as nooftrains from train_details where start_place='dwd' ;

select count(train_no) as no_of_trains,start_place from train_details group by start_place;

select count(train_no) as no_of_trains,month(start_datetime) 
as start_month from train_details group by start_month;

select count(train_no)as no_of_trains,date(start_datetime)
as start_day from train_details group by start_day;

select count (train_no) as no_of_trains, start_place 
from train_details group by start_place;

select count (train_no) as no_of_trains,name as names_of
from train_details group by (names_of);

select max(ticketprice) as higher_ticket_price,
date(start_datetime) as start_date from train_details;

select max(ticketprice) as higher_ticket_price,
day(start_datetime) as start_date from train_details group by start_date;

select max(ticketprice) as higher_ticket_price,
destination_place from train_details group by destination_place;

select min(ticketprice) as lower_ticket_price,
destination_place from train_details group by destination_place;

select max(ticketprice) as higher_ticket_price,min(ticketprice) as lower_ticket_price
,name from train_details group by name;


select max(noofclass) as higher_noofclass,min(noofclass) as lower_noofclass
,name from train_details group by name;


select sum(ticketprice) as total_ticket_price
,name from train_details group by name;

select sum(ticketprice) as total_ticket_price
,year(start_datetime)as start_year from train_details group by start_year;

select avg(ticketprice) as total_ticket_price
,year(start_datetime)as start_year from train_details group by start_year;

select avg(ticketprice) as total_ticket_price
,name from train_details where name like  'h%' group by name;

select sum(ticketprice) as total_ticket_price
,year(start_datetime)as start_year from train_details group by start_year;

use train;

select sum(ticketprice) as total_ticket_price
,day(start_datetime)as start_day
 from train_details group by start_day;
 
 
select sum(ticketprice) as total_ticket_price
,day(start_datetime)as start_day
 from train_details group by start_day>15;
 
 
select avg(ticketprice) as total_ticket_price
,day(start_datetime)as start_day
 from train_details group by start_day;
 
 
select max(noofclass) as higher_noofclass,min(noofclass) as lower_noofclass
,name from train_details group by name having higher_noofclass>4;

use train;

select *from train_details where ticketprice=(select max(ticketprice)from train_details);

select max(ticketprice) as second_highestticketprice from 
train_details where ticketprice<80;

select max(ticketprice) as third_highestticketprice from 
train_details where ticketprice<65;

select *from train_details where ticketprice=(select max(ticketprice) as second_highestticketprice from 
train_details where ticketprice<(select max(ticketprice)from train_details));

select max(ticketprice) as third_highestticketprice from 
train_details where ticketprice<(select max(ticketprice)from 
train_details where ticketprice<(select max(ticketprice)from train_details));

select *from train_details where ticketprice=(select max(ticketprice)from train_details
 where ticketprice<(select max(ticketprice)from train_details
 where ticketprice<(select max(ticketprice)from train_details)));
 
 select *from train_details where ticketprice=(select min(ticketprice)from train_details);
 
 select *from train_details where ticketprice in((select max(ticketprice) from train_details),
 (select min(ticketprice) from train_details));

select *from train_details where ticketprice = 80 or ticketprice= 15;

select *from train_details where ticketprice in  (80,15);

select *from train_details where noofclass in 
(( select max(noofclass) from train_details group by start_place
having max(noofclass)>6));

select user();

select user,host from mysql.user;


























