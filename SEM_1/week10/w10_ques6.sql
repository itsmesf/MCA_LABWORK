--create table by specifying primary key and foreign key
CREATE TABLE branch(
branch_name VARCHAR2(20),
branch_city VARCHAR2(20),
balance REAL,
PRIMARY KEY(branch_name));

CREATE TABLE account(
accno NUMBER(10),
branch_name VARCHAR2(20),
balance REAL,
PRIMARY KEY(accno),
FOREIGN KEY (branch_name) REFERENCES branch(branch_name) ON DELETE CASCADE);

CREATE TABLE customer(
customer_name VARCHAR2(20),
customer_street VARCHAR2(20),
customer_city VARCHAR2(20),
PRIMARY KEY(customer_name));

CREATE TABLE depositor(
customer_name VARCHAR2(20),
accno NUMBER(10),
PRIMARY KEY(accno),
FOREIGN KEY(customer_name) REFERENCES customer(customer_name) ON DELETE CASCADE,
FOREIGN KEY(accno) REFERENCES account(accno) ON DELETE CASCADE);

CREATE TABLE loan(
loan_number NUMBER(15),
branch_name VARCHAR2(20),
amount REAL,
PRIMARY KEY(loan_number),
FOREIGN KEY (branch_name) REFERENCES branch(branch_name) ON DELETE CASCADE);

CREATE TABLE borrower(
customer_name VARCHAR2(20),
loan_number NUMBER(15),
PRIMARY KEY(customer_name,loan_number),
FOREIGN KEY(customer_name) REFERENCES customer(customer_name) ON DELETE CASCADE,
FOREIGN KEY(loan_number) REFERENCES loan(loan_number) ON DELETE CASCADE);

--insert record in a tables
-- Insert new records with different values

INSERT INTO branch VALUES('Axis','Mumbai',15000);
INSERT INTO branch VALUES('Bank of Baroda','Pune',25000);
INSERT INTO branch VALUES('IDFC','Bangalore',35000);
INSERT INTO branch VALUES('Yes Bank','Chennai',45000);
INSERT INTO branch VALUES('Kotak','Hyderabad',55000);

INSERT INTO account VALUES(15,'Axis',3500);
INSERT INTO account VALUES(25,'Bank of Baroda',4500);
INSERT INTO account VALUES(35,'IDFC',5500);
INSERT INTO account VALUES(45,'Yes Bank',6500);
INSERT INTO account VALUES(55,'Kotak',7500);

INSERT INTO customer VALUES('Ali','B17','Mumbai');
INSERT INTO customer VALUES('Zara','A14','Pune');
INSERT INTO customer VALUES('Omar','C20','Bangalore');
INSERT INTO customer VALUES('Fatima','D22','Chennai');
INSERT INTO customer VALUES('Ahmed','E25','Hyderabad');

INSERT INTO depositor VALUES('Ali',15);
INSERT INTO depositor VALUES('Zara',25);
INSERT INTO depositor VALUES('Omar',35);
INSERT INTO depositor VALUES('Fatima',45);
INSERT INTO depositor VALUES('Ahmed',55);

INSERT INTO loan VALUES(60,'Axis',15000);
INSERT INTO loan VALUES(70,'Bank of Baroda',25000);
INSERT INTO loan VALUES(80,'IDFC',35000);
INSERT INTO loan VALUES(90,'Yes Bank',45000);
INSERT INTO loan VALUES(100,'Kotak',55000);

INSERT INTO borrower VALUES('Ali',60);
INSERT INTO borrower VALUES('Zara',70);
INSERT INTO borrower VALUES('Omar',80);
INSERT INTO borrower VALUES('Fatima',90);
INSERT INTO borrower VALUES('Ahmed',100);

--find all customers who have at least two accounts in a main branch
SELECT customer.customer_name
             FROM account a,branch b,depositor d,customer c
             WHERE b.branch_name=a.branch_name AND
             a.accno=d.accno AND c.customer_name=d.customer_name and
             b.branch_city='Delhi'
             GROUP BY c.customer_name
             HAVING COUNT(distinct b.branch_name)=(
                SELECT COUNT(branch_name)
                FROM branch WHERE branch_city='Mumbai');
--find all the customers who have an account at all the branches located in a specific city
select customer_name
from account,depositor
where depositor.accno=account.accno and account.branch_name='Mumbai'
group by depositor.CUSTOMER_NAME
having count(depositor.customer_name)>1;

--demonstrate how you delete all accounts tuples at every branch located in a specific city
DELETE FROM account WHERE branch_name IN(SELECT branch_name FROM branch WHERE branch_city='Mumbai');
