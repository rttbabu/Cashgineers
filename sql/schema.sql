-- Users table to store user credentials and basic information
CREATE TABLE users (
    userId INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Banking details table to store user's bank information
CREATE TABLE banking_details (
    bankId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    sortCode VARCHAR(6) NOT NULL,
    accountNumber VARCHAR(10) NOT NULL UNIQUE,
    balance DECIMAL(15, 2) DEFAULT 0.00,
    FOREIGN KEY (userId) REFERENCES users(userId)
);

-- Transactions table to store money in and out
CREATE TABLE transactions (
    transactionId INT AUTO_INCREMENT PRIMARY KEY,
    userId INT NOT NULL,
    bankId INT NOT NULL,
    amount DECIMAL(10, 2) NOT NULL,
    transactionType ENUM('DEPOSIT', 'WITHDRAWAL') NOT NULL,
    transactionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (userId) REFERENCES users(userId),
    FOREIGN KEY (bankId) REFERENCES banking_details(bankId)
);