CREATE SCHEMA `db_example` ;

CREATE TABLE `db_example`.`strategies` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `strategyType` VARCHAR(45) NOT NULL,
  `stock` VARCHAR(45) NOT NULL,
  `entry` FLOAT NOT NULL,
  `exit` FLOAT NOT NULL,
  `active` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `db_example`.`trades` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tradeType` VARCHAR(45) NOT NULL,
  `entry` FLOAT NOT NULL,
  `exit` INT NOT NULL,
  `stock` VARCHAR(45) NOT NULL,
  `dateExecuted` DATETIME NOT NULL,
  PRIMARY KEY (`id`));


