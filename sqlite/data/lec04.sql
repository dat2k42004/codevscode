--- EXERCISE 1: Viết các truy vấn SQL theo các yêu cầu, với cấu trúc CSDL cho bên dưới

- Product(maker,model, type)
- PC(model, speed, ram, hd, price) 
- Laptop(model, speed, ram, hd, screen, price) 
- Printer(model, color, type, price)

CREATE TABLE Product(
maker VARCHAR(1), 
model INT PRIMARY KEY,
type VARCHAR(10));

CREATE TABLE PC(
model INT PRIMARY KEY,
speed FLOAT,
ram INT,
HD INT,
price INT,
FOREIGN KEY (model) REFERENCES Product(model));

CREATE TABLE Laptop(
model INT PRIMARY KEY,
speed FLOAT,
ram INT,
hd INT,
screen FLOAT,
price INT,
FOREIGN KEY (model) REFERENCES Product(model));

CREATE TABLE Printer(
model INT PRIMARY KEY,
color BOOLEAN,
type VARCHAR(10),
price INT,
FOREIGN KEY (model) REFERENCES Product(model));


.mode csv
.import Product.csv Product
.import PC.csv PC
.import Laptop.csv Laptop
.import Printer.csv Printer
.header on
.mode column

--- a) Tìm tốc độ trung bình của các PC.

select avg(speed) 
from PC;
-- +--------------------+
-- | avg(speed)         |
-- +--------------------+
-- | 2.4846153809474063 |
-- +--------------------+
--- b) Tìm tốc độ trung bình của các Laptop có giá > 1000$
select avg(speed)
from Laptop 
where price > 1000;

-- +--------------------+
-- | avg(speed)         |
-- +--------------------+
-- | 1.9983333547910054 |
-- +--------------------+
--- c) Tìm giá trung bình của các PC được sản xuất bới nhà sản xuất (manufacturer) "A"

select avg(PC.price)
from PC join Product on PC.model = Product.model
where Product.maker = 'A';
-- +---------------+
-- | avg(PC.price) |
-- +---------------+
-- |     1195.6667 |
-- +---------------+
--- ! d) Tìm giá trung bình của các PC và Laptop được sản xuất bới nhà sản xuất (manufacturer) "D"

select avg(PL.price)
from (
    select PC.price 
    from PC join Product 
    on PC.model = Product.model
    where Product.maker = 'D'

    union all

    select Laptop.price 
    from Laptop join Product 
    on Laptop.model = Product.model
    where Product.maker = 'D') as PL;

-- +---------------+
-- | avg(PL.price) |
-- +---------------+
-- |      710.0000 |
-- +---------------+

--- e) Tìm giá trung bình của PC theo từng tốc độ
select speed, avg(price)
from PC
group by speed;
-- +-------+------------+
-- | speed | avg(price) |
-- +-------+------------+
-- |  2.66 |  2114.0000 |
-- |   2.1 |   995.0000 |
-- |  1.42 |   478.0000 |
-- |   2.8 |   689.3333 |
-- |   3.2 |   839.5000 |
-- |   2.2 |   640.0000 |
-- |     2 |   650.0000 |
-- |  1.86 |   959.0000 |
-- |  3.06 |   529.0000 |
-- +-------+------------+
--- ! f) Tìm kích thước màn hình trung bình của laptop theo từng nhà sản xuất (manufacturer)
select maker, avg(Laptop.screen)
from Product join Laptop on Product.model = Laptop.model
group by maker;
-- +-------+--------------------+
-- | maker | avg(Laptop.screen) |
-- +-------+--------------------+
-- | A     | 15.233333269755045 |
-- | B     | 13.300000190734863 |
-- | E     |               17.5 |
-- | F     |              14.75 |
-- | G     | 15.399999618530273 |
-- +-------+--------------------+

--- ! g) Tìm các nhà sản xuất (manufacturers) có sản xuất ra ít nhất 3 mẫu PC

select maker 
from Product
where type = 'pc'
group by maker
having count(*) >= 3;


-- +-------+
-- | maker |
-- +-------+
-- | A     |
-- | B     |
-- | D     |
-- | E     |
-- +-------+
--- ! h) Với mỗi nhà sản xuất có sản xuất (manufacturer) PC, tìm giá PC cao nhất của nhà sản xuất đó

select maker, max(price)
from Product join PC on Product.model = PC.model
group by maker;


