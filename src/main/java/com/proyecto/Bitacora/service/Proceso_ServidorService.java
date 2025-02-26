package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Proceso_Servidor;
import com.proyecto.Bitacora.repository.Proceso_ServidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Proceso_ServidorService {

    @Autowired
    private Proceso_ServidorRepository procesoServidorRepository;

    public Proceso_Servidor save(Proceso_Servidor procesoServidor) {
        return procesoServidorRepository.save(procesoServidor);
    }

    public List<Proceso_Servidor> findAll() {
        return procesoServidorRepository.findAll();
    }

    public Optional<Proceso_Servidor> findById(Long id) {
        return procesoServidorRepository.findById(id);
    }

    public void deleteById(Long id) {
        procesoServidorRepository.deleteById(id);
    }

    public void delete(Proceso_Servidor procesoServidor) {
        procesoServidorRepository.delete(procesoServidor);
    }
}
