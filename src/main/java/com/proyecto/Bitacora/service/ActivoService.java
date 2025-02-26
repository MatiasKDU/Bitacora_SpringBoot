package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Activo;
import com.proyecto.Bitacora.repository.ActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivoService {

    @Autowired
    private ActivoRepository activoRepository;

    public Activo save(Activo activo) {
        return activoRepository.save(activo);
    }

    public List<Activo> findAll() {
        return activoRepository.findAll();
    }

    public Optional<Activo> findById(Long id) {
        return activoRepository.findById(id);
    }

    public void deleteById(Long id) {
        activoRepository.deleteById(id);
    }

    public void delete(Activo activo) {
        activoRepository.delete(activo);
    }
}
