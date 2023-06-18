
insert into brand (brand_id,name) values ('1','ZARA');

insert into product (product_id,name) values ('35455','item');

insert into prices(price_list,brand_id, product_id, start_date, end_date, priority, price, curr)  (
    select '1','1','35455',TO_TIMESTAMP('2020-06-14-00.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_TIMESTAMP('2020-12-31-23.59.59','YYYY-MM-DD-HH24.MI.SS'),0, 35.50, 'EUR' FROM DUAL UNION ALL
    select '2','1','35455',TO_TIMESTAMP('2020-06-14-15.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_TIMESTAMP('2020-06-14-18.30.00','YYYY-MM-DD-HH24.MI.SS'),1, 25.45, 'EUR' FROM DUAL UNION ALL
    select '3','1','35455',TO_TIMESTAMP('2020-06-15-00.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_TIMESTAMP('2020-06-15-11.00.00','YYYY-MM-DD-HH24.MI.SS'),1, 30.50, 'EUR' FROM DUAL UNION ALL
    select '4','1','35455',TO_TIMESTAMP('2020-06-15-16.00.00','YYYY-MM-DD-HH24.MI.SS'),TO_TIMESTAMP('2020-12-31-23.59.59','YYYY-MM-DD-HH24.MI.SS'),1, 38.95, 'EUR' FROM DUAL);

