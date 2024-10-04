-- EXERCISE 1: Viết các truy vấn theo yêu cầu, dựa trên cấu trúc CSDL như dưới đây

---- Product(maker, model, type)
---- PC(model, speed, ram, hd, price) 
---- Laptop(model, speed, ram, hd, screen, price) 
---- Printer(model, color, type, price)

---  Yêu cầu sử dụng ít nhất một truy vấn con trong câu trả lời và viết các truy vấn sử dụng 2 cách khác nhau 
--- (e.g., sử dụng kết hợp các toán tử khác nhau EXISTS, IN, ALL, ANY).


-- CREATE TABLE Product (
-- maker VARCHAR(1),
-- model INT PRIMARY KEY,
-- type VARCHAR(10));

-- CREATE TABLE PC(
-- model INT PRIMARY KEY,
-- speed FLOAT,
-- ram INT,
-- hd INT,
-- price INT,
-- FOREIGN KEY (model) REFERENCES Product(model));

-- CREATE TABLE Laptop(
-- model INT PRIMARY KEY,
-- speed FLOAT,
-- ram INT,
-- hd INT,
-- screen FLOAT,
-- price INT,
-- FOREIGN KEY (model) REFERENCES Product(model));


-- CREATE TABLE Printer (
-- model INT PRIMARY KEY,
-- color BOOLEAN,
-- type VARCHAR(10),
-- price INT,
-- FOREIGN KEY (model) REFERENCES Product(model));


-- .mode csv
-- .import C:\\code\\SQLITE\\Product.csv Product
-- .import C:\\code\\SQLITE\\PC.csv PC
-- .import C:\\code\\SQLITE\\Laptop.csv Laptop
-- .import C:\\code\\SQLITE\\Printer.csv Printer


-- .mode COLUMN
-- .header ON

-- SELECT * FROM Product;


--- 1. Tìm nhãn hiệu (maker) của các PC có tốc độ ít nhất là 3.0 

-- SELECT DISTINCT maker 
-- FROM Product
-- WHERE model IN (SELECT model from PC WHERE speed >= 3.0);

-- SELECT DISTINCT maker
-- FROM Product
-- WHERE EXISTS (SELECT * FROM PC WHERE Product.model = PC.model AND PC.speed >= 3.0); 


--- 2. Tìm các máy in có giá cao nhất

-- SELECT model 
-- FROM Printer 
-- WHERE price in (SELECT MAX(price) FROM Printer);

-- SELECT A.model
-- FROM Printer A
-- WHERE NOT EXISTS (SELECT * FROM Printer B WHERE B.price > A.price);


--- 3. !Tìm các laptops có tốc độ thấp hơn tốc độ của một PC bất kỳ

-- SELECT model 
-- FROM Laptop 
-- WHERE EXISTS (SELECT * FROM PC WHERE PC.speed > Laptop.speed);

-- SELECT DISTINCT L.model
-- FROM Laptop L
-- WHERE L.speed < (SELECT P.speed FROM PC P);

--- 4. !Tìm model của các sản phẩm (PC, laptop, or printer) có giá cao nhất

-- SELECT model 
-- FROM (
-- SELECT model, price FROM PC
-- UNION 
-- SELECT model, price FROM Laptop
-- UNION 
-- SELECT model, price FROM Printer
-- ) AS Products
-- WHERE price = (SELECT max(price) 
-- FROM (SELECT price FROM PC
-- UNION SELECT price FROM Laptop
-- UNION SELECT price FROM Printer) AS AllProducts);


-- SELECT model
-- FROM (
--     SELECT model, price FROM PC
--     UNION 
--     SELECT model, price FROM Laptop
--     UNION 
--     SELECT model, price FROM Printer
-- ) AS Products
-- WHERE NOT EXISTS (
--     SELECT *
--     FROM (
--         SELECT price FROM PC
--         UNION 
--         SELECT price FROM Laptop 
--         UNION 
--         SELECT price FROM Printer
--         ) AS AllProduct 
--     WHERE AllProduct.price > Products.price);


--- 5. !Tìm nhãn hiệu (maker) của các máy in màu với giá thấp nhất

-- SELECT maker 
-- FROM Product
-- WHERE model IN
--     (SELECT model 
--     FROM Printer
--     WHERE color = 'true' AND
--         price = (SELECT min(price) FROM Printer WHERE color = 'true') );

-- SELECT maker
-- FROM Product
-- WHERE EXISTS (SELECT * FROM Printer WHERE Product.model = Printer.model 
--                     AND Printer.color = 'true'
--                     AND Printer.price = (SELECT min(price) FROM Printer WHERE color = 'true'));

--- 6. !!Tìm nhãn hiệu (maker) của các PC với bộ xử lý có tốc độ cao nhất trong các PC có dung lượng RAM thấp nhất

