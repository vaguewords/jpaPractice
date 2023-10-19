create user 'ohgiraffers'%' identified by 'ohgiraffers';
create database drink;
grant all privileges on drink.* to ohgiraffers@'%' with grant option;
use drink;

#drop table tbl_drink;
    create table tbl_drink (
       drink_code integer not null auto_increment,
        calorie integer,
        drink_name varchar(255),
        drink_price integer,
        fat integer,
        sugar integer,
        type_code integer,
        primary key (drink_code)
    )

#drop table tbl_type;
create table tbl_type (
       type_code integer not null auto_increment,
        type_name varchar(255),
        primary key (type_code)
    )

INSERT INTO tbl_type (type_name) VALUES('커피');
INSERT INTO tbl_type (type_name) VALUES('논커피');