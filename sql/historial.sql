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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` VALUES (1,'2023-05-28','23:12:00',150,125,1,1),(5,'2023-04-10','23:59:00',NULL,NULL,1,1),(6,'2023-12-25','10:59:00',150,125,1,2);
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
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departamento` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'Peten'),(2,'Izabal'),(3,'Alta Verapaz'),(4,'Quiche'),(5,'Huehuetenango'),(6,'Escuintla'),(7,'San Marcos'),(8,'Jutiapa'),(9,'Baja Verapaz'),(10,'Santa Rosa'),(11,'Zacapa'),(12,'Suchitepequez'),(13,'Guatemala'),(14,'Jalapa'),(15,'Chimaltenango'),(16,'Quetzaltenango'),(17,'El Progreso'),(18,'Retalhuleu'),(19,'Solola'),(20,'Totonicapan'),(21,'Sacatepequez');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `direccionid` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(100) NOT NULL,
  `edificio_colonia` varchar(45) DEFAULT NULL,
  `zona` int(2) NOT NULL,
  `municipioid` int(11) NOT NULL,
  `departamentoid` int(11) NOT NULL,
  `personaid` bigint(13) NOT NULL,
  PRIMARY KEY (`direccionid`),
  KEY `direccion_persondpi` (`personaid`),
  KEY `direccion_municipiopi` (`municipioid`),
  CONSTRAINT `direccion_departamentoid` FOREIGN KEY (`direccionid`) REFERENCES `departamento` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `direccion_persondpi` FOREIGN KEY (`personaid`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,'3ra calle ','a',7,1,1,1),(2,'6 ave zona 7 Guatemala',NULL,8,1,1,1);
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
  `activo` tinyint(4) NOT NULL,
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
INSERT INTO `doctor` VALUES (1,'12','4','1','1',1,1);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email`
--

DROP TABLE IF EXISTS `email`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email` (
  `id` int(11) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `persondpi` bigint(13) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `email_personadpi` (`persondpi`),
  CONSTRAINT `email_personadpi` FOREIGN KEY (`persondpi`) REFERENCES `persona` (`dpi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
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
-- Table structure for table `laboratori_tipo`
--

DROP TABLE IF EXISTS `laboratori_tipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratori_tipo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `laboratorio` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=304 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratori_tipo`
--

LOCK TABLES `laboratori_tipo` WRITE;
/*!40000 ALTER TABLE `laboratori_tipo` DISABLE KEYS */;
INSERT INTO `laboratori_tipo` VALUES (1,'Análisis de sangre'),(2,'Análisis de orina'),(3,'Análisis de cálculos renales'),(4,'Amplitud de distribución eritrocitaria'),(5,'Análisis de globulinas'),(6,'Análisis de hemoglobina'),(7,'Análisis de sangre de glucagón'),(8,'Análisis de sangre de la brecha aniónica'),(9,'Análisis de sangre de lipoproteína (a)'),(10,'Análisis de semen'),(11,'Análisis del complemento'),(12,'Análisis del líquido cefalorraquídeo'),(13,'Análisis del líquido pleural'),(14,'Análisis del líquido sinovial'),(15,'Anoscopia'),(16,'Anticuerpos antitiroideos'),(17,'Biopsia de ganglio centinela'),(18,'Biopsia de piel'),(19,'Biopsia de seno'),(20,'Broncoscopia con lavado broncoalveolar'),(21,'Colposcopia'),(22,'Cadenas ligeras libres'),(23,'Cociente de microalbúmina y creatinina'),(24,'Conteo de glóbulos blancos'),(25,'Conteo de glóbulos rojos'),(26,'Conteo de reticulocitos'),(27,'Conteo sanguíneo completo'),(28,'Creatina cinasa'),(29,'Cultivo de esputo'),(30,'Densitometría ósea'),(31,'Diagnóstico diferencial'),(32,'Dióxido de carbono (CO2) en la sangre'),(33,'Ecografía'),(34,'Ecografía Doppler'),(35,'Elastasa fecal'),(36,'Elastografía'),(37,'Electrocardiograma'),(38,'Electroforesis de hemoglobina'),(39,'Electromiografía y estudios de conducción nerviosa'),(40,'Estudio del sueño'),(41,'Evaluación de depresión'),(42,'Evaluación de la depresión posparto'),(43,'Evaluación de obesidad'),(44,'Evaluación de quemaduras'),(45,'Evaluación de salud mental'),(46,'Evaluación de sarpullido'),(47,'Evaluación de trastornos del espectro alcohólico fetal (TEAF)'),(48,'Evaluación de trastornos del espectro autista (TEA)'),(49,'Evaluación del consumo de alcohol'),(50,'Evaluación del riesgo de caídas'),(51,'Evaluación del riesgo de enfermedad cardíaca'),(52,'Evaluación del riesgo de suicidio'),(53,'Evaluación del TDAH'),(54,'Examen de bilirrubina en sangre'),(55,'Examen de cáncer de piel'),(56,'Examen de isoenzimas de la lactato deshidrogenasa (LDH)'),(57,'Examen de la vista'),(58,'Examen de nitrógeno ureico en sangre (NUS)'),(59,'Examen del pie diabético'),(60,'Examen dental'),(61,'Examen neurológico'),(62,'Fluoroscopia'),(63,'Fórmula leucocitaria'),(64,'Fosfatasa alcalina'),(65,'Frotis de sangre'),(66,'Gammagrafía V/Q'),(67,'Glóbulos blancos en las heces'),(68,'Hematocrito'),(69,'Hisopado nasal'),(70,'Histeroscopia'),(71,'Hormona adrenocorticotrópica (ACTH)'),(72,'Laparoscopia'),(73,'Marcadores tumorales'),(74,'Medición de la presión arterial'),(75,'Mielografía'),(76,'Monitorización de fármacos'),(77,'Muestra de vellosidades coriónicas'),(78,'Nivel de acetaminofén'),(79,'Nivel de salicilatos'),(80,'Niveles de amoníaco'),(81,'Niveles de colesterol'),(82,'Niveles de prolactina'),(83,'Panel de patógenos respiratorios'),(84,'Panel metabólico básico'),(85,'Panel metabólico completo (PMC)'),(86,'Pielografía intravenosa (PIV)'),(87,'Proteínas totales y relación albúmina/globulina (A/G)'),(88,'Prueba de ACE'),(89,'Prueba de ácido láctico'),(90,'Prueba de ácido metilmalónico'),(91,'Prueba de ácido úrico'),(92,'Prueba de ADN fetal libre'),(93,'Prueba de AFP (alfafetoproteína)'),(94,'Prueba de albúmina en la sangre'),(95,'Prueba de alcohol en la sangre'),(96,'Prueba de aldosterona'),(97,'Prueba de alergias'),(98,'Prueba de alergias en la piel'),(99,'Prueba de alfa-1 antitripsina'),(100,'Prueba de amilasa'),(101,'Prueba de anticuerpos antinucleares'),(102,'Prueba de anticuerpos antipéptido cíclico citrulinado (anti-CCP)'),(103,'Prueba de anticuerpos contra el músculo liso'),(104,'Prueba de anticuerpos contra los glóbulos rojos'),(105,'Prueba de anticuerpos frente al citoplasma de los neutrófilos'),(106,'Prueba de antidepresivos tricíclicos'),(107,'Prueba de antígeno de cáncer 125 (para cáncer de ovario)'),(108,'Prueba de AST'),(109,'Prueba de calcio en la sangre'),(110,'Prueba de calcio en orina'),(111,'Prueba de calcitonina'),(112,'Prueba de cáncer de seno HER2'),(113,'Prueba de carga viral'),(114,'Prueba de cariotipo'),(115,'Prueba de CA-19-9 en sangre (cáncer de páncreas)'),(116,'Prueba de ceruloplasmina'),(117,'Prueba de cetonas en la orina'),(118,'Prueba de cetonas en sangre'),(119,'Prueba de clamidia'),(120,'Prueba de cloruro en sangre'),(121,'Prueba de cortisol'),(122,'Prueba de creatinina'),(123,'Prueba de cultivo de bacterias'),(124,'Prueba de cultivo fúngico'),(125,'Prueba de detección de fenilcetonuria (FCU)'),(126,'Prueba de embarazo'),(127,'Prueba de enfermedad celíaca'),(128,'Prueba de estimulación por frío'),(129,'Prueba de estreptococos A'),(130,'Prueba de estreptococos del grupo B'),(131,'Prueba de estrógeno'),(132,'Prueba de factor reumatoideo (FR)'),(133,'Prueba de fosfato en la orina'),(134,'Prueba de fosfato en la sangre'),(135,'Prueba de galactosemia'),(136,'Prueba de gamma-glutamil transferasa (GGT)'),(137,'Prueba de gasometría arterial'),(138,'Prueba de glucosa en la orina'),(139,'Prueba de glucosa en la sangre'),(140,'Prueba de gonorrea'),(141,'Prueba de G6PD'),(142,'Prueba de G6PD'),(143,'Prueba de hemoglobina A1c'),(144,'Prueba de hepatitis'),(145,'Prueba de homocisteína'),(146,'Prueba de hormona paratiroidea (PTH)'),(147,'Prueba de huevos y parásitos'),(148,'Prueba de IGF-1 (factor de crecimiento similar a la insulina 1)'),(149,'Prueba de IGF-1 (factor de crecimiento similar a la insulina 1)'),(150,'Prueba de la fiebre del dengue'),(151,'Prueba de la gripe (influenza)'),(152,'Prueba de la hormona antimulleriana'),(153,'Prueba de la médula ósea'),(154,'Prueba de lactato deshidrogenasa (LDH)'),(155,'Prueba de lipasa'),(156,'Prueba de magnesio en la sangre'),(157,'Prueba de marcador tumoral AFP (alfafetoproteína)'),(158,'Prueba de marcador tumoral AFP (alfafetoproteína)'),(159,'Prueba de marcadores tumorales de cáncer de pulmón'),(160,'Prueba de moco en la orina'),(161,'Prueba de mutaciones de MTHFR'),(162,'Prueba de nitritos en la orina'),(163,'Prueba de niveles de la hormona foliculoestimulante (FSH)'),(164,'Prueba de niveles de la hormona foliculoestimulante (FSH)'),(165,'Prueba de niveles de testosterona'),(166,'Prueba de Papanicolaou'),(167,'Prueba de parainfluenza'),(168,'Prueba de PD-L1 (inmunoterapia)'),(169,'Prueba de péptido C'),(170,'Prueba de pH esofágico'),(171,'Prueba de potasio en sangre'),(172,'Prueba de procalcitonina'),(173,'Prueba de progesterona'),(174,'Prueba de proteína C reactiva (PCR)'),(175,'Prueba de proteínas en la orina'),(176,'Prueba de proteínas en la orina'),(177,'Prueba de renina'),(178,'Prueba de sangre de ALT'),(179,'Prueba de sangre de ferritina'),(180,'Prueba de sangre de inmunoglobulinas'),(181,'Prueba de sangre de metales pesados'),(182,'Prueba de sangre de prealbúmina'),(183,'Prueba de sangre de prealbúmina'),(184,'Prueba de sangre de VCM'),(185,'Prueba de sangre de VPM'),(186,'Prueba de sangre de VPM'),(187,'Prueba de sangre de VPM'),(188,'Prueba de sangre de VPM'),(189,'Prueba de síndrome de Down'),(190,'Prueba de sodio en la sangre'),(191,'Prueba de sodio en la sangre'),(192,'Prueba de sulfato de DHEA'),(193,'Prueba de sulfato de DHEA'),(194,'Prueba de tiempo de protrombina e INR (TP/INR)'),(195,'Prueba de tiroxina (T4)'),(196,'Prueba de tos ferina'),(197,'Prueba de TPT (tiempo parcial de tromboplastina)'),(198,'Prueba de tricomoniasis'),(199,'Prueba de tricomoniasis'),(200,'Prueba de troponina'),(201,'Prueba de TSH'),(202,'Prueba de tuberculosis'),(203,'Prueba de uribilinógeno en orina'),(204,'Prueba de vaginosis bacteriana'),(205,'Prueba de varicela y herpes zóster'),(206,'Prueba de VIH'),(207,'Prueba de vitamina B'),(208,'Prueba de vitamina D'),(209,'Prueba de vitamina D'),(210,'Prueba del dímero D'),(211,'Prueba del trastorno de pánico'),(212,'Prueba del trastorno obsesivo-compulsivo (TOC)'),(213,'Prueba del virus del herpes simple (VHS)'),(214,'Prueba del virus del papiloma humano (VPH)'),(215,'Prueba del virus del Zika'),(216,'Prueba del virus sincicial respiratorio (VSR)'),(217,'Prueba genética BCR-ABL'),(218,'Prueba genética de BRCA'),(219,'Prueba genética de BRCA'),(220,'Prueba genética del PTEN'),(221,'Prueba genética TP 53 (proteína tumoral 53)'),(222,'Prueba sin estrés'),(223,'Pruebas autonómicas'),(224,'Pruebas cognitivas'),(225,'Pruebas de alergias alimentarias'),(226,'Pruebas de apendicitis'),(227,'Pruebas de apendicitis'),(228,'Pruebas de audición para niños'),(229,'Pruebas de bacilos acidorresistentes (BAAR)'),(230,'Pruebas de bilirrubina en la orina'),(231,'Pruebas de C. difficile'),(232,'Pruebas de catecolaminas'),(233,'Pruebas de células epiteliales en la orina'),(234,'Pruebas de citomegalovirus (CMV)'),(235,'Pruebas de conmoción cerebral'),(236,'Pruebas de conmoción cerebral'),(237,'Pruebas de detección del uso de drogas'),(238,'Pruebas de detección del uso de drogas'),(239,'Pruebas de detección del uso de drogas'),(240,'Pruebas de drogas'),(241,'Pruebas de drogas'),(242,'Pruebas de drogas'),(243,'Pruebas de drogas'),(244,'Pruebas de función pulmonar'),(245,'Pruebas de glaucoma'),(246,'Pruebas de Helicobacter pylori (H. Pylori)'),(247,'Pruebas de Helicobacter pylori (H. Pylori)'),(248,'Pruebas de la enfermedad de Lyme'),(249,'Pruebas de la hormona del crecimiento'),(250,'Pruebas de legionela'),(251,'Pruebas de legionela'),(252,'Pruebas de malaria'),(253,'Pruebas de miastenia grave (MG)'),(254,'Pruebas de mononucleosis'),(255,'Pruebas de opiáceos'),(256,'Pruebas de opiáceos'),(257,'Pruebas de PCR'),(258,'Pruebas de péptidos natriuréticos (BNP, NT-proBNP)'),(259,'Pruebas de plaquetas'),(260,'Pruebas de porfirina'),(261,'Pruebas de proteína C y proteína S'),(262,'Pruebas de receptores de estrógeno y de progesteronaPruebas de sarampión y paperas'),(263,'Pruebas de sarampión y paperas'),(264,'Pruebas de SARM'),(265,'Pruebas de SARM'),(266,'Pruebas de sífilis'),(267,'Pruebas de tolerancia a la lactosa'),(268,'Pruebas de tolerancia a la lactosa'),(269,'Pruebas de vaciamiento gástrico'),(270,'Pruebas de xilosa'),(271,'Pruebas del equilibrio'),(272,'Pruebas farmacogenéticas'),(273,'Pruebas funcionales hepáticas'),(274,'Pruebas médicas en el hogar'),(275,'Pruebas para detectar infecciones por cándida'),(276,'Pruebas prenatales'),(277,'Pruebas rápidas'),(278,'Pruebas y bancos de sangre del cordón umbilical'),(279,'Pulsioximetría'),(280,'Quimotripsina en heces'),(281,'Quimotripsina en heces'),(282,'Tasa de sedimentación eritrocítica'),(283,'Tinción de Gram'),(284,'Tiroglobulina'),(285,'Tomografía por emisión de positrones'),(286,'Tránsito esofagogastroduodenal'),(287,'Videonistagmografía (VNG)'),(288,'17-hidroxiprogesterona'),(289,'Tomografía computarizada'),(290,'Tomografía computarizada'),(291,'Mamografía'),(292,'Fluoroscopia con escaneo'),(293,'Radiografías simples'),(294,'Tomografía por emisión de positrones'),(295,'Ultasonido'),(296,'Angiografía'),(297,'Vertebroplastia y cifoplastia'),(298,'Biopsias por punción'),(299,'Biopsia de mama'),(300,'Biopsia de mama'),(301,'Ecografía'),(302,'Rayos x'),(303,'Biopsia');
/*!40000 ALTER TABLE `laboratori_tipo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laboratorio`
--

DROP TABLE IF EXISTS `laboratorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laboratorio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `laboratorioid` int(11) NOT NULL,
  `comentario` varchar(250) DEFAULT NULL,
  `consultaid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `laboratori_consultaid_idx` (`consultaid`),
  KEY `laboratori_tipo` (`laboratorioid`),
  CONSTRAINT `laboratori_consultaid` FOREIGN KEY (`consultaid`) REFERENCES `consulta` (`consultaid`),
  CONSTRAINT `laboratori_tipo` FOREIGN KEY (`laboratorioid`) REFERENCES `laboratori_tipo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laboratorio`
--

LOCK TABLES `laboratorio` WRITE;
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` VALUES (1,302,'Rayos en la pierna izquieda',1);
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamentos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `medicamento` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamentos`
--

LOCK TABLES `medicamentos` WRITE;
/*!40000 ALTER TABLE `medicamentos` DISABLE KEYS */;
INSERT INTO `medicamentos` VALUES (1,'Amoxicilina 500mg'),(2,'adsf');
/*!40000 ALTER TABLE `medicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `municipio`
--

DROP TABLE IF EXISTS `municipio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `municipio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `municipio` varchar(45) DEFAULT NULL,
  `depid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `municipio_departamentoid` (`depid`),
  CONSTRAINT `municipio_departamentoid` FOREIGN KEY (`depid`) REFERENCES `departamento` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `municipio`
--

LOCK TABLES `municipio` WRITE;
/*!40000 ALTER TABLE `municipio` DISABLE KEYS */;
INSERT INTO `municipio` VALUES (1,'Comalapa',1),(2,'Zaragoza',1);
/*!40000 ALTER TABLE `municipio` ENABLE KEYS */;
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
  `estado` tinyint(4) NOT NULL,
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
  `medicamentoid` int(11) NOT NULL,
  `dosis` int(11) NOT NULL,
  `comentario` varchar(45) DEFAULT NULL,
  `consultaid` int(11) NOT NULL,
  PRIMARY KEY (`recetaid`),
  KEY `receta_consultaid_idx` (`consultaid`),
  KEY `receta_medicamentoid` (`medicamentoid`),
  CONSTRAINT `receta_consultaid` FOREIGN KEY (`consultaid`) REFERENCES `consulta` (`consultaid`),
  CONSTRAINT `receta_medicamentoid` FOREIGN KEY (`medicamentoid`) REFERENCES `medicamentos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `receta`
--

LOCK TABLES `receta` WRITE;
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
INSERT INTO `receta` VALUES (1,1,4,'tomar una cada 8hrs',1),(2,1,3,'tomar 2',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono`
--

LOCK TABLES `telefono` WRITE;
/*!40000 ALTER TABLE `telefono` DISABLE KEYS */;
INSERT INTO `telefono` VALUES (1,'546546545',1),(2,'23323242',1),(7,'34433434',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_sangre`
--

LOCK TABLES `tipo_sangre` WRITE;
/*!40000 ALTER TABLE `tipo_sangre` DISABLE KEYS */;
INSERT INTO `tipo_sangre` VALUES (1,'A+'),(2,'O+'),(3,'B+'),(4,'AB+'),(5,'A-'),(6,'O-'),(7,'B-'),(8,'AB-'),(9,'NA');
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

-- Dump completed on 2023-05-27 17:53:40
