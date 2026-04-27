package com.example.usuario.service;

import com.example.usuario.model.Usuario;
import com.example.usuario.respository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findAll(){
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id){
        return repository.findById(id);
    }

    public Optional<Usuario> findByEmail(String email){
        return repository.findByEmail(email);
    }

    public List<Usuario> findByRol(Usuario rol){
        return repository.findByRol(rol);
    }

    public boolean existsByEmail(String email){
        return repository.existsByEmail(email);
    }

}
