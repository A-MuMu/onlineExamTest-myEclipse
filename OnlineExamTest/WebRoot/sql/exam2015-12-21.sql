# MySQL-Front 5.1  (Build 2.7)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: 127.0.01    Database: exam
# ------------------------------------------------------
# Server version 5.6.27-log

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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

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
  PRIMARY KEY (`ID`),
  UNIQUE KEY `TeaID` (`TeaID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Dumping data for table teacher
#
LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;

INSERT INTO `teacher` VALUES ('单红','123456','mycpp20@sina.cn',1,'031256');
INSERT INTO `teacher` VALUES ('张舒','123456','469714793@qq.com',2,'031234');
INSERT INTO `teacher` VALUES ('陈嘉','123456','mycpp20@sina.cn',3,'031278');
INSERT INTO `teacher` VALUES ('陈家瑞','123456','mycpp20@sina.cn',4,'031121');
INSERT INTO `teacher` VALUES ('傅仰耿','123456','469714793@qq.com',5,'031221');
INSERT INTO `teacher` VALUES ('王一蕾','123456','469714793@qq.com',6,'031222');
INSERT INTO `teacher` VALUES ('2111','3222','5555',7,'1');
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
INSERT INTO `user` VALUES ('1','3222','2111');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table xueke
#

DROP TABLE IF EXISTS `xueke`;
CREATE TABLE `xueke` (
  `XKid` bigint(20) NOT NULL AUTO_INCREMENT,
  `NameXK` varchar(32) DEFAULT NULL,
  `TeaID` bigint(20) NOT NULL,
  PRIMARY KEY (`XKid`,`TeaID`),
  KEY `TeaID` (`TeaID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

#
# Dumping data for table xueke
#
LOCK TABLES `xueke` WRITE;
/*!40000 ALTER TABLE `xueke` DISABLE KEYS */;

INSERT INTO `xueke` VALUES (1,'JAVA',2);
INSERT INTO `xueke` VALUES (2,'JAVA',3);
INSERT INTO `xueke` VALUES (3,'操作系统',3);
INSERT INTO `xueke` VALUES (4,'软件工程',1);
INSERT INTO `xueke` VALUES (5,'数据结构',6);
INSERT INTO `xueke` VALUES (6,'数据结构',5);
INSERT INTO `xueke` VALUES (7,'LINUX',4);
INSERT INTO `xueke` VALUES (8,'JAVAEE',4);
/*!40000 ALTER TABLE `xueke` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table xuenze
#

DROP TABLE IF EXISTS `xuenze`;
CREATE TABLE `xuenze` (
  `XZid` bigint(20) NOT NULL AUTO_INCREMENT,
  `Type` varchar(8) DEFAULT NULL,
  `XKid` bigint(20) NOT NULL DEFAULT '0',
  `TiMu` varchar(255) DEFAULT NULL,
  `DaAn` varchar(2) DEFAULT NULL,
  `A` varchar(255) NOT NULL DEFAULT '',
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `D` varchar(255) DEFAULT NULL,
  `TeaID` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`XZid`),
  UNIQUE KEY `TiMu` (`TiMu`),
  KEY `xzTOxk` (`TeaID`,`XKid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

#
# Dumping data for table xuenze
#
LOCK TABLES `xuenze` WRITE;
/*!40000 ALTER TABLE `xuenze` DISABLE KEYS */;

INSERT INTO `xuenze` VALUES (1,'hard',1,'下列关于this关键字的说法正确的是（  ）。','C','可以在构造函数内部通过this关键字调用同类的另一构造函数，并且此调用语句可以位于该构造函数内部的任意位置处','可以在构造函数内部通过this关键字调用同类的两个或两个以上的构造函数','在类的静态方法中可通过this关键字访问本类对象','当方法的形参和类的成员变量同名时，可以使用this关键字指明成员变量',2);
INSERT INTO `xuenze` VALUES (2,'hard',2,'下列关于静态初始化器的说法错误的是（  ）。','D','静态初始化器是在类加载到内存时由系统调用执行的','静态初始化器可执行多次','静态初始化器中不能出现非静态域或非静态方法','静态初始化器不是方法，因此没有方法名、返回值和参数列表',3);
INSERT INTO `xuenze` VALUES (3,'hard',1,'以下代码段 Point  p1=new Point(2,3);  Point  p2=new Point(4,5);  p1=p2;\r\n(Point为点类)的执行结果是（  ）。\r\n','A','p1所指Point对象的成员更新为4，5','以上代码段不能通过编译','p1和p2均指向原p2所指对象，原p1所指对象将被垃圾收集器收集','p1为null, 原p1所指对象将被垃圾收集器收集',2);
INSERT INTO `xuenze` VALUES (4,'hard',2,'下列关于公有类中成员的访问权限说法错误的是（  ）。','A','友好成员可以被本类或同包中的其它类访问，但不能被异包中的类访问','公有成员可以被其它任何类访问','私有成员仅可被本类访问','保护成员仅可以被本类或同包中的子类访问，不能被异包中的类访问',3);
INSERT INTO `xuenze` VALUES (5,'hard',1,'下列说法错误的是（  ）。','B','final类不能派生出其它类','基类的final方法不能被子类继承','基类的final方法不能被子类重写','final类中的所有方法都是final方法',2);
INSERT INTO `xuenze` VALUES (6,'hard',1,'当需要许多面板切换，而每个面板需要显示为不同布局时，可以使用（  ）。','D','流式布局','卡片布局','盒式布局','网格布局',2);
INSERT INTO `xuenze` VALUES (7,'hard',1,'设已建立好到某数据库的连接conn,对conn调用哪个方法返回的对象可用于执行存储过程（  ）。','A','prepareCall','prepareStatement','createStatement','createCall',2);
INSERT INTO `xuenze` VALUES (8,'hard',2,'加载JDBC驱动的正确方法是（  ）。','D','使用类java.sql.DriverManager的getDriver方法','使用类java.sql.DriverManager的getConnection方法','使用类java.lang.Class的forName方法','使用接口java.sql.Driver的connect方法',3);
INSERT INTO `xuenze` VALUES (9,'hard',1,'想要读取URL资源中的html文本，下列方法正确的是（  ）。','B','对URL对象调用openStream( )方法，获取此URL资源上的输入流再进行读取','对URL对象调用retrieveContent( )方法','对URL对象调用getConnection( )方法打开到该URL资源的连接后再对该连接调用getInputStream( )方法获取此连接上的输入流进行读取','对URL对象调用openConnection( )方法打开到该URL资源的连接后再对该连接调用openStream( )方法获取此连接上的输入流进行读取',2);
INSERT INTO `xuenze` VALUES (10,'hard',2,'InetAddress类的哪个方法可以获取本地主机的网络地址（即InetAddress对象） （  ）。','A','getByName(String)','getLocalHost( )','getAddress( )','getHostAddress( )',3);
INSERT INTO `xuenze` VALUES (11,'easy',1,'对于下面的程序哪个结论是正确的（  ）。\r\n   Enum Color { red，blue，yellow }\r\n   public  class  A {\r\npublic static void main (String args[ ]) {\r\n  for  ( Color a: Color.values( ) )\r\n    System.out.println(a+”,”);\r\n } }\r\n}\r\n','C','程序无法通过编译','程序可以通过编译，但无法正常运行','程序运行结果为0，1，2','程序运行结果为red，blue，yellow',2);
INSERT INTO `xuenze` VALUES (12,'easy',2,'下列关于线程的说法正确的是（  ）。','A','对于使用同一目标对象的线程，目标对象的成员变量自然就是这些线程共享的数据单元','继承Thread类创建线程的方法中采用了接口回调技术','使用同一目标对象的线程共享目标类中run( )方法所定义的局部变量','非主线程不能启动其它线程',3);
INSERT INTO `xuenze` VALUES (13,'easy',1,'下列关于线程的说法错误的是（  ）。','B','一个进程可被划分为多个线程','JVM加载代码后就会启动一个主线程','在GUI程序中，java使用线程AWT_EventQueue专门负责处理GUI事件','在Java中，Thread类由Runnable类派生而来。',2);
INSERT INTO `xuenze` VALUES (14,'easy',2,'下列关于Applet的说法错误的是（  ）。','B','Applet自身不能运行，必须嵌入到其它应用程序（如浏览器）中运行','从web 服务器上下载的Applet可以读写本地磁盘文件','在Applet对应的HTML文档中使用param标记可向该Applet传递参数','Applet的主类要定义为java.applet.Applet类的子类',3);
INSERT INTO `xuenze` VALUES (15,'easy',1,'在浏览器中执行applet 程序时，以下哪个方法将最先被执行（    ）。','D','init()','start()','destroy()','stop()',2);
INSERT INTO `xuenze` VALUES (16,'easy',2,'以下程序段的输出结果为（  ）。 for  ( int i=1; i<=6; i++ )\r\n  { \r\n     if (i==2)   continue;\r\n     if (i==4)    break;\r\n     System.out.print( i+“  ”); \r\n  }\r\n','C','1  3','1  2  3  4','1  2  3','1  3  4',3);
INSERT INTO `xuenze` VALUES (17,'easy',2,'以下两条语句int  a=6, b=7, c;  c=a++ + ++b; 执行后，a、b、c三个变量的值分别为（  ）。','B','6，7，13','6，8，14','7，8，15','7，8，14',3);
INSERT INTO `xuenze` VALUES (18,'easy',2,'下列不属于java语言的特色的是（  ）。','D','java提供无用存储单元收集机制','java具有可移植性','java支持运算符重载','java提供多线程机制',3);
/*!40000 ALTER TABLE `xuenze` ENABLE KEYS */;
UNLOCK TABLES;

#
#  Foreign keys for table course
#

ALTER TABLE `course`
ADD CONSTRAINT `student` FOREIGN KEY (`stuID`) REFERENCES `student` (`id`),
ADD CONSTRAINT `xk` FOREIGN KEY (`TeaID`, `XKid`) REFERENCES `xueke` (`TeaID`, `XKid`);

#
#  Foreign keys for table daanjuan
#

ALTER TABLE `daanjuan`
ADD CONSTRAINT `shijuan` FOREIGN KEY (`shijuan`) REFERENCES `shijuan` (`sjID`);

#
#  Foreign keys for table keguan
#

ALTER TABLE `keguan`
ADD CONSTRAINT `kg` FOREIGN KEY (`TeaID`, `XKid`) REFERENCES `xueke` (`TeaID`, `XKid`);

#
#  Foreign keys for table pangduan
#

ALTER TABLE `pangduan`
ADD CONSTRAINT `pd` FOREIGN KEY (`TeaID`, `XKid`) REFERENCES `xueke` (`TeaID`, `XKid`);

#
#  Foreign keys for table shijuan
#

ALTER TABLE `shijuan`
ADD CONSTRAINT `pd1` FOREIGN KEY (`pangduan1`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd10` FOREIGN KEY (`pangduan10`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd2` FOREIGN KEY (`pangduan2`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd3` FOREIGN KEY (`pangduan3`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd4` FOREIGN KEY (`pangduan4`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd5` FOREIGN KEY (`pangduan5`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd6` FOREIGN KEY (`pangduan6`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd7` FOREIGN KEY (`pangduan7`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd8` FOREIGN KEY (`pangduan8`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `pd9` FOREIGN KEY (`pangduan9`) REFERENCES `pangduan` (`PDid`),
ADD CONSTRAINT `xz1` FOREIGN KEY (`xuanze1`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz10` FOREIGN KEY (`xuanze10`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz2` FOREIGN KEY (`xuanze2`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz3` FOREIGN KEY (`xuanze3`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz4` FOREIGN KEY (`xuanze4`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz5` FOREIGN KEY (`xuanze5`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz6` FOREIGN KEY (`xuanze6`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz7` FOREIGN KEY (`xuanze7`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz8` FOREIGN KEY (`xuanze8`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `xz9` FOREIGN KEY (`xuanze9`) REFERENCES `xuenze` (`XZid`),
ADD CONSTRAINT `zg1` FOREIGN KEY (`zhuguan1`) REFERENCES `keguan` (`KGid`),
ADD CONSTRAINT `zg2` FOREIGN KEY (`zhuguan2`) REFERENCES `keguan` (`KGid`),
ADD CONSTRAINT `zg3` FOREIGN KEY (`zhuguan3`) REFERENCES `keguan` (`KGid`);

#
#  Foreign keys for table tiankong
#

ALTER TABLE `tiankong`
ADD CONSTRAINT `tk` FOREIGN KEY (`TeaID`, `XKid`) REFERENCES `xueke` (`TeaID`, `XKid`);

#
#  Foreign keys for table xueke
#

ALTER TABLE `xueke`
ADD CONSTRAINT `teaID` FOREIGN KEY (`TeaID`) REFERENCES `teacher` (`ID`);

#
#  Foreign keys for table xuenze
#

ALTER TABLE `xuenze`
ADD CONSTRAINT `xzTOxk` FOREIGN KEY (`TeaID`, `XKid`) REFERENCES `xueke` (`TeaID`, `XKid`);


/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
