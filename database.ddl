-- creating Database
create database MLP335;

-- using the Database
use MLP335;

-- Creating Menu table 
CREATE TABLE MENU
(
FOOD_ID VARCHAR(20) PRIMARY KEY,
ITEM_NAME VARCHAR(40),
FOOD_PRICE int
);

-- Creating Customer table
CREATE TABLE CUSTOMER
(
CUS_ID VARCHAR(20) PRIMARY KEY,
CUS_NAME VARCHAR(50),
CUS_PHN bigint,
CUS_ADD VARCHAR(100),
CUS_EMAIL VARCHAR(50) UNIQUE
);

-- Creating Orders table
CREATE TABLE ORDERS
(
ORD_ID VARCHAR(20) PRIMARY KEY,
ORD_DATE date,
FOOD_ID VARCHAR(20),
CUS_ID VARCHAR(20),
TOKEN int,
FOREIGN KEY(FOOD_ID) REFERENCES MENU(FOOD_ID),
FOREIGN KEY(CUS_ID) REFERENCES CUSTOMER(CUS_ID)
);

-- Creating Vendor table
CREATE TABLE VENDOR
(
VEN_ID VARCHAR(20) PRIMARY KEY,
VEN_NAME VARCHAR(50),
CUS_ID VARCHAR(20),
FOREIGN KEY(CUS_ID) REFERENCES CUSTOMER(CUS_ID)
);




