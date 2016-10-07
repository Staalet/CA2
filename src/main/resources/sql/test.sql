# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: localhost (MySQL 5.6.28)
# Database: ca2
# Generation Time: 2016-10-07 08:25:33 +0000
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
  `NUMEMPLOYEES` varchar(255) DEFAULT NULL,
  `CVR` varchar(255) DEFAULT NULL,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `MARKETVALUE` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  CONSTRAINT `FK_COMPANY_ID` FOREIGN KEY (`ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `COMPANY` WRITE;
/*!40000 ALTER TABLE `COMPANY` DISABLE KEYS */;

INSERT INTO `COMPANY` (`ID`, `NUMEMPLOYEES`, `CVR`, `DESCRIPTION`, `MARKETVALUE`, `NAME`)
VALUES
	(11,'86','91906979','Description 1','5025','Company 1'),
	(12,'18','91625556','Description 2','5999','Company 2'),
	(13,'91','49943021','Description 3','7963','Company 3'),
	(14,'0','26308319','Description 4','7641','Company 4'),
	(15,'70','27793461','Description 5','838','Company 5'),
	(16,'7','50723315','Description 6','5315','Company 6'),
	(17,'94','46485882','Description 7','3383','Company 7'),
	(18,'47','77350138','Description 8','8546','Company 8'),
	(19,'64','75971439','Description 9','6742','Company 9'),
	(20,'44','64554167','Description 10','605','Company 10');

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
  `hobbies_ID` int(11) NOT NULL,
  `persons_ID` int(11) NOT NULL,
  PRIMARY KEY (`hobbies_ID`,`persons_ID`),
  KEY `FK_PERSON_HOBBY_persons_ID` (`persons_ID`),
  CONSTRAINT `FK_PERSON_HOBBY_hobbies_ID` FOREIGN KEY (`hobbies_ID`) REFERENCES `HOBBY` (`ID`),
  CONSTRAINT `FK_PERSON_HOBBY_persons_ID` FOREIGN KEY (`persons_ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `PERSON_HOBBY` WRITE;
/*!40000 ALTER TABLE `PERSON_HOBBY` DISABLE KEYS */;

INSERT INTO `PERSON_HOBBY` (`hobbies_ID`, `persons_ID`)
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
  `INFOENTITY_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_PHONE_INFOENTITY_ID` (`INFOENTITY_ID`),
  CONSTRAINT `FK_PHONE_INFOENTITY_ID` FOREIGN KEY (`INFOENTITY_ID`) REFERENCES `INFOENTITY` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
