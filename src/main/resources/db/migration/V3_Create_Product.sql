create table product
(
    id bigint not null
        constraint product_pkey
            primary key,
    count_of_availability integer,
    description varchar(255),
    name varchar(255),
    price numeric(19,2),
    supplier_id varchar(255)
        constraint fk2kxvbr72tmtscjvyp9yqb12by
            references supplier
);

alter table product owner to postgres;

