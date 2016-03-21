# Project: CRM_API
# Author: hieunc
# Created: 26/02/2016 12:10

USE `marketing`;
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `locationId`       INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `locationName`     VARCHAR(100)              DEFAULT NULL,

  `createdDate`     DATETIME                  DEFAULT '0000-00-00 00:00:00',
  `lastUpdated` DATETIME                  DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`locationId`),
  KEY `locationName` (`locationName`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

INSERT INTO `location` (`locationName`, `createdDate`, `lastUpdated`)
VALUES
  ('TP. Hồ Chí Minh', NOW(), NOW()),
  ('Hà Nội', NOW(), NOW()),
  ('Đà Nẵng', NOW(), NOW()),
  ('Cần Thơ', NOW(), NOW());
