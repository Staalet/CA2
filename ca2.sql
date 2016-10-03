DROP DATABASE IF EXISTS CA2;
CREATE DATABASE CA2;
USE CA2;

DROP TABLE IF EXISTS cityinfo;
CREATE TABLE cityinfo (
	cityinfo_id INT PRIMARY KEY AUTO_INCREMENT,
    cityinfo_zip INT,
    cityinfo_city VARCHAR(255)
);

DROP TABLE IF EXISTS address;
CREATE TABLE address (
	address_id INT PRIMARY KEY AUTO_INCREMENT,
    address_street VARCHAR(255),
    address_info TEXT,
    fk_cityinfo_id INT,
    FOREIGN KEY (fk_cityinfo_id) REFERENCES cityinfo(cityinfo_id)
);

DROP TABLE IF EXISTS infoentity;
CREATE TABLE infoentity (
	infoentity_id INT PRIMARY KEY AUTO_INCREMENT,
    infoentity_email VARCHAR(255),
    fk_address_id INT,
    FOREIGN KEY (fk_address_id) REFERENCES address(address_id)
);

DROP TABLE IF EXISTS hobby;
CREATE TABLE hobby (
	hobby_id INT PRIMARY KEY AUTO_INCREMENT,
    hobby_name VARCHAR(255),
    hobby_desc TEXT
);

DROP TABLE IF EXISTS person;
CREATE TABLE person (
	person_id INT PRIMARY KEY AUTO_INCREMENT,
    person_firstname VARCHAR(255),
    person_lastname VARCHAR(255),
    fk_infoentity_id INT,
    FOREIGN KEY (fk_infoentity_id) REFERENCES infoentity(infoentity_id)
);

DROP TABLE IF EXISTS hobbyperson;
CREATE TABLE hobbyperson (
	hobbyperson_id INT PRIMARY KEY AUTO_INCREMENT,
    fk_hobby_id INT,
    fk_person_id INT,
    FOREIGN KEY (fk_hobby_id) REFERENCES hobby(hobby_id),
    FOREIGN KEY (fk_person_id) REFERENCES person(person_id)
);

DROP TABLE IF EXISTS company;
CREATE TABLE company (
	company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(255),
    company_desc TEXT,
    company_cvr VARCHAR(255),
    company_numemployees INT,
    company_marketvalue INT,
    fk_infoentity_id INT,
    FOREIGN KEY (fk_infoentity_id) REFERENCES infoentity(infoentity_id)
);

DROP TABLE IF EXISTS phone;
CREATE TABLE phone (
	phone_id INT PRIMARY KEY AUTO_INCREMENT,
    phone_number INT,
    phone_desc VARCHAR(255),
    fk_infoentity_id INT,
    FOREIGN KEY (fk_infoentity_id) REFERENCES infoentity(infoentity_id)
);



