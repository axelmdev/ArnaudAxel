-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.7.14 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Export de la structure de la base pour bdd_arnaud_axel
CREATE DATABASE IF NOT EXISTS `bdd_arnaud_axel` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bdd_arnaud_axel`;

-- Export de la structure de la table bdd_arnaud_axel. rights
CREATE TABLE IF NOT EXISTS `rights` (
  `droits_id` int(11) NOT NULL AUTO_INCREMENT,
  `niveau` varchar(255) DEFAULT NULL,
  `severite` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `societe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`droits_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table bdd_arnaud_axel.rights : ~0 rows (environ)
/*!40000 ALTER TABLE `rights` DISABLE KEYS */;
INSERT INTO `rights` (`droits_id`, `niveau`, `severite`, `nom`, `societe`) VALUES
	(1, 'Niveau 1', 'Danger', 'Droit 1', 'Ubisoft'),
	(2, 'Niveau 2', 'Normal', 'Droit 2', 'Ubisoft');
/*!40000 ALTER TABLE `rights` ENABLE KEYS */;

-- Export de la structure de la table bdd_arnaud_axel. users
CREATE TABLE IF NOT EXISTS `users` (
  `users_id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`users_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table bdd_arnaud_axel.users : ~0 rows (environ)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`users_id`, `login`, `password`, `nom`, `prenom`) VALUES
	(1, 'Jack', 'toto', 'Jack', 'Lee'),
	(2, 'Ricky', 'tata', 'Ricky', 'Bobby'),
	(3, 'Jack', 'toto', 'Jack', 'Lee'),
	(4, 'Ricky', 'tata', 'Ricky', 'Bobby'),
	(5, 'Jack', 'toto', 'Jack', 'Lee'),
	(6, 'Ricky', 'tata', 'Ricky', 'Bobby'),
	(7, 'Jack', 'toto', 'Jack', 'Lee'),
	(8, 'Ricky', 'tata', 'Ricky', 'Bobby'),
	(9, 'Jack', 'toto', 'Jack', 'Lee'),
	(10, 'Ricky', 'tata', 'Ricky', 'Bobby');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Export de la structure de la table bdd_arnaud_axel. users_droits
CREATE TABLE IF NOT EXISTS `users_droits` (
  `users_id` int(11) NOT NULL,
  `droits_id` int(11) NOT NULL,
  PRIMARY KEY (`users_id`,`droits_id`),
  KEY `FK_users_droits_droits_id` (`droits_id`),
  CONSTRAINT `FK_users_droits_droits_id` FOREIGN KEY (`droits_id`) REFERENCES `rights` (`droits_id`),
  CONSTRAINT `FK_users_droits_users_id` FOREIGN KEY (`users_id`) REFERENCES `users` (`users_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table bdd_arnaud_axel.users_droits : ~0 rows (environ)
/*!40000 ALTER TABLE `users_droits` DISABLE KEYS */;
INSERT INTO `users_droits` (`users_id`, `droits_id`) VALUES
	(9, 1),
	(10, 1),
	(9, 2),
	(10, 2);
/*!40000 ALTER TABLE `users_droits` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
