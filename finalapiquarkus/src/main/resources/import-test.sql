DROP TABLE IF EXISTS Sample;
DROP TABLE IF EXISTS SampleAR;

CREATE TABLE Sample
(
    id INT NOT NULL AUTO_INCREMENT UNIQUE,
    name VARCHAR (255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE SampleAR
(
    id INT NOT NULL AUTO_INCREMENT UNIQUE,
    name VARCHAR (255) NOT NULL, 
    PRIMARY KEY (id)
);

INSERT INTO Sample (id, name) VALUES (1, 'Pineapple');
INSERT INTO Sample (id, name) VALUES (2, 'Pineapple');
INSERT INTO Sample (id, name) VALUES (3, 'Pineapple');

INSERT INTO SampleAR (id, name) VALUES (1, 'Apple');
INSERT INTO SampleAR (id, name) VALUES (2, 'Apple');
INSERT INTO SampleAR (id, name) VALUES (3, 'Apple');