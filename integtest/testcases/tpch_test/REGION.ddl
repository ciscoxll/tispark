DROP TABLE IF EXISTS `REGION`;
CREATE TABLE `REGION` (
  `R_REGIONKEY` int(11) NOT NULL,
  `R_NAME` char(25) NOT NULL,
  `R_COMMENT` varchar(152) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin