# MySQL-Front 5.1  (Build 2.7)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.0.1    Database: exam
# ------------------------------------------------------
# Server version 5.6.24-log

DROP DATABASE IF EXISTS `exam`;
CREATE DATABASE `exam` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `exam`;

#
# Source for table admin
#

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `loginId` varchar(32) DEFAULT NULL,
  `loginPsw` varchar(32) DEFAULT NULL,
  `loginName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Dumping data for table admin
#
LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;

INSERT INTO `admin` VALUES (1,'admin','admin','管理员');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table course
#

DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `CID` bigint(20) NOT NULL AUTO_INCREMENT,
  `stuID` int(11) NOT NULL DEFAULT '0',
  `XKid` bigint(20) DEFAULT NULL,
  `TeaID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CID`),
  KEY `xk` (`TeaID`,`XKid`),
  KEY `student` (`stuID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Dumping data for table course
#
LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;

INSERT INTO `course` VALUES (1,1,1,2);
INSERT INTO `course` VALUES (2,1,3,3);
INSERT INTO `course` VALUES (3,1,6,5);
INSERT INTO `course` VALUES (4,1,7,4);
INSERT INTO `course` VALUES (5,2,2,3);
INSERT INTO `course` VALUES (6,3,2,3);
INSERT INTO `course` VALUES (7,4,2,3);
INSERT INTO `course` VALUES (8,5,1,2);
INSERT INTO `course` VALUES (9,6,1,2);
INSERT INTO `course` VALUES (10,7,2,3);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table daanjuan
#

