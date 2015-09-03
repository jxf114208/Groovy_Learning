create database if not exists weartherinfo;
use weartherinfo;

drop table if exists weather;

CREATE TABLE weather(
city varchar(100) not null,
temperature integer not null
);

insert into weather(city,temperature) values('Austin',48);
insert into weather(city,temperature) values('Baton Rouge',57);
insert into weather(city,temperature) values('Jackson',50);
insert into weather(city,temperature) values('Montgomery',53);
insert into weather(city,temperature) values('Phoenix',67);
insert into weather(city,temperature) values('Sacramento',66);
insert into weather(city,temperature) values('Santa Fe',27);
insert into weather(city,temperature) values('Tallahassee',59);