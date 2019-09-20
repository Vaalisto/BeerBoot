DROP TABLE IF EXISTS beers;

CREATE TABLE beers (
    id LONG AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

INSERT INTO beers (name) VALUES
('Karhu III'),('Koff Porter');
