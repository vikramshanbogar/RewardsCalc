CREATE TABLE `UserInfo` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `email` varchar(255) DEFAULT NULL,
                            `name` varchar(255) DEFAULT NULL,
                            `password` varchar(255) DEFAULT NULL,
                            `roles` varchar(255) DEFAULT NULL,
                            PRIMARY KEY (`id`));

INSERT INTO UserInfo (email,name,password,roles) VALUES
                                                                 ('vikram@gmail.com','vikram11','''$2a$12$Zv9a3QgsvjqXdCssxbMRV.7Joy.t26lGYlLqm.VWMBmB2morc2RnO''','ROLE_ADMIN'),
                                                                 ('jonny@gmail.com','jonny',' Use https://bcrypt-generator.com/','ROLE_ADMIN'),
                                                                 ('roger@gmail.com','roger','$2a$12$e.5r0N.d3VIxRoDFP3Yg1ewYKu9nnTQkjFtkymfbVYWgU0iSj8zja','ROLE_USER'),
                                                                 ('vikram@gmail.com','Vikram','$2a$12$Zv9a3QgsvjqXdCssxbMRV.7Joy.t26lGYlLqm.VWMBmB2morc2RnO','ROLE_ADMIN');
