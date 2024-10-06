--create tables

create table person( 
    driver_id varchar2(5) not null primary key, 
    name varchar2(50) not null, 
    address varchar2(250) not null 
);

create table car( 
    regno varchar2(5) not null primary key, 
    model varchar2(50) not null, 
    year number(4) not null 
);

create table accident( 
    report_number number(5) not null primary key, 
    accd_date date not null, 
    location varchar2(50) not null 
);

create table owns( 
    driver_id varchar2(5) not null, 
    regno varchar2(5) not null, 
    foreign key(driver_id) references person(driver_id), 
    foreign key(regno) references car(regno)  
);

create table participated( 
    driver_id varchar2(5) not null, 
    regno varchar2(5) not null, 
    report_number number(5)not null, 
    damage_amount number(7) not null, 
    foreign key(driver_id) references person(driver_id), 
    foreign key(regno) references car(regno), 
    foreign key(report_number) references accident(report_number)  
);

--Insert data into tables

insert into person(driver_id, name, address) values ('D0001' , 'John', 'Aligarh');
insert into person(driver_id, name, address) values ('D0002','David','Bulandshahr');
insert into person(driver_id, name, address) values ('D0003','Ahsan','Delhi');
insert into person(driver_id, name, address) values ('D0004','Sahil' , 'Aligarh');
insert into person(driver_id, name, address) values ('D0005', 'Mujtaba', 'Agra');

insert into car values('R0001', 'Ford', '2008');
insert into car values('R0002', 'Suzuki', '2005');
insert into car values('R0003', 'Mercedes', '2006');
insert into car values('R0004', 'Ford', '2007');
insert into car values('R0005', 'Hyundai', '2004');

insert into accident values(10,'11 nov 2008','Aligarh');
insert into accident values(11,'09 december 2009','Aligarh');
insert into accident values(12,'15 january 2008','Lucknow');
insert into accident values(13,'27 may 2007','Delhi');
insert into accident values(14,'11 nov 2008','Agra');

insert into owns values('D0001', 'R0001');
insert into owns values('D0002', 'R0002');
insert into owns values('D0003', 'R0003');
insert into owns values('D0004', 'R0004');
insert into owns values('D0005', 'R0005');

insert into participated values('D0001', 'R0001', 10, 30000);
insert into participated values('D0002', 'R0002', 11, 25000);
insert into participated values('D0003', 'R0003', 12, 10600);
insert into participated values('D0004', 'R0004', 13, 12900);
insert into participated values('D0005', 'R0005', 14, 9000);


--update the damage amount for specific accident

update participated
set damage_amount = 25000
where report_number = 12 and regno = 'R0003;

-- add new accident to database
    
insert into accident values(15,'13 oct 2008','Agra');
insert into participated values('D0001','R0001',15,12000);

--find total number of unique people who owned cars involved in accidents in 2008
    
select count(distinct O.driver_id) as no_of_people from owns O
join participated P on O.regno = p. regno
join accident A on P.report_number = A.report_number
where accd_date like '%08';

--number of accidents for specific car model

    select count(distinct P.report_number) as total_accidents
from participated P
join car C on P.regno = C.regno
where C.model = 'Hyundai';

