/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.6.24-enterprise-commercial-advanced-log : Database - cms
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cms` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cms`;

/*Table structure for table `business` */


create table advanced_log 
(
   LOG_ID               int(12)         not null,
   BUSINESS_ID          int(12),
   CREATOR              int(12),
   ADVANCE_CONTENT      VARCHAR(2048),
   CREATE_TIME          timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
   ADVANCE_STATUS       char(2),
   primary key (LOG_ID)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `business`;

CREATE TABLE `business` (
  `BUSINESS_ID` int(12) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_ID` int(12) DEFAULT NULL,
  `LINK_MAIN_ID` int(12) DEFAULT NULL,
  `BUSINESS_NAME` varchar(512) DEFAULT NULL,
  `BUSINESS_TYPE_ID` int(4) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `BUSINESS_SOURCE_ID` int(4) DEFAULT NULL,
  `PERSALE_PRICE` decimal(10,0) DEFAULT NULL,
  `PROBABILITY` decimal(2,0) DEFAULT NULL,
  `VISIT_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `VISIT_CONTENT` varchar(2048) DEFAULT NULL,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `EMPLOYEE_ID` int(12) DEFAULT NULL,
  PRIMARY KEY (`BUSINESS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `business` */

insert  into `business`(`BUSINESS_ID`,`CUSTOMER_ID`,`LINK_MAIN_ID`,`BUSINESS_NAME`,`BUSINESS_TYPE_ID`,`STATUS`,`BUSINESS_SOURCE_ID`,`PERSALE_PRICE`,`PROBABILITY`,`VISIT_TIME`,`VISIT_CONTENT`,`UPDATE_TIME`) values (1,1,1,'23',1,'3',20,'12','12','2017-04-25 13:37:45','ghahah','2017-04-25 13:37:45'),(2,1,2,'12',1,'3',10,'11','11','2017-04-19 14:07:26','','2017-04-19 14:07:26'),(3,1,1,'hahah',2,'3',20,'23','23','2017-04-13 00:00:00','hehehehhe','2017-04-19 14:22:54'),(4,1,1,'商机1',1,'3',20,'12','12','2017-03-21 13:59:33','','2017-04-20 13:39:44'),(5,1,1,'商机2',1,'3',10,'23','12','2017-03-22 13:59:35','','2017-04-20 13:49:19'),(6,1,1,'商机3',1,'3',10,'23','12','2017-03-21 13:59:39','','2017-04-20 13:58:51'),(7,4,4,'222222',2,'3',10,'122','22','2017-04-20 00:00:00','222','2017-04-26 16:19:46'),(8,2,2,'2打的',1,'1',20,'222','22','2017-04-25 00:00:00','嗯嗯嗯','2017-04-26 16:20:51'),(9,3,3,'2测试时',1,'1',20,'11','13','2017-04-28 00:00:00','222','2017-04-26 16:21:26');

/*Table structure for table `business_source` */

DROP TABLE IF EXISTS `business_source`;

CREATE TABLE `business_source` (
  `SOURCE_ID` int(4) DEFAULT NULL,
  `SOURCE_NAME` varchar(512) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `business_source` */

insert  into `business_source`(`SOURCE_ID`,`SOURCE_NAME`) values (1001,'网络营销'),(1002,'公开媒体'),(1003,'合作伙伴'),(1004,'员工介绍'),(1005,'广告'),(1006,'推销电话'),(1007,'朋友推荐'),(1008,'同事介绍'),(1009,'其他'),(10,'电话营销'),(20,'网络营销');

/*Table structure for table `business_type` */

DROP TABLE IF EXISTS `business_type`;

CREATE TABLE `business_type` (
  `TYPE_ID` int(4) DEFAULT NULL,
  `TYPE_NAME` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `business_type` */

insert  into `business_type`(`TYPE_ID`,`TYPE_NAME`) values (1,'新业务'),(2,'现有业务');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `COMMENT_ID` int(12) NOT NULL AUTO_INCREMENT,
  `RECORD_ID` int(12) DEFAULT NULL,
  `COMMENT_EMPLOYEE` int(12) DEFAULT NULL,
  `DETAIL` varchar(4000) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`COMMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`COMMENT_ID`,`RECORD_ID`,`COMMENT_EMPLOYEE`,`DETAIL`,`CREATE_TIME`) values (2,5,10,'333','2017-04-25 13:52:00');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `CUSTOMER_ID` int(12) NOT NULL AUTO_INCREMENT,
  `CUSTOMER_NAME` varchar(512) DEFAULT NULL,
  `POST_CODE` varchar(12) DEFAULT NULL,
  `FIELD_ID` int(4) DEFAULT NULL,
  `SOURCE_ID` int(4) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `EMPLOYEE_NUMBERS` varchar(128) DEFAULT NULL,
  `PRINPICAL` int(12) DEFAULT NULL,
  `ADDRESS` varchar(1024) DEFAULT NULL,
  `TAG` varchar(512) DEFAULT NULL,
  `REMARKS` varchar(2048) DEFAULT NULL,
  `BUSUBESS_VOLUME` varchar(2048) DEFAULT NULL,
  PRIMARY KEY (`CUSTOMER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `customer` */

insert  into `customer`(`CUSTOMER_ID`,`CUSTOMER_NAME`,`POST_CODE`,`FIELD_ID`,`SOURCE_ID`,`CREATE_TIME`,`UPDATE_TIME`,`EMPLOYEE_NUMBERS`,`PRINPICAL`,`ADDRESS`,`TAG`,`REMARKS`,`BUSUBESS_VOLUME`) values (1,'耿龙刚测试','11',1,1002,'2017-04-25 14:54:01','2017-04-18 16:55:21',NULL,2,NULL,'耿龙刚测试耿龙刚测试耿龙刚测试','耿龙刚测试耿龙刚测试耿龙刚测试耿龙刚测试耿龙刚测试','2001'),(2,'ll','11',1,1001,'2017-03-25 13:36:06','2017-04-18 16:55:40',NULL,2,NULL,'11','11',''),(3,'张超张超修改修改','225455',1,1001,'2017-04-25 13:36:15','2017-04-22 18:44:22',NULL,3,NULL,'张超','张超张超张超张超',''),(4,'江苏万和','210000',6,1007,'2017-04-25 13:45:19','2017-04-25 13:45:19','21-50',3,NULL,'万和','万和万和万和万和','2003');

/*Table structure for table `daily_record` */

DROP TABLE IF EXISTS `daily_record`;

CREATE TABLE `daily_record` (
  `RECORD_ID` int(12) NOT NULL AUTO_INCREMENT,
  `CREATOR` int(12) DEFAULT NULL,
  `TITLE` varchar(256) DEFAULT NULL,
  `CONTENT` varchar(4000) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `RECORDLX` varchar(20) DEFAULT NULL,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`RECORD_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `daily_record` */

insert  into `daily_record`(`RECORD_ID`,`CREATOR`,`TITLE`,`CONTENT`,`CREATE_TIME`,`RECORDLX`,`UPDATE_TIME`) values (4,110,'www','qqqq','2017-04-21 14:00:59','1','2017-04-19 16:47:45'),(5,110,'qwqwq','qwqwq','2017-04-21 14:01:00','2','2017-04-19 16:51:07'),(14,110,'壮观军','东方饭店','2017-04-21 14:01:05','3','2017-04-21 11:27:01'),(15,10,'周报2017年4月25日13:52:22','周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22','2017-04-25 13:52:27','周报','2017-04-25 13:52:27');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `DEPARTMENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPARTMENT_NAME` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`DEPARTMENT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`DEPARTMENT_ID`,`DEPARTMENT_NAME`) values (1,'产品一部'),(2,'产品二部'),(3,'产品三部');

/*Table structure for table `emm_position` */

DROP TABLE IF EXISTS `emm_position`;

CREATE TABLE `emm_position` (
  `POSITION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `POSITION_NAME` varchar(512) DEFAULT NULL,
  `POSITION_LEVEL` varchar(3) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`POSITION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

/*Data for the table `emm_position` */

insert  into `emm_position`(`POSITION_ID`,`POSITION_NAME`,`POSITION_LEVEL`,`CREATE_TIME`,`UPDATE_TIME`) values (12,'经理','2','2017-04-18 11:29:12','2017-04-14 13:29:40'),(13,'普通员工','3','2017-04-18 11:29:03','2017-04-14 13:33:17'),(14,'总监','1','2017-04-14 13:45:06','2017-04-14 13:45:06'),(15,'测试111','2','2017-04-26 18:25:25','2017-04-26 18:25:31'),(16,'测试333','2','2017-04-26 18:42:04','2017-04-26 18:42:06'),(17,'测试222','1','2017-04-26 18:42:13','2017-04-26 18:42:13'),(18,'测试444','3','2017-04-26 18:42:20','2017-04-26 18:42:20'),(19,'测试555','2','2017-04-26 18:42:30','2017-04-26 18:42:30');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_NAME` varchar(512) DEFAULT NULL,
  `DEPARTMENT_ID` int(11) DEFAULT NULL,
  `POSITON_ID` int(11) DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `EMAIL` varchar(256) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `PARENT_EMPLOYEE_ID` int(11) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`EMPLOYEE_ID`,`EMPLOYEE_NAME`,`DEPARTMENT_ID`,`POSITON_ID`,`PHONE`,`EMAIL`,`STATUS`,`PARENT_EMPLOYEE_ID`,`CREATE_TIME`,`UPDATE_TIME`) values (1,'张三丰修改222',1,14,'18305168559','12@qq.com','1',NULL,'2017-04-21 21:17:46','2017-04-14 14:18:07'),(2,'张三',1,13,'18305168559','34@qq.com','1',1,'2017-04-16 09:32:54','2017-04-14 14:18:12'),(3,'李四',2,12,'119','56@qq.com','0',2,'2017-04-16 09:32:45','2017-04-14 14:18:35'),(4,'王五',3,12,'18305168559','78@qq.com','1',2,'2017-04-16 08:58:06','2017-04-14 14:20:01'),(5,'谷胖子',2,14,'18305168559','568275@qq.com','1',1,'2017-04-15 20:24:49','2017-04-15 20:24:49'),(6,'小谷',2,12,'18305168559','568275@qq.com','1',1,'2017-04-16 08:56:46','2017-04-16 08:56:46'),(7,'谷胖子2',3,13,'18305168559','568275@qq.com','1',2,'2017-04-16 09:32:26','2017-04-16 09:32:26'),(8,'2货小黄超',3,13,'18311115555','18311115555@qq.com','1',2,'2017-04-20 16:04:21','2017-04-20 16:04:21'),(9,'3货小超',1,12,'18311115555','18311115555@qq.com','1',2,'2017-04-21 11:31:09','2017-04-21 11:31:09'),(10,'张超',1,14,'13764111008','7633@qq.com','1',NULL,'2017-04-22 17:45:58','2017-04-22 17:45:58'),(11,'耿龙刚',2,12,'13764111008','7633@qq.com','1',10,'2017-04-22 17:46:23','2017-04-22 17:46:23'),(12,'夏宁',3,13,'13764111008','7633@qq.com','0',11,'2017-04-22 18:17:37','2017-04-22 17:46:49');

/*Table structure for table `individual_task` */

DROP TABLE IF EXISTS `individual_task`;

CREATE TABLE `individual_task` (
  `TASK_ID` int(12) NOT NULL AUTO_INCREMENT,
  `TOPIC` varchar(512) DEFAULT NULL,
  `DESCRIPTION` text,
  `RESPONSIBLE_PERSON` int(12) DEFAULT NULL,
  `END_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `PRIORITY` varchar(2) DEFAULT NULL,
  `STATUS` varchar(2) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `OPERATOR` int(12) DEFAULT NULL,
  `LINK_URL` varchar(512) DEFAULT NULL,
  `TASK_TYPE` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`TASK_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

/*Data for the table `individual_task` */

insert  into `individual_task`(`TASK_ID`,`TOPIC`,`DESCRIPTION`,`RESPONSIBLE_PERSON`,`END_TIME`,`PRIORITY`,`STATUS`,`CREATE_TIME`,`OPERATOR`,`LINK_URL`,`TASK_TYPE`) values (23,'主题123','ADASD',2,'2017-04-25 14:56:08','20','10','2017-04-24 09:56:36',5,NULL,NULL),(24,'主题456','WFSF',3,'2017-04-25 14:56:11','10','10','2017-04-24 09:57:06',5,NULL,NULL),(25,'1','啊啊士大夫',3,'2017-04-24 17:08:13','10','10','2017-04-24 14:20:20',10,NULL,NULL),(26,'请问','12而且',3,'2017-04-24 17:08:10','20','10','2017-04-24 14:20:51',10,NULL,NULL),(27,'qew','qweqw',4,'2017-04-25 16:35:17','10','30','2017-04-24 15:30:25',10,NULL,NULL),(28,'主题123','qwe',2,'2017-04-25 14:56:17','20','10','2017-04-24 15:30:46',10,NULL,NULL),(29,'SFGSDFGS','DGFSDFGSD',2,'2017-04-17 00:00:00','10','0','2017-04-24 17:11:01',10,NULL,NULL),(30,'周报2017年4月25日13:52:22','周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22周报2017年4月25日13:52:22',NULL,'2017-04-25 13:52:27',NULL,NULL,'2017-04-25 13:52:27',10,NULL,'0'),(31,'32425','32425324253242532425',2,'2017-04-26 00:00:00','20','0','2017-04-25 16:39:49',11,NULL,'2');

/*Table structure for table `instation_mail` */

DROP TABLE IF EXISTS `instation_mail`;

CREATE TABLE `instation_mail` (
  `MAIL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SENDER_ID` int(11) DEFAULT NULL,
  `RECEIVER_ID` int(11) DEFAULT NULL,
  `THEME` varchar(4000) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `REMARK` varchar(1) DEFAULT NULL,
  `CREATE_TIME` timestamp NULL DEFAULT NULL,
  `UPDATE_TIME` timestamp NULL DEFAULT NULL,
  `CONTENT` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`MAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `instation_mail` */

insert  into `instation_mail`(`MAIL_ID`,`SENDER_ID`,`RECEIVER_ID`,`THEME`,`STATUS`,`REMARK`,`CREATE_TIME`,`UPDATE_TIME`,`CONTENT`) values (1,5,6,'明天开会','0','0','2017-04-17 14:01:15','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(2,5,6,'明天开会','0','0','2017-04-17 14:01:17','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(3,6,7,'晚上吃饭','0','0','2017-04-17 14:01:18','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(4,6,5,'晚上吃饭','1','1','2017-04-17 14:01:20','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(5,7,5,'后天逛街','2','2','2017-04-17 14:01:21','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(6,1,5,'吃饭','1','0','2017-04-17 14:01:23','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(7,2,5,'睡觉','0','0','2017-04-17 14:02:23','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(8,3,5,'打豆豆','0','2','2017-04-17 14:03:23','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(9,4,5,'吃饭','1','1','2017-04-17 14:04:23','2017-04-17 14:01:38','吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭吃饭'),(10,5,9,'小超是2货','0',NULL,'2017-04-21 21:13:22',NULL,'是的，没错'),(11,10,9,'发件人：张超发件人：张超发件人：张超发件人：张超','0',NULL,'2017-04-22 18:51:23',NULL,'发件人：张超发件人：张超发件人：张超发件人：张超'),(12,10,8,'1111','0',NULL,'2017-04-22 18:56:40',NULL,'11111'),(13,10,1,'张三丰','0',NULL,'2017-04-25 14:15:44',NULL,'张三丰张三丰张三丰'),(14,11,10,'测试邮件一封','1',NULL,'2017-04-25 16:46:06',NULL,'测试邮件一封测试邮件一封测试邮件一封');

/*Table structure for table `link_man` */

DROP TABLE IF EXISTS `link_man`;

CREATE TABLE `link_man` (
  `LINK_MAIN_ID` int(12) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(256) DEFAULT NULL,
  `SEX` varchar(1) DEFAULT NULL,
  `POSITION` varchar(1024) DEFAULT NULL,
  `NICKNAME` varchar(256) DEFAULT NULL,
  `PHONENUM` int(11) DEFAULT NULL,
  `EMAIL` varchar(512) DEFAULT NULL,
  `QQ` int(13) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `REMARKS` varchar(2048) DEFAULT NULL,
  `QR_CODE` varchar(2048) DEFAULT NULL,
  `CUSTOMER_ID` int(12) DEFAULT NULL,
  PRIMARY KEY (`LINK_MAIN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `link_man` */

insert  into `link_man`(`LINK_MAIN_ID`,`NAME`,`SEX`,`POSITION`,`NICKNAME`,`PHONENUM`,`EMAIL`,`QQ`,`CREATE_TIME`,`UPDATE_TIME`,`REMARKS`,`QR_CODE`,`CUSTOMER_ID`) values (1,'ddfdsd','1','2','22',22,'644351063@qq.com',64435,'2017-04-18 17:18:17','2017-04-18 17:18:17','sdssdss',NULL,NULL),(2,'耿龙刚','2','总经理','耿总',110,'11@dd',111,'2017-04-22 18:45:57','2017-04-22 18:45:57','','',NULL),(3,'zhangs','2','232','nihao',134555,'6444@122',366545,'2017-04-22 19:16:17','2017-04-22 19:16:08','212','',NULL),(4,'zc','1','zxczxc','zc',123,'763375777@qq.com',123,'2017-04-24 13:40:37','2017-04-24 13:40:37','123','',NULL),(5,'江苏万和','2','江苏万和','江苏',155,'122@qq.com',112324,'2017-04-26 18:43:44','2017-04-26 18:43:44','江苏万和','',4),(6,'123123','2','111','111',1111,'12@11.com',12312,'2017-04-26 18:44:01','2017-04-26 18:44:01','13123','',2);

/*Table structure for table `log_in` */

DROP TABLE IF EXISTS `log_in`;

CREATE TABLE `log_in` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMPLOYEE_ID` int(11) DEFAULT NULL,
  `EMM_PASSWORD` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `log_in` */

insert  into `log_in`(`USER_ID`,`EMPLOYEE_ID`,`EMM_PASSWORD`) values (1,5,'e13dd027be0f2152ce387ac0ea83d863'),(2,6,'1c63129ae9db9c60c3e8aa94d3e00495'),(3,7,'9cbf8a4dcb8e30682b927f352d6559a0'),(4,8,'e10adc3949ba59abbe56e057f20f883e'),(5,9,'e10adc3949ba59abbe56e057f20f883e'),(6,10,'1c63129ae9db9c60c3e8aa94d3e00495'),(7,11,'d878fd0bfcffc1b082b8ffc05b476e96'),(8,12,'dca0eaa38eb8044fe18498f1f7d35f25');

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `MENU_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MENU_NAME` varchar(256) DEFAULT NULL,
  `MENU_URL` varchar(1024) DEFAULT NULL,
  `PICTURES` varchar(1024) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `PARENT_MENU_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`MENU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

/*Data for the table `menu` */

insert  into `menu`(`MENU_ID`,`MENU_NAME`,`MENU_URL`,`PICTURES`,`STATUS`,`CREATE_TIME`,`UPDATE_TIME`,`PARENT_MENU_ID`) values (9,'系统设置','javascript:;','se7en-gear',NULL,'2017-04-22 17:42:56','2017-04-22 17:24:43',NULL),(10,'个人办公','javascript:;','se7en-flag',NULL,'2017-04-22 17:42:57','2017-04-22 17:30:08',NULL),(11,'员工管理','EmployeeServlet?method=getAllEmployee',NULL,NULL,'2017-04-22 17:31:10','2017-04-22 17:31:10',9),(12,'职位管理','EmmPositionServlet?method=getAllEmmPosition',NULL,NULL,'2017-04-22 17:31:31','2017-04-22 17:31:31',9),(13,'菜单管理','MenuServlet?method=getAllMenu',NULL,NULL,'2017-04-22 17:31:45','2017-04-22 17:31:45',9),(14,'电子邮件','InstationMailServlet?method=getAllMail&flag=0',NULL,NULL,'2017-04-22 17:32:10','2017-04-22 17:32:10',10),(15,'客户管理','javascript:;','se7en-star',NULL,'2017-04-22 17:42:58','2017-04-22 17:35:34',NULL),(16,'客户','CustomerServlet?method=getAllCustomer',NULL,NULL,'2017-04-22 17:35:56','2017-04-22 17:35:56',15),(17,'产品管理','javascript:;','se7en-forms',NULL,'2017-04-22 17:43:01','2017-04-22 17:40:55',NULL),(18,'产品','ProductServlet?method=allProducts',NULL,NULL,'2017-04-22 17:43:57','2017-04-22 17:43:57',17),(19,'我的任务','IndividualTaskServlet?method=getAllTaskAsPage',NULL,NULL,'2017-04-22 17:45:00','2017-04-22 17:45:00',10),(20,'销售单','OrderServlet?method=allOrders',NULL,NULL,'2017-04-22 17:48:11','2017-04-22 17:48:11',17),(21,'出入库','ProcessServlet?method=allProcessDtos',NULL,NULL,'2017-04-22 17:48:30','2017-04-22 17:48:30',17),(22,'库存明细','InventoryServlet?method=allInventoryDtos',NULL,NULL,'2017-04-22 17:48:51','2017-04-22 17:48:51',17),(23,'产品类别','ProductTypeServlet?method=allProductTypes',NULL,NULL,'2017-04-22 17:49:08','2017-04-22 17:49:08',17),(24,'仓库管理','StoreServlet?method=getAllStoresByPage',NULL,NULL,'2017-04-22 17:49:25','2017-04-22 17:49:25',17),(25,'联系人','LinkManServlet?method=getAllLinkMan',NULL,NULL,'2017-04-22 17:51:21','2017-04-22 17:51:21',15),(26,'商机','BuinessServlet?method=getAllBusiness',NULL,NULL,'2017-04-22 17:51:37','2017-04-22 17:51:37',15),(28,'控制台','ControlServlet?method=countAll','se7en-home',NULL,'2017-04-22 18:15:33','2017-04-22 17:59:41',NULL);

/*Table structure for table `orders` */

DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
  `ORDER_ID` int(12) NOT NULL AUTO_INCREMENT,
  `ORDER_SEQ` varchar(128) DEFAULT NULL,
  `TITLE` varchar(512) DEFAULT NULL,
  `CUSTOMER_ID` int(12) DEFAULT NULL,
  `TOTAL_MONEY` decimal(10,0) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `OPERATOR` int(12) DEFAULT NULL,
  `ORDER_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CREATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ORDER_TYPE` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ORDER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `orders` */

insert  into `orders`(`ORDER_ID`,`ORDER_SEQ`,`TITLE`,`CUSTOMER_ID`,`TOTAL_MONEY`,`STATUS`,`OPERATOR`,`ORDER_TIME`,`CREATE_TIME`,`ORDER_TYPE`) values (1,'2123','aa',1,'213','3',2,'2017-04-21 13:18:06','2017-04-21 15:54:10',NULL),(2,'123','ab',2,'213','3',2,'2017-04-21 13:18:16','2017-04-22 18:37:21',NULL),(3,'1425','ac',3,'543','3',3,'2017-04-21 13:18:20','2017-04-25 13:43:56',NULL),(4,'2213','bb',3,'352','3',3,'2017-04-21 13:18:10','2017-04-21 13:19:28',NULL),(5,'542','cc',4,'24','2',3,'2017-04-21 13:17:08','0000-00-00 00:00:00',NULL),(6,'73','dd',4,'25','2',3,'2017-04-21 13:16:49','0000-00-00 00:00:00',NULL),(7,'231','qe',1,'31','3',2,'2017-04-21 13:16:52','2017-04-24 17:44:42',NULL),(8,'1234','hre',2,'34','1',4,'2017-04-21 13:18:21','0000-00-00 00:00:00',NULL),(9,'345','fghsg',1,'4132','1',4,'2017-04-21 13:18:22','0000-00-00 00:00:00',NULL),(10,'24','eh',2,'23','1',2,'2017-04-21 13:18:15','2017-04-21 10:51:42',NULL),(11,'2017042218344581',NULL,NULL,'3300','1',NULL,'2017-04-22 18:34:45','2017-04-22 18:34:45',NULL),(12,'2017042451','qwqe',1,'25986','1',5,'2017-04-24 17:44:58','2017-04-24 17:44:58',NULL),(13,'2017042431','sf',3,'150429','1',5,'2017-04-24 17:45:10','2017-04-24 17:45:10',NULL),(14,'2017042421','sad',1,'39852','1',5,'2017-04-24 17:46:52','2017-04-24 17:46:52',NULL),(15,'2017042441','123',1,'15129','1',5,'2017-04-24 17:48:38','2017-04-24 17:48:38',NULL),(16,'2017042401','带我去',1,'49203','1',10,'2017-04-24 17:51:48','2017-04-24 17:51:48',NULL),(17,'2017042421','qwe',1,'7659','1',10,'2017-04-24 18:03:51','2017-04-24 18:03:51',NULL),(18,'2017042571','企鹅',1,'2604','3',10,'2017-04-25 13:35:51','2017-04-25 13:54:19',NULL),(19,'2017042551','撒旦',1,'16482','3',10,'2017-04-25 13:36:04','2017-04-25 13:36:47',NULL),(20,'2017042571','违反',1,'1476','1',10,'2017-04-25 13:36:18','2017-04-25 13:36:11',NULL),(21,'2017042591','法国人日',1,'1488','3',10,'2017-04-25 13:37:16','2017-04-25 13:54:14',NULL),(22,'2017042591','热奇怪',1,'2015','1',10,'2017-04-25 13:42:00','2017-04-25 13:41:53',NULL),(23,'2017042581','日期',1,'15252','2',10,'2017-04-25 13:42:14','2017-04-25 13:44:13',NULL),(24,'2017042571','各方',1,'1488','1',10,'2017-04-25 13:42:42','2017-04-25 13:42:36',NULL),(25,'2017042591','位',1,'2808','1',10,'2017-04-25 13:44:31','2017-04-25 13:44:24',NULL),(26,'2017042511','个wet',1,'3045','1',10,'2017-04-25 13:44:43','2017-04-25 13:44:36',NULL),(27,'2017042541','前卫',1,'51045','3',10,'2017-04-25 13:58:43','2017-04-25 14:02:55',NULL);

/*Table structure for table `orders_detail` */

DROP TABLE IF EXISTS `orders_detail`;

CREATE TABLE `orders_detail` (
  `DETAIL_ID` int(12) NOT NULL AUTO_INCREMENT,
  `ORDER_ID` int(12) DEFAULT NULL,
  `STORE_ID` int(12) DEFAULT NULL,
  `PRODUCT_ID` int(12) DEFAULT NULL,
  `BUY_NUMS` int(12) DEFAULT NULL,
  `REAL_PRICES` decimal(10,0) DEFAULT NULL,
  `REAL_TOTALPRICE` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`DETAIL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `orders_detail` */

insert  into `orders_detail`(`DETAIL_ID`,`ORDER_ID`,`STORE_ID`,`PRODUCT_ID`,`BUY_NUMS`,`REAL_PRICES`,`REAL_TOTALPRICE`) values (1,1,1,1,100,'10','1000'),(2,2,2,1,50,'3','150'),(3,3,3,3,30,'30','900'),(4,4,4,4,10,'20','200'),(6,5,2,2,2,'2','4'),(7,6,3,3,20,'3','60'),(8,7,2,2,15,'4','60'),(9,18,NULL,3,21,'124','2604'),(10,19,NULL,2,123,'134','16482'),(11,18,NULL,5,12,'123','1476'),(12,21,NULL,4,12,'124','1488'),(13,21,NULL,4,13,'155','2015'),(14,23,NULL,2,123,'124','15252'),(15,18,NULL,2,12,'124','1488'),(16,21,NULL,3,12,'234','2808'),(17,26,NULL,2,21,'145','3045'),(18,27,NULL,1,123,'415','51045');

/*Table structure for table `position_menu_relations` */

DROP TABLE IF EXISTS `position_menu_relations`;

CREATE TABLE `position_menu_relations` (
  `RELATION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `POSITION_ID` int(11) DEFAULT NULL,
  `MENU_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`RELATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=165 DEFAULT CHARSET=utf8;

/*Data for the table `position_menu_relations` */

insert  into `position_menu_relations`(`RELATION_ID`,`POSITION_ID`,`MENU_ID`) values (118,14,9),(119,14,10),(120,14,11),(121,14,12),(122,14,13),(123,14,14),(124,14,15),(125,14,16),(126,14,17),(127,14,18),(128,14,19),(129,14,20),(130,14,21),(131,14,22),(132,14,23),(133,14,24),(134,14,25),(135,14,26),(136,14,28),(137,12,9),(138,12,10),(139,12,11),(140,12,12),(141,12,13),(142,12,14),(143,12,15),(144,12,16),(145,12,17),(146,12,18),(147,12,19),(148,12,20),(149,12,21),(150,12,22),(151,12,23),(152,12,24),(153,12,25),(154,12,26),(155,12,28),(157,13,9),(158,13,10),(159,13,11),(160,13,12),(161,13,13),(162,13,14),(163,13,15),(164,13,16);

/*Table structure for table `process` */

DROP TABLE IF EXISTS `process`;

CREATE TABLE `process` (
  `PROCESS_ID` int(12) NOT NULL AUTO_INCREMENT,
  `TYPE` varchar(1) DEFAULT NULL,
  `BUSINESS_ID` int(12) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `OPINIONS` varchar(512) DEFAULT NULL,
  `OPERATOR` int(12) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`PROCESS_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `process` */

insert  into `process`(`PROCESS_ID`,`TYPE`,`BUSINESS_ID`,`STATUS`,`OPINIONS`,`OPERATOR`,`CREATE_TIME`) values (1,'1',1,'1','qwe',134,'2017-04-20 14:25:22'),(2,'1',2,'1','we',12,'2017-04-20 14:25:21'),(3,'2',3,'2','rfqa',43,'2017-04-20 14:25:27'),(4,'2',4,'2','fq',22,'2017-04-20 14:25:29'),(5,'2',5,'3','qeg',213,'2017-04-20 14:25:41'),(6,'1',6,'3','eqfg',312,'2017-04-20 14:26:08'),(7,'2',7,'2','qr',63,'2017-04-20 14:52:34'),(8,'1',NULL,'3',NULL,NULL,'2017-04-20 14:52:37'),(9,'2',NULL,'2',NULL,NULL,'2017-04-20 14:52:39');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `PRODUCT_ID` int(12) NOT NULL AUTO_INCREMENT,
  `PROD_TYPE` int(4) DEFAULT NULL,
  `PROD_NAME` varchar(512) DEFAULT NULL,
  `PROD_STANDARD` varchar(512) DEFAULT NULL,
  `COST_PRICE` decimal(10,0) DEFAULT NULL,
  `RETAIL_PRICE` decimal(10,0) DEFAULT NULL,
  `REMARKS` varchar(2048) DEFAULT NULL,
  `STATUS` varchar(1) DEFAULT NULL,
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`PRODUCT_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`PRODUCT_ID`,`PROD_TYPE`,`PROD_NAME`,`PROD_STANDARD`,`COST_PRICE`,`RETAIL_PRICE`,`REMARKS`,`STATUS`,`CREATE_TIME`,`UPDATE_TIME`) values (1,2,'咸鱼1','asd','12','22','3','0','2017-04-21 15:47:28','2017-04-25 13:59:32'),(2,2,'咸鱼2','as','12','25','1','1','2017-04-21 15:47:30','0000-00-00 00:00:00'),(3,3,'咸鱼小超','sad','25','55','3','1','2017-04-21 15:47:33','0000-00-00 00:00:00'),(4,2,'2货小超','asd','8','22','1','0','2017-04-21 15:47:42','2017-04-16 22:11:37'),(5,2,'aa5','asdf','6','13','1','0','2017-04-15 18:05:12','2017-04-16 22:11:53'),(6,3,'aa6','agd','4','21','ads','1','2017-04-15 18:05:26','0000-00-00 00:00:00'),(7,1,'aa7','asg','7','51','sdads','0','2017-04-15 18:05:50','2017-04-19 09:40:20'),(8,3,'asd','asf','11','22','fd','0','2017-04-18 08:55:40','0000-00-00 00:00:00'),(9,3,'adgte','sad','12','44','gr','0','2017-04-18 08:55:43','0000-00-00 00:00:00'),(10,1,'aa7','asg','7','51','hra','1','2017-04-18 08:55:48','0000-00-00 00:00:00'),(11,1,'aa7','asg','7','51','qe','1','2017-04-18 08:55:50','0000-00-00 00:00:00'),(12,1,'aa7','asg','7','51','fdg','1','2017-04-18 08:55:52','0000-00-00 00:00:00'),(13,1,'aa7','asg','7','51','bzf','0','2017-04-18 08:55:54','2017-04-18 21:17:34'),(14,1,'aa7','asg','7','51','th','0','2017-04-18 08:55:56','2017-04-18 21:17:34'),(15,1,'aa7','asg','7','51','few','1','2017-04-18 08:55:58','0000-00-00 00:00:00'),(16,1,'aa7','asg','7','51','gr','1','2017-04-18 08:55:59','0000-00-00 00:00:00'),(17,1,'aa7','asg','7','51','gw','1','2017-04-18 08:56:09','0000-00-00 00:00:00'),(18,1,'aa7','asg','7','51','sdads','1','2017-04-15 18:05:50','0000-00-00 00:00:00'),(19,3,'对其','1','23','123',NULL,NULL,'2017-04-19 15:47:32','0000-00-00 00:00:00'),(20,11,'测试产品1','个','10','23',NULL,'1','2017-04-22 18:32:06','0000-00-00 00:00:00'),(21,17,'测试产品1','箱','1','1',NULL,'1','2017-04-25 14:01:56','0000-00-00 00:00:00'),(22,18,'阿道夫','个','213','124',NULL,'1','2017-04-25 14:13:42','0000-00-00 00:00:00'),(23,6,'阿迪发动','个','12','213',NULL,'1','2017-04-25 14:47:41','0000-00-00 00:00:00'),(24,17,'请问','去','123','132',NULL,'1','2017-04-25 14:50:01','0000-00-00 00:00:00'),(25,12,'武器','1','21','13',NULL,'1','2017-04-25 14:53:16','0000-00-00 00:00:00'),(26,17,'无情人情人','124','213','123',NULL,'1','2017-04-25 14:54:31','0000-00-00 00:00:00'),(27,6,'121313','22','1111','222',NULL,'1','2017-04-26 16:03:43','0000-00-00 00:00:00'),(28,6,'12313','111','11','111',NULL,'1','2017-04-26 16:03:56','0000-00-00 00:00:00'),(29,12,'12313','12313','12313','12313',NULL,'1','2017-04-26 16:04:20','0000-00-00 00:00:00');

/*Table structure for table `product_inventory` */

DROP TABLE IF EXISTS `product_inventory`;

CREATE TABLE `product_inventory` (
  `INVENTORY_ID` int(12) NOT NULL AUTO_INCREMENT,
  `PRODUCT_ID` int(12) DEFAULT NULL,
  `STORE_ID` int(12) DEFAULT NULL,
  `INVENTORY` decimal(10,0) DEFAULT NULL,
  `UPDATE_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`INVENTORY_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `product_inventory` */

insert  into `product_inventory`(`INVENTORY_ID`,`PRODUCT_ID`,`STORE_ID`,`INVENTORY`,`UPDATE_TIME`) values (1,1,1,'327','2017-04-17 11:13:33'),(2,2,2,'233','2017-04-20 17:50:10'),(3,3,3,'279','2017-04-20 17:50:12'),(4,4,1,'548','2017-04-20 17:50:14'),(5,5,2,'351','2017-04-20 17:50:17'),(6,6,3,'250','2017-04-20 17:50:36'),(7,3,2,'320','2017-04-20 17:50:20'),(8,2,1,'263','2017-04-20 17:50:29'),(9,2,2,'200','2017-04-20 17:50:43'),(10,3,3,'200','2017-04-20 17:50:52'),(11,1,2,'180','2017-04-20 17:51:12'),(12,27,6,NULL,'2017-04-26 16:03:43'),(13,28,6,NULL,'2017-04-26 16:03:56'),(14,29,1,NULL,'2017-04-26 16:04:20');

/*Table structure for table `product_type` */

DROP TABLE IF EXISTS `product_type`;

CREATE TABLE `product_type` (
  `TYPE_ID` int(4) NOT NULL AUTO_INCREMENT,
  `TYPE_NAME` varchar(512) DEFAULT NULL,
  `TYPE_DESCRIPTION` varchar(1024) DEFAULT NULL,
  `PARENT_TYPE_ID` int(12) DEFAULT NULL,
  PRIMARY KEY (`TYPE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `product_type` */

insert  into `product_type`(`TYPE_ID`,`TYPE_NAME`,`TYPE_DESCRIPTION`,`PARENT_TYPE_ID`) values (6,'gw','ads',NULL),(12,'d','qw',NULL),(16,'asd','asd',6),(17,'阿哥','阿哥',NULL),(18,'大哥','大公会',NULL),(19,'如果','好',NULL),(20,'前卫','阿哥',6),(21,'gw子类测试','gw子类测试gw子类测试gw子类测试',6);

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `STORE_ID` int(12) NOT NULL AUTO_INCREMENT,
  `STORE_NAME` varchar(512) DEFAULT NULL,
  `DESCRIPTION` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`STORE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `store` */

insert  into `store`(`STORE_ID`,`STORE_NAME`,`DESCRIPTION`) values (1,'一号店仓库1','一号店仓库'),(2,'淘宝仓库','淘宝仓库'),(3,'京东仓库1','京东仓库'),(5,'我的仓库','我的仓库'),(6,'猫眼仓库','阿哥'),(7,'阿斯钢','啊各位'),(8,'给我','阿斯钢');

/*Table structure for table `task_user_relations` */

DROP TABLE IF EXISTS `task_user_relations`;

CREATE TABLE `task_user_relations` (
  `RELATION_ID` int(12) NOT NULL AUTO_INCREMENT,
  `TASK_ID` int(12) DEFAULT NULL,
  `EMPLOYEE_ID` int(12) DEFAULT NULL,
  PRIMARY KEY (`RELATION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8;

/*Data for the table `task_user_relations` */

insert  into `task_user_relations`(`RELATION_ID`,`TASK_ID`,`EMPLOYEE_ID`) values (8,1,5),(9,2,3),(10,3,3),(11,4,8),(12,5,5),(13,6,4),(14,7,8),(15,8,3),(16,9,8),(17,10,2),(18,11,8),(19,12,3),(20,13,4),(21,14,8),(22,15,7),(23,16,6),(24,17,3),(25,18,4),(26,19,5),(27,20,4),(28,21,6),(29,22,8),(30,23,5),(31,24,7),(32,25,6),(33,26,10),(34,27,4),(35,28,5),(36,29,4),(37,4,1),(38,4,5),(39,4,10),(40,5,1),(41,5,5),(42,5,10),(43,4,1),(44,4,5),(45,4,10),(46,5,1),(47,5,5),(48,5,10),(49,5,1),(50,5,5),(51,5,10),(52,5,1),(53,5,5),(54,5,10),(55,1,1),(56,1,5),(57,1,10),(58,15,1),(59,15,5),(60,15,10),(61,4,1),(62,4,5),(63,4,10),(64,31,5);

/*Table structure for table `working_field` */

DROP TABLE IF EXISTS `working_field`;

CREATE TABLE `working_field` (
  `FIELD_ID` int(4) DEFAULT NULL,
  `FIELD_NAME` varchar(512) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `working_field` */

insert  into `working_field`(`FIELD_ID`,`FIELD_NAME`) values (3,'设计院/研究所'),(4,'政府/学校/社团'),(5,'成长性企业'),(6,'其他'),(1,'集团/上市公司'),(2,'大型企业'),(7,'新增测试');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
