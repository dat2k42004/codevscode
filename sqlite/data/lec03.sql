--EXERCISE 1. Cho CSDL về phim như bên dưới

--- Movies(title, year, length, genre, studioName, producerC#): Bảng Movie chứa thông tin về các bộ phim
--- Starsln(movieTitle, movieYear, starName): Bảng StarsIn cho biết diễn viên đóng phim nào
--- MovieStar(name, address, gender, birthdate): Bảng MovieStar chứa thông tin về diễn viên
--- MovieExec(name, address, cert#, netWorth): Bảng MoviewExec chứa thông tin về đạo diễn
--- Studio(name, address, presC#): Bảng Studio chứa thông tin về hãng phim

CREATE TABLE Movies(
title VARCHAR(50),
year INT,
length INT,
genre VARCHAR(50),
studioName VARCHAR(50),
producerC INT,
PRIMARY KEY (title, studioName));

CREATE TABLE Starsln(
movieTitle VARCHAR(50) references Movies,
movieYear INT,
starName VARCHAR(50) PRIMARY KEY);

CREATE TABLE MovieStar(
name VARCHAR(50) references Starsln,
address VARCHAR(50),
gender VARCHAR(1),
birthday VARCHAR(20));

CREATE TABLE MovieExec(
name VARCHAR(50),
address VARCHAR(50),
cert INT PRIMARY KEY,
netWorth VARCHAR(10));

CREATE TABLE Studio(
name VARCHAR(50),
address VARCHAR(50),
pressC INT references MovieExec);


.mode csv
.import Movie.csv Movies
.import StarsIn.csv Starsln
.import MovieStar.csv MovieStar
.import MovieExec.csv MovieExec
.import Studio.csv Studio

.header on
.mode column




--- Viết các câu truy vấn sau:

--- a) Ai là diễn viên nữ chính đã đóng phim Stars War?
SELECT MS.name
FROM Starsln SI
JOIN MovieStar MS ON SI.starName = MS.name
WHERE SI.movieTitle = 'Star Wars'
AND MS.gender = 'F';


--- Kết quả:
	name         
	-------------
	Carrie Fisher

--- b) Những diễn viên nào xuất hiện trong các bộ phim sản xuất bởi Paramount năm 1992?
SELECT DISTINCT SI.starName
FROM Starsln SI
JOIN Movies M ON SI.movieTitle = M.title AND SI.movieYear = M.year
WHERE M.studioName = 'Paramount'
AND M.year = 1992;


--- Kết quả:
	starName   
	-----------
	Dana Carvey
	Mike Meyers

--- c) Ai là chủ tịch của hãng phim MGM?
SELECT S.pressC, ME.name
FROM Studio S
JOIN MovieExec ME ON S.pressC = ME.cert
WHERE S.name = 'MGM';


--- Kết quả:
	pressC  name     
	------  ---------
	9982    Tom Hanks

--- ! d) Những bộ phim nào dài hơn phim Galaxy Quest?
SELECT M.title
FROM Movies M
WHERE M.length > (
    SELECT length
    FROM Movies
    WHERE title = 'Galaxy Quest'
);


--- Kết quả:
	title    
	---------
	Star Wars


--- ! e) Những đạo diễn nào thu nhập cao hơn Mary Tyler Moore?

SELECT ME.name
FROM MovieExec ME
WHERE ME.netWorth > (
    SELECT netWorth
    FROM MovieExec
    WHERE name = 'Mary Tyler Moore'
);


--- Kết quả:
	name        
	------------
	Tom Hanks   
	George Lucas

--EXERCISE 2. Cho CSDL về thiết bị công nghệ như bên dưới. Dữ liệu mẫu trong các file .csv tương ứng.

--- Product(maker,model, type): Bảng Product chứa thông tin về các sản phẩm
--- PC(model, speed, ram, HD, price): Bảng PC chứa thông tin về máy tính PC
--- Laptop(model, speed, ram, hd, screen, price): Bảng Laptop chứa thông tin về máy tính xách tay
--- Printer(model, color, type, price): Bảng Printer chứa thông tin về máy in


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



--- Viết các câu truy vấn sau:

--- a) Tìm nhà sản xuất và tốc độ của các laptop có ổ cứng ít nhất 30 GB.
SELECT p.maker, l.speed
FROM Product p
JOIN Laptop l ON p.model = l.model
WHERE l.hd >= 30;


--- Kết quả:
	maker  speed
	-----  -----
	E      2.0  
	E      1.73 
	E      1.8  
	A      2.0  
	A      2.16 
	A      2.0  
	B      1.83 
	F      1.6  
	F      1.6  
	G      2.0  

--- b) Tìm model và giá của tất cả các sản phẩm (các loại) được làm bởi nhà sản xuất B 
---	   (Gợi ý: Dùng toán tử UNION)
SELECT model, price
FROM PC 
WHERE model in(SELECT model FROM Product WHERE maker = 'B')
UNION
SELECT model, price
FROM Laptop 
WHERE model in(SELECT model FROM Product WHERE maker = 'B')
UNION
SELECT model, price
FROM Printer 
WHERE model in(SELECT model FROM Product WHERE maker = 'B');


--- Kết quả:
	model  price
	-----  -----
	1004   649  
	1005   630  
	1006   1049 
	2007   1429 

--- c) Tìm những nhà sản xuất có bán Laptop nhưng không bán PC.
---    (Gợi ý: Dùng toán tử EXCEPT)

SELECT maker
FROM Product 
WHERE type = 'laptop'
EXCEPT
SELECT maker
FROM Product
WHERE type = 'pc';

--- Kết quả:
	maker
	-----
	F    
	G  

--- ! d) Tìm những kích thước ổ cứng xuất hiện ở 2 hoặc nhiều mẫu PC khác nhau.
---    (Gợi ý: Dùng SEFL-JOIN)
SELECT DISTINCT p.HD
FROM PC p
JOIN PC p1 ON p.HD = p1.HD
AND p.model != p1.model;

--- Kết quả:
	HD 
	---
	250
	250
	250
	250
	250
	250
	250
	250
	250
	80 
	250
	250
	250
	250
	250
	250
	160

--- ! e) Tìm những cặp mẫu PC có cùng tốc độ và RAM. Mỗi cặp chỉ được liệt kê 1 lần. VD liệt kê cặp (i, j) thì thôi không liệt kê (j, i)
SELECT p1.model AS model1, p2.model AS model2
FROM PC p1, PC p2
WHERE p1.model < p2.model AND p1.speed = p2.speed AND p1.ram = p2.ram;


--- Kết quả:
	model1  model2
	-----  -----
	1004   1012 

--- !! f) Tìm những nhà sản xuất có ít nhất 2 mẫu máy tính khác nhau (PC hoặc Laptop)
SELECT maker 
FROM Product 
WHERE type = 'pc' OR type = 'laptop'
GROUP BY maker
HAVING COUNT(DISTINCT model) >= 2;


--- Kết quả:
	maker
	-----
	A    
	B    
	D    
	E    
	F    