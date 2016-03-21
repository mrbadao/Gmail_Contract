# Project: CRM_API
# Author: hieunc
# Created: 26/02/2016 12:10

USE `marketing`;
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `roleId`           INT(11) UNSIGNED AUTO_INCREMENT NOT NULL,
  `roleName`         VARCHAR(128)                    NOT NULL,
  `roleDescription`  VARCHAR(128)                    NOT NULL,
  `created`          DATETIME     DEFAULT '0000-00-00 00:00:00',
  `last_update_date` DATETIME     DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`roleId`),
  KEY `roleName` (`roleName`),
  KEY `roleDescription` (`roleDescription`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_general_ci;
