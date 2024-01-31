DROP TABLE IF EXISTS `expenses`;

DROP TABLE IF EXISTS `categories`;

CREATE TABLE categories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE expenses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(100) NOT NULL,
    amount DOUBLE NOT NULL,
    category_id BIGINT NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(id)
);

INSERT INTO categories (name) VALUES ("Food");
INSERT INTO categories (name) VALUES ("Transport");
INSERT INTO categories (name) VALUES ("Health");
INSERT INTO categories (name) VALUES ("Education");
INSERT INTO categories (name) VALUES ("Entertainment");
INSERT INTO categories (name) VALUES ("Others");
