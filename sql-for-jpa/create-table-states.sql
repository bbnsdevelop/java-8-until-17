-- create table states
CREATE TABLE states(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name_states VARCHAR(45) UNIQUE NOT NULL,
    initials VARCHAR(2) UNIQUE NOT NULL,
    region ENUM('Norte', 'Nordeste', 'Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
    populations DECIMAL(5,2) NOT NULL,
    PRIMARY KEY (id)
);