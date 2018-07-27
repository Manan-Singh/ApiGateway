CREATE SCHEMA `swift_mysql` ;

CREATE TABLE `swift_mysql`.`strategies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `strategyType` VARCHAR(45) NOT NULL,
  `stock` VARCHAR(45) NOT NULL,
  `entry` FLOAT NOT NULL,
  `exit` FLOAT NOT NULL,
  `active` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `swift_mysql`.`trades` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tradeType` VARCHAR(45) NOT NULL,
  `entry` FLOAT NOT NULL,
  `exit` INT NOT NULL,
  `stock` VARCHAR(45) NOT NULL,
  `dateExecuted` DATETIME NOT NULL,
  PRIMARY KEY (`id`));


