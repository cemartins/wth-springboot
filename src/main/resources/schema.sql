drop table if exists customer;

create table customer
(
  id integer not null,
  name varchar(255) not null,
  email varchar(255) not null,
  number varchar(255) not null,
  address varchar(255) not null,
  primary key(id)
);