CREATE DATABASE StoredSoul;

USE StoredSoul;

CREATE TABLE User(
    user_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    email_id VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL
);

CREATE TABLE User(
    user_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    email_id VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(30) NOT NULL
);

CREATE TABLE Product_Type(
	product_type_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    target_gender ENUM('F', 'M', 'A') DEFAULT 'A'					-- definitely not a reference..
);

CREATE TABLE Product(
	product_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL UNIQUE,
    product_type_id INT,
    foreign key(product_type_id) references Product_type(product_type_id)
);

CREATE TABLE Product_Variant(
	product_variant_id INT PRIMARY KEY NOT NULL UNIQUE AUTO_INCREMENT,
    product_id INT NOT NULL,
    colour VARCHAR(15) NOT NULL,
    price INT NOT NULL,
    quantity INT DEFAULT 0,
    foreign key(product_id) references Product(product_id)
);

