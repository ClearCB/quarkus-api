DROP TABLE IF EXISTS Sample;
DROP TABLE IF EXISTS SampleAR;
DROP TABLE IF EXISTS SampleMTO;
DROP TABLE IF EXISTS SampleOTM;
DROP TABLE IF EXISTS SampleOne;
DROP TABLE IF EXISTS SampleTwo;
DROP TABLE IF EXISTS SampleOTO;

CREATE TABLE Sample (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE SampleAR (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE SampleOTM (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE SampleMTO (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    sampleOTM_id INT NOT NULL,
    FOREIGN KEY (sampleOTM_id) REFERENCES SampleOTM(id)
);


CREATE TABLE SampleOne (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE SampleTwo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE SampleOTO (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sample_one_id INT NOT NULL,
    sample_two_id INT NOT NULL,
    FOREIGN KEY (sample_one_id) REFERENCES SampleOne(id),
    FOREIGN KEY (sample_two_id) REFERENCES SampleTwo(id)
);

INSERT INTO Sample (id, name) VALUES (1, 'Pineapple');
INSERT INTO Sample (id, name) VALUES (2, 'Pineapple');
INSERT INTO Sample (id, name) VALUES (3, 'Pineapple');

INSERT INTO SampleAR (id, name) VALUES (1, 'Apple');
INSERT INTO SampleAR (id, name) VALUES (2, 'Apple');
INSERT INTO SampleAR (id, name) VALUES (3, 'Apple');

INSERT INTO SampleOTM (id, name) VALUES (1, 'PineapplePEN');
INSERT INTO SampleOTM (id, name) VALUES (2, 'PineapplePEN');
INSERT INTO SampleOTM (id, name) VALUES (3, 'PineapplePEN');

INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (1, 'ApplePEN', 3);
INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (2, 'ApplePEN', 2);
INSERT INTO SampleMTO (id, name, sampleOTM_id) VALUES (3, 'ApplePEN', 1);

INSERT INTO SampleTwo (id, name) VALUES (1, 'sampletwo1');
INSERT INTO SampleTwo (id, name) VALUES (2, 'sampletwo2');
INSERT INTO SampleTwo (id, name) VALUES (3, 'sampletwo3');

INSERT INTO SampleOne (id, name) VALUES (1, 'sampleone1');
INSERT INTO SampleOne (id, name) VALUES (2, 'sampleone2');
INSERT INTO SampleOne (id, name) VALUES (3, 'sampleone3');

INSERT INTO SampleOTO (id, sample_one_id, sample_two_id) VALUES (1, 1, 1);
INSERT INTO SampleOTO (id, sample_one_id, sample_two_id) VALUES (2, 2, 2);
INSERT INTO SampleOTO (id, sample_one_id, sample_two_id) VALUES (3, 3, 3);
