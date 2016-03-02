# Project: Gmail_Contract
# Author: hieunc
# Created: 23/02/2016 08:11

USE `marketing`;
DROP TABLE IF EXISTS `event`;
CREATE TABLE `event` (
  `eventId`          BIGINT(20) UNSIGNED     NOT NULL AUTO_INCREMENT,

  `eventTitle`       VARCHAR(128)
                     COLLATE utf8_general_ci NOT NULL,

  `eventDescription` TEXT
                     COLLATE utf8_general_ci NOT NULL,

  `eventDetail`      TEXT
                     COLLATE utf8_general_ci NOT NULL,

  `eventStartDate`   DATETIME                         DEFAULT '0000-00-00 00:00:00',
  `eventEndDate`     DATETIME                         DEFAULT '0000-00-00 00:00:00',

  `eventLocation`    VARCHAR(128)            NOT NULL,
  `eventAddress`     VARCHAR(128)            NOT NULL,

  `createdDate`      DATETIME                         DEFAULT '0000-00-00 00:00:00',
  `lastUpdate`       DATETIME                         DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`eventId`),
  KEY `eventTitle` (`eventTitle`),
  KEY `type_length` (`eventStartDate`, `eventEndDate`),
  KEY `created_date` (`createdDate`),
  KEY `event_location` (`eventLocation`),
  KEY `event_address` (`eventAddress`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;
