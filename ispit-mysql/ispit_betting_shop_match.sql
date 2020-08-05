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
-- Table structure for table `betting_shop_match`
--

DROP TABLE IF EXISTS `betting_shop_match`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `betting_shop_match` (
  `betting_shop_match_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `betting_shop_id` int(10) unsigned NOT NULL,
  `match_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`betting_shop_match_id`),
  KEY `fk_betting_shop_match_betting_shop_id_idx` (`betting_shop_id`),
  KEY `fk_betting_shop_match_match_id_idx` (`match_id`),
  CONSTRAINT `fk_betting_shop_match_betting_shop_id` FOREIGN KEY (`betting_shop_id`) REFERENCES `betting_shop` (`betting_shop_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_betting_shop_match_match_id` FOREIGN KEY (`match_id`) REFERENCES `matches` (`match_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `betting_shop_match`
--

LOCK TABLES `betting_shop_match` WRITE;
/*!40000 ALTER TABLE `betting_shop_match` DISABLE KEYS */;
INSERT INTO `betting_shop_match` VALUES (1,1,22),(2,1,5),(3,1,1),(4,2,3),(5,2,9),(6,2,12),(7,3,18),(8,3,10),(9,3,25),(10,3,24),(11,4,14),(12,4,4),(13,1,17),(14,2,2),(15,4,19),(16,4,7),(17,5,8),(18,5,20),(19,5,11),(20,5,23),(25,6,6),(26,6,13),(27,6,15),(28,6,16),(29,6,21);
/*!40000 ALTER TABLE `betting_shop_match` ENABLE KEYS */;
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
