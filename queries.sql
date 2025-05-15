CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Email VARCHAR(100) UNIQUE,
    CreatedAt DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Products (
    ProductID INT PRIMARY KEY AUTO_INCREMENT,
    ProductName VARCHAR(100),
    Price DECIMAL(10,2),
    Stock INT,
    CreatedAt DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Orders (
    OrderID INT PRIMARY KEY AUTO_INCREMENT,
    CustomerID INT,
    OrderDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    TotalAmount DECIMAL(10,2),
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

CREATE TABLE OrderDetails (
    OrderDetailID INT PRIMARY KEY AUTO_INCREMENT,
    OrderID INT,
    ProductID INT,
    Quantity INT,
    Price DECIMAL(10,2),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INSERT INTO Customers (Name, Email) VALUES
('Alice Johnson', 'alice@example.com'),
('Bob Smith', 'bob@example.com'),
('Charlie Lee', 'charlie@example.com'),
('Diana Prince', 'diana@example.com'),
('Evan Stone', 'evan@example.com');

INSERT INTO Products (ProductName, Price, Stock) VALUES
('Laptop', 1200.00, 10),
('Smartphone', 800.00, 20),
('Headphones', 150.00, 50),
('Monitor', 300.00, 15),
('Keyboard', 75.00, 30),
('Mouse', 45.00, 40),
('USB Cable', 10.00, 100);

INSERT INTO Orders (CustomerID, TotalAmount, OrderDate) VALUES
(1, 1350.00, '2024-12-15 10:30:00'),
(2, 875.00, '2025-01-10 14:45:00'),
(3, 145.00, '2025-02-05 16:00:00'),
(1, 110.00, '2025-03-20 09:00:00'),
(4, 1200.00, '2025-04-25 18:20:00');

INSERT INTO OrderDetails (OrderID, ProductID, Quantity, Price) VALUES
(1, 1, 1, 1200.00),     -- Laptop
(1, 5, 2, 75.00),       -- Keyboard
(2, 2, 1, 800.00),      -- Smartphone
(2, 6, 1, 45.00),       -- Mouse
(3, 3, 1, 150.00),      -- Headphones
(4, 7, 2, 10.00),       -- USB Cable
(4, 6, 1, 45.00),       -- Mouse
(5, 1, 1, 1200.00);     -- Laptop

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
CRUD OPERATIONS
Q) SELECT: Retrieve the names and emails of all customers.
-> select name,email from customers;

Q)SELECT with WHERE: Get products that cost more than $100.
-> select ProductName from products where price>100;

Q)INSERT: Add a new customer named 'Alice' with email 'alice@example.com'.
-> insert into customers(name,email) values("Alice","alice@example.com");

Q)INSERT: Insert a new order with two products for an existing customer.
-> INSERT INTO orders (CustomerID, TotalAmount) VALUES (2, 950.00);
-> INSERT INTO OrderDetails (OrderDetailsID, ProductID, Quantity, Price) VALUES (new_order_id, 2, 1, 800.00),(new_order_id,3, 1, 150.00);

Q)UPDATE: Update the stock of a product after a purchase.
-> update products set stock = stock -1 where productID = 2 and stock > 0;

Q)UPDATE with condition: Change the price of all products under $50 to $55.
-> update products set price = 55 where price<50;

Q)DELETE: Remove a product from the inventory.
-> delete from products where productID = 4;

Q)DELETE with condition: Delete all orders made before January 1, 2024.
-> DELETE FROM OrderDetails WHERE OrderID IN ( SELECT OrderID FROM Orders WHERE OrderDate < '2024-01-01');
-> delete from orders where orderDate<"2024-01-01";

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
JOINS
Q)List all orders with customer names.
->  select orders.orderid, customers.name
    -> from
    -> customers
    -> INNER JOIN
    -> orders
    -> on customers.customerid = orders.customerid;

Q)Show all products ordered, including product name, quantity, and order ID.
-> select products.productname, orderdetails.quantity, orderdetails.orderid
    -> from
    -> products
    -> INNER JOIN
    -> orderDetails
    -> on products.productID = orderDetails.productId;

Q)List customers who have placed an order.
-> select distinct customers.name from customers inner join orders on customers.customerid = orders.customerid;

Q)Show customers who have never placed an order (use LEFT JOIN + IS NULL).
-> select name from (select customers.name, orders.orderID from customers Left join orders on customers.customerid = orders.customerid)t where t.orderid IS NULL;

Q)Get the total number of items per order (using JOIN and GROUP BY).
-> select orders.orderid, sum(orderdetails.quantity) as number_of_items from orders inner join orderdetails on orders.orderid = orderdetails.orderid group by orders.orderid;

Q)Retrieve the top 5 customers based on the total amount spent.
-> select customers.name from customers inner join (select customerid, sum(TotalAmount) as total_spend from orders group by customerId order by total_spend desc)t on customers.customerid = t.customerid Limit 5;

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
INDEXING
Q)Create an index on the Email column of the Customers table. Why is this useful?
->  CREATE INDEX emailIDX ON Customers (email); Creating an index on the email column improves query performance—especially when you frequently say, Search by email:

Q)Add an index to speed up searches on ProductName.
-> CREATE INDEX productNameIDX ON products (productname);

Q)Check what indexes exist on the Orders table.
-> SHOW INDEXES FROM orders;

Q)Analyze how indexing affects a query on Products where Price > 100.
->  select * from products where price> 100;
    explain select * from products where price> 100;
    CREATE INDEX priceIDX ON products (price);
    select * from products where price> 100;
    explain select * from products where price> 100;
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

