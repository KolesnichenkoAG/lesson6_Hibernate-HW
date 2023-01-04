DROP TABLE IF EXISTS clients CASCADE;
CREATE TABLE clients (id bigserial PRIMARY KEY, name VARCHAR(255));
INSERT INTO clients (name) VALUES ('Bob'), ('Jack'), ('John'), ('Alex');

DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products (id bigserial PRIMARY KEY, title VARCHAR(255), cost int);
INSERT INTO products (title, cost) VALUES ('Bread', 120), ('Milk', 500), ('Apples', 350), ('Sugar', 600);

DROP TABLE IF EXISTS products_clients CASCADE;
CREATE TABLE products_clients (product_id bigint, client_id bigint, FOREIGN KEY (product_id) REFERENCES products (id), FOREIGN KEY (client_id) REFERENCES clients (id));
INSERT INTO products_clients (product_id, client_id) VALUES
(1,1),
(1,2),
(1,3),
(2,2),
(2,3),
(2,4),
(3,1),
(3,3),
(4,1),
(4,2),
(4,3);

