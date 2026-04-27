CREATE TABLE IF NOT EXISTS usuario (
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre        VARCHAR(100) NOT NULL,
    email         VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    telefono      VARCHAR(15),
    rol           VARCHAR(50)  NOT NULL,
    created_at    DATETIME     DEFAULT CURRENT_TIMESTAMP
);
