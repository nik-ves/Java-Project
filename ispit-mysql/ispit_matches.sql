-- MariaDB dump 10.17  Distrib 10.4.13-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: ispit
-- ------------------------------------------------------
-- Server version	10.4.13-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `matches`
--

DROP TABLE IF EXISTS `matches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `matches` (
  `match_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `sport` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `date` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `odd_1` decimal(3,2) unsigned NOT NULL,
  `odd_2` decimal(3,2) unsigned NOT NULL,
  PRIMARY KEY (`match_id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `matches`
--

LOCK TABLES `matches` WRITE;
/*!40000 ALTER TABLE `matches` DISABLE KEYS */;
INSERT INTO `matches` VALUES (1,'Fudbal','Sreda',1.63,2.55),(2,'Tenis','Ponedeljak',3.11,1.13),(3,'Kosarka','Ponedeljak',7.50,2.11),(4,'Hokej','Ponedeljak',3.81,4.19),(5,'Bejzbol','Ponedeljak',1.41,2.33),(6,'Fudbal','Ponedeljak',6.74,3.61),(7,'Tenis','Utorak',1.68,1.33),(8,'Kosarka','Utorak',8.88,4.78),(9,'Hokej','Utorak',3.65,2.78),(10,'Bejzbol','Utorak',4.15,2.99),(11,'Fudbal','Utorak',1.79,2.33),(12,'Kosarka','Sreda',3.33,4.44),(13,'Bejzbol','Sreda',3.45,1.12),(14,'Bejzbol','Cetvrtak',5.13,3.87),(15,'Bejzbol','Petak',4.00,3.31),(16,'Fudbal','Cetvrtak',3.27,4.86),(17,'Fudbal','Petak',1.30,1.55),(18,'Hokej','Sreda',1.34,2.11),(19,'Hokej','Cetvrtak',2.33,4.50),(20,'Hokej','Petak',5.30,4.11),(21,'Kosarka','Cetvrtak',1.33,2.41),(22,'Kosarka','Petak',2.56,3.00),(23,'Tenis','Sreda',2.44,3.50),(24,'Tenis','Cetvrtak',4.10,4.36),(25,'Tenis','Petak',2.11,1.68);
/*!40000 ALTER TABLE `matches` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-06  1:18:27
