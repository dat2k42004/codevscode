

CREATE Table Carriers (
    cid VARCHAR(10) PRIMARY KEY, 
    name VARCHAR(50)

);

CREATE Table Months (
    mid INT PRIMARY KEY, 
    month VARCHAR(20)
);

CREATE Table Weekdays (
    did INT PRIMARY KEY, 
    day_of_week VARCHAR(15)
);

CREATE Table Flights (
    fid INT PRIMARY KEY,
    year INT,
    month_id INT,
    day_of_month INT,
    day_of_week_id INT, 
    carrier_id VARCHAR(10), 
    flight_num INT, 
    origin_city VARCHAR(50), 
    origin_state VARCHAR(50), 
    dest_city VARCHAR(50), 
    dest_state VARCHAR(50), 
    departure_delay FLOAT, 
    taxi_out FLOAT, 
    arrival_delay FLOAT, 
    canceled INT, 
    actual_time FLOAT, 
    distance FLOAT,
    FOREIGN KEY (carrier_id) REFERENCES Carriers(cid),
    FOREIGN KEY (month_id) REFERENCES Months(mid),
    FOREIGN KEY (day_of_week_id) REFERENCES Weekdays(did)
);

PRAGMA foreign_keys=ON;

.mode csv
.import flights-small.csv Flights
.import carriers.csv Carriers
.import months.csv Months
.import weekdays.csv Weekdays


