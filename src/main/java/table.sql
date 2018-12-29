CREATE TABLE `class` (
  `classId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `gradeId` int(11) DEFAULT NULL,
  `classesId` int(11) NOT NULL,
  PRIMARY KEY (`classId`),
  KEY `fk_gradeId` (`gradeId`),
  CONSTRAINT `fk_gradeId` FOREIGN KEY (`gradeId`) REFERENCES `grade` (`gradeId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

CREATE TABLE `grade` (
  `gradeId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`gradeId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;