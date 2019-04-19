-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: retail_service
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category_detail`
--

DROP TABLE IF EXISTS `category_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `category_detail` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `created_date` datetime DEFAULT CURRENT_TIMESTAMP,
  `modified_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_detail`
--

LOCK TABLES `category_detail` WRITE;
/*!40000 ALTER TABLE `category_detail` DISABLE KEYS */;
INSERT INTO `category_detail` VALUES (3,'Kitchen','active','2019-04-19 15:07:56','2019-04-19 15:07:56'),(4,'candies','active','2019-04-19 15:07:56','2019-04-19 15:07:56'),(5,'sweets','active','2019-04-19 15:07:56','2019-04-19 15:07:56'),(6,'vegetables','active','2019-04-19 15:07:56','2019-04-19 15:07:56'),(7,'dsfds','dfdsf','2019-04-19 20:24:11','2019-04-19 20:24:11'),(8,'','','2019-04-19 22:04:23','2019-04-19 22:04:23'),(9,'qwerty','active','2019-04-19 22:05:48','2019-04-19 22:05:48'),(10,'cosmetics','active','2019-04-19 22:09:59','2019-04-19 22:09:59');
/*!40000 ALTER TABLE `category_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_detail`
--

DROP TABLE IF EXISTS `item_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `item_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `categoryId` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_detail`
--

LOCK TABLES `item_detail` WRITE;
/*!40000 ALTER TABLE `item_detail` DISABLE KEYS */;
INSERT INTO `item_detail` VALUES (1,'shrit','2','avialable',200),(2,'potato','6','not available',20),(3,'pressure cooker','3','available',300),(4,'trouser','2','available',NULL);
/*!40000 ALTER TABLE `item_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryId` int(11) DEFAULT NULL,
  `itemId` int(11) DEFAULT NULL,
  `itemName` varchar(45) DEFAULT NULL,
  `categoryName` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `invoiceNo` varchar(45) DEFAULT NULL,
  `dateOfOrder` datetime DEFAULT CURRENT_TIMESTAMP,
  `emailId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
INSERT INTO `order_detail` VALUES (1,2,1,'shirt','Dress','successful',200,'123','2019-04-19 20:10:16','manisha@gmail.com'),(2,2,1,'shirt','Dress','successful',200,'123','2019-04-19 20:10:16','manisha@gmail.com'),(3,6,2,'shirt','Dress','Success',200,'123423','2019-04-19 23:19:28',NULL);
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-20  0:32:49
