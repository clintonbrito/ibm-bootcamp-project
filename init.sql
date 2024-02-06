-- -- USE db_system;

-- -- Drop tables if they exist
-- DROP TABLE IF EXISTS db_system.expenses;
-- DROP TABLE IF EXISTS db_system.categories;

-- -- Create categories table
-- -- CREATE TABLE categories (
-- --     id BIGINT PRIMARY KEY AUTO_INCREMENT,
-- --     name VARCHAR(100) NOT NULL
-- -- );

-- -- -- Create expenses table with foreign key reference
-- -- CREATE TABLE expenses (
-- --     id BIGINT PRIMARY KEY AUTO_INCREMENT,
-- --     description VARCHAR(100) NOT NULL,
-- --     amount DECIMAL(10, 2) NOT NULL,
-- --     date DATE NOT NULL,
-- --     category_id BIGINT,
-- --     FOREIGN KEY (category_id) REFERENCES categories(id)
-- -- );

-- -- Insert predefined categories
-- INSERT INTO db_system.categories (name) VALUES
--     ('Food'),
--     ('Transport'),
--     ('Health'),
--     ('Education'),
--     ('Entertainment'),
--     ('Others');

-- -- Insert sample expenses with category references
-- INSERT INTO db_system.expenses (description, amount, date, category_id) VALUES
--     ('Almoço no iFood', 30.00, '2023-01-01', 1),
--     ('Uber', 12.50, '2023-01-02', 2),
--     ('Compras na farmácia', 52.35, '2023-01-03', 3),
--     ('Livros na Amazon', 44.75, '2023-01-04', 4),
--     ('Ingresso do cinema', 15.20, '2023-01-05', 5),
--     ('Crédito no celular', 30.00, '2023-01-06', 6);