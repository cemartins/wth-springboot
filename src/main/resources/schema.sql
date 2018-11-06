drop table if exists customer;

create table customer
(
  customer_id integer not null,
  name varchar(255) not null,
  email varchar(255) not null,
  number varchar(255) not null,
  address varchar(255) not null,
  primary key(customer_id)
);

drop table if exists account;
create table account
(
  account_id integer not null,
  balance decimal not null,
  account_number varchar(255) not null,
  card_number decimal not null,
  start_date date not null,
  end_date date,
  customer_id integer not null,
  foreign key(customer_id) references customer(customer_id),
  primary key(account_id)
);