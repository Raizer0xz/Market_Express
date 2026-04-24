package com.example.pedido.service;
import com.example.pedido.model.EstadoPedido;
import com.example.pedido.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PedidoService {
    @Autowired
    private PedidoRepository repository;

    public List<PedidoService> findAll() {
        return repository.findAll();
    }

    public Optional<PedidoService> findById(Long id) {
        return repository.findById(id);
    }

    public List<PedidoService> findByUsuario(Long usuarioId) {
        return repository.findByUsuarioIdOrderByCreatedAtDesc(usuarioId);
    }

    public List<PedidoService> findBySucursalYEstado(Long sucursalId, EstadoPedido estado) {
        return repository.findBySucursalIdAndEstado(sucursalId, estado);
    }

    public PedidoService save(PedidoService pedido) {
        return repository.save(pedido);
    }

    public Optional<PedidoService> actualizarEstado(Long id, EstadoPedido nuevoEstado) {
        return repository.findById(id).map(p -> {
            p.setEstado(nuevoEstado);
            return repository.save(p);
        });
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
