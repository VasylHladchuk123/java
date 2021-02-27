create table supplier
(
    id varchar(255) not null
        constraint supplier_pkey
            primary key,
    address varchar(255),
    business_bill varchar(255),
    business_name varchar(255),
    description varchar(255),
    director varchar(255),
    number varchar(255),
    started_work_together timestamp,
    what_product_supply varchar(255)
);

alter table supplier owner to postgres;

