DROP DATABASE IF EXISTS exam;
CREATE DATABASE exam;

# user
DROP TABLE IF EXISTS exam.user;
CREATE TABLE exam.user(
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) UNIQUE,
    password VARCHAR(255),
#     date DATE,
#     date TIMESTAMP DEFAULT now(),
    role VARCHAR(50) DEFAULT 'user'
);


TRUNCATE TABLE exam.user;
INSERT INTO exam.user(username, password, role) VALUES ('admin','123', 'admin');
# INSERT INTO exam.user(username, password, date, role) VALUES ('admin','123', DATE (now()) ,'admin');


SELECT *
FROM exam.user;
