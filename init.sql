DROP TABLE IF EXISTS `categories`;

CREATE TABLE categories (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

DROP TABLE IF EXISTS `expenses`;

CREATE TABLE expenses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(100) NOT NULL,
    amount DOUBLE NOT NULL,
    category_id BIGINT NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(id)
);