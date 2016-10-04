/* Address Tabel */
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Nansensgade 18','Lorem ipsum dolor',3200);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Blaagardsplads 17','Lorem ipsum dolor',3210);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Frederiksberg Allé 14','Lorem ipsum dolor',3220);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Rådhuspladsen 16','Lorem ipsum dolor',3230);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Violvej 15','Lorem ipsum dolor',3250);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Nansensgade 18','Lorem ipsum dolor',3250);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Blaagardsplads 17','Lorem ipsum dolor',2300);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Frederiksberg Allé 14','Lorem ipsum dolor',4800);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Rådhuspladsen 16','Lorem ipsum dolor',4840);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Violvej 15','Lorem ipsum dolor',2300);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Nansensgade 18','Lorem ipsum dolor',3250);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Blaagardsplads 17','Lorem ipsum dolor',3200);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Frederiksberg Allé 14','Lorem ipsum dolor',3210);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Rådhuspladsen 16','Lorem ipsum dolor',3450);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Violvej 15','Lorem ipsum dolor',3200);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Nansensgade 18','Lorem ipsum dolor',3450);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Blaagardsplads 17','Lorem ipsum dolor',3450);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Frederiksberg Allé 14','Lorem ipsum dolor',8210);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Rådhuspladsen 16','Lorem ipsum dolor',3200);
INSERT INTO address (address_street, address_info, fk_zipcode) VALUES ('Violvej 15','Lorem ipsum dolor',3230);

/* Entity Tabel */
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('jesper@andersen.dk','person',1);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('anders@softsolo.dk','company',2);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('thomas@softsolo.dk','company',2);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('kasper@andersen.dk','person',3);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('kristoffer@andersen.dk','person',4);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('joakim@andersen.dk','person',5);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('karsten@jal.dk','company',6);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('ole@jal.dk','company',6);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('kurt@andersen.dk','person',7);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('steen@andersen.dk','person',8);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('viggo@cpsol.dk','company',9);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('viktor@cpsol.dk','company',9);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('nikolaj@andersen.dk','person',10);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('jens@andersen.dk','person',11);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('john@engholm.dk','company',12);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('leon@engholm.dk','company',12);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('elias@andersen.dk','person',13);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('kristian@andersen.dk','person',14);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('michael@andersen.dk','person',15);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('lukas@andersen.dk','person',16);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('hans@andersen.dk','person',17);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('klaus@unit.dk','company',18);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('frans@unit.dk','company',18);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('stig@andersen.dk','person',19);
INSERT INTO infoentity (entity_email, entity_typeof, fk_address_id) VALUES ('bo@andersen.dk','person',20);

/* Phone Tabel */
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (88888888,'Privat',1);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (77777777,'Privat',2);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (66666666,'Privat',3);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (55555555,'Privat',4);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (44444444,'Privat',5);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (33333333,'Privat',6);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (22222222,'Privat',7);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (11111111,'Privat',7);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (12345678,'Privat',8);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (87654321,'Privat',9);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (56895655,'Privat',10);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (78945621,'Privat',11);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (43243253,'Privat',12);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (54531231,'Privat',13);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (53484943,'Privat',14);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (98989874,'Privat',14);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (90849393,'Privat',15);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (36782100,'Privat',16);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (36009877,'Privat',16);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (49339399,'Privat',17);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (34145243,'Privat',18);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (43243243,'Privat',19);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (12341123,'Privat',20);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (12344321,'Privat',21);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (23455432,'Privat',22);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (34566534,'Privat',23);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (45677654,'Privat',23);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (56788765,'Privat',24);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (39201293,'Privat',25);
INSERT INTO phone (phone_number, phone_desc, fk_entity_id) VALUES (10293848,'Privat',25);

/* Company Tabel */
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(2,'Twitter',12345678,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(3,'Facebook',87654321,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(7,'Disney',32178938,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(8,'Nike',12903902,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(11,'Adidas',12344321,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(12,'Puma',67894321,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(15,'Peak Performance',56778890,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(16,'Nortlander',23423423,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(22,'K2',43243243,'Lorem ipsum',16,1000);
INSERT INTO company (company_id, company_name, company_cvr, company_desc, company_empl, company_value) VALUES(23,'Blyat',12345612,'Lorem ipsum',16,1000);

/* Person Tabel */
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (1,'Jens','Jensen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (4,'Anders','Andersen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (5,'Kasper','Kaspersen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (6,'Christian','Christiansen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (9,'Kristoffer','Kristoffersen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (10,'Tom','Tomsen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (13,'Ib','Ibsen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (14,'Klaus','Klausen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (17,'Hans','Hansen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (18,'Peter','Petersen');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (19,'Bo','Ib');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (20,'Ib','Bo');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (21,'Foo','Bar');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (24,'Lorem','Ipsum');
INSERT INTO person (person_id, person_firstname, person_lastname) VALUES (25,'Lorentz','Lorentzen');

/* Hobby Tabel */
INSERT INTO hobby (hobby_name, hobby_desc) VALUES ('Skiskydning','Lorem ipsum dolor');
INSERT INTO hobby (hobby_name, hobby_desc) VALUES ('Dværgkastning','Lorem ipsum dolor');
INSERT INTO hobby (hobby_name, hobby_desc) VALUES ('At jodle','Lorem ipsum dolor');
INSERT INTO hobby (hobby_name, hobby_desc) VALUES ('UFO jagt','Lorem ipsum dolor');
INSERT INTO hobby (hobby_name, hobby_desc) VALUES ('Ølsmagning','Lorem ipsum dolor');

/* Hobby link Person Tabel */
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(1,1);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(2,4);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(1,5);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(3,6);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(4,4);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(3,9);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(4,10);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(5,13);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(1,14);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(2,17);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(3,18);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(4,19);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(3,20);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(4,21);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(5,24);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(1,25);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(2,25);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(3,25);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(4,25);
INSERT INTO hobbyperson(fk_hobby_id, fk_person_id) VALUES(5,21);
