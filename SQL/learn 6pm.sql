CREATE TABLE employee(
eid INT,
ename VARCHAR(32),
esal FLOAT,
loc varchar(32));

INSERT INTO employee VALUES
(101, 'Rahul' ,25000,'Hyderbad'),
(102, 'Sonia' ,55000,'Hyderbad'),
(103, 'Priya' ,23000,'Banglore'),
(104, 'Rajni' ,27000,'Banglore'),
(105, 'Modi' ,14000,'Chennai'),
(106, 'Vijay' ,36000,'Chennai'),
(107, 'Vinay' ,70000,'Chennai'),
(108, 'Maddi' ,58000,'Kochi'),
(109, 'Ganesh' ,45000,'Kochi'),
(110, 'Balaji' ,85000,'Vizag');

1.SELECT* FROM employee
  WHERE ename LIKE 'R%';
  
 2.SELECT * FROM employee
   WHERE ename LIKE '%i';
   
3. SELECT * FROM employee
   WHERE ename LIKE '__j%';
   
   SELECT * FROM employee
   WHERE esal=(SELECT MAX(esal) FROM employee);


database charan

  create table customers(
  cid int primary key,
  cname varchar(32),
  email varchar(32),
  loc varchar(32) default 'India');


  alter table customers
  modify email varchar(32) unique;

  alter table customers
  modify cname varchar(32) not null;


  alter table orders
  add cid int;

  ALTER TABLE orders
  ADD CONSTRAINT fk_customer
  FOREIGN KEY (cid) REFERENCES customers(cid);


desc orders;

update orders
set o_status=case
                when o_Id=10002 then 'in-progress'
                when o_Id=10004 then 'in-progress'
                when o_Id=10005 then 'refund'
                when o_ID=10010 then 'delayed'
             end
where o_Id in (10002,10004,10005,10010);

update orders
set cid=104
where o_ID in (10019,10018,10020);

insert into customers
values
(101,'surya','surya@gmail.com','Banglore'),
(102,'charan','charan@gmail.com','Kurnool'),
(103,'venkat','venkat@gmail.com','Vizag'),
(104,'sattar','sattar@gmail.com','Guntur'),
(105,'vasthav','vasthav@gmail.com','Hyderabad');

select * from customers;

+-----+---------+-------------------+-----------+
| cid | cname   | email             | loc       |
+-----+---------+-------------------+-----------+
| 101 | surya   | surya@gmail.com   | Banglore  |
| 102 | charan  | charan@gmail.com  | Kurnool   |
| 103 | venkat  | venkat@gmail.com  | Vizag     |
| 104 | sattar  | sattar@gmail.com  | Guntur    |
| 105 | vasthav | vasthav@gmail.com | Hyderabad |
+-----+---------+-------------------+-----------+

select * from orders;

+-------+-------------+---------+-------------+------+
| o_Id  | o_Details   | o_price | o_Status    | cid  |
+-------+-------------+---------+-------------+------+
| 10001 | parker pen  |    4500 | delivered   |  101 |
| 10002 | watch       |   35000 | in-progress |  101 |
| 10003 | Smart watch |    2000 | delivered   |  102 |
| 10004 | smart TV    |  450000 | in-progress |  101 |
| 10005 | Wall Clock  |    2500 | refund      |  102 |
| 10006 | Belt        |     250 | delivered   |  102 |
| 10007 | comb        |      50 | delivered   |  102 |
| 10008 | mirror      |      70 | delivered   |  103 |
| 10009 | disco light |     220 | delivered   |  103 |
| 10010 | marker      |      45 | delayed     |  103 |
| 10011 | tablesheet  |     230 | delivered   |  105 |
| 10012 | sofa        |  450000 | delivered   |  105 |
| 10013 | bedsheet    |     340 | delivered   |  103 |
| 10014 | towel       |     249 | delivered   |  103 |
| 10015 | brush       |      44 | delivered   |  105 |
| 10016 | paste       |      74 | delivered   |  105 |
| 10017 | tooth brush |      46 | delivered   |  105 |
| 10018 | laptop      |   55000 | delivered   |  104 |
| 10019 | smart phone |   45000 | delivered   |  104 |
| 10020 | charger     |    2500 | delivered   |  104 |
+-------+-------------+---------+-------------+------+


