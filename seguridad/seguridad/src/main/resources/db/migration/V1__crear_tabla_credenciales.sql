CREATE TABLE IF NOT EXISTS credenciales (
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id    BIGINT NOT NULL UNIQUE,
    email         VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    rol           VARCHAR(50)  NOT NULL,
    activo        TINYINT(1)   NOT NULL DEFAULT 1
);
