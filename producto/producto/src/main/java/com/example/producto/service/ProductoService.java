package com.example.producto.service;


import com.example.producto.model.Producto;
import com.example.producto.repository.CategoriaRepository;
import com.example.producto.repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Slf4j
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<Producto> ListarProductos(){
        log.info("Listado de todos los productos activos");

        return productoRepository.findByActivoTrue();
    }

    public Producto obternerPorId(Long id){
        return productoRepository.findById(id).orElseThrow(()
                -> new RuntimeException("Producto no encontrado:" + id));



    }




}
