/*
    DB Schema
*/

CREATE TABLE Class (
       dept VARCHAR(6),
       number INTEGER,
       title VARCHAR(75),
       PRIMARY KEY (dept, number)
);

CREATE TABLE Instructor (
       username VARCHAR(8),
       fname VARCHAR(50),
       lname VARCHAR(50),
       started_on CHAR(10),
       PRIMARY KEY (username)
);

CREATE TABLE Teaches (
       username VARCHAR(8),
       dept VARCHAR(6),
      
 number INTEGER,
       PRIMARY KEY (username, dept, number),
       FOREIGN KEY (username) REFERENCES Instructor(username),
       FOREIGN KEY (dept, number) REFERENCES Class(dept, number)
);


/* 
   Dữ liệu mẫu 
 */

INSERT INTO Class
       VALUES('CSE', 378, 'Machine Organization and Assembly Language');
INSERT INTO Class
       VALUES('CSE', 451, 'Introduction to Operating Systems');
INSERT INTO Class
       VALUES('CSE', 461, 'Introduction to Computer Communication Networks');

INSERT INTO Instructor
       VALUES('zahorjan', 'John', 'Zahorjan', '1985-01-01');
INSERT INTO Instructor
       VALUES('djw', 'David', 'Wetherall', '1999-07-01');
INSERT INTO Instructor
       VALUES('tom', 'Tom', 'Anderson', date('1997-10-01'));
INSERT INTO Instructor
       VALUES('levy', 'Hank', 'Levy', date('1988-04-01'));

INSERT INTO Teaches
       VALUES('zahorjan', 'CSE', 378);
INSERT INTO Teaches
       VALUES('tom', 'CSE', 451);
INSERT INTO Teaches
       VALUES('tom', 'CSE', 461);
INSERT INTO Teaches
       VALUES('zahorjan', 'CSE', 451);
INSERT INTO Teaches
       VALUES('zahorjan', 'CSE', 461);
INSERT INTO Teaches
       VALUES('djw', 'CSE', 461);
INSERT INTO Teaches
       VALUES('levy', 'CSE', 451);




/*
   Các yêu cầu truy vấn: Gõ câu truy vấn vào bên dưới. Lưu ý kết quả đã được gợi ý.
 */
.header on
.mode column

-- Các khóa học nào đang được mở?

SELECT title FROM Class;

title                                     
------------------------------------------
Machine Organization and Assembly Language
Introduction to Operating Systems         
Introduction to Computer Communication Net



-- Liệt kê 2 khóa học theo tên giảng viên (sắp xếp theo tên tăng dần)

SELECT * FROM Teaches ORDER BY username asc limit 2;

username    dept        number    
----------  ----------  ----------
djw         CSE         461       
levy        CSE         451 



-- Liệt kê 2 khóa học theo tên giảng viên (sắp xếp theo tên giảm dần)

SELECT * FROM Teaches ORDER BY username desc limit 2;


username    dept        number    
----------  ----------  ----------
zahorjan    CSE         461       
zahorjan    CSE         451 


-- Tên (firstname) của Instructor có tên đăng nhập (login) là 'zahorjan'?

SELECT fname FROM Instructor WHERE username = 'zahorjan';

fname     
----------
John 


-- Các khóa học cấp độ 400 (4xx) của CSE đang mở là gì?

SELECT * FROM Class WHERE number > 400;


dept        number      title                            
----------  ----------  ---------------------------------
CSE         451         Introduction to Operating Systems
CSE         461         Introduction to Computer Communic


-- Những lớp nào đang dạy bởi levy hoặc djw?

SELECT * FROM Teaches WHERE username = 'djw' or username = 'levy';

username    dept        number    
----------  ----------  ----------
djw         CSE         461       
levy        CSE         451



-- Những khóa học nào có tên bắt đầu bằng "Introduction"

SELECT * FROM Class WHERE title like '%Introduction%';

dept        number      title                            
----------  ----------  ---------------------------------
CSE         451         Introduction to Operating Systems
CSE         461         Introduction to Computer Communic



-- Nếu gõ nhầm Introduction thành INtroduction, làm thế nào để vẫn ra kết quả đúng?

SELECT * FROM Class WHERE title like '%INtroduction%' COLLATE NOCASE;

dept        number      title                            
----------  ----------  ---------------------------------
CSE         451         Introduction to Operating Systems
CSE         461         Introduction to Computer Communic


-- Hiển thị tên khóa học và độ dài của nó
SELECT title, LENGTH(title) AS length
FROM Class;

title                                       LENGTH(title)
------------------------------------------  -------------
Machine Organization and Assembly Language  42           
Introduction to Operating Systems           33           
Introduction to Computer Communication Net  47 




-- Cắt tên các khóa học về còn 12 ký tự

SELECT dept, number, SUBSTR(title, 1, 12) AS short_title
FROM Class;

dept        number      short_title 
----------  ----------  ------------
CSE         378         Machine Orga
CSE         451         Introduction
CSE         461         Introduction



-- Những instructors nào bắt đầu dạy trước 1990?

SELECT * FROM Instructor WHERE started_on < 1990-01-01;

username    fname       lname       started_on
----------  ----------  ----------  ----------
zahorjan    John        Zahorjan    1985-01-01
levy        Hank        Levy        1988-04-01



-- Những instructors nào bắt đầu dạy trước thời điểm hiện tại?
-- (Hopefully, this is all of them!)

SELECT * FROM Instructor WHERE started_on < date('now');

username    fname       lname       started_on
----------  ----------  ----------  ----------
zahorjan    John        Zahorjan    1985-01-01
djw         David       Wetherall   1999-07-01
tom         Tom         Anderson    1997-10-01
levy        Hank        Levy        1988-04-01



-- Những instructors bắt đầu dạy vào hoặc sau ngày 1 tháng 1 của 20 năm trước?

SELECT * FROM Instructor WHERE started_on >= date('now', '-30 years');

username    fname       lname       started_on
----------  ----------  ----------  ----------
djw         David       Wetherall   1999-07-01
tom         Tom         Anderson    1997-10-01

