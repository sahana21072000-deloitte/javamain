-- Create User table
CREATE TABLE User (
  user_id INT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  -- Add other user-related fields as needed
);

-- Create Product table
CREATE TABLE Product (
  product_id INT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL,
  quantity INT NOT NULL,
  -- Add other product-related fields as needed
);

-- Create Category table
CREATE TABLE Category (
  category_id INT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

-- Create Product_Category table
CREATE TABLE Product_Category (
  product_id INT NOT NULL,
  category_id INT NOT NULL,
  PRIMARY KEY (product_id, category_id),
  FOREIGN KEY (product_id) REFERENCES Product(product_id),
  FOREIGN KEY (category_id) REFERENCES Category(category_id)
);
