-- MySQL Script generated by MySQL Workbench
-- Fri Aug 17 13:50:49 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema terrorism
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema terrorism
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `terrorism` DEFAULT CHARACTER SET utf8 ;
USE `terrorism` ;

-- -----------------------------------------------------
-- Table `terrorism`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`country` (
  `country_id` INT NOT NULL,
  `country_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`country_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`region`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`region` (
  `region_id` INT NOT NULL,
  `region_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`region_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`provstate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`provstate` (
  `provstate_id` INT NOT NULL,
  `provstate_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`provstate_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`city`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`city` (
  `city_id` INT NOT NULL,
  `city_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`city_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`location`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`location` (
  `location_id` INT NOT NULL,
  `country_id` INT NOT NULL,
  `region_id` INT NOT NULL,
  `provstate_id` INT NULL,
  `city_id` INT NULL,
  `latitude` DECIMAL(20) NULL,
  `longitude` DECIMAL(20) NULL,
  PRIMARY KEY (`location_id`),
  INDEX `fk_location_country1_idx` (`country_id` ASC),
  INDEX `fk_location_region1_idx` (`region_id` ASC),
  INDEX `fk_location_provstate1_idx` (`provstate_id` ASC),
  INDEX `fk_location_city1_idx` (`city_id` ASC),
  CONSTRAINT `fk_location_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `terrorism`.`country` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_location_region1`
    FOREIGN KEY (`region_id`)
    REFERENCES `terrorism`.`region` (`region_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_location_provstate1`
    FOREIGN KEY (`provstate_id`)
    REFERENCES `terrorism`.`provstate` (`provstate_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_location_city1`
    FOREIGN KEY (`city_id`)
    REFERENCES `terrorism`.`city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`attacktype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`attacktype` (
  `attacktype_id` INT NOT NULL,
  `attacktype_txt` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`attacktype_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`weapontype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`weapontype` (
  `weapontype_id` INT NOT NULL,
  `weapontype_txt` VARCHAR(75) NOT NULL,
  PRIMARY KEY (`weapontype_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`event` (
  `event_id` INT NOT NULL,
  `year` INT NOT NULL,
  `month` INT NOT NULL,
  `day` INT NOT NULL,
  `doubtterr` TINYINT NOT NULL,
  `summary` VARCHAR(2048) NULL,
  `num_perps` INT NULL,
  `location_id` INT NOT NULL,
  `attacktype_id` INT NOT NULL,
  `weapontype_id` INT NOT NULL,
  PRIMARY KEY (`event_id`),
  INDEX `fk_event_location1_idx` (`location_id` ASC),
  INDEX `fk_event_attacktype1_idx` (`attacktype_id` ASC),
  INDEX `fk_event_weapontype1_idx` (`weapontype_id` ASC),
  CONSTRAINT `fk_event_location1`
    FOREIGN KEY (`location_id`)
    REFERENCES `terrorism`.`location` (`location_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_event_attacktype1`
    FOREIGN KEY (`attacktype_id`)
    REFERENCES `terrorism`.`attacktype` (`attacktype_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_event_weapontype1`
    FOREIGN KEY (`weapontype_id`)
    REFERENCES `terrorism`.`weapontype` (`weapontype_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`outcome`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`outcome` (
  `event_id` INT NOT NULL,
  `suicide` TINYINT NOT NULL,
  `multiple` TINYINT NOT NULL,
  `success` TINYINT NOT NULL,
  `num_killed` INT NULL,
  `num_injured` INT NULL,
  INDEX `fk_attack_event1_idx` (`event_id` ASC),
  CONSTRAINT `fk_attack_event1`
    FOREIGN KEY (`event_id`)
    REFERENCES `terrorism`.`event` (`event_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`targettype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`targettype` (
  `targettype_id` INT NOT NULL,
  `targettype_txt` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`targettype_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`nationalty`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`nationalty` (
  `nationality_id` INT NOT NULL,
  `nationality_txt` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`nationality_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`target`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`target` (
  `target_id` INT NOT NULL AUTO_INCREMENT,
  `targettype_id` INT NOT NULL,
  `entity_name` VARCHAR(45) NULL,
  `specific_target_name` VARCHAR(45) NULL,
  `nationality_id` INT NULL,
  PRIMARY KEY (`target_id`),
  INDEX `fk_target_targettype1_idx` (`targettype_id` ASC),
  INDEX `target_natly_id_idx` (`nationality_id` ASC),
  CONSTRAINT `fk_target_targettype1`
    FOREIGN KEY (`targettype_id`)
    REFERENCES `terrorism`.`targettype` (`targettype_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `target_natly_id`
    FOREIGN KEY (`nationality_id`)
    REFERENCES `terrorism`.`nationalty` (`nationality_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `terrorism`.`eventtarget`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `terrorism`.`eventtarget` (
  `event_target_id` INT NOT NULL,
  `event_id` INT NOT NULL,
  `target_id` INT NOT NULL,
  PRIMARY KEY (`event_target_id`),
  INDEX `fk_eventtarget_event1_idx` (`event_id` ASC),
  INDEX `fk_eventtarget_target1_idx` (`target_id` ASC),
  CONSTRAINT `fk_eventtarget_event1`
    FOREIGN KEY (`event_id`)
    REFERENCES `terrorism`.`event` (`event_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_eventtarget_target1`
    FOREIGN KEY (`target_id`)
    REFERENCES `terrorism`.`target` (`target_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
