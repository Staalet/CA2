# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localhost (MySQL 5.6.28)
# Database: ca2
# Generation Time: 2016-10-09 01:34:56 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table ADDRESS
# ------------------------------------------------------------

DROP TABLE IF EXISTS `ADDRESS`;

CREATE TABLE `ADDRESS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ADDITIONALINFO` varchar(255) DEFAULT NULL,
  `STREET` varchar(255) DEFAULT NULL,
  `CITYINFO_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ADDRESS_CITYINFO_ID` (`CITYINFO_ID`),
  CONSTRAINT `FK_ADDRESS_CITYINFO_ID` FOREIGN KEY (`CITYINFO_ID`) REFERENCES `CITYINFO` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table CITYINFO
# ------------------------------------------------------------

DROP TABLE IF EXISTS `CITYINFO`;

CREATE TABLE `CITYINFO` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CITY` varchar(255) DEFAULT NULL,
  `ZIPCODE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table COMPANY
# ------------------------------------------------------------

DROP TABLE IF EXISTS `COMPANY`;

CREATE TABLE `COMPANY` (
  `ID` int(11) NOT NULL,
  `CVR` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `MARKETVALUE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `NUMEMPLOYEES` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_COMPANY_ID` FOREIGN KEY (`ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `COMPANY` WRITE;
/*!40000 ALTER TABLE `COMPANY` DISABLE KEYS */;

INSERT INTO `COMPANY` (`ID`, `CVR`, `DESCRIPTION`, `MARKETVALUE`, `NAME`, `NUMEMPLOYEES`)
VALUES
	(11,'63863566','Description 1','594','Company 1','27'),
	(12,'58422152','Description 2','5381','Company 2','99'),
	(13,'88959009','Description 3','6035','Company 3','51'),
	(14,'26589803','Description 4','6221','Company 4','9'),
	(15,'22743192','Description 5','6430','Company 5','58'),
	(16,'59790537','Description 6','766','Company 6','26'),
	(17,'29118787','Description 7','7710','Company 7','63'),
	(18,'29735808','Description 8','1350','Company 8','68'),
	(19,'23633733','Description 9','8643','Company 9','4'),
	(20,'32457581','Description 10','7079','Company 10','14');

/*!40000 ALTER TABLE `COMPANY` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table HOBBY
# ------------------------------------------------------------

DROP TABLE IF EXISTS `HOBBY`;

CREATE TABLE `HOBBY` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `HOBBY` WRITE;
/*!40000 ALTER TABLE `HOBBY` DISABLE KEYS */;

INSERT INTO `HOBBY` (`ID`, `DESCRIPTION`, `NAME`)
VALUES
	(1,'I like to play CS:GO','Gaming'),
	(2,'I like to play CS:GO','Gaming'),
	(3,'I like to play CS:GO','Gaming'),
	(4,'I like to play CS:GO','Gaming'),
	(5,'I like to play CS:GO','Gaming'),
	(6,'I like horses','Horse riding'),
	(7,'I like horses','Horse riding'),
	(8,'I like horses','Horse riding'),
	(9,'I like horses','Horse riding'),
	(10,'I like horses','Horse riding');

/*!40000 ALTER TABLE `HOBBY` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table INFOENTITY
# ------------------------------------------------------------

DROP TABLE IF EXISTS `INFOENTITY`;

CREATE TABLE `INFOENTITY` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DTYPE` varchar(31) DEFAULT NULL,
  `EMAIL` varchar(255) DEFAULT NULL,
  `ADDRESS_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_INFOENTITY_ADDRESS_ID` (`ADDRESS_ID`),
  CONSTRAINT `FK_INFOENTITY_ADDRESS_ID` FOREIGN KEY (`ADDRESS_ID`) REFERENCES `ADDRESS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `INFOENTITY` WRITE;
/*!40000 ALTER TABLE `INFOENTITY` DISABLE KEYS */;

INSERT INTO `INFOENTITY` (`ID`, `DTYPE`, `EMAIL`, `ADDRESS_ID`)
VALUES
	(1,'Person',NULL,NULL),
	(2,'Person',NULL,NULL),
	(3,'Person',NULL,NULL),
	(4,'Person',NULL,NULL),
	(5,'Person',NULL,NULL),
	(6,'Person',NULL,NULL),
	(7,'Person',NULL,NULL),
	(8,'Person',NULL,NULL),
	(9,'Person',NULL,NULL),
	(10,'Person',NULL,NULL),
	(11,'Company',NULL,NULL),
	(12,'Company',NULL,NULL),
	(13,'Company',NULL,NULL),
	(14,'Company',NULL,NULL),
	(15,'Company',NULL,NULL),
	(16,'Company',NULL,NULL),
	(17,'Company',NULL,NULL),
	(18,'Company',NULL,NULL),
	(19,'Company',NULL,NULL),
	(20,'Company',NULL,NULL);

/*!40000 ALTER TABLE `INFOENTITY` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table INFOENTITY_PHONE
# ------------------------------------------------------------

DROP TABLE IF EXISTS `INFOENTITY_PHONE`;

CREATE TABLE `INFOENTITY_PHONE` (
  `InfoEntity_ID` int(11) NOT NULL,
  `phones_ID` int(11) NOT NULL,
  PRIMARY KEY (`InfoEntity_ID`,`phones_ID`),
  KEY `FK_INFOENTITY_PHONE_phones_ID` (`phones_ID`),
  CONSTRAINT `FK_INFOENTITY_PHONE_InfoEntity_ID` FOREIGN KEY (`InfoEntity_ID`) REFERENCES `INFOENTITY` (`ID`),
  CONSTRAINT `FK_INFOENTITY_PHONE_phones_ID` FOREIGN KEY (`phones_ID`) REFERENCES `PHONE` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table PERSON
# ------------------------------------------------------------

DROP TABLE IF EXISTS `PERSON`;

CREATE TABLE `PERSON` (
  `ID` int(11) NOT NULL,
  `FIRSTNAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_PERSON_ID` FOREIGN KEY (`ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `PERSON` WRITE;
/*!40000 ALTER TABLE `PERSON` DISABLE KEYS */;

INSERT INTO `PERSON` (`ID`, `FIRSTNAME`, `LASTNAME`)
VALUES
	(1,'Person 1','Person 1'),
	(2,'Person 2','Person 2'),
	(3,'Person 3','Person 3'),
	(4,'Person 4','Person 4'),
	(5,'Person 5','Person 5'),
	(6,'Person 6','Person 6'),
	(7,'Person 7','Person 7'),
	(8,'Person 8','Person 8'),
	(9,'Person 9','Person 9'),
	(10,'Person 10','Person 10');

/*!40000 ALTER TABLE `PERSON` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table PERSON_HOBBY
# ------------------------------------------------------------

DROP TABLE IF EXISTS `PERSON_HOBBY`;

CREATE TABLE `PERSON_HOBBY` (
  `persons_ID` int(11) NOT NULL,
  `hobbies_ID` int(11) NOT NULL,
  PRIMARY KEY (`persons_ID`,`hobbies_ID`),
  KEY `FK_PERSON_HOBBY_hobbies_ID` (`hobbies_ID`),
  CONSTRAINT `FK_PERSON_HOBBY_hobbies_ID` FOREIGN KEY (`hobbies_ID`) REFERENCES `HOBBY` (`ID`),
  CONSTRAINT `FK_PERSON_HOBBY_persons_ID` FOREIGN KEY (`persons_ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `PERSON_HOBBY` WRITE;
/*!40000 ALTER TABLE `PERSON_HOBBY` DISABLE KEYS */;

INSERT INTO `PERSON_HOBBY` (`persons_ID`, `hobbies_ID`)
VALUES
	(1,1),
	(2,2),
	(3,3),
	(4,4),
	(5,5),
	(6,6),
	(7,7),
	(8,8),
	(9,9),
	(10,10);

/*!40000 ALTER TABLE `PERSON_HOBBY` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table PHONE
# ------------------------------------------------------------

DROP TABLE IF EXISTS `PHONE`;

CREATE TABLE `PHONE` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NUMBER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
