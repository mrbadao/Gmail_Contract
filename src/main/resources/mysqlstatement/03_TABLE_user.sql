# Project: CRM_API
# Author: hieunc
# Created: 26/02/2016 12:10

USE `crm`;
DROP TABLE IF EXISTS `facebook_user_detail`;
CREATE TABLE `facebook_user_detail` (
  `facebookId`         BIGINT(20) UNSIGNED NOT NULL,
  `fullName`           VARCHAR(100) DEFAULT NULL,
  `firstName`          VARCHAR(50)  DEFAULT NULL,
  `lastName`           VARCHAR(50)  DEFAULT NULL,
  `registeredEmail`    VARCHAR(100) DEFAULT NULL,
  `facebookLink`       VARCHAR(200) DEFAULT NULL,
  `birthday`           VARCHAR(20)  DEFAULT NULL,
  `about`              TEXT         DEFAULT NULL,
  `bio`                TEXT         DEFAULT NULL,
  `hometown`           VARCHAR(30)  DEFAULT NULL,
  `relationshipStatus` VARCHAR(50)  DEFAULT NULL,
  `religion`           VARCHAR(50)  DEFAULT NULL,
  `timezone`           FLOAT        DEFAULT 0,
  `website`            VARCHAR(200) DEFAULT NULL,


  `import_date`        DATETIME     DEFAULT '0000-00-00 00:00:00',
  `last_update_date`   DATETIME     DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`facebookId`),
  KEY `registeredEmail` (`registeredEmail`),
  KEY `timezone` (`timezone`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
