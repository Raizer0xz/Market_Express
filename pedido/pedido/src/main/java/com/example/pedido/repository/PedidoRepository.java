package com.example.pedido.repository;

import com.example.pedido.model.EstadoPedido;
import com.example.pedido.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    List<Pedido> findAll();

    List<Pedido> findByUsuarioIdOrderByCreatedAtDesc(Long usuarioId);

    List<Pedido> findBySucursalIdAndEstado(Long sucursalId, EstadoPedido estado);
}
