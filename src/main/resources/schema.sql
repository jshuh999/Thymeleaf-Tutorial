drop table if exists comment;
drop table if exists customer;
drop table if exists orderline;
drop table if exists orders;
drop table if exists product;
drop table if exists user;

create table comment ( id bigint not null primary key, comment_text text   null, product_id   bigint null );
create table customer ( id bigint not null primary key, name varchar(200) null, customer_since date null );
create table orderline ( order_id bigint not null, product_id bigint not null, amount int null, purchase_price decimal(20, 3) null, primary key (order_id, product_id);
create table orders ( id bigint not null primary key, order_date  date null, customer_id bigint null );
create table product ( id bigint not null primary key, name varchar(200) null, price decimal(20, 3) null, in_stock tinyint(1) null );
create table user ( id bigint not null primary key, firstname varchar(200) null, lastname varchar(200) null, nationality varchar(100) null, age int null );