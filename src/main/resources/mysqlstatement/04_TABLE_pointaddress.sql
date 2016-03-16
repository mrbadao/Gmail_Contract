# Project: CRM_API
# Author: hieunc
# Created: 26/02/2016 12:10

USE `marketing`;
DROP TABLE IF EXISTS `pointaddress`;
CREATE TABLE `pointaddress` (
  `pointId`      INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `locationId`   INT(11) UNSIGNED NOT NULL,
  `pointAddress` VARCHAR(128)              DEFAULT NULL,

  `createdDate`  DATETIME                  DEFAULT '0000-00-00 00:00:00',
  `lastUpdated`  DATETIME                  DEFAULT '0000-00-00 00:00:00',

  PRIMARY KEY (`pointId`),
  KEY `pointAddress` (`pointAddress`),
  KEY `locationId` (`locationId`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8,
  COLLATE = utf8_general_ci;

INSERT INTO `pointaddress` (`locationId`, `pointAddress`, `createdDate`, `lastUpdated`)
VALUES
  (1, 'Trung tâm triễn lãm Sài Gón SECC, Quận 7,', NOW(), NOW()),
  (2, 'Cung triển lãm xây dựng quốc gia, 01 Đỗ Đức Dục, Nam Từ Liêm', NOW(), NOW()),
  (3, 'Trung Tâm hội chợ triễn lãm Đà Nẵng, 09 CMT8, Quận Cẩm Lệ', NOW(), NOW()),
  (4, 'Trung tâm hội trợ tiển lãm quốc tế Cần Thơ, 108A Lê Lợi, Quận Ninh Kiều', NOW(), NOW());
