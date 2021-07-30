CREATE TABLE Kinobillett
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    ticket    VARCHAR(255)           NOT NULL,
    number    VARCHAR(255)           NOT NULL,
    firstname VARCHAR(255)           NOT NULL,
    surname   VARCHAR(255)           NOT NULL,
    email     VARCHAR(255)           NOT NULL,
    phoneno   VARCHAR(255)           NOT NULL,
    PRIMARY KEY (id)
);