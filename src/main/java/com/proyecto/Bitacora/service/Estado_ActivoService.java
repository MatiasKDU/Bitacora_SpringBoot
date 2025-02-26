package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Estado_Activo;
import com.proyecto.Bitacora.repository.Estado_ActivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Estado_ActivoService {

    @Autowired
    private Estado_ActivoRepository estadoActivoRepository;

    public Estado_Activo save(Estado_Activo estadoActivo) {
        return estadoActivoRepository.save(estadoActivo);
    }

    public List<Estado_Activo> findAll() {
        return estadoActivoRepository.findAll();
    }

    public Optional<Estado_Activo> findById(Long id) {
        return estadoActivoRepository.findById(id);
    }

    public void deleteById(Long id) {
        estadoActivoRepository.deleteById(id);
    }

    public void delete(Estado_Activo estadoActivo) {
        estadoActivoRepository.delete(estadoActivo);
    }
}