update orders
set o_status='delayed'
where o_Id in (10004,10012,10018,10019);

update orders
set o_status='in-progress'
where o_Id in (10007,10008,10010,10015,10016,10017);


+-------+-------------+---------+-------------+------+
| o_Id  | o_Details   | o_price | o_Status    | cid  |
+-------+-------------+---------+-------------+------+
| 10001 | parker pen  |    4500 | delivered   |  101 |
| 10002 | watch       |   35000 | in-progress |  101 |
| 10003 | Smart watch |    2000 | delivered   |  102 |
| 10004 | smart TV    |  450000 | delayed     |  101 |
| 10005 | Wall Clock  |    2500 | refund      |  102 |
| 10006 | Belt        |     250 | delivered   |  102 |
| 10007 | comb        |      50 | in-progress |  102 |
| 10008 | mirror      |      70 | in-progress |  103 |
| 10009 | disco light |     220 | delivered   |  103 |
| 10010 | marker      |      45 | in-progress |  103 |  
| 10011 | tablesheet  |     230 | delivered   |  105 |
| 10012 | sofa        |  450000 | delayed     |  105 |
| 10013 | bedsheet    |     340 | delivered   |  103 |
| 10014 | towel       |     249 | delivered   |  103 |
| 10015 | brush       |      44 | in-progress |  105 |
| 10016 | paste       |      74 | in-progress |  105 |
| 10017 | tooth brush |      46 | in-progress |  105 |
| 10018 | laptop      |   55000 | delayed     |  104 |
| 10019 | smart phone |   45000 | delayed     |  104 |
| 10020 | charger     |    2500 | delivered   |  104 |
+-------+-------------+---------+-------------+------+


select * from orders
where o_status='delivered';

+-------+-------------+---------+-----------+------+
| o_Id  | o_Details   | o_price | o_Status  | cid  |
+-------+-------------+---------+-----------+------+
| 10001 | parker pen  |    4500 | delivered |  101 |
| 10003 | Smart watch |    2000 | delivered |  102 |
| 10006 | Belt        |     250 | delivered |  102 |
| 10009 | disco light |     220 | delivered |  103 |
| 10011 | tablesheet  |     230 | delivered |  105 |
| 10013 | bedsheet    |     340 | delivered |  103 |
| 10014 | towel       |     249 | delivered |  103 |
| 10020 | charger     |    2500 | delivered |  104 |
+-------+-------------+---------+-----------+------+

select * from orders
where o_status='in-progress';

+-------+-------------+---------+-------------+------+
| o_Id  | o_Details   | o_price | o_Status    | cid  |
+-------+-------------+---------+-------------+------+
| 10002 | watch       |   35000 | in-progress |  101 |
| 10007 | comb        |      50 | in-progress |  102 |
| 10008 | mirror      |      70 | in-progress |  103 |
| 10010 | marker      |      45 | in-progress |  103 |
| 10015 | brush       |      44 | in-progress |  105 |
| 10016 | paste       |      74 | in-progress |  105 |
| 10017 | tooth brush |      46 | in-progress |  105 |
+-------+-------------+---------+-------------+------+

select * from orders
where o_status='delayed';

+-------+-------------+---------+----------+------+
| o_Id  | o_Details   | o_price | o_Status | cid  |
+-------+-------------+---------+----------+------+
| 10004 | smart TV    |  450000 | delayed  |  101 |
| 10012 | sofa        |  450000 | delayed  |  105 |
| 10018 | laptop      |   55000 | delayed  |  104 |
| 10019 | smart phone |   45000 | delayed  |  104 |
+-------+-------------+---------+----------+------+

SELECT o_ID,
       IF(o_status = 'delivered', 'Completed', 'Not Completed') AS status_flag
FROM orders;
