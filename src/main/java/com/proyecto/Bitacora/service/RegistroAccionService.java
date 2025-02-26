package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.RegistroAccion;
import com.proyecto.Bitacora.repository.RegistroAccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAccionService {

    @Autowired
    private RegistroAccionRepository registroAccionRepository;

    public RegistroAccion save(RegistroAccion registroAccion) {
        return registroAccionRepository.save(registroAccion);
    }

    public List<RegistroAccion> findAll() {
        return registroAccionRepository.findAll();
    }

    public Optional<RegistroAccion> findById(Long id) {
        return registroAccionRepository.findById(id);
    }

    public void deleteById(Long id) {
        registroAccionRepository.deleteById(id);
    }

    public void delete(RegistroAccion registroAccion) {
        registroAccionRepository.delete(registroAccion);
    }
}
