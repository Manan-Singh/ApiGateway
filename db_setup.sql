CREATE SCHEMA `swift_mysql` ;


CREATE TABLE `swift_mysql`.`strategies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `strategy_type` varchar(45) NOT NULL,
  `stock` varchar(45) NOT NULL,
  `entry` float NOT NULL,
  `exit` float NOT NULL,
  `active` varchar(45) NOT NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `swift_mysql`.`trades` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `strategy_id` int(11) NOT NULL,
  `trade_type` varchar(45) NOT NULL,
  `price` float NOT NULL,
  `size` int(11) NOT NULL,
  `stock` varchar(45) NOT NULL,
  `date_executed` datetime NOT NULL,
  PRIMARY KEY (`id`));
