drop table if exists customer;
drop table if exists UserInfo;

CREATE TABLE `customer` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `f_name` varchar(255) DEFAULT NULL,
                            `l_name` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`id`));

CREATE TABLE `UserInfo` (
                                `id` int NOT NULL AUTO_INCREMENT,
                                `email` varchar(255) DEFAULT NULL,
                                `name` varchar(255) DEFAULT NULL,
                                `password` varchar(255) DEFAULT NULL,
                                `roles` varchar(255) DEFAULT NULL,
                                PRIMARY KEY (`id`));


