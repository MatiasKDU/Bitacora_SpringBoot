package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Mantencion_Activo;
import com.proyecto.Bitacora.repository.Mantencion_ActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Mantencion_ActivoService {

    @Autowired
    private Mantencion_ActivoRepository mantencionActivoRepository;

    public Mantencion_Activo save(Mantencion_Activo mantencionActivo) {
        return mantencionActivoRepository.save(mantencionActivo);
    }

    public List<Mantencion_Activo> findAll() {
        return mantencionActivoRepository.findAll();
    }

    public Optional<Mantencion_Activo> findById(Long id) {
        return mantencionActivoRepository.findById(id);
    }

    public void deleteById(Long id) {
        mantencionActivoRepository.deleteById(id);
    }

    public void delete(Mantencion_Activo mantencionActivo) {
        mantencionActivoRepository.delete(mantencionActivo);
    }
}
