CREATE USER 'pposong'@'%' IDENTIFIED BY '000000';

CREATE DATABASE Tables_in_nodejs;

GRANT ALL PRIVILEGES ON Tables_in_nodejs.* TO 'pposong'@'%';
FLUSH PRIVILEGES;
USE Tables_in_nodejs;

CREATE TABLE IF NOT EXISTS forecast (
    DATE VARCHAR(16) NOT NULL,
    TIME VARCHAR(8) NOT NULL,
    X VARCHAR(8) NOT NULL,
    Y VARCHAR(8) NOT NULL, 
    RN1 VARCHAR(128),
    T1H VARCHAR(8),
    REH VARCHAR(8), 
    WSD VARCHAR(8), 
    UPTIME VARCHAR(16) NOT NULL,
    PRIMARY KEY (DATE, TIME, X, Y, UPTIME)
);

CREATE TABLE IF NOT EXISTS usertable (
    username VARCHAR(50) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (username)
);
