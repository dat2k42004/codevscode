-- ------------------------------------------------------------------------------------------------------
-- ------------------------------------------------------------------------------------------------------
-- -- EXERCISE 1: Viết các truy vấn theo yêu cầu, dựa trên cấu trúc CSDL như dưới đây

-- ---- Product(maker, model, type)
-- ---- PC(model, speed, ram, hd, price) 
-- ---- Laptop(model, speed, ram, hd, screen, price) 
-- ---- Printer(model, color, type, price)

-- ---  Yêu cầu sử dụng ít nhất một truy vấn con trong câu trả lời và viết các truy vấn sử dụng 2 cách khác nhau 
-- --- (e.g., sử dụng kết hợp các toán tử khác nhau EXISTS, IN, ALL, ANY).



-- CREATE TABLE Product(
-- maker VARCHAR(1), 
-- model INT PRIMARY KEY,
-- type VARCHAR(10));

-- CREATE TABLE PC(
-- model INT PRIMARY KEY,
-- speed FLOAT,
-- ram INT,
-- HD INT,
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

-- CREATE TABLE Printer(
-- model INT PRIMARY KEY,
-- color BOOLEAN,
-- type VARCHAR(10),
-- price INT,
-- FOREIGN KEY (model) REFERENCES Product(model));


-- .mode csv
-- .import D:\codevscode\sqlite\data\Product.csv Product
-- .import D:\codevscode\sqlite\data\PC.csv PC
-- .import D:\codevscode\sqlite\data\Laptop.csv Laptop
-- .import D:\codevscode\sqlite\data\Printer.csv Printer
-- .header on
-- .mode column
-- SELECT * FROM Laptop;
-- --- 1. Tìm nhãn hiệu (maker) của các PC có tốc độ ít nhất là 3.0
-- select DISTINCT A.maker
-- from Product A 
-- where EXISTS (select * from PC B where A.model = B.model and B.speed >= 3.0);


-- select DISTINCT A.maker 
-- from Product A
-- where A.model IN (select B.model from PC B where B.speed >= 3.0);


-- --- Kết quả
--       maker
--       -----
--       B    
--       E   
-- SELECT * FROM Printer;
-- --- 2. Tìm các máy in có giá cao nhất
-- select A.model
-- from Printer A
-- where A.price = (select max(B.price) from Printer B );

-- select A.model
-- from Printer A
-- where A.price >= all(select B.price from Printer B );

-- SELECT a.model
-- FROM Printer a
-- WHERE NOT EXISTS (SELECT * FROM Printer b WHERE b.price > a.price);

-- --- Kết quả
--       model
--       -----
--       3003 

-- --- 3. !Tìm các laptops có tốc độ thấp hơn tốc độ của một PC bất kỳ
-- SELECT L.model
-- FROM Laptop L
-- WHERE EXISTS (
--     SELECT 1 
--     FROM PC 
--     WHERE PC.speed > L.speed
-- );

-- SELECT model
-- FROM Laptop
-- WHERE speed < ANY (
--     SELECT speed 
--     FROM PC
-- );

-- SELECT model FROM Laptop 
-- WHERE model NOT IN (SELECT l.model FROM Laptop l WHERE l.speed >= (SELECT MAX(speed) FROM PC));


-- --- Kết quả
--       model
--       -----
--       2001 
--       2002 
--       2003 
--       2004 
--       2005 
--       2006 
--       2007 
--       2008 
--       2009 
--       2010 
 

-- --- 4. !Tìm model của các sản phẩm (PC, laptop, or printer) có giá cao nhất

-- SELECT model
-- FROM (
--     SELECT model, price FROM PC
--     UNION
--     SELECT model, price FROM Laptop
--     UNION
--     SELECT model, price FROM Printer
-- ) AS Products
-- WHERE price = (
--     SELECT MAX(price) 
--     FROM (
--         SELECT price FROM PC
--         UNION
--         SELECT price FROM Laptop
--         UNION
--         SELECT price FROM Printer
--     ) AS AllProducts
-- );


-- SELECT model
-- FROM (
--     SELECT model, price FROM PC
--     UNION
--     SELECT model, price FROM Laptop
--     UNION
--     SELECT model, price FROM Printer
-- ) AS Products
-- WHERE NOT EXISTS (
--     SELECT 1 
--     FROM (
--         SELECT price FROM PC
--         UNION
--         SELECT price FROM Laptop
--         UNION
--         SELECT price FROM Printer
--     ) AS AllProducts
--     WHERE AllProducts.price > Products.price
-- );


-- --- Kết quả
--       model
--       -----
--       2001 

-- --- 5. !Tìm nhãn hiệu (maker) của các máy in màu với giá thấp nhất

-- SELECT maker
-- FROM Product
-- WHERE model IN (
--     SELECT model 
--     FROM Printer 
--     WHERE color = TRUE 
--     AND price = (
--         SELECT MIN(price) 
--         FROM Printer 
--         WHERE color = TRUE
--     )
-- );

-- SELECT P.maker
-- FROM Product P
-- WHERE EXISTS (
--     SELECT 1 
--     FROM Printer PR 
--     WHERE PR.model = P.model 
--     AND PR.color = TRUE 
--     AND PR.price = (
--         SELECT MIN(price) 
--         FROM Printer 
--         WHERE color = TRUE
--     )
-- );


-- --- Kết quả
--       maker
--       -----
--       E    

-- --- 6. !!Tìm nhãn hiệu (maker) của các PC với bộ xử lý có tốc độ cao nhất trong các PC có dung lượng RAM thấp nhất
-- SELECT maker
-- FROM Product
-- WHERE model IN (
--     SELECT model 
--     FROM PC
--     WHERE speed = (
--         SELECT MAX(speed) 
--         FROM PC 
--         WHERE ram = (
--             SELECT MIN(ram) 
--             FROM PC
--         )
--     )
-- )
-- GROUP BY P.maker;

-- SELECT P.maker
-- FROM Product P
-- WHERE EXISTS (
--     SELECT 1 
--     FROM PC 
--     WHERE PC.model = P.model 
--     AND PC.speed = (
--         SELECT MAX(speed) 
--         FROM PC 
--         WHERE ram = (
--             SELECT MIN(ram) 
--             FROM PC
--         )
--     )
-- )
-- GROUP BY P.maker;




-- --- Kết quả
--       maker
--       -----
--       B    


-- -- EXERCISE 2: Viết các truy vấn theo yêu cầu, dựa trên cấu trúc CSDL như dưới đây

-- ---- Classes(class, type, country, numGuns, bore, displacement) 
-- ---- Ships(name, class, launched)
-- ---- Battles(name, date)
-- ---- Outcomes(ship, battle, result)
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
-- .import CLasses.csv Classes
-- .import Ships.csv Ships
-- .import Battles.csv Battles
-- .import Outcomes.csv Outcomes

-- .header on
-- .mode column


-- ---  Yêu cầu sử dụng ít nhất một truy vấn con trong câu trả lời và viết các truy vấn sử dụng 2 cách khác nhau 
-- --- (e.g., sử dụng kết hợp các toán tử khác nhau EXISTS, IN, ALL, ANY).

-- --- 1. Tìm những nước sở hữu các tàu có số lượng súng nhiều nhất.

-- SELECT country
-- FROM Classes
-- WHERE numGuns = (
--     SELECT MAX(numGuns) 
--     FROM Classes
-- );

-- SELECT C.country
-- FROM Classes C
-- WHERE EXISTS (
--     SELECT 1 
--     FROM Classes C2
--     WHERE C.numGuns = C2.numGuns 
--     AND C2.numGuns = (
--         SELECT MAX(numGuns) 
--         FROM Classes
--     )
-- );

-- country
-- -------
-- USA


-- --- 2. !Tìm các lớp tàu mà có ít nhất một tàu của lớp đó bị chìm trong một trận chiến.

-- SELECT class
-- FROM Classes
-- WHERE class IN (
--     SELECT S.class 
--     FROM Ships S
--     WHERE S.name IN (
--         SELECT O.ship
--         FROM Outcomes O
--         WHERE O.result = 'sunk'
--     )
-- );

-- SELECT C.class
-- FROM Classes C
-- WHERE EXISTS (
--     SELECT 1 
--     FROM Ships S
--     WHERE S.class = C.class 
--     AND EXISTS (
--         SELECT 1 
--         FROM Outcomes O
--         WHERE O.ship = S.name 
--         AND O.result = 'sunk'
--     )
-- );

-- class
-- -----
-- Kongo
-- --- 3. Tìm tên các tàu có bore là 16-inch.
-- SELECT S.name
-- FROM Ships S
-- WHERE S.class IN (
--     SELECT C.class 
--     FROM Classes C
--     WHERE C.bore = 16
-- );

-- SELECT S.name
-- FROM Ships S
-- JOIN Classes C ON S.class = C.class
-- WHERE C.bore = 16;

-- name
-- --------------
-- Iowa
-- Missouri
-- New Jersey
-- North Carolina
-- Washington
-- Wisconsin

-- --- 4. Tìm các trận chiến có tàu của lớp Kongo tham gia

-- SELECT B.name
-- FROM Battles B
-- WHERE B.name IN (
--     SELECT O.battle 
--     FROM Outcomes O
--     WHERE O.ship IN (
--         SELECT S.name 
--         FROM Ships S 
--         WHERE S.class = 'Kongo'
--     )
-- );

-- SELECT B.name
-- FROM Battles B
-- WHERE EXISTS (
--     SELECT 1 
--     FROM Outcomes O
--     WHERE O.battle = B.name 
--     AND EXISTS (
--         SELECT 1 
--         FROM Ships S
--         WHERE S.name = O.ship 
--         AND S.class = 'Kongo'
--     )
-- );

-- name
-- -----------
-- Guadalcanal

-- --- 5. !!Tìm tên của các tàu có số súng là lớn nhất trong số các tàu có cùng bore

-- SELECT S.name
-- FROM Ships S
-- WHERE S.class IN (
--     SELECT C.class 
--     FROM Classes C
--     WHERE C.numGuns = (
--         SELECT MAX(C2.numGuns) 
--         FROM Classes C2 
--         WHERE C2.bore = C.bore
--     )
-- );

-- SELECT S.name
-- FROM Ships S
-- WHERE EXISTS (
--     SELECT 1 
--     FROM Classes C
--     WHERE S.class = C.class 
--     AND C.numGuns = (
--         SELECT MAX(C2.numGuns) 
--         FROM Classes C2
--         WHERE C2.bore = C.bore
--     )
-- );


-- name
-- ---------------
-- California
-- Iowa
-- Missouri
-- Musashi
-- New Jersey
-- North Carolina
-- Ramillies
-- Resolution
-- Revenge
-- Royal Oak
-- Royal Sovereign
-- Tennessee
-- Washington
-- Wisconsin
-- Yamato



