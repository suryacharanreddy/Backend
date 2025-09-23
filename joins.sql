create table orders(
    o_ID int,
    details varchar(32),
    amount int,
    c_ID int,
);

CREATE TABLE customers(
c_id int,
c_name VARCHAR(32) NOT null,
c_loc VARCHAR(32),
PRIMARY KEY(c_id)
);

CREATE TABLE orders(
o_id int,
details VARCHAR(32) NOT null,
amount INT NOT null,
c_id int,
status VARCHAR(32) DEFAULT 'open',
PRIMARY KEY(o_id),
FOREIGN KEY(c_id) REFERENCES customers(c_id)
);

INSERT INTO customers
VALUES
(101,'Rahul','Bangalore'),
(102,'Sonai','New Delhi'),
(103,'Priyanka','Bangalore'),
(104,'Amit','Gandhi Nagar'),
(105,'Modi','New Delhi');

INSERT INTO orders (o_id,details,amount,c_id,status)
VALUES
(10002,'Parker Pen',450,101,'Delivered'),
(10003,'Samsung s24',44450,101,'Delivered'),
(10004,'Samsung TV',23450,102,'Delivered'),
(10005,'Samsung Watch',450,102,'Pending'),
(10006,'Samsung Pad',450,102,'Delivered'),
(10007,'Nynka1',1450,103,'Delivered'),
(10008,'Nynka2',2250,103,'Delivered'),
(10009,'Nynka3',1450,103,'Delivered'),
(10010,'Rolex',2222450,103,'Delivered');

INSERT INTO orders
VALUES
(10011,'Water Bottle',199,101,'delivered'),
(10012,'Marker Pen',299,101,'delivered'),
(10013,'Lenovo Mouse',399,101,'delivered'),
(10014,'Parker Pen',499,104,'delivered'),
(10015,'OG Movie',599,104,'delivered'),
(10016,'Glass',1200,104,'delivered');


select * from orders,customers;

SELECT * FROM customers,orders
WHERE customers.c_id=orders.c_id;

SELECT * FROM customers INNER JOIN orders
ON customers.c_id=orders.c_id;