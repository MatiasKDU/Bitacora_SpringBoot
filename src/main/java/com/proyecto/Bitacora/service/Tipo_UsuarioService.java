package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Tipo_Usuario;
import com.proyecto.Bitacora.repository.Tipo_UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_UsuarioService {

    @Autowired
    private Tipo_UsuarioRepository tipoUsuarioRepository;

    public Tipo_Usuario save(Tipo_Usuario tipoUsuario) {
        return tipoUsuarioRepository.save(tipoUsuario);
    }

    public List<Tipo_Usuario> findAll() {
        return tipoUsuarioRepository.findAll();
    }

    public Optional<Tipo_Usuario> findById(Long id) {
        return tipoUsuarioRepository.findById(id);
    }

    public void deleteById(Long id) {
        tipoUsuarioRepository.deleteById(id);
    }

    public void delete(Tipo_Usuario tipoUsuario) {
        tipoUsuarioRepository.delete(tipoUsuario);
    }
}
