CREATE TABLE products(
    id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    stock INT DEFAULT 0 CHECK (stock >= 0 AND stock <= 10000),
    price INT NOT NULL,
    manufacturer VARCHAR(50) NOT NULL,

    PRIMARY KEY (id)
);