CREATE DATABASE  IF NOT EXISTS `bq8mr1ofkwm41wihlvic` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `bq8mr1ofkwm41wihlvic`;
-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: bq8mr1ofkwm41wihlvic
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `idadmin` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `contrasinia` varchar(45) NOT NULL,
  `doctorid` int(11) DEFAULT NULL,
  PRIMARY KEY (`idadmin`),
  KEY `admin_doctorid_idx` (`doctorid`),
  CONSTRAINT `admin_doctorid` FOREIGN KEY (`doctorid`) REFERENCES `doctor` (`doctorid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'Carlos Lopez','c12345/',NULL);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cita` (
  `citaid` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `peso` decimal(5,0) DEFAULT NULL,
  `altura` decimal(5,0) DEFAULT NULL,
  `personaid` bigint(20) NOT NULL,
  `clinicaid` int(11) DEFAULT NULL,
  PRIMARY KEY (`citaid`),
  KEY `cita_personaid` (`personaid`),
  KEY `cita_clinicaid` (`clinicaid`),
  CONSTRAINT `cita_clinicaid` FOREIGN KEY (`clinicaid`) REFERENCES `clinica` (`id`),
  CONSTRAINT `cita_personaid` FOREIGN KEY (`personaid`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` VALUES (1,'0000-00-00','00:00:01',12,125,2,1);
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinica`
--

DROP TABLE IF EXISTS `clinica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clinica` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `clinica` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinica`
--

LOCK TABLES `clinica` WRITE;
/*!40000 ALTER TABLE `clinica` DISABLE KEYS */;
INSERT INTO `clinica` VALUES (1,'Hospital Yarden Calzada San Juan Gutemala'),(2,'CENTRO MEDICO SAN ANGEL'),(3,'Hospital Roosevelt'),(4,'Hospital Infantil de Infectología y Rehabilitación'),(5,'Hospital San Vicente'),(6,'Hospital San Vicente'),(7,'Hospital Nacional de Salud Mental Federico Mora'),(8,'Hospital De Amatitlán'),(9,'Hospital de La Amistad'),(10,'Hospital El Progreso'),(11,'Hospital Pedro De Bethancourt'),(12,'Hospital Nacional de Chimaltenango'),(13,'Hospital Regional De Escuintla'),(14,'Hospital Distrital De Tiquisate'),(15,'Hospital Regional De Cuilapa'),(16,'Hospital Departamental de Sololá');
/*!40000 ALTER TABLE `clinica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consulta`
--

DROP TABLE IF EXISTS `consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consulta` (
  `consultaid` int(11) NOT NULL AUTO_INCREMENT,
  `citaid` int(11) NOT NULL,
  `doctorid` int(11) NOT NULL,
  PRIMARY KEY (`consultaid`),
  KEY `consutla_doctorid_idx` (`doctorid`),
  KEY `consulta_citaid_idx` (`citaid`),
  CONSTRAINT `consulta_citaid` FOREIGN KEY (`citaid`) REFERENCES `cita` (`citaid`),
  CONSTRAINT `consulta_doctorid` FOREIGN KEY (`doctorid`) REFERENCES `doctor` (`doctorid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consulta`
--

LOCK TABLES `consulta` WRITE;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
INSERT INTO `consulta` VALUES (1,1,1);
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `direccionid` int(11) NOT NULL AUTO_INCREMENT,
  `direccion` varchar(100) NOT NULL,
  `personaid` bigint(13) NOT NULL,
  PRIMARY KEY (`direccionid`),
  KEY `direccion_persondpi` (`personaid`),
  CONSTRAINT `direccion_persondpi` FOREIGN KEY (`personaid`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `doctor` (
  `doctorid` int(11) NOT NULL AUTO_INCREMENT,
  `licencia` varchar(45) NOT NULL,
  `turno` varchar(45) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `especialidad` varchar(45) NOT NULL,
  `personaid` bigint(13) NOT NULL,
  PRIMARY KEY (`doctorid`),
  UNIQUE KEY `licencia_UNIQUE` (`licencia`),
  KEY `doctor_personaid` (`personaid`),
  CONSTRAINT `doctor_personaid` FOREIGN KEY (`personaid`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'12','4','1','1',1);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email` (
  `idemail` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) NOT NULL,
  `persondpi` bigint(13) NOT NULL,
  PRIMARY KEY (`idemail`),
  KEY `email_personadpi` (`persondpi`),
  CONSTRAINT `email_personadpi` FOREIGN KEY (`persondpi`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email`
--

LOCK TABLES `email` WRITE;
/*!40000 ALTER TABLE `email` DISABLE KEYS */;
/*!40000 ALTER TABLE `email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genero`
--

DROP TABLE IF EXISTS `genero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `genero` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genero`
--

LOCK TABLES `genero` WRITE;
/*!40000 ALTER TABLE `genero` DISABLE KEYS */;
INSERT INTO `genero` VALUES (1,'Masculino'),(2,'Femenino'),(3,'Otros');
/*!40000 ALTER TABLE `genero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorio`
--

DROP TABLE IF EXISTS `laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratorio` (
  `laboratorioid` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_laboratorio` varchar(45) NOT NULL,
  `consultaid` int(11) NOT NULL,
  PRIMARY KEY (`laboratorioid`),
  KEY `laboratori_consultaid_idx` (`consultaid`),
  CONSTRAINT `laboratori_consultaid` FOREIGN KEY (`consultaid`) REFERENCES `consulta` (`consultaid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorio`
--

LOCK TABLES `laboratorio` WRITE;
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` VALUES (1,'Sangre',1);
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `dpi` bigint(13) NOT NULL,
  `generoid` int(11) NOT NULL,
  `edad` int(11) NOT NULL,
  `primer_nombre` varchar(20) NOT NULL,
  `segundo_nombre` varchar(20) DEFAULT NULL,
  `primer_apellido` varchar(20) NOT NULL,
  `sapellido` varchar(20) NOT NULL,
  `bloodid` int(11) NOT NULL,
  `paciente` tinyint(4) NOT NULL,
  PRIMARY KEY (`dpi`),
  KEY `person_blodid` (`bloodid`),
  KEY `person_generoid` (`generoid`),
  CONSTRAINT `person_blodid` FOREIGN KEY (`bloodid`) REFERENCES `tipo_sangre` (`id`),
  CONSTRAINT `person_generoid` FOREIGN KEY (`generoid`) REFERENCES `genero` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,1,25,'Cesar','Noe','Tzaj','Gabriel',1,0),(2,2,24,'Fernando',NULL,'Gomez','Lopez',2,1);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `receta`
--

DROP TABLE IF EXISTS `receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `receta` (
  `recetaid` int(11) NOT NULL AUTO_INCREMENT,
  `medicamentos` varchar(200) NOT NULL,
  `dosis` varchar(45) NOT NULL,
  `consultaid` int(11) NOT NULL,
  PRIMARY KEY (`recetaid`),
  KEY `receta_consultaid_idx` (`consultaid`),
  CONSTRAINT `receta_consultaid` FOREIGN KEY (`consultaid`) REFERENCES `consulta` (`consultaid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receta`
--

LOCK TABLES `receta` WRITE;
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
INSERT INTO `receta` VALUES (1,'Amoxicilina','500mg cada 8hrs',1);
/*!40000 ALTER TABLE `receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono`
--

DROP TABLE IF EXISTS `telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefono` (
  `telefonoid` int(11) NOT NULL AUTO_INCREMENT,
  `numero_telefono` varchar(15) NOT NULL,
  `personadpi` bigint(13) NOT NULL,
  PRIMARY KEY (`telefonoid`),
  KEY `telefono_personaid` (`personadpi`),
  CONSTRAINT `telefono_personaid` FOREIGN KEY (`personadpi`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_sangre`
--

DROP TABLE IF EXISTS `tipo_sangre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipo_sangre` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_sangre` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_sangre`
--

LOCK TABLES `tipo_sangre` WRITE;
/*!40000 ALTER TABLE `tipo_sangre` DISABLE KEYS */;
INSERT INTO `tipo_sangre` VALUES (1,'A+'),(2,'O+'),(3,'B+'),(4,'AB+'),(5,'A-'),(6,'O-'),(7,'B-'),(8,'AB-');
/*!40000 ALTER TABLE `tipo_sangre` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-18 22:24:48
