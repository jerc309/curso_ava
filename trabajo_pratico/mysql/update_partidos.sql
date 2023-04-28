-- Active: 1682191285245@@127.0.0.1@3306@prueba
DROP TABLE partidos;
SHOW COLUMNS FROM resultados;

CREATE TABLE partidos ( ID int NOT NULL AUTO_INCREMENT , NOMBRE  VARCHAR(20) NOT NULL, EQUIPO_1 VARCHAR(20) NOT NULL, GANA_1  VARCHAR(1), EMPATA  VARCHAR(1), GANA_2  VARCHAR(1), EQUIPO_2 VARCHAR(20) NOT NULL , PRIMARY KEY (ID));
 

INSERT INTO partidos (NOMBRE, EQUIPO_1, GANA_1, EMPATA, GANA_2 ,EQUIPO_2) VALUES ('Jose', 'Argentina','X',NULL,NULL, 'Arabia Saudita');
INSERT INTO partidos (NOMBRE, EQUIPO_1, GANA_1, EMPATA, GANA_2 ,EQUIPO_2) VALUES ('Johann', 'Polonia','X',NULL,NULL, 'Mexico');
INSERT INTO partidos (NOMBRE, EQUIPO_1, GANA_1, EMPATA, GANA_2 ,EQUIPO_2) VALUES ('Johann', 'Venezuela','X',NULL,NULL, 'Mexico');
INSERT INTO partidos (NOMBRE, EQUIPO_1, GANA_1, EMPATA, GANA_2 ,EQUIPO_2) VALUES ('Jose', 'Mexico','X',NULL,NULL, 'Argentina');
INSERT INTO partidos (NOMBRE, EQUIPO_1, GANA_1, EMPATA, GANA_2 ,EQUIPO_2) VALUES ('Johann', 'Polonia','X',NULL,NULL, 'Venezuela');


SELECT * from prueba.partidos;
Nombre,Equipo 1,Gana 1,Empata,Gana 2,Equipo 2
Jose,Argentina,X,,,Arabia Saudita
Johann,Polonia,X,,,Mexico
Johann,Venezuela,X,,,Mexico
Jose,Mexico,,X,,Argentina
Johann,Polonia,X,,,Venezuela