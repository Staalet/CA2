USE ca2;

CREATE TABLE cityinfo (
    zipcode INT PRIMARY KEY,
    city VARCHAR(255)
);

CREATE TABLE address (
    address_id INT PRIMARY KEY AUTO_INCREMENT,
    address_street VARCHAR(255),
    address_info VARCHAR(255),
    fk_zipcode INT,
    FOREIGN KEY (fk_zipcode) REFERENCES cityinfo(zipcode)
);

CREATE TABLE infoentity (
    entity_id INT PRIMARY KEY AUTO_INCREMENT,
    entity_email VARCHAR(255) UNIQUE,
    entity_typeof VARCHAR(20),
    fk_address_id INT,
    FOREIGN KEY (fk_address_id) REFERENCES address(address_id)
);

CREATE TABLE phone (
    phone_number INT(8) PRIMARY KEY,
    phone_desc VARCHAR(255),
    fk_entity_id INT,
    FOREIGN KEY(fk_entity_id) REFERENCES infoentity(entity_id)
);

CREATE TABLE company (
    company_id INT PRIMARY KEY REFERENCES infoentitiy(entity_id),
    company_name VARCHAR(255),
    company_cvr INT(8) UNIQUE,
    company_desc VARCHAR(255),
    company_empl INT,
    company_value INT
);

CREATE TABLE person (
    person_id INT PRIMARY KEY REFERENCES infoentitiy(entity_id),
    person_firstname VARCHAR(255),
    person_lastname VARCHAR(255)
);

CREATE TABLE hobby (
    hobby_id INT PRIMARY KEY AUTO_INCREMENT,
    hobby_name VARCHAR(255),
    hobby_desc VARCHAR(255),
    fk_entity_id INT,
    FOREIGN KEY(fk_entity_id) REFERENCES infoentity(entity_id)
);
