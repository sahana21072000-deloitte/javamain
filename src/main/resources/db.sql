-- Create User table
CREATE TABLE Users (
  user_id integer PRIMARY KEY auto increment,
  username character varying(255) NOT NULL,
  password character varying(255) NOT NULL,
  email character varying(255) NOT NULL,
  -- Add other user-related fields as needed
);

-- Create Product table
CREATE TABLE Product (
  product_id integer PRIMARY KEY auto increment,
  name character varying(255) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL,
  quantity integer NOT NULL
  -- Add other product-related fields as needed
);

-- Create Category table
CREATE TABLE Category (
  category_id integer PRIMARY KEY auto increment,
  name character varying(255) NOT NULL
);

-- Create Product_Category table
CREATE TABLE Product_Category (
  product_id integer NOT NULL,
  category_id integer NOT NULL,
  PRIMARY KEY (product_id, category_id),
  FOREIGN KEY (product_id) REFERENCES Product(product_id),
  FOREIGN KEY (category_id) REFERENCES Category(category_id)
);

