CREATE TABLE `users` (
  `oid` varchar(36) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `pwd` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  UNIQUE KEY `unique_index_users_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
-- 因oid和name是两个不同的unique，所以他们都不能用来做分表
-- All columns used in the partitioning expression for a partitioned table must be part of every unique key that the table may have
-- 被用来分表的列，必须属于每一个unique
-- 如表有unique1:a; unique2:[a,b];unique3:[a,b,c].
-- 此时只有a满足同时属于所有unique，所以只有a可以用来分表。
--可以在程序中实现按name分表，因大多查找用name作为条件，