-- +-------+------------+
-- | maker | max(price) |
-- +-------+------------+
-- | A     |       2114 |
-- | B     |       1049 |
-- | C     |        510 |
-- | D     |        770 |
-- | E     |        959 |
-- +-------+------------+
--- ! i) Tính giá trung bình theo tốc độ PC với các PC có tốc độ > 2.0

select speed, avg(PC.price) 
from PC
where PC.speed > 2.0
group by speed;
-- +-------+---------------+
-- | speed | avg(PC.price) |
-- +-------+---------------+
-- |  2.66 |     2114.0000 |
-- |   2.1 |      995.0000 |
-- |   2.8 |      689.3333 |
-- |   3.2 |      839.5000 |
-- |   2.2 |      640.0000 |
-- |  3.06 |      529.0000 |
-- +-------+---------------+
--- !! j) Tìm kích thước ổ cứng trung bình của PC của các nhà sản xuất (manufacturer) 
--- có sản xuất máy in

select maker, avg(hd)
from Product join PC
on Product.model = PC.model
where maker in (
    select distinct maker
    from Product 
    where type = 'printer'
)
group by maker;
-- +-------+----------+
-- | maker | avg(hd)  |
-- +-------+----------+
-- | D     | 266.6667 |
-- | E     | 133.3333 |
-- +-------+----------+

--------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------

--- EXERCISE 2: Viết các truy vấn SQL theo các yêu cầu, với cấu trúc CSDL cho bên dưới

--- Classes(class, type, country, numGuns, bore, displacement)
--- Ships(name, class, launched)
--- Battles(name, date)
--- Outcomes(ship, battle, result)

create table Classes(
    class VARCHAR(10) PRIMARY KEY,
    type VARCHAR(2),
    country VARCHAR(15),
    numGuns INT,
    bore INT,
    displacement INT 
);

create table Ships(
    name VARCHAR(15) PRIMARY KEY,
    class VARCHAR(10) REFERENCES Classes(class),
    launched INT
);

create table Battles(
    name VARCHAR(15) PRIMARY KEY,
    DATE VARCHAR(15)
);

create table Outcomes(
    ship VARCHAR(15) REFERENCES Ships(name),
    battle VARCHAR(15) REFERENCES Battles(name),
    result VARCHAR(10)
);

.mode csv
.import CLasses.csv Classes
.import Ships.csv Ships
.import Battles.csv Battles
.import Outcomes.csv Outcomes

.header on
.mode column
--- a) Tìm số lượng lớp tàu chiến (battleship classes).
select count(*) 
from Classes;

-- count(*)
-- --------
-- 8

--- b) Tìm số lượng súng trung bình của các lớp tàu chiến.
select avg(numGuns)
from Classes;

-- avg(numGuns)
-- ------------
-- 8.625

--- ! c) Tìm số lượng súng trung bình của các tàu chiến (lưu ý phần biệt lớp tàu và tàu)
select avg(Classes.numGuns)
from CLasses join Ships on Classes.class = Ships.class;

-- avg(Classes.numGuns)
-- --------------------
-- 8.57142857142857

--- ! d) Với mỗi lớp tàu chiến, tìm năm mà chiếc tàu đầu tiên trong lớp đó được hạ thủy
select Classes.class, min(Ships.launched) as first_launched_year
from Classes join Ships on Classes.class = Ships.class
group by Classes.class;

-- class           first_launched_year
-- --------------  -------------------
-- Iowa            1943
-- Kongo           1913
-- North Carolina  1941
-- Renown          1916
-- Revenge         1916
-- Tennessee       1920
-- Yamato          1941

--- ! e) Với mỗi lớp tàu chiến, tìm số lượng tàu của lớp đó bị đánh chìm trong chiến đấu
select Classes.class, count(Outcomes.ship) as sunk_ship
from Classes join Ships on Classes.class = Ships.class
join Outcomes on Ships.name = Outcomes.ship
where Outcomes.result = 'sunk'
group by Classes.class;

-- class  sunk_ship
-- -----  ---------
-- Kongo  1

--- !! f) Với mỗi lớp tàu chiến có ít nhất ba tàu, tìm số tàu của lớp đó bị đánh chìm trong trận chiến

select Classes.class, count(Outcomes.ship) as sunk_ship
from Classes join Ships s1 on Classes.class = s1.class
and (select count(*) from Ships s2 where Classes.class = s2.class) >= 3
join Outcomes on s1.name = Outcomes.ship
where Outcomes.result = 'sunk'
group by Classes.class;

-- class  sunk_ship
-- -----  ---------
-- Kongo  1