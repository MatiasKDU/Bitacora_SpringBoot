package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Tipo_Servidor;
import com.proyecto.Bitacora.repository.Tipo_ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_ServidorService {

    @Autowired
    private Tipo_ServidorRepository tipo_ServidorRepository;

    public Tipo_Servidor save(Tipo_Servidor tipoServidor) {
        return tipo_ServidorRepository.save(tipoServidor);
    }

    public List<Tipo_Servidor> findAll() {
        return tipo_ServidorRepository.findAll();
    }

    public Optional<Tipo_Servidor> findById(Long id) {
        return tipo_ServidorRepository.findById(id);
    }

    public void deleteById(Long id) {
        tipo_ServidorRepository.deleteById(id);
    }

    public void delete(Tipo_Servidor tipoServidor) {
        tipo_ServidorRepository.delete(tipoServidor);
    }
}
