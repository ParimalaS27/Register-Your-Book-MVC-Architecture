create database ps;
use ps; 
CREATE TABLE book (
    BName varchar(250) NOT NULL,
    Author varchar(250) NOT NULL,
    Editn varchar(250) NOT NULL,
    Category varchar(250) NOT NULL,
    Price double NOT NULL,
    Stock_qty integer NOT NULL) ;