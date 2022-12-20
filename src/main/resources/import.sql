DROP TABLE clients IF EXISTS;
CREATE TABLE IF NOT EXISTS clients (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO clients (name) VALUES ('Bob'), ('Jack'), ('John'), ('Alex');

DROP TABLE products IF EXISTS;
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('Bread', 120), ('Milk', 500), ('Apples', 350), ('Sugar', 600);

