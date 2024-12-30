USE `usermanagement`;

CREATE TABLE `users` (
  `id` INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
  `username` VARCHAR(100) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `age` INT NOT NULL,
  `city` VARCHAR(100) NOT NULL
);
INSERT INTO users (id, username, email, age, city)
VALUES
    (1, 'John', 'john@gmail.com', 22, 'washington'),
    (2, 'Mike', 'Mike@gmail.com', 30, 'california');
    select * from users;