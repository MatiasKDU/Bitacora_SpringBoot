package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.repository.ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServidorService {

    @Autowired
    private ServidorRepository servidorRepository;

    public Servidor save(Servidor servidor) {
        return servidorRepository.save(servidor);
    }

    public List<Servidor> findAll() {
        return servidorRepository.findAll();
    }

    public Optional<Servidor> findById(Long id) {
        return servidorRepository.findById(id);
    }

    public void deleteById(Long id) {
        servidorRepository.deleteById(id);
    }

    public void delete(Servidor servidor) {
        servidorRepository.delete(servidor);
    }
}