TRANSACTIONS
Q)Write a transaction to:
Insert a new order.
Reduce stock for the ordered products.
Rollback if stock is insufficient.

->  start transaction;
    INSERT INTO orders(customerid, totalamount) VALUES (3, 800.00);
    SET @orderId = LAST_INSERT_ID();
    INSERT INTO orderdetails(OrderID, ProductID, Quantity, Price) VALUES (@orderId, 2, 1, 800.00);
    UPDATE products SET stock = stock - 1 WHERE productid = 2 AND stock >= 1;

    select row_count();
    if row_count() = 1 -> commit;
    if row_count() = 0 -> rollback;

Q)Demonstrate the use of START TRANSACTION, COMMIT, and ROLLBACK.
-> same as above

Q)What happens if two transactions try to update the same product stock simultaneously? Demonstrate with SELECT ... FOR UPDATE.
-> If two transactions try to update the same product row (e.g., reduce stock) at the same time, MySQL uses locks to prevent race conditions or data corruption.
By default:
    The first transaction locks the row for update.
    The second transaction must wait until the lock is released (COMMIT or ROLLBACK) before continuing.

SELECT ... FOR UPDATE:
Locks the selected rows for writing.
Prevents other transactions from reading or modifying those rows until the current transaction finishes.

DEMONSTRATION SETUP
Let’s assume productID = 2 has stock 10

cmd 1:
START TRANSACTION;

-- Lock the row
SELECT stock FROM products WHERE productID = 2 FOR UPDATE;

-- Simulate some processing delay
-- Now reduce stock
UPDATE products SET stock = stock - 1 WHERE productID = 2;

-- Do not commit yet...
-- Wait here


cmd 2:
START TRANSACTION;

-- Try to lock the same row
SELECT stock FROM products WHERE productID = 2 FOR UPDATE;
(Transaction 2 is blocked and must wait until Transaction 1 commits or rolls back.)

cmd 1:
COMMIT;

Now Transaction 2 continues — it can lock and update the row.

Why This Is Important
Using SELECT ... FOR UPDATE:
    Prevents race conditions where both transactions might try to deduct stock simultaneously.
    Ensures accurate stock handling in critical operations like order processing.


-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
STORED PROCEDURES
Q)Write a stored procedure to place a new order for a customer.
-> 
->mysql>DELIMITER &&
->mysql> CREATE PROCEDURE insert_order(
    ->     IN cId INT,
    ->     IN tAmt DECIMAL(10,2),
    ->     IN pId INT,
    ->     IN qt INT,
    ->     IN pr DECIMAL(10,2)
    -> )
    -> BEGIN
    ->     DECLARE stockChanged INT;
    ->
    ->     START TRANSACTION;
    ->
    ->     -- Insert order
    ->     INSERT INTO orders(customerid, totalamount)
    ->     VALUES (cId, tAmt);
    ->
    ->     SET @orderId = LAST_INSERT_ID();
    ->
    ->     -- Insert order detail
    ->     INSERT INTO orderdetails(OrderID, ProductID, Quantity, Price)
    ->     VALUES (@orderId, pId, qt, pr);
    ->
    ->     -- Try to update stock
    ->     UPDATE products
    ->     SET stock = stock - qt
    ->     WHERE productId = pId AND stock >= qt;
    ->
    ->     SET stockChanged = ROW_COUNT();
    ->
    ->     -- Check if update was successful
    ->     IF stockChanged = 0 THEN
    ->         ROLLBACK;
    ->     ELSE
    ->         COMMIT;
    ->     END IF;
    -> END &&
->Query OK, 0 rows affected (0.01 sec)
->mysql> DELIMITER ;
->mysql> CALL insert_order(3,800.00,2,1,800.00);



Q)Create a stored procedure that returns total spending by a given customer ID.
-> mysql->DELIMITER &&
-> mysql> CREATE PROCEDURE get_total_spend(IN cId INT, OUT amt DECIMAL(10,2))
    -> BEGIN
    -> select sum(totalAmount) INTO amt from orders where customerId=cId;
    -> END &&
-> Query OK, 0 rows affected (0.01 sec)
-> mysql> SET @total = 0;
    -> CALL get_total_spend(2, @total);
    -> &&
-> Query OK, 0 rows affected (0.00 sec)
-> Query OK, 1 row affected (0.01 sec)
-> mysql> SELECT @total;
       -> &&
+---------+
| @total  |
+---------+
| 1825.00 |
+---------+

Q)Modify the stored procedure to include a rollback if product stock is insufficient.
-> Same as first one

Q)Create a stored procedure that deletes a customer and all associated orders.

-> mysql>DELIMITER &&
-> mysql> CREATE PROCEDURE delete_customer(IN cId INT)
    -> BEGIN
    -> delete from orderdetails where orderId IN (select orderId from orders where customerId = cId);
    -> delete from orders where customerId = cId;
    -> delete from customers where customerId = cId;
    -> END &&
-> Query OK, 0 rows affected (0.01 sec)
-> mysql> CALL delete_customer(2);
       -> &&

Q)Write a stored procedure to increase prices of all products in a specific category by 10% (if a Category column exists).

-> mysql>DELIMITER &&
-> mysql> CREATE PROCEDURE increase_product_price(
    ->     IN pId INT
    -> )
    -> BEGIN
    ->     UPDATE products
    ->     SET price = price * 1.10
    ->     WHERE productID = pId;
    -> END &&
-> Query OK, 0 rows affected (0.01 sec)
-> mysql> CALL increase_product_price(2);

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------