DROP TABLE IF EXISTS `daanjuan`;
CREATE TABLE `daanjuan` (
  `DaJuan` bigint(20) NOT NULL AUTO_INCREMENT,
  `idStu` bigint(20) DEFAULT NULL,
  `xuanze1` varchar(2) DEFAULT NULL,
  `xuanze2` varchar(2) DEFAULT NULL,
  `xuanze3` varchar(2) DEFAULT NULL,
  `xuanze4` varchar(2) DEFAULT NULL,
  `xuanze5` varchar(2) DEFAULT NULL,
  `xuanze6` varchar(2) DEFAULT NULL,
  `xuanze7` varchar(2) DEFAULT NULL,
  `xuanze8` varchar(2) DEFAULT NULL,
  `xuanze9` varchar(2) DEFAULT NULL,
  `xuanze10` varchar(2) DEFAULT NULL,
  `pangduan1` varchar(2) DEFAULT NULL,
  `pangduan2` varchar(2) DEFAULT NULL,
  `pangduan3` varchar(2) DEFAULT NULL,
  `pangduan4` varchar(2) DEFAULT NULL,
  `pangduan5` varchar(2) DEFAULT NULL,
  `pangduan6` varchar(2) DEFAULT NULL,
  `pangduan7` varchar(2) DEFAULT NULL,
  `pangduan8` varchar(2) DEFAULT NULL,
  `pangduan9` varchar(2) DEFAULT NULL,
  `pangduan10` varchar(2) DEFAULT NULL,
  `zhuguan1` varchar(255) DEFAULT NULL,
  `zhuguan2` varchar(255) DEFAULT NULL,
  `zhuguan3` varchar(255) DEFAULT NULL,
  `zuZhuFenShu` int(9) DEFAULT NULL,
  `zongFen` int(9) DEFAULT NULL,
  `shijuan` bigint(20) NOT NULL DEFAULT '0',
  `date` date DEFAULT NULL,
  PRIMARY KEY (`DaJuan`),
  KEY `shijuan` (`shijuan`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

#
# Dumping data for table daanjuan
#
LOCK TABLES `daanjuan` WRITE;
/*!40000 ALTER TABLE `daanjuan` DISABLE KEYS */;

INSERT INTO `daanjuan` VALUES (1,1,'A','A','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1',2,NULL,1,'2015-12-21');
INSERT INTO `daanjuan` VALUES (2,1,'A','A','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1','-1',2,NULL,2,'2015-12-21');
/*!40000 ALTER TABLE `daanjuan` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table keguan
#

DROP TABLE IF EXISTS `keguan`;
CREATE TABLE `keguan` (
  `KGid` bigint(20) NOT NULL AUTO_INCREMENT,
  `Type` varchar(8) DEFAULT NULL,
  `XKid` bigint(20) DEFAULT NULL,
  `TiMu` varchar(255) DEFAULT NULL,
  `DaAn` varchar(255) DEFAULT NULL,
  `TeaID` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`KGid`),
  UNIQUE KEY `TiMu` (`TiMu`),
  KEY `kg` (`TeaID`,`XKid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

#
# Dumping data for table keguan
#
LOCK TABLES `keguan` WRITE;
/*!40000 ALTER TABLE `keguan` DISABLE KEYS */;

INSERT INTO `keguan` VALUES (1,'hard',1,'Java中的HashMap的工作原理是什么？',NULL,2);
INSERT INTO `keguan` VALUES (2,'hard',2,'你了解大O符号(big-O notation)么？你能给出不同数据结构的例子么？',NULL,3);
INSERT INTO `keguan` VALUES (3,'hard',1,'HashMap和Hashtable有什么区别？',NULL,2);
INSERT INTO `keguan` VALUES (4,'hard',1,'在监视器(Monitor)内部，是如何做线程同步的？程序应该做哪种级别的同步？',NULL,2);
INSERT INTO `keguan` VALUES (5,'hard',2,'Java支持的数据类型有哪些？什么是自动拆装箱？',NULL,3);
INSERT INTO `keguan` VALUES (6,'easy',1,'”static”关键字是什么意思？Java中是否可以覆盖(override)一个private或者是static的方法？',NULL,2);
INSERT INTO `keguan` VALUES (7,'easy',2,'Java集合类框架的最佳实践有哪些？',NULL,3);
INSERT INTO `keguan` VALUES (8,'easy',2,'什么是Java虚拟机？为什么Java被称作是“平台无关的编程语言”？',NULL,3);
INSERT INTO `keguan` VALUES (9,'easy',1,'public class FirstArray {\r\n  public static void main(String args[]) {\r\n  int  i;\r\n  int  aa[]=new int[5];\r\n  for (i=0; i<5; i++)\r\n  System.out.print(“aa[“+i+”]=”+aa[i]+”,”);\r\n   System.out.println(“\\nlength of array a is ”+aa.length);\r\n  }\r\n}请写出以上程序的执行结果。',NULL,2);
INSERT INTO `keguan` VALUES (10,'easy',1,'public class  A {\r\n     public static void main(String[] args) {\r\n     char[] s1={\'h\',\'e\',\'l\',\'l\',\'o\',\'w\', \'!\'};\r\n     char[] s2=new char[3];\r\n     System.arraycopy(s1,2,s2,0,3);\r\n     System.out.println(new String(s2));\r\n     }\r\n}请写出以上程序的执行结果。\r\n\r\n}\r\n   ',NULL,2);
/*!40000 ALTER TABLE `keguan` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table mingyan
#

DROP TABLE IF EXISTS `mingyan`;
CREATE TABLE `mingyan` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `YuJu` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Dumping data for table mingyan
#
LOCK TABLES `mingyan` WRITE;
/*!40000 ALTER TABLE `mingyan` DISABLE KEYS */;

INSERT INTO `mingyan` VALUES (1,'放开往日的学习中的紧张，用一颗平常心去轻松面对，相信你会考出自己理想的成绩的。愿好运一直陪伴着你！');
INSERT INTO `mingyan` VALUES (2,'悲观些看成功，乐观些看失败。轻松些看自己，宽容些看别人。理智些不问收获，但问耕耘！天道酬勤。');
INSERT INTO `mingyan` VALUES (3,'人生终有许多选择。每一步都要慎重。但是一次选择不能决定一切。不要犹豫，作出选择就不要后悔。只要我们能不屈不挠地奋斗，胜利就在前方。');
INSERT INTO `mingyan` VALUES (4,'长风破浪会有时，直挂云帆济沧海。');
INSERT INTO `mingyan` VALUES (5,'考试答题步骤：通览全卷，沉着应试；慎密审题，扣题作答；先易后难，从容解答；祝你开始顺顺利利，顺利通过啊。');
INSERT INTO `mingyan` VALUES (6,'面对目标，信心百倍，人生能有几次搏？面对成绩，心胸豁达，条条大陆通罗马。给自己一个恰如其分的自信。');
/*!40000 ALTER TABLE `mingyan` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table pangduan
#

DROP TABLE IF EXISTS `pangduan`;
CREATE TABLE `pangduan` (
  `PDid` bigint(20) NOT NULL AUTO_INCREMENT,
  `Type` varchar(8) DEFAULT NULL,
  `XKid` bigint(20) DEFAULT NULL,
  `TiMu` varchar(255) DEFAULT NULL,
  `DaAn` varchar(2) DEFAULT NULL,
  `TeaID` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`PDid`),
  UNIQUE KEY `TiMu` (`TiMu`),
  KEY `pd` (`TeaID`,`XKid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

#
# Dumping data for table pangduan
#
LOCK TABLES `pangduan` WRITE;
/*!40000 ALTER TABLE `pangduan` DISABLE KEYS */;

INSERT INTO `pangduan` VALUES (1,'hard',1,'Java的各种数据类型所占用的内存长度与具体软硬件环境有关。（   ）','0',2);
INSERT INTO `pangduan` VALUES (2,'hard',1,'在Java的方法中定义一个常量要用const关键字。（   ）','0',2);
INSERT INTO `pangduan` VALUES (3,'hard',1,'Java的类不允许多重继承，但接口支持多重继承。（   ）','1',2);
INSERT INTO `pangduan` VALUES (4,'hard',2,'所谓抽象类就是包含有抽象方法的类。（   ）','0',3);
INSERT INTO `pangduan` VALUES (5,'hard',2,'在异常处理中总是将可能产生异常的语句放在try块中，用catch子句去处理异常，而且一个try块之后只能对应一个catch语句。（   ）','0',3);
INSERT INTO `pangduan` VALUES (6,'hard',2,'程序员可以不必释放已创建的对象，因为Java有垃圾回收机制，内存回收程序可在指定的时间释放内存对象。（   ）','0',3);
INSERT INTO `pangduan` VALUES (7,'hard',2,'Java语言中的数组元素只能是基本数据类型而不能为对象类型。（ )  ','1',3);
INSERT INTO `pangduan` VALUES (8,'hard',1,'构造函数用于创建类的实例对象，构造函数名应与类名相同，在类中必须定义构造函数，且只能定义一个构造函数。（   ）','0',2);
INSERT INTO `pangduan` VALUES (9,'hard',1,'JVM对给定对象可以多次执行finalize方法。（  ）','0',2);
INSERT INTO `pangduan` VALUES (10,'hard',1,'父类的private方法可以被子类重写。（  ）','0',2);
INSERT INTO `pangduan` VALUES (11,'easy',2,'自定义组件不能触发事件，但可以由系统采用接口回调技术进行事件处理。（  ）','0',3);
INSERT INTO `pangduan` VALUES (12,'easy',2,'多个类可共享相同的接口。（  ）','1',3);
INSERT INTO `pangduan` VALUES (13,'easy',1,'事件侦听器所在的类可以实现多个事件侦听接口，从而可以处理多种事件。（  ）','1',2);
INSERT INTO `pangduan` VALUES (14,'easy',1,'单一应用程序仅可以拥有与单个数据库的一个连接。（  ）','0',2);
INSERT INTO `pangduan` VALUES (15,'easy',2,'在方法中使用final型参数，可防止在方法中对形参的修改影响到实参。（  ）','1',3);
INSERT INTO `pangduan` VALUES (16,'easy',1,'在Java的线程调度策略中，同优先级的线程排队轮流使用时间片。（  ）','1',2);
INSERT INTO `pangduan` VALUES (17,'easy',2,'Java中的标识符不区分大小写。（  ）','0',3);
INSERT INTO `pangduan` VALUES (18,'easy',2,'Java程序中仅有一个类是public类。（  ）','1',3);
/*!40000 ALTER TABLE `pangduan` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table shijuan
#

DROP TABLE IF EXISTS `shijuan`;
CREATE TABLE `shijuan` (
  `sjID` bigint(20) NOT NULL AUTO_INCREMENT,
  `xuanze5` bigint(20) DEFAULT NULL,
  `xuanze1` bigint(20) DEFAULT NULL,
  `xuanze2` bigint(20) DEFAULT NULL,
  `xuanze3` bigint(20) DEFAULT NULL,
  `xuanze4` bigint(20) DEFAULT NULL,
  `xuanze6` bigint(20) DEFAULT NULL,
  `xuanze7` bigint(20) DEFAULT NULL,
  `xuanze8` bigint(20) DEFAULT NULL,
  `xuanze9` bigint(20) DEFAULT NULL,
  `xuanze10` bigint(20) DEFAULT NULL,
  `pangduan1` bigint(20) DEFAULT NULL,
  `pangduan2` bigint(20) DEFAULT NULL,
  `pangduan3` bigint(20) DEFAULT NULL,
  `pangduan4` bigint(20) DEFAULT NULL,
  `pangduan5` bigint(20) DEFAULT NULL,
  `pangduan6` bigint(20) DEFAULT NULL,
  `pangduan7` bigint(20) DEFAULT NULL,
  `pangduan8` bigint(20) DEFAULT NULL,
  `pangduan9` bigint(20) DEFAULT NULL,
  `pangduan10` bigint(20) DEFAULT NULL,
  `zhuguan1` bigint(20) DEFAULT NULL,
  `zhuguan2` bigint(20) DEFAULT NULL,
  `zhuguan3` bigint(20) DEFAULT NULL,
  `StuID` bigint(20) DEFAULT NULL,
  `NameXK` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`sjID`),
  KEY `xz3` (`xuanze3`),
  KEY `xz1` (`xuanze1`),
  KEY `xz2` (`xuanze2`),
  KEY `xz4` (`xuanze4`),
  KEY `xz5` (`xuanze5`),
  KEY `xz6` (`xuanze6`),
  KEY `xz7` (`xuanze7`),
  KEY `xz8` (`xuanze8`),
  KEY `xz9` (`xuanze9`),
  KEY `xz10` (`xuanze10`),
  KEY `pd2` (`pangduan2`),
  KEY `pd3` (`pangduan3`),
  KEY `pd4` (`pangduan4`),
  KEY `pd5` (`pangduan5`),
  KEY `pd6` (`pangduan6`),
  KEY `pd7` (`pangduan7`),
  KEY `pd9` (`pangduan9`),
  KEY `pd10` (`pangduan10`),
  KEY `zg1` (`zhuguan1`),
  KEY `zg2` (`zhuguan2`),
  KEY `zg3` (`zhuguan3`),
  KEY `pd1` (`pangduan1`),
  KEY `pd8` (`pangduan8`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Dumping data for table shijuan
#
LOCK TABLES `shijuan` WRITE;
/*!40000 ALTER TABLE `shijuan` DISABLE KEYS */;

INSERT INTO `shijuan` VALUES (1,4,11,12,16,7,8,10,9,5,2,18,11,12,5,1,10,8,6,7,4,6,5,3,1,'JAVA');
INSERT INTO `shijuan` VALUES (2,3,12,11,13,5,1,7,9,8,10,13,11,17,9,5,4,2,1,7,10,7,3,4,1,'JAVA');
/*!40000 ALTER TABLE `shijuan` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table student
#

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idStu` varchar(32) NOT NULL DEFAULT '',
  `nameStu` varchar(255) NOT NULL,
  `pswStu` varchar(255) NOT NULL,
  `emailStu` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stuID` (`idStu`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

#
# Dumping data for table student
#
LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;

INSERT INTO `student` VALUES (1,'221200214','林俊鑫','350322','469714793@qq.com');
INSERT INTO `student` VALUES (2,'221200213','林德强','174979','892285963@qq.com');
INSERT INTO `student` VALUES (3,'221200215','罗樱','011244','1024489308@qq.com');
INSERT INTO `student` VALUES (4,'221200216','王薪越','220013','435397724@qq.com');
INSERT INTO `student` VALUES (5,'221200217','严宇凡','155132','969851796@qq.com');
INSERT INTO `student` VALUES (6,'221200218','黄艺伟','016518','290994590@qq.com');
INSERT INTO `student` VALUES (7,'221200221','夏凡','090065','751566387@qq.com');
INSERT INTO `student` VALUES (8,'221200201','谢志华','233333','1222222222');
INSERT INTO `student` VALUES (9,'666666','666666','6666','66666');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table teacher
#

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `Name` varchar(32) DEFAULT NULL,
  `PwsTea` varchar(32) DEFAULT NULL,
  `EmailTea` varchar(32) DEFAULT NULL,
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `TeaID` varchar(32) DEFAULT NULL,
  `NamePY` varchar(32) DEFAULT NULL,
  `usedName` varchar(32) DEFAULT NULL,
  `sex` varchar(32) DEFAULT NULL,
  `bornDate` date DEFAULT NULL,
  `country` varchar(32) DEFAULT NULL,
  `mingzu` varchar(32) DEFAULT NULL,
  `zhengzhiMM` varchar(32) DEFAULT NULL,
  `BornWhere` varchar(64) DEFAULT NULL,
  `hunyin` varchar(32) DEFAULT NULL,
  `jiguan` varchar(32) DEFAULT NULL,
  `shenfenID` varchar(64) DEFAULT NULL,
  `jiaoshiID` varchar(64) DEFAULT NULL,
  `xueyuan` varchar(255) DEFAULT NULL,
  `zhuanye` varchar(255) DEFAULT NULL,
  `ruzhiFS` varchar(64) DEFAULT NULL,
  `zhiwei` varchar(32) DEFAULT NULL,
  `ruzhiDate` date DEFAULT NULL,
  `renqi` varchar(32) DEFAULT NULL,
  `zhiweiChange` text,
  `zhuyaoChengjiu` text,
  `renjiaoXK` text,
  `Tel` varchar(32) DEFAULT NULL,
  `sushe` text,
  `susheTEL` varchar(32) DEFAULT NULL,
  `Home` text,
  `HomeTEL` varchar(32) DEFAULT NULL,
  `youbian` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `TeaID` (`TeaID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Dumping data for table teacher
#
LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;

INSERT INTO `teacher` VALUES ('单红','123456','mycpp20@sina.cn',1,'031256','shanhong','无','男','1978-12-30','中国','汉','党员','福建','已婚','福建','未知','1132212031256','软件学院','软件工程','正常入职','讲师','2007-12-30','20年','',NULL,'软件工程等学科',NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `teacher` VALUES ('张舒','123456','469714793@qq.com',2,'031234',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `teacher` VALUES ('陈嘉','123456','mycpp20@sina.cn',3,'031278',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `teacher` VALUES ('陈家瑞','123456','mycpp20@sina.cn',4,'031121',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `teacher` VALUES ('傅仰耿','123456','469714793@qq.com',5,'031221',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO `teacher` VALUES ('王一蕾','123456','469714793@qq.com',6,'031222',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tiankong
#

DROP TABLE IF EXISTS `tiankong`;
CREATE TABLE `tiankong` (
  `TDid` bigint(20) NOT NULL AUTO_INCREMENT,
  `Type` varchar(8) DEFAULT NULL,
  `XKid` bigint(20) DEFAULT NULL,
  `TiMu` varchar(255) DEFAULT NULL,
  `DaAn` varchar(255) DEFAULT NULL,
  `TeaID` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`TDid`),
  UNIQUE KEY `TiMu` (`TiMu`),
  KEY `tk` (`TeaID`,`XKid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Dumping data for table tiankong
#
LOCK TABLES `tiankong` WRITE;
/*!40000 ALTER TABLE `tiankong` DISABLE KEYS */;

/*!40000 ALTER TABLE `tiankong` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for view user
#

DROP VIEW IF EXISTS `user`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `user` AS (select `u`.`loginId` AS `id`,`u`.`loginPsw` AS `psw`,`u`.`loginName` AS `name` from `admin` `u`) union (select `u`.`idStu` AS `id`,`u`.`pswStu` AS `psw`,`u`.`nameStu` AS `name` from `student` `u`) union (select `u`.`TeaID` AS `id`,`u`.`PwsTea` AS `psw`,`u`.`Name` AS `name` from `teacher` `u`);
INSERT INTO `user` VALUES ('admin','admin','管理员');
INSERT INTO `user` VALUES ('221200214','350322','林俊鑫');
INSERT INTO `user` VALUES ('221200213','174979','林德强');
INSERT INTO `user` VALUES ('221200215','011244','罗樱');
INSERT INTO `user` VALUES ('221200216','220013','王薪越');
INSERT INTO `user` VALUES ('221200217','155132','严宇凡');
INSERT INTO `user` VALUES ('221200218','016518','黄艺伟');
INSERT INTO `user` VALUES ('221200221','090065','夏凡');
INSERT INTO `user` VALUES ('221200201','233333','谢志华');
INSERT INTO `user` VALUES ('666666','6666','666666');
INSERT INTO `user` VALUES ('031256','123456','单红');
INSERT INTO `user` VALUES ('031234','123456','张舒');
INSERT INTO `user` VALUES ('031278','123456','陈嘉');
INSERT INTO `user` VALUES ('031121','123456','陈家瑞');
INSERT INTO `user` VALUES ('031221','123456','傅仰耿');
INSERT INTO `user` VALUES ('031222','123456','王一蕾');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
