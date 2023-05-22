DROP TABLE IF EXISTS Sample;
DROP TABLE IF EXISTS SampleAR;
DROP TABLE IF EXISTS SampleMTO;
DROP TABLE IF EXISTS SampleOTM;

CREATE TABLE Sample (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE SampleAR (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE SampleOTM (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);


CREATE TABLE SampleMTO (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    sampleOTM_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (sampleOTM_id) REFERENCES SampleOTM(id)
);


INSERT INTO Sample (id, name) VALUES (1, 'Pineapple');
INSERT INTO Sample (id, name) VALUES (2, 'Orange');
INSERT INTO Sample (id, name) VALUES (3, 'Lemon');

INSERT INTO SampleAR (id, name) VALUES (1, 'Apple');
INSERT INTO SampleAR (id, name) VALUES (2, 'Orange');
INSERT INTO SampleAR (id, name) VALUES (3, 'Lemon');

INSERT INTO SampleOTM (id, name) VALUES (1, 'PineapplePEN');
INSERT INTO SampleOTM (id, name) VALUES (2, 'Orange');
INSERT INTO SampleOTM (id, name) VALUES (3, 'Lemon');

INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (1, 'ApplePEN',3);
INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (2, 'Orange',2);
INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (3, 'Lemon',1);