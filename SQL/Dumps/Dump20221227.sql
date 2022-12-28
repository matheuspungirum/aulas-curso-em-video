CREATE DATABASE  IF NOT EXISTS `aulaguanabara` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `aulaguanabara`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: aulaguanabara
-- ------------------------------------------------------
-- Server version	5.7.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `cod` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `descricao` text,
  `carga` int(10) unsigned DEFAULT NULL,
  `totalaulas` int(10) unsigned DEFAULT NULL,
  `ano` year(4) DEFAULT '2016',
  PRIMARY KEY (`cod`),
  UNIQUE KEY `nome` (`nome`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (1,'HTML5','Curso de HTML5',40,37,2014),(2,'Algoritmos','Lógica de Programação',20,15,2014),(3,'Photoshop','Dicas de Photoshop CC',10,8,2014),(4,'PHP','Cursos de PHP para Iniciantes',40,20,2015),(5,'Java','Curso de Introdução à linguagem Java',40,29,2015),(6,'MySQL','Banco de Dados MySQL',30,15,2016),(7,'Word','Curso completo de Word',40,30,2016);
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoas`
--

DROP TABLE IF EXISTS `pessoas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `profissao` varchar(20) DEFAULT '',
  `nascimento` date DEFAULT NULL,
  `sexo` enum('M','F') DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  `altura` decimal(3,2) DEFAULT NULL,
  `nacionalidade` varchar(20) DEFAULT 'Brasil',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES (1,'Godofredo',NULL,'1984-01-02','M',78.50,1.83,'Brasil'),(2,'Maria',NULL,'1999-12-30','F',55.20,1.65,'Portugal'),(3,'Creuza',NULL,'1920-12-30','F',50.20,1.65,'Brasil'),(4,'Adalgiza',NULL,'1930-11-02','F',63.20,1.75,'Irlanda'),(5,'Ana',NULL,'1975-12-22','F',52.30,1.45,'EUA'),(6,'Pedro',NULL,'2000-07-15','M',52.30,1.45,'Brasil'),(7,'Maria',NULL,'1999-05-30','F',75.90,1.70,'Porgual'),(8,'Matheus',NULL,'1990-08-16','M',98.60,1.70,'Brasil'),(9,'Cláudio',NULL,'1975-04-22','M',99.00,2.15,'Brasil'),(10,'Pedro',NULL,'1999-12-03','M',87.00,2.00,'Brasil'),(11,'Janaína',NULL,'1987-11-12','F',75.40,1.66,'EUA'),(12,'Godofredo',NULL,'1984-01-02','M',78.50,1.83,'Brasil'),(13,'Maria',NULL,'1999-12-30','F',55.20,1.65,'Portugal'),(14,'Creuza',NULL,'1920-12-30','F',50.20,1.65,'Brasil'),(15,'Adalgiza',NULL,'1930-11-02','F',63.20,1.75,'Irlanda'),(16,'Ana',NULL,'1975-12-22','F',52.30,1.45,'EUA'),(17,'Pedro',NULL,'2000-07-15','M',52.30,1.45,'Brasil'),(18,'Maria',NULL,'1999-05-30','F',75.90,1.70,'Porgual'),(19,'Matheus',NULL,'1990-08-16','M',98.60,1.70,'Brasil'),(20,'Cláudio',NULL,'1975-04-22','M',99.00,2.15,'Brasil'),(21,'Pedro',NULL,'1999-12-03','M',87.00,2.00,'Brasil'),(22,'Janaína',NULL,'1987-11-12','F',75.40,1.66,'EUA');
/*!40000 ALTER TABLE `pessoas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-27 10:48:14
