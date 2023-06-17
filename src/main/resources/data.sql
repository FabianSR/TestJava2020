/*create table brand(
    brand_id varchar(30) not null primary key,
    name varchar(39));*/

insert into brand (brand_id,name) values ('1','ZARA');

/*create table product(
    product_id varchar(30) not null primary key,
    name varchar(39));*/
insert into product (product_id,name) values ('35455','item');

/*create table fare(
    price_list varchar(30) not null primary key,
    brand_id varchar(30) not null,
    product_id varchar(30) not null,
    start_date timestamp,
    end_date timestamp,
    priority int,
    price decimal,
    curr varchar(3),
    FOREIGN KEY (brand_id) REFERENCES brand (brand_id),
    FOREIGN KEY (product_id) REFERENCES product (product_id));*/

insert into fare(price_list,brand_id, product_id, start_date, end_date, priority, price, curr) values ('1','1','35455',TO_TIMESTAMP('2020-06-14-00.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_TIMESTAMP('2020-12-31-23.59.59','YYYY-MM-DD-HH24.MI.SS'),0, 35.50, 'EUR');