-- SELECT DISTINCT maker 
-- FROM Product
-- WHERE model IN (SELECT model FROM PC WHERE speed = (SELECT max(speed) FROM PC WHERE 
--                                                     ram = (SELECT min(ram) FROM PC)));


-- SELECT DISTINCT maker
-- FROM Product
-- WHERE EXISTS (SELECT * FROM PC WHERE Product.model = PC.model AND
--                 PC.speed = (SELECT max(speed) FROM PC WHERE 
--                                 ram = (SELECT min(ram) FROM PC)));






-- EXERCISE 2: Viết các truy vấn theo yêu cầu, dựa trên cấu trúc CSDL như dưới đây

---- Classes(class, type, country, numGuns, bore, displacement) 
---- Ships(name, class, launched)
---- Battles(name, date)
---- Outcomes(ship, battle, result)


-- create table Classes(
--     class VARCHAR(10) PRIMARY KEY,
--     type VARCHAR(2),
--     country VARCHAR(15),
--     numGuns INT,
--     bore INT,
--     displacement INT 
-- );

-- create table Ships(
--     name VARCHAR(15) PRIMARY KEY,
--     class VARCHAR(10) REFERENCES Classes(class),
--     launched INT
-- );

-- create table Battles(
--     name VARCHAR(15) PRIMARY KEY,
--     DATE VARCHAR(15)
-- );

-- create table Outcomes(
--     ship VARCHAR(15) REFERENCES Ships(name),
--     battle VARCHAR(15) REFERENCES Battles(name),
--     result VARCHAR(10)
-- );

-- .mode csv
-- .import C:\\code\\SQLITE\\CLasses.csv Classes
-- .import C:\\code\\SQLITE\\Ships.csv Ships
-- .import C:\\code\\SQLITE\\Battles.csv Battles
-- .import C:\\code\\SQLITE\\Outcomes.csv Outcomes

-- .header on
-- .mode column

-- SELECT * FROM Classes;

--- 1. Tìm những nước sở hữu các tàu có số lượng súng nhiều nhất.


-- SELECT country 
-- FROM Classes
-- WHERE numGuns = (SELECT max(numGuns) FROM Classes);

-- SELECT C.country 
-- FROM Classes C
-- WHERE EXISTS (SELECT * FROM Classes C1 WHERE C.class = C1.class and C1.numGuns = (SELECT max(numGuns) FROM Classes));



--- 2. !Tìm các lớp tàu mà có ít nhất một tàu của lớp đó bị chìm trong một trận chiến.

-- SELECT class
-- FROM Classes
-- WHERE class IN (SELECT S.class
--                 FROM Ships S
--                 WHERE S.name IN (SELECT O.ship
--                                 FROM Outcomes O
--                                 WHERE O.result = 'sunk'));


-- SELECT C.class 
-- FROM Classes C
-- WHERE EXISTS (SELECT * FROM Ships S WHERE C.class = S.class AND EXISTS (SELECT *
--                                                                             FROM Outcomes O 
--                                                                             WHERE O.ship = S.name AND O.result = 'sunk'));


--- 3. Tìm tên các tàu có bore là 16-inch.

-- SELECT S.name
-- FROM Ships S
-- WHERE S.class IN (SELECT C.class 
--                     FROM Classes C
--                     WHERE C.bore = 16);

-- SELECT S.name
-- FROM Ships S
-- WHERE EXISTS (SELECT 1 FROM Classes C WHERE C.class = S.class AND C.bore = 16);

--- 4. Tìm các trận chiến có tàu của lớp Kongo tham gia

-- SELECT B.name
-- FROM Battles B
-- WHERE B.name IN (SELECT O.battle FROM Outcomes O WHERE O.ship IN 
--                 (SELECT S.name FROM Ships S WHERE S.class = 'Kongo'));


-- SELECT B.name
-- FROM Battles B
-- WHERE EXISTS (SELECT * FROM Outcomes O WHERE O.battle = B.name AND EXISTS
--              (SELECT * FROM Ships S WHERE S.name = O.ship AND S.class = 'Kongo'));         


--- 5. !!Tìm tên của các tàu có số súng là lớn nhất trong số các tàu có cùng bore

-- SELECT S.name
-- FROM Ships S
-- WHERE S.class in (SELECT C.class FROM Classes C WHERE C.numGuns = (SELECT max(C1.numGuns) FROM Classes C1 WHERE C.bore = C1.bore));  
                                                                


-- SELECT S.name
-- FROM Ships S
-- WHERE EXISTS (
--     SELECT * 
--     FROM Classes C
--     WHERE S.class = C.class 
--     AND C.numGuns = (
--         SELECT MAX(C2.numGuns) 
--         FROM Classes C2
--         WHERE C2.bore = C.bore
--     )
-- );


