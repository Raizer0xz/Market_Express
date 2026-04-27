CREATE TABLE IF NOT EXISTS pedido (
    id                 BIGINT AUTO_INCREMENT PRIMARY KEY,
    usuario_id         BIGINT         NOT NULL,
    sucursal_id        BIGINT         NOT NULL,
    carrito_id         BIGINT,
    estado             VARCHAR(20)    NOT NULL,
    total              DECIMAL(10,2)  NOT NULL,
    direccion_entrega  VARCHAR(255)   NOT NULL,
    created_at         DATETIME       DEFAULT CURRENT_TIMESTAMP,
    updated_at         DATETIME       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
