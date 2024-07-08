CREATE TABLE Employee (
    'id' INT PRIMARY KEY AUTO_INCREMENT,
    'name' VARCHAR(50),
    'salary' DECIMAL(10, 2),
    'position' VARCHAR(50)
);

SELECT * FROM Employee WHERE salary > 50000;