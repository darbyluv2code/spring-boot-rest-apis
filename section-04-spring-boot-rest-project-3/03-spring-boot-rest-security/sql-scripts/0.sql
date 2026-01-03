-- Drop table if exists.
DROP TABLE IF EXISTS employee;


-- Create employee table
CREATE TABLE employee (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(45),
  last_name VARCHAR(45),
  email VARCHAR(45)
);

-- Inserting data

INSERT INTO employee (first_name, last_name, email)
VALUES
('Leslie', 'Andrews', 'leslie@luv2code.com'),
('Emma', 'Baumgarten', 'emma@luv2code.com'),
('Yuri', 'Petrov', 'yuri@luv2code.com'),
('Juan', 'Vega', 'juan@luv2code.com');
