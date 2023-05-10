CREATE DATABASE  IF NOT EXISTS `bq8mr1ofkwm41wihlvic` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bq8mr1ofkwm41wihlvic`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: bq8mr1ofkwm41wihlvic-mysql.services.clever-cloud.com    Database: bq8mr1ofkwm41wihlvic
-- ------------------------------------------------------
-- Server version	8.0.22-13

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

-- SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ 'a05a675a-1414-11e9-9c82-cecd01b08c7e:1-491550428, 
-- a38a16d0-767a-11eb-abe2-cecd029e558e:1-250516963'; 

--
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Admin` (
  `idAdmin` int NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  `idDoctor` int NOT NULL,
  PRIMARY KEY (`idAdmin`),
  KEY `FK_idAdmin_idx` (`idDoctor`),
  CONSTRAINT `FK_idAdmin` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`id_doctor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES (1,'Carlos Lopez','c12345/',1);
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Consulta`
--

DROP TABLE IF EXISTS `Consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Consulta` (
  `idConsulta` int NOT NULL,
  `No.Clinica` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `idDoctor` int NOT NULL,
  `idCita` int NOT NULL,
  PRIMARY KEY (`idConsulta`),
  KEY `FK_idConsulta_idx` (`idDoctor`),
  KEY `FK_idConsulta_idx1` (`idCita`),
  CONSTRAINT `FK_idConsulta` FOREIGN KEY (`idDoctor`) REFERENCES `doctor` (`id_doctor`),
  CONSTRAINT `FK_idConsultaa` FOREIGN KEY (`idCita`) REFERENCES `cita` (`idCita`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Consulta`
--

LOCK TABLES `Consulta` WRITE;
/*!40000 ALTER TABLE `Consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `Consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Datos_de_Contacto`
--

DROP TABLE IF EXISTS `Datos_de_Contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Datos_de_Contacto` (
  `idDatosContacto` int NOT NULL,
  `No_Celular` varchar(45) NOT NULL,
  `Telefono1` varchar(45) DEFAULT NULL,
  `Telefono2` varchar(45) DEFAULT NULL,
  `Correo1` varchar(45) NOT NULL,
  `Coreo2` varchar(45) DEFAULT NULL,
  `Direccion1` varchar(45) NOT NULL,
  `Direccion2` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDatosContacto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Datos_de_Contacto`
--

LOCK TABLES `Datos_de_Contacto` WRITE;
/*!40000 ALTER TABLE `Datos_de_Contacto` DISABLE KEYS */;
INSERT INTO `Datos_de_Contacto` VALUES (1,'12453678','15457896',NULL,'Clopez1@.gemail.com ',NULL,'Av los Cipreces Villa Nieva Guatemala ',NULL),(2,'13254569',NULL,NULL,'Clopez@gmail.com',NULL,'Av. Los cipreces Villa Nueva Guatemala',NULL);
/*!40000 ALTER TABLE `Datos_de_Contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Expediente`
--

DROP TABLE IF EXISTS `Expediente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Expediente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo_sangre` varchar(45) NOT NULL,
  `estatura` varchar(45) NOT NULL,
  `peso` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Expediente`
--

LOCK TABLES `Expediente` WRITE;
/*!40000 ALTER TABLE `Expediente` DISABLE KEYS */;
INSERT INTO `Expediente` VALUES (1,'A+','1.62','120L');
/*!40000 ALTER TABLE `Expediente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Laboratorio`
--

DROP TABLE IF EXISTS `Laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Laboratorio` (
  `idLaboratorio` int NOT NULL,
  `Tipo_Laboratorio` varchar(45) NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `idReceta` int NOT NULL,
  PRIMARY KEY (`idLaboratorio`),
  KEY `FK_idLaboratorio_idx` (`idReceta`),
  CONSTRAINT `FK_idLaboratorio` FOREIGN KEY (`idReceta`) REFERENCES `Receta` (`idReceta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Laboratorio`
--

LOCK TABLES `Laboratorio` WRITE;
/*!40000 ALTER TABLE `Laboratorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `Laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Receta`
--

DROP TABLE IF EXISTS `Receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Receta` (
  `idReceta` int NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `Medicamentos` varchar(45) NOT NULL,
  `Dosis` varchar(45) NOT NULL,
  `idConsuta` int NOT NULL,
  PRIMARY KEY (`idReceta`),
  KEY `FK_Receta _idx` (`idConsuta`),
  CONSTRAINT `FK_Receta ` FOREIGN KEY (`idConsuta`) REFERENCES `Consulta` (`idConsulta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Receta`
--

LOCK TABLES `Receta` WRITE;
/*!40000 ALTER TABLE `Receta` DISABLE KEYS */;
/*!40000 ALTER TABLE `Receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cita` (
  `idCita` int NOT NULL,
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `idExpediente` int NOT NULL,
  PRIMARY KEY (`idCita`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `direccion` (
  `direccionid` int NOT NULL AUTO_INCREMENT,
  `direccion` varchar(100) NOT NULL,
  `personaid` double NOT NULL,
  PRIMARY KEY (`direccionid`),
  KEY `direccion_personaid_idx` (`personaid`),
  CONSTRAINT `direccion_persondpi` FOREIGN KEY (`personaid`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
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
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `id_doctor` int NOT NULL,
  `licencia` varchar(45) NOT NULL,
  `turno` varchar(45) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `especialidad` varchar(45) NOT NULL,
  PRIMARY KEY (`id_doctor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'123456-9','Matituno ','Encargado ','Genaral ');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `email` (
  `idemail` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `persondpi` double NOT NULL,
  PRIMARY KEY (`idemail`),
  KEY `email_personadpi_idx` (`persondpi`),
  CONSTRAINT `email_personadpi` FOREIGN KEY (`persondpi`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email`
--

LOCK TABLES `email` WRITE;
/*!40000 ALTER TABLE `email` DISABLE KEYS */;
/*!40000 ALTER TABLE `email` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `dpi` double NOT NULL,
  `genero` varchar(10) NOT NULL,
  `edad` int NOT NULL,
  `primer_nombre` varchar(20) NOT NULL,
  `segundo_nombre` varchar(20) DEFAULT NULL,
  `primer_apellido` varchar(20) NOT NULL,
  `sapellido` varchar(20) NOT NULL,
  PRIMARY KEY (`dpi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (53645646,'M',3,'Carlos','Noe','Lopez','Gomez'),(1231231231,'Maculinos',20,'Carlos','Noe','Lopez','Gomez'),(5364564645,'M',20,'Carlos','Noe','Lopez','Gomez'),(5645645454,'Maculino',20,'Carlos','Noe','Lopez','Gomez'),(9645855460809,'M',3,'Carlos','Noe','Lopez','Gomez');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono`
--

DROP TABLE IF EXISTS `telefono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `telefono` (
  `telefonoid` int NOT NULL AUTO_INCREMENT,
  `numero_telefono` varchar(15) NOT NULL,
  `personadpi` double NOT NULL,
  PRIMARY KEY (`telefonoid`),
  KEY `telfono_personadpi_idx` (`personadpi`),
  CONSTRAINT `telfono_personadpi` FOREIGN KEY (`personadpi`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefono` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-08 21:49:41
