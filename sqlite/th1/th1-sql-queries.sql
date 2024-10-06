-- 1. Tìm các số hiệu chuyến bay phân biệt của tất cả các chuyến bay 
-- từ Seattle tới Boston bởi hãng Alaska Airlines Inc. 
-- vào Mondays. Lưu ý rằng trong CSDL, tên các TP bao gồm cả tên bang. 
-- VD tên TP Seattle sẽ là Seattle WA. [3 rows]

SELECT DISTINCT f.flight_num
FROM FLights f JOIN Carriers c ON f.carrier_id = c.cid 
JOIN Weekdays w ON f.day_of_week_id = w.did
WHERE f.origin_city = 'Seattle WA' AND f.dest_city = 'Boston MA' 
AND c.name = 'Alaska Airlines Inc.' AND w.day_of_week = 'Monday';

--  Truy vấn này tìm các số hiệu chuyến bay không trùng lặp (DISTINCT) từ Seattle tới Boston, 
-- -- do Alaska Airlines thực hiện vào các ngày thứ Hai. 

-- 12
-- 24
-- 734

-- 2. Tìm tất cả các chuyến bay từ Seattle tới Boston vào July 15th 2015. 
-- Chỉ tìm các chuyến bay mà có 1 điểm trung chuyển ở giữa chuyến. 
-- Cả 2 phần của chuyến bay phải diễn ra trong cùng 1 ngày và cùng 1 hãng. 
-- Tổng thời gian bay (actual_time) phải nhỏ hơn 7 giờ (lưu ý thời gian của trường actual_time đang lưu theo phút). 
-- Với mỗi chuyển bay thỏa mãn, câu lệnh cần trả về tên hãng, số hiệu chuyến bay nửa đầu, 
-- điểm xuất phát và điểm đến của chuyến bay nửa đầu, thời gian bay của chuyến bay nửa đầu, 
-- số hiệu chuyến bay nửa sau, điểm xuất phát và điểm đến của chuyến bay nửa sau, 
-- thời gian bay của chuyến bay nửa sau, và tổng thời gian bay. [488 rows]

SELECT c1.name AS airline, f1.flight_num AS first_leg_flight_num, f1.origin_city AS first_leg_origin, 
       f1.dest_city AS first_leg_dest, f1.actual_time AS first_leg_time, f2.flight_num AS second_leg_flight_num, 
       f2.origin_city AS second_leg_origin, f2.dest_city AS second_leg_dest, f2.actual_time AS second_leg_time, 
       (f1.actual_time + f2.actual_time) AS total_flight_time
FROM Flights f1
JOIN Flights f2 ON f1.dest_city = f2.origin_city AND f1.carrier_id = f2.carrier_id AND f1.year = f2.year
AND f1.month_id = f2.month_id AND f1.day_of_month = f2.day_of_month
JOIN Carriers c1 ON f1.carrier_id = c1.cid
WHERE f1.origin_city = 'Seattle WA'
  AND f2.dest_city = 'Boston MA'
  AND f1.year = 2015 AND f1.month_id = 7 AND f1.day_of_month = 15
  AND f1.actual_time + f2.actual_time < 420;

-- Truy vấn này tìm các chuyến bay từ Seattle tới Boston vào ngày 15 tháng 7 năm 2015, với một điểm trung chuyển.
-- -- Cả hai phần của chuyến bay (first_leg và second_leg) phải diễn ra trong cùng một ngày và do cùng một hãng thực hiện.
-- -- Tổng thời gian bay nhỏ hơn 7 giờ (420 phút).

-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|26|Chicago IL|Boston MA|150.0|378.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|186|Chicago IL|Boston MA|137.0|365.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|288|Chicago IL|Boston MA|137.0|365.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|366|Chicago IL|Boston MA|150.0|378.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|1205|Chicago IL|Boston MA|128.0|356.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|1240|Chicago IL|Boston MA|130.0|358.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|1299|Chicago IL|Boston MA|133.0|361.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|1435|Chicago IL|Boston MA|133.0|361.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|1557|Chicago IL|Boston MA|122.0|350.0
-- American Airlines Inc.|42|Seattle WA|Chicago IL|228.0|2503|Chicago IL|Boston MA|127.0|355.0

-- 3. Tìm các ngày trong tuần mà có thời gian trễ khi hạ cánh trung bình dài nhất. 
-- Trả về ngày và thời gian trễ trung bình. [1 row]

SELECT w.day_of_week, AVG(f.arrival_delay) AS avg_arrival_delay
FROM Flights f
JOIN Weekdays w ON f.day_of_week_id = w.did
GROUP BY w.day_of_week
ORDER BY avg_arrival_delay DESC
LIMIT 1; 

-- Truy vấn này tìm ngày trong tuần có thời gian trễ trung bình khi hạ cánh dài nhất.
-- -- Sắp xếp kết quả theo thời gian trễ trung bình giảm dần và lấy ngày có giá trị lớn nhất. 

-- Wednesday|13.0125428064529

-- 4. Tìm tên các hãng hàng không đã từng bay hơn 1000 chuyến trong một ngày.
--  Chỉ trả về tên, không có tên trùng nhau. [11 rows]

SELECT DISTINCT c.name
FROM Carriers c 
JOIN Flights f ON c.cid = f.carrier_id
GROUP BY f.year, f.month_id, f.day_of_month, c.name
HAVING COUNT(*) > 1000;

-- Truy vấn này tìm các hãng hàng không có số chuyến bay lớn hơn 1000 chuyến trong một ngày (GROUP BY theo năm, tháng, ngày và hãng).
-- -- Chỉ trả về tên các hãng hàng không không trùng lặp. 

-- American Airlines Inc.
-- Comair Inc.
-- Delta Air Lines Inc.
-- Envoy Air
-- ExpressJet Airlines Inc. (1)
-- Northwest Airlines Inc.
-- SkyWest Airlines Inc.
-- Southwest Airlines Co.
-- US Airways Inc.
-- United Air Lines Inc.
-- ExpressJet Airlines Inc.

-- 5.Tìm tất cả các hãng hàng không có hơn 0.5% chuyến bay khởi hành từ Seattle bị hủy. 
-- Trả về tên của hãng và tỷ lệ % các chuyển bay khỏi Seattle bị hủy. 
-- Sắp xếp kết quả tăng dần theo tỷ lệ phần trăm số chuyến bay bị hủy. [6 rows]



SELECT c.name, (SUM(f.canceled) * 100.0 / COUNT(*)) AS cancel_rate
FROM Carriers c
JOIN Flights f ON c.cid = f.carrier_id
WHERE f.origin_city = 'Seattle WA'
GROUP BY c.name
HAVING cancel_rate > 0.5
ORDER BY cancel_rate ASC;

-- Truy vấn này tính tỷ lệ phần trăm các chuyến bay từ Seattle bị hủy của mỗi hãng hàng không (SUM(canceled) / COUNT(*)).
-- -- Trả về những hãng có tỷ lệ hủy chuyến hơn 0.5%. 
-- -- Kết quả được sắp xếp theo tỷ lệ phần trăm tăng dần. 

-- SkyWest Airlines Inc.|0.728291316526611
-- Frontier Airlines Inc.|0.840336134453782
-- United Air Lines Inc.|0.983767830791933
-- JetBlue Airways|1.00250626566416
-- Northwest Airlines Inc.|1.4336917562724
-- ExpressJet Airlines Inc.|3.2258064516129
