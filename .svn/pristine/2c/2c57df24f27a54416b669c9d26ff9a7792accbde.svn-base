-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 192.168.65.188    Database: cms
-- ------------------------------------------------------
-- Server version	5.5.20

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
-- Table structure for table `advancedlog`
--

DROP TABLE IF EXISTS `advancedlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advancedlog` (
  `LOGID` int(11) NOT NULL DEFAULT '0',
  `BUSINESSID` int(12) DEFAULT NULL,
  `CREATOR` int(12) DEFAULT NULL,
  `ADVANCECONTENT` varchar(2048) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `ADVANCESTATUS` char(2) DEFAULT NULL,
  PRIMARY KEY (`LOGID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advancedlog`
--

LOCK TABLES `advancedlog` WRITE;
/*!40000 ALTER TABLE `advancedlog` DISABLE KEYS */;
/*!40000 ALTER TABLE `advancedlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business` (
  `BUSINESSID` int(12) NOT NULL AUTO_INCREMENT,
  `CUSTOMERID` int(12) DEFAULT NULL,
  `LINKMAINID` int(12) DEFAULT NULL,
  `BUSINESSNAME` varchar(512) DEFAULT NULL,
  `BUSINESSTYPEID` int(4) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `BUSINESSSOURCEID` int(4) DEFAULT NULL,
  `PERSALEPRICE` decimal(10,0) DEFAULT NULL,
  `PROBABILITY` decimal(2,0) DEFAULT NULL,
  `VISITTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `VISITCONTENT` varchar(2048) DEFAULT NULL,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `EMPLOYEEID` int(12) DEFAULT NULL,
  PRIMARY KEY (`BUSINESSID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
INSERT INTO `business` VALUES (1,1,1,'23',1,'3',20,12,12,'2017-04-25 05:37:45','ghahah','2017-04-25 05:37:45',NULL),(2,1,2,'12',1,'3',10,11,11,'2017-04-19 06:07:26','','2017-04-19 06:07:26',NULL),(3,1,1,'hahah',2,'3',20,23,23,'2017-04-12 16:00:00','hehehehhe','2017-04-19 06:22:54',NULL),(4,1,1,'商机1',1,'3',20,12,12,'2017-03-21 05:59:33','','2017-04-20 05:39:44',NULL),(5,1,1,'商机2',1,'3',10,23,12,'2017-03-22 05:59:35','','2017-04-20 05:49:19',NULL),(6,1,1,'商机3',1,'3',10,23,12,'2017-03-21 05:59:39','','2017-04-20 05:58:51',NULL),(7,4,4,'222222',2,'3',10,122,22,'2017-04-19 16:00:00','222','2017-04-26 08:19:46',NULL),(8,2,2,'2打的',1,'1',20,222,22,'2017-04-24 16:00:00','嗯嗯嗯','2017-04-26 08:20:51',NULL),(9,3,3,'2测试时',1,'1',20,11,13,'2017-04-27 16:00:00','222','2017-04-26 08:21:26',NULL);
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `businesssource`
--

DROP TABLE IF EXISTS `businesssource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `businesssource` (
  `SOURCEID` int(4) DEFAULT NULL,
  `SOURCENAME` varchar(512) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `businesssource`
--

LOCK TABLES `businesssource` WRITE;
/*!40000 ALTER TABLE `businesssource` DISABLE KEYS */;
INSERT INTO `businesssource` VALUES (1001,'网络营销'),(1002,'公开媒体'),(1003,'合作伙伴'),(1004,'员工介绍'),(1005,'广告'),(1006,'推销电话'),(1007,'朋友推荐'),(1008,'同事介绍'),(1009,'其他'),(10,'电话营销'),(20,'网络营销');
/*!40000 ALTER TABLE `businesssource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `businesstype`
--

DROP TABLE IF EXISTS `businesstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `businesstype` (
  `TYPEID` int(4) DEFAULT NULL,
  `TYPENAME` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `businesstype`
--

LOCK TABLES `businesstype` WRITE;
/*!40000 ALTER TABLE `businesstype` DISABLE KEYS */;
INSERT INTO `businesstype` VALUES (1,'新业务'),(2,'现有业务');
/*!40000 ALTER TABLE `businesstype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `COMMENTID` int(12) NOT NULL AUTO_INCREMENT,
  `RECORDID` int(12) DEFAULT NULL,
  `COMMENTEMPLOYEE` int(12) DEFAULT NULL,
  `DETAIL` varchar(4000) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`COMMENTID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (2,5,10,'333','2017-04-25 05:52:00');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CUSTOMERID` int(12) NOT NULL AUTO_INCREMENT,
  `CUSTOMERNAME` varchar(512) DEFAULT NULL,
  `POSTCODE` varchar(12) DEFAULT NULL,
  `FIELDID` int(4) DEFAULT NULL,
  `SOURCEID` int(4) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `EMPLOYEENUMBERS` varchar(128) DEFAULT NULL,
  `PRINPICAL` int(12) DEFAULT NULL,
  `ADDRESS` varchar(1024) DEFAULT NULL,
  `TAG` varchar(512) DEFAULT NULL,
  `REMARKS` varchar(2048) DEFAULT NULL,
  `BUSINESSVOLUME` varchar(2048) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMERID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'耿龙刚测试','11',1,1002,'2017-04-25 06:54:01','2017-04-18 08:55:21',NULL,2,NULL,'耿龙刚测试耿龙刚测试耿龙刚测试','耿龙刚测试耿龙刚测试耿龙刚测试耿龙刚测试耿龙刚测试','2001'),(2,'ll','11',1,1001,'2017-03-25 05:36:06','2017-04-18 08:55:40',NULL,2,NULL,'11','11',''),(3,'张超张超修改修改','225455',1,1001,'2017-04-25 05:36:15','2017-04-22 10:44:22',NULL,3,NULL,'张超','张超张超张超张超',''),(4,'江苏万和','210000',6,1007,'2017-04-25 05:45:19','2017-04-25 05:45:19','21-50',3,NULL,'万和','万和万和万和万和','2003');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dailyrecord`
--

DROP TABLE IF EXISTS `dailyrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dailyrecord` (
  `RECORDID` int(12) NOT NULL AUTO_INCREMENT,
  `CREATOR` int(12) DEFAULT NULL,
  `TITLE` varchar(256) DEFAULT NULL,
  `CONTENT` varchar(4000) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `RECORDLX` varchar(20) DEFAULT NULL,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`RECORDID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailyrecord`
--

LOCK TABLES `dailyrecord` WRITE;
/*!40000 ALTER TABLE `dailyrecord` DISABLE KEYS */;
INSERT INTO `dailyrecord` VALUES (4,110,'www','qqqq','2017-04-21 06:00:59','1','2017-04-19 08:47:45'),(5,110,'qwqwq','qwqwq','2017-04-21 06:01:00','2','2017-04-19 08:51:07'),(14,110,'壮观军','东方饭店','2017-04-21 06:01:05','3','2017-04-21 03:27:01'),(15,10,'周报2017年4月25日13:52:22','周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22','2017-04-25 05:52:27','周报','2017-04-25 05:52:27');
/*!40000 ALTER TABLE `dailyrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `department` (
  `DEPARTMENTID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPARTMENTNAME` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`DEPARTMENTID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'产品一部'),(2,'产品二部'),(3,'产品三部');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emmposition`
--

DROP TABLE IF EXISTS `emmposition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emmposition` (
  `POSITIONID` int(11) NOT NULL AUTO_INCREMENT,
  `POSITIONNAME` varchar(512) DEFAULT NULL,
  `POSITIONLEVEL` varchar(3) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`POSITIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emmposition`
--

LOCK TABLES `emmposition` WRITE;
/*!40000 ALTER TABLE `emmposition` DISABLE KEYS */;
INSERT INTO `emmposition` VALUES (12,'经理','2','2017-04-18 03:29:12','2017-04-14 05:29:40'),(13,'普通员工','3','2017-04-18 03:29:03','2017-04-14 05:33:17'),(14,'总监','1','2017-04-14 05:45:06','2017-04-14 05:45:06'),(15,'测试111','2','2017-04-26 10:25:25','2017-04-26 10:25:31'),(16,'测试333','2','2017-04-26 10:42:04','2017-04-26 10:42:06'),(17,'测试222','1','2017-04-26 10:42:13','2017-04-26 10:42:13'),(18,'测试444','3','2017-04-26 10:42:20','2017-04-26 10:42:20'),(19,'测试555','2','2017-04-26 10:42:30','2017-04-26 10:42:30');
/*!40000 ALTER TABLE `emmposition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `EMPLOYEEID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEENAME` varchar(512) DEFAULT NULL,
  `DEPARTMENTID` int(11) DEFAULT NULL,
  `POSITONID` int(11) DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `EMAIL` varchar(256) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `PARENTEMPLOYEEID` int(11) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`EMPLOYEEID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'张三丰修改222',1,14,'18305168559','12@qq.com','1',NULL,'2017-04-21 13:17:46','2017-04-14 06:18:07'),(2,'张三',1,13,'18305168559','34@qq.com','1',1,'2017-04-16 01:32:54','2017-04-14 06:18:12'),(3,'李四',2,12,'119','56@qq.com','0',2,'2017-04-16 01:32:45','2017-04-14 06:18:35'),(4,'王五',3,12,'18305168559','78@qq.com','1',2,'2017-04-16 00:58:06','2017-04-14 06:20:01'),(5,'谷胖子',2,14,'18305168559','568275@qq.com','1',1,'2017-04-15 12:24:49','2017-04-15 12:24:49'),(6,'小谷',2,12,'18305168559','568275@qq.com','1',1,'2017-04-16 00:56:46','2017-04-16 00:56:46'),(7,'谷胖子2',3,13,'18305168559','568275@qq.com','1',2,'2017-04-16 01:32:26','2017-04-16 01:32:26'),(8,'2货小黄超',3,13,'18311115555','18311115555@qq.com','1',2,'2017-04-20 08:04:21','2017-04-20 08:04:21'),(9,'3货小超',1,12,'18311115555','18311115555@qq.com','1',2,'2017-04-21 03:31:09','2017-04-21 03:31:09'),(10,'张超',1,14,'13764111008','7633@qq.com','1',NULL,'2017-04-22 09:45:58','2017-04-22 09:45:58'),(11,'耿龙刚',2,12,'13764111008','7633@qq.com','1',10,'2017-04-22 09:46:23','2017-04-22 09:46:23'),(12,'夏宁',3,13,'13764111008','7633@qq.com','0',11,'2017-04-22 10:17:37','2017-04-22 09:46:49');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `individualtask`
--

DROP TABLE IF EXISTS `individualtask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `individualtask` (
  `TASKID` int(12) NOT NULL AUTO_INCREMENT,
  `TOPIC` varchar(512) DEFAULT NULL,
  `DESCRIPTION` text,
  `RESPONSIBLEPERSON` int(12) DEFAULT NULL,
  `ENDTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `PRIORITY` varchar(2) DEFAULT NULL,
  `STATUS` varchar(2) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `OPERATOR` int(12) DEFAULT NULL,
  `LINKURL` varchar(512) DEFAULT NULL,
  `TASKTYPE` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`TASKID`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individualtask`
--

LOCK TABLES `individualtask` WRITE;
/*!40000 ALTER TABLE `individualtask` DISABLE KEYS */;
INSERT INTO `individualtask` VALUES (23,'主题123','ADASD',2,'2017-04-25 06:56:08','20','10','2017-04-24 01:56:36',5,NULL,NULL),(24,'主题456','WFSF',3,'2017-04-25 06:56:11','10','10','2017-04-24 01:57:06',5,NULL,NULL),(25,'1','啊啊士大夫',3,'2017-04-24 09:08:13','10','10','2017-04-24 06:20:20',10,NULL,NULL),(26,'请问','12而且',3,'2017-04-24 09:08:10','20','10','2017-04-24 06:20:51',10,NULL,NULL),(27,'qew','qweqw',4,'2017-04-25 08:35:17','10','30','2017-04-24 07:30:25',10,NULL,NULL),(28,'主题123','qwe',2,'2017-04-25 06:56:17','20','10','2017-04-24 07:30:46',10,NULL,NULL),(29,'SFGSDFGS','DGFSDFGSD',2,'2017-04-16 16:00:00','10','0','2017-04-24 09:11:01',10,NULL,NULL),(30,'周报2017年4月25日13:52:22','周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22',NULL,'2017-04-25 05:52:27',NULL,NULL,'2017-04-25 05:52:27',10,NULL,'0'),(31,'32425','32425324253242532425',2,'2017-04-25 16:00:00','20','0','2017-04-25 08:39:49',11,NULL,'2');
/*!40000 ALTER TABLE `individualtask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `instationmail`
--

DROP TABLE IF EXISTS `instationmail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `instationmail` (
  `MAILID` int(11) NOT NULL AUTO_INCREMENT,
  `SENDERID` int(11) DEFAULT NULL,
  `RECEIVERID` int(11) DEFAULT NULL,
  `THEME` varchar(4000) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `REMARK` varchar(1) DEFAULT NULL,
  `CREATETIME` timestamp NULL DEFAULT NULL,
  `UPDATETIME` timestamp NULL DEFAULT NULL,
  `CONTENT` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`MAILID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instationmail`
--

LOCK TABLES `instationmail` WRITE;
/*!40000 ALTER TABLE `instationmail` DISABLE KEYS */;
INSERT INTO `instationmail` VALUES (1,5,6,'明天开会','0','0','2017-04-17 06:01:15','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(2,5,6,'明天开会','0','0','2017-04-17 06:01:17','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(3,6,7,'晚上吃饭','0','0','2017-04-17 06:01:18','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(4,6,5,'晚上吃饭','1','1','2017-04-17 06:01:20','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(5,7,5,'后天逛街','2','2','2017-04-17 06:01:21','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(6,1,5,'吃饭','1','0','2017-04-17 06:01:23','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(7,2,5,'睡觉','0','0','2017-04-17 06:02:23','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(8,3,5,'打豆豆','0','2','2017-04-17 06:03:23','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(9,4,5,'吃饭','1','1','2017-04-17 06:04:23','2017-04-17 06:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(10,5,9,'小超是2货','0',NULL,'2017-04-21 13:13:22',NULL,'是的，没错'),(11,10,9,'发件人：张超发件人：张超发件人：张超发件人：张超','0',NULL,'2017-04-22 10:51:23',NULL,'发件人：张超发件人：张超发件人：张超发件人：张超'),(12,10,8,'1111','0',NULL,'2017-04-22 10:56:40',NULL,'11111'),(13,10,1,'张三丰','0',NULL,'2017-04-25 06:15:44',NULL,'张三丰张三丰张三丰'),(14,11,10,'测试邮件一封','1',NULL,'2017-04-25 08:46:06',NULL,'测试邮件一封测试邮件一封测试邮件一封');
/*!40000 ALTER TABLE `instationmail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linkman`
--

DROP TABLE IF EXISTS `linkman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `linkman` (
  `LINKMAINID` int(12) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(256) DEFAULT NULL,
  `SEX` varchar(1) DEFAULT NULL,
  `POSITION` varchar(1024) DEFAULT NULL,
  `NICKNAME` varchar(256) DEFAULT NULL,
  `PHONENUM` int(11) DEFAULT NULL,
  `EMAIL` varchar(512) DEFAULT NULL,
  `QQ` int(13) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `REMARKS` varchar(2048) DEFAULT NULL,
  `QRCODE` varchar(2048) DEFAULT NULL,
  `CUSTOMERID` int(12) DEFAULT NULL,
  PRIMARY KEY (`LINKMAINID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linkman`
--

LOCK TABLES `linkman` WRITE;
/*!40000 ALTER TABLE `linkman` DISABLE KEYS */;
INSERT INTO `linkman` VALUES (1,'ddfdsd','1','2','22',22,'644351063@qq.com',64435,'2017-04-18 09:18:17','2017-04-18 09:18:17','sdssdss',NULL,NULL),(2,'耿龙刚','2','总经理','耿总',110,'11@dd',111,'2017-04-22 10:45:57','2017-04-22 10:45:57','','',NULL),(3,'zhangs','2','232','nihao',134555,'6444@122',366545,'2017-04-22 11:16:17','2017-04-22 11:16:08','212','',NULL),(4,'zc','1','zxczxc','zc',123,'763375777@qq.com',123,'2017-04-24 05:40:37','2017-04-24 05:40:37','123','',NULL),(5,'江苏万和','2','江苏万和','江苏',155,'122@qq.com',112324,'2017-04-26 10:43:44','2017-04-26 10:43:44','江苏万和','',4),(6,'123123','2','111','111',1111,'12@11.com',12312,'2017-04-26 10:44:01','2017-04-26 10:44:01','13123','',2);
/*!40000 ALTER TABLE `linkman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEEID` int(11) DEFAULT NULL,
  `EMMPASSWORD` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,2,'123'),(2,6,'123'),(3,7,'123'),(4,8,'123'),(5,9,'123'),(6,10,'123'),(7,11,'123'),(8,12,'123');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `MENUID` int(11) NOT NULL AUTO_INCREMENT,
  `MENUNAME` varchar(256) DEFAULT NULL,
  `MENUURL` varchar(1024) DEFAULT NULL,
  `PICTURES` varchar(1024) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `PARENTMENUID` int(11) DEFAULT NULL,
  PRIMARY KEY (`MENUID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES (9,'系统设置','javascript:;','se7en-gear',NULL,'2017-04-22 09:42:56','2017-04-22 09:24:43',NULL),(10,'个人办公','javascript:;','se7en-flag',NULL,'2017-04-22 09:42:57','2017-04-22 09:30:08',NULL),(11,'员工管理','EmployeeServlet?method=getAllEmployee',NULL,NULL,'2017-04-22 09:31:10','2017-04-22 09:31:10',9),(12,'职位管理','EmmPositionServlet?method=getAllEmmPosition',NULL,NULL,'2017-04-22 09:31:31','2017-04-22 09:31:31',9),(13,'菜单管理','MenuServlet?method=getAllMenu',NULL,NULL,'2017-04-22 09:31:45','2017-04-22 09:31:45',9),(14,'电子邮件','InstationMailServlet?method=getAllMail&flag=0',NULL,NULL,'2017-04-22 09:32:10','2017-04-22 09:32:10',10),(15,'客户管理','javascript:;','se7en-star',NULL,'2017-04-22 09:42:58','2017-04-22 09:35:34',NULL),(16,'客户','CustomerServlet?method=getAllCustomer',NULL,NULL,'2017-04-22 09:35:56','2017-04-22 09:35:56',15),(17,'产品管理','javascript:;','se7en-forms',NULL,'2017-04-22 09:43:01','2017-04-22 09:40:55',NULL),(18,'产品','ProductServlet?method=allProducts',NULL,NULL,'2017-04-22 09:43:57','2017-04-22 09:43:57',17),(19,'我的任务','IndividualTaskServlet?method=getAllTaskAsPage',NULL,NULL,'2017-04-22 09:45:00','2017-04-22 09:45:00',10),(20,'销售单','OrderServlet?method=allOrders',NULL,NULL,'2017-04-22 09:48:11','2017-04-22 09:48:11',17),(21,'出入库','ProcessServlet?method=allProcessDtos',NULL,NULL,'2017-04-22 09:48:30','2017-04-22 09:48:30',17),(22,'库存明细','InventoryServlet?method=allInventoryDtos',NULL,NULL,'2017-04-22 09:48:51','2017-04-22 09:48:51',17),(23,'产品类别','ProductTypeServlet?method=allProductTypes',NULL,NULL,'2017-04-22 09:49:08','2017-04-22 09:49:08',17),(24,'仓库管理','StoreServlet?method=getAllStoresByPage',NULL,NULL,'2017-04-22 09:49:25','2017-04-22 09:49:25',17),(25,'联系人','LinkManServlet?method=getAllLinkMan',NULL,NULL,'2017-04-22 09:51:21','2017-04-22 09:51:21',15),(26,'商机','BuinessServlet?method=getAllBusiness',NULL,NULL,'2017-04-22 09:51:37','2017-04-22 09:51:37',15),(28,'控制台','ControlServlet?method=countAll','se7en-home',NULL,'2017-04-22 10:15:33','2017-04-22 09:59:41',NULL);
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `ORDERID` int(12) NOT NULL AUTO_INCREMENT,
  `ORDERSEQ` varchar(128) DEFAULT NULL,
  `TITLE` varchar(512) DEFAULT NULL,
  `CUSTOMERID` int(11) DEFAULT NULL,
  `TOTALMONEY` decimal(10,0) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `OPERATOR` int(12) DEFAULT NULL,
  `ORDERTIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CREATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ORDERTYPE` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ORDERID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2123','aa',1,213,'3',2,'2017-04-21 05:18:06','2017-04-21 07:54:10',NULL),(2,'123','ab',2,213,'3',2,'2017-04-21 05:18:16','2017-04-22 10:37:21',NULL),(3,'1425','ac',3,543,'3',3,'2017-04-21 05:18:20','2017-04-25 05:43:56',NULL),(4,'2213','bb',3,352,'3',3,'2017-04-21 05:18:10','2017-04-21 05:19:28',NULL),(5,'542','cc',4,24,'2',3,'2017-04-21 05:17:08','0000-00-00 00:00:00',NULL),(6,'73','dd',4,25,'2',3,'2017-04-21 05:16:49','0000-00-00 00:00:00',NULL),(7,'231','qe',1,31,'3',2,'2017-04-21 05:16:52','2017-04-24 09:44:42',NULL),(8,'1234','hre',2,34,'1',4,'2017-04-21 05:18:21','0000-00-00 00:00:00',NULL),(9,'345','fghsg',1,4132,'1',4,'2017-04-21 05:18:22','0000-00-00 00:00:00',NULL),(10,'24','eh',2,23,'1',2,'2017-04-21 05:18:15','2017-04-21 02:51:42',NULL),(11,'2017042218344581',NULL,NULL,3300,'1',NULL,'2017-04-22 10:34:45','2017-04-22 10:34:45',NULL),(12,'2017042451','qwqe',1,25986,'1',5,'2017-04-24 09:44:58','2017-04-24 09:44:58',NULL),(13,'2017042431','sf',3,150429,'1',5,'2017-04-24 09:45:10','2017-04-24 09:45:10',NULL),(14,'2017042421','sad',1,39852,'1',5,'2017-04-24 09:46:52','2017-04-24 09:46:52',NULL),(15,'2017042441','123',1,15129,'1',5,'2017-04-24 09:48:38','2017-04-24 09:48:38',NULL),(16,'2017042401','带我去',1,49203,'1',10,'2017-04-24 09:51:48','2017-04-24 09:51:48',NULL),(17,'2017042421','qwe',1,7659,'1',10,'2017-04-24 10:03:51','2017-04-24 10:03:51',NULL),(18,'2017042571','企鹅',1,2604,'3',10,'2017-04-25 05:35:51','2017-04-25 05:54:19',NULL),(19,'2017042551','撒旦',1,16482,'3',10,'2017-04-25 05:36:04','2017-04-25 05:36:47',NULL),(20,'2017042571','违反',1,1476,'1',10,'2017-04-25 05:36:18','2017-04-25 05:36:11',NULL),(21,'2017042591','法国人日',1,1488,'3',10,'2017-04-25 05:37:16','2017-04-25 05:54:14',NULL),(22,'2017042591','热奇怪',1,2015,'1',10,'2017-04-25 05:42:00','2017-04-25 05:41:53',NULL),(23,'2017042581','日期',1,15252,'2',10,'2017-04-25 05:42:14','2017-04-25 05:44:13',NULL),(24,'2017042571','各方',1,1488,'1',10,'2017-04-25 05:42:42','2017-04-25 05:42:36',NULL),(25,'2017042591','位',1,2808,'1',10,'2017-04-25 05:44:31','2017-04-25 05:44:24',NULL),(26,'2017042511','个wet',1,3045,'1',10,'2017-04-25 05:44:43','2017-04-25 05:44:36',NULL),(27,'2017042541','前卫',1,51045,'3',10,'2017-04-25 05:58:43','2017-04-25 06:02:55',NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordersdetail`
--

DROP TABLE IF EXISTS `ordersdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordersdetail` (
  `DETAILID` int(12) NOT NULL AUTO_INCREMENT,
  `ORDERID` int(12) DEFAULT NULL,
  `STOREID` int(12) DEFAULT NULL,
  `PRODUCTID` int(12) DEFAULT NULL,
  `BUYNUMS` int(12) DEFAULT NULL,
  `REALPRICES` decimal(10,0) DEFAULT NULL,
  `REALTOTALPRICE` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`DETAILID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordersdetail`
--

LOCK TABLES `ordersdetail` WRITE;
/*!40000 ALTER TABLE `ordersdetail` DISABLE KEYS */;
INSERT INTO `ordersdetail` VALUES (1,1,1,1,100,10,1000),(2,2,2,1,50,3,150),(3,3,3,3,30,30,900),(4,4,4,4,10,20,200),(6,5,2,2,2,2,4),(7,6,3,3,20,3,60),(8,7,2,2,15,4,60),(9,18,NULL,3,21,124,2604),(10,19,NULL,2,123,134,16482),(11,18,NULL,5,12,123,1476),(12,21,NULL,4,12,124,1488),(13,21,NULL,4,13,155,2015),(14,23,NULL,2,123,124,15252),(15,18,NULL,2,12,124,1488),(16,21,NULL,3,12,234,2808),(17,26,NULL,2,21,145,3045),(18,27,NULL,1,123,415,51045);
/*!40000 ALTER TABLE `ordersdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `positionmenurelations`
--

DROP TABLE IF EXISTS `positionmenurelations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `positionmenurelations` (
  `RELATIONID` int(11) NOT NULL AUTO_INCREMENT,
  `POSITIONID` int(11) DEFAULT NULL,
  `MENUID` int(11) DEFAULT NULL,
  PRIMARY KEY (`RELATIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `positionmenurelations`
--

LOCK TABLES `positionmenurelations` WRITE;
/*!40000 ALTER TABLE `positionmenurelations` DISABLE KEYS */;
INSERT INTO `positionmenurelations` VALUES (118,14,9),(119,14,10),(120,14,11),(121,14,12),(122,14,13),(123,14,14),(124,14,15),(125,14,16),(126,14,17),(127,14,18),(128,14,19),(129,14,20),(130,14,21),(131,14,22),(132,14,23),(133,14,24),(134,14,25),(135,14,26),(136,14,28),(137,12,9),(138,12,10),(139,12,11),(140,12,12),(141,12,13),(142,12,14),(143,12,15),(144,12,16),(145,12,17),(146,12,18),(147,12,19),(148,12,20),(149,12,21),(150,12,22),(151,12,23),(152,12,24),(153,12,25),(154,12,26),(155,12,28),(157,13,9),(158,13,10),(159,13,11),(160,13,12),(161,13,13),(162,13,14),(163,13,15),(164,13,16);
/*!40000 ALTER TABLE `positionmenurelations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `process`
--

DROP TABLE IF EXISTS `process`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `process` (
  `PROCESSID` int(12) NOT NULL AUTO_INCREMENT,
  `TYPE` varchar(1) DEFAULT NULL,
  `BUSINESSID` int(12) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `OPINIONS` varchar(512) DEFAULT NULL,
  `OPERATOR` int(12) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`PROCESSID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `process`
--

LOCK TABLES `process` WRITE;
/*!40000 ALTER TABLE `process` DISABLE KEYS */;
INSERT INTO `process` VALUES (1,'1',1,'1','qwe',134,'2017-04-20 06:25:22'),(2,'1',2,'1','we',12,'2017-04-20 06:25:21'),(3,'2',3,'2','rfqa',43,'2017-04-20 06:25:27'),(4,'2',4,'2','fq',22,'2017-04-20 06:25:29'),(5,'2',5,'3','qeg',213,'2017-04-20 06:25:41'),(6,'1',6,'3','eqfg',312,'2017-04-20 06:26:08'),(7,'2',7,'2','qr',63,'2017-04-20 06:52:34'),(8,'1',NULL,'3',NULL,NULL,'2017-04-20 06:52:37'),(9,'2',NULL,'2',NULL,NULL,'2017-04-20 06:52:39');
/*!40000 ALTER TABLE `process` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `PRODUCTID` int(12) NOT NULL AUTO_INCREMENT,
  `PRODTYPE` int(4) DEFAULT NULL,
  `PRODNAME` varchar(512) DEFAULT NULL,
  `PRODSTANDARD` varchar(512) DEFAULT NULL,
  `COSTPRICE` decimal(10,0) DEFAULT NULL,
  `RETAILPRICE` decimal(10,0) DEFAULT NULL,
  `REMARKS` varchar(2048) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `CREATETIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`PRODUCTID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,2,'咸鱼1','asd',12,22,'3','0','2017-04-21 07:47:28','2017-04-25 05:59:32'),(2,2,'咸鱼2','as',12,25,'1','1','2017-04-21 07:47:30','0000-00-00 00:00:00'),(3,3,'咸鱼小超','sad',25,55,'3','1','2017-04-21 07:47:33','0000-00-00 00:00:00'),(4,2,'2货小超','asd',8,22,'1','0','2017-04-21 07:47:42','2017-04-16 14:11:37'),(5,2,'aa5','asdf',6,13,'1','0','2017-04-15 10:05:12','2017-04-16 14:11:53'),(6,3,'aa6','agd',4,21,'ads','1','2017-04-15 10:05:26','0000-00-00 00:00:00'),(7,1,'aa7','asg',7,51,'sdads','0','2017-04-15 10:05:50','2017-04-19 01:40:20'),(8,3,'asd','asf',11,22,'fd','0','2017-04-18 00:55:40','0000-00-00 00:00:00'),(9,3,'adgte','sad',12,44,'gr','0','2017-04-18 00:55:43','0000-00-00 00:00:00'),(10,1,'aa7','asg',7,51,'hra','1','2017-04-18 00:55:48','0000-00-00 00:00:00'),(11,1,'aa7','asg',7,51,'qe','1','2017-04-18 00:55:50','0000-00-00 00:00:00'),(12,1,'aa7','asg',7,51,'fdg','1','2017-04-18 00:55:52','0000-00-00 00:00:00'),(13,1,'aa7','asg',7,51,'bzf','0','2017-04-18 00:55:54','2017-04-18 13:17:34'),(14,1,'aa7','asg',7,51,'th','0','2017-04-18 00:55:56','2017-04-18 13:17:34'),(15,1,'aa7','asg',7,51,'few','1','2017-04-18 00:55:58','0000-00-00 00:00:00'),(16,1,'aa7','asg',7,51,'gr','1','2017-04-18 00:55:59','0000-00-00 00:00:00'),(17,1,'aa7','asg',7,51,'gw','1','2017-04-18 00:56:09','0000-00-00 00:00:00'),(18,1,'aa7','asg',7,51,'sdads','1','2017-04-15 10:05:50','0000-00-00 00:00:00'),(19,3,'对其','1',23,123,NULL,NULL,'2017-04-19 07:47:32','0000-00-00 00:00:00'),(20,11,'测试产品1','个',10,23,NULL,'1','2017-04-22 10:32:06','0000-00-00 00:00:00'),(21,17,'测试产品1','箱',1,1,NULL,'1','2017-04-25 06:01:56','0000-00-00 00:00:00'),(22,18,'阿道夫','个',213,124,NULL,'1','2017-04-25 06:13:42','0000-00-00 00:00:00'),(23,6,'阿迪发动','个',12,213,NULL,'1','2017-04-25 06:47:41','0000-00-00 00:00:00'),(24,17,'请问','去',123,132,NULL,'1','2017-04-25 06:50:01','0000-00-00 00:00:00'),(25,12,'武器','1',21,13,NULL,'1','2017-04-25 06:53:16','0000-00-00 00:00:00'),(26,17,'无情人情人','124',213,123,NULL,'1','2017-04-25 06:54:31','0000-00-00 00:00:00'),(27,6,'121313','22',1111,222,NULL,'1','2017-04-26 08:03:43','0000-00-00 00:00:00'),(28,6,'12313','111',11,111,NULL,'1','2017-04-26 08:03:56','0000-00-00 00:00:00'),(29,12,'12313','12313',12313,12313,NULL,'1','2017-04-26 08:04:20','0000-00-00 00:00:00');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productinventory`
--

DROP TABLE IF EXISTS `productinventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `productinventory` (
  `INVENTORYID` int(12) NOT NULL AUTO_INCREMENT,
  `PRODUCTID` int(12) DEFAULT NULL,
  `STOREID` int(12) DEFAULT NULL,
  `INVENTORY` decimal(10,0) DEFAULT NULL,
  `UPDATETIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`INVENTORYID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productinventory`
--

LOCK TABLES `productinventory` WRITE;
/*!40000 ALTER TABLE `productinventory` DISABLE KEYS */;
INSERT INTO `productinventory` VALUES (1,1,1,327,'2017-04-17 03:13:33'),(2,2,2,233,'2017-04-20 09:50:10'),(3,3,3,279,'2017-04-20 09:50:12'),(4,4,1,548,'2017-04-20 09:50:14'),(5,5,2,351,'2017-04-20 09:50:17'),(6,6,3,250,'2017-04-20 09:50:36'),(7,3,2,320,'2017-04-20 09:50:20'),(8,2,1,263,'2017-04-20 09:50:29'),(9,2,2,200,'2017-04-20 09:50:43'),(10,3,3,200,'2017-04-20 09:50:52'),(11,1,2,180,'2017-04-20 09:51:12'),(12,27,6,NULL,'2017-04-26 08:03:43'),(13,28,6,NULL,'2017-04-26 08:03:56'),(14,29,1,NULL,'2017-04-26 08:04:20');
/*!40000 ALTER TABLE `productinventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producttype`
--

DROP TABLE IF EXISTS `producttype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `producttype` (
  `TYPEID` int(4) NOT NULL AUTO_INCREMENT,
  `TYPENAME` varchar(512) DEFAULT NULL,
  `TYPEDESCRIPTION` varchar(1024) DEFAULT NULL,
  `PARENTTYPEID` int(12) DEFAULT NULL,
  PRIMARY KEY (`TYPEID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producttype`
--

LOCK TABLES `producttype` WRITE;
/*!40000 ALTER TABLE `producttype` DISABLE KEYS */;
INSERT INTO `producttype` VALUES (6,'gw','ads',NULL),(12,'d','qw',NULL),(16,'asd','asd',6),(17,'阿哥','阿哥',NULL),(18,'大哥','大公会',NULL),(19,'如果','好',NULL),(20,'前卫','阿哥',6),(21,'gw子类测试','gw子类测试gw子类测试gw子类测试',6);
/*!40000 ALTER TABLE `producttype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `store`
--

DROP TABLE IF EXISTS `store`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `store` (
  `STOREID` int(12) NOT NULL AUTO_INCREMENT,
  `STORENAME` varchar(512) DEFAULT NULL,
  `DESCRIPTION` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`STOREID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `store`
--

LOCK TABLES `store` WRITE;
/*!40000 ALTER TABLE `store` DISABLE KEYS */;
INSERT INTO `store` VALUES (1,'一号店仓库1','一号店仓库'),(2,'淘宝仓库','淘宝仓库'),(3,'京东仓库1','京东仓库'),(5,'我的仓库','我的仓库'),(6,'猫眼仓库','阿哥'),(7,'阿斯钢','啊各位'),(8,'给我','阿斯钢');
/*!40000 ALTER TABLE `store` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taskuserrelations`
--

DROP TABLE IF EXISTS `taskuserrelations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taskuserrelations` (
  `RELATIONID` int(12) NOT NULL AUTO_INCREMENT,
  `TASKID` int(12) DEFAULT NULL,
  `EMPLOYEEID` int(12) DEFAULT NULL,
  PRIMARY KEY (`RELATIONID`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taskuserrelations`
--

LOCK TABLES `taskuserrelations` WRITE;
/*!40000 ALTER TABLE `taskuserrelations` DISABLE KEYS */;
INSERT INTO `taskuserrelations` VALUES (8,1,5),(9,2,3),(10,3,3),(11,4,8),(12,5,5),(13,6,4),(14,7,8),(15,8,3),(16,9,8),(17,10,2),(18,11,8),(19,12,3),(20,13,4),(21,14,8),(22,15,7),(23,16,6),(24,17,3),(25,18,4),(26,19,5),(27,20,4),(28,21,6),(29,22,8),(30,23,5),(31,24,7),(32,25,6),(33,26,10),(34,27,4),(35,28,5),(36,29,4),(37,4,1),(38,4,5),(39,4,10),(40,5,1),(41,5,5),(42,5,10),(43,4,1),(44,4,5),(45,4,10),(46,5,1),(47,5,5),(48,5,10),(49,5,1),(50,5,5),(51,5,10),(52,5,1),(53,5,5),(54,5,10),(55,1,1),(56,1,5),(57,1,10),(58,15,1),(59,15,5),(60,15,10),(61,4,1),(62,4,5),(63,4,10),(64,31,5);
/*!40000 ALTER TABLE `taskuserrelations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workingfield`
--

DROP TABLE IF EXISTS `workingfield`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workingfield` (
  `FIELDID` int(4) DEFAULT NULL,
  `FIELDNAME` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workingfield`
--

LOCK TABLES `workingfield` WRITE;
/*!40000 ALTER TABLE `workingfield` DISABLE KEYS */;
INSERT INTO `workingfield` VALUES (3,'设计院/研究所'),(4,'政府/学校/社团'),(5,'成长性企业'),(6,'其他'),(1,'集团/上市公司'),(2,'大型企业'),(7,'新增测试');
/*!40000 ALTER TABLE `workingfield` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-08 14:02:47
