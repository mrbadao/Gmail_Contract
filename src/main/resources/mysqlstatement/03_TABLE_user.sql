# Project: CRM_API
# Author: hieunc
# Created: 26/02/2016 12:10

USE `marketing`;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId`           INT(11) UNSIGNED AUTO_INCREMENT NOT NULL,
  `loginEmail`       VARCHAR(128) NOT NULL,
  `loginPwd`         VARCHAR(128) NOT NULL,
  `fullName`         VARCHAR(100) DEFAULT NULL,
  `firstName`        VARCHAR(50)  DEFAULT NULL,
  `lastName`         VARCHAR(50)  DEFAULT NULL,
  `birthday`         VARCHAR(20)  DEFAULT NULL,
  `smtpServer`       VARCHAR(128) DEFAULT 'smtp.gmail.com',
  `smtpPort`         INT(3)       DEFAULT 465,
  `imapServer`       VARCHAR(128) DEFAULT 'imap.gmail.com',
  `imapPort`         INT(3)       DEFAULT 993,
  `timezone`         FLOAT        DEFAULT 0,


  `created`          DATETIME     DEFAULT '0000-00-00 00:00:00',
  `last_update_date` DATETIME     DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`userId`),
  KEY `loginEmail` (`loginEmail`),
  KEY `loginPwd` (`loginPwd`),
  KEY `timezone` (`timezone`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;
