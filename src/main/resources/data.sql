insert into customer
values(10001, 'Carlos', 'carlos@email.com', '061234567890', 'Hoofdorp');
insert into customer
values(10002, 'Erwin', 'erwin@email.com', '061234567890', 'Apeldoorn');
insert into customer
values(10003, 'Kwong', 'kwong@email.com', '061234567890', 'Amsterdam');
insert into customer
values(10004, 'Samraj', 'samraj@email.com', '061234567890', 'Amsterdam');
insert into customer
values(10005, 'Ahmed', 'ahmed@email.com', '061234567890', 'Amsterdam');
insert into customer
values(10006, 'Oleg', 'oleg@email.com', '061234567890', 'Amsterdam');
insert into customer
values(10007, 'Pragya', 'pragya@email.com', '061234567890', 'Amsterdam');


insert into account (account_id, fk_customer_id, balance, account_number, card_number, start_date)
values (1, 10002, 5000, 'NL90INGB123450000', 1234, TO_DATE('17/12/2015', 'DD/MM/YYYY'));

insert into account (account_id, fk_customer_id, balance, account_number, card_number, start_date)
values (2, 10002, 5000, 'NL90INGB123452222', 1234, TO_DATE('17/12/2015', 'DD/MM/YYYY'));

insert into account (account_id, fk_customer_id, balance, account_number, card_number, start_date)
values (3, 10002, 5000, 'NL90INGB123456678', 1234, TO_DATE('17/12/2015', 'DD/MM/YYYY'));

insert into account (account_id, fk_customer_id, balance, account_number, card_number, start_date)
values (4, 10005, 5000, 'NL90INGB123459999', 1234, TO_DATE('17/12/2015', 'DD/MM/YYYY'));

insert into account (account_id, fk_customer_id, balance, account_number, card_number, start_date)
values (5, 10006, 5000, 'NL90INGB123456888', 1234, TO_DATE('17/12/2015', 'DD/MM/YYYY'));

