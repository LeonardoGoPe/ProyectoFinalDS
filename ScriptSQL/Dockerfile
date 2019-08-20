FROM lopdam/dbsoftdesign:img
ENV MYSQL_ROOT_PASSWORD pass
ADD DBFinalDS.sql  /docker-entrypoint-initdb.d
ADD Prueba.sql /docker-entrypoint-initdb.d
ADD Acceso.sql /docker-entrypoint-initdb.d