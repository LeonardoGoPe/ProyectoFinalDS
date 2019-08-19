USE mysql;
CREATE USER 'jalvarez'@'localhost' IDENTIFIED BY 'abc123';
GRANT ALL PRIVILEGES ON ProyectoDS.* TO 'jalvarez'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;