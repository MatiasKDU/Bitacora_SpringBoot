package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Licencia;
import com.proyecto.Bitacora.repository.LicenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenciaService {

    @Autowired
    private LicenciaRepository licenciaRepository;

    public Licencia save(Licencia licencia) {
        return licenciaRepository.save(licencia);
    }

    public List<Licencia> findAll() {
        return licenciaRepository.findAll();
    }

    public Optional<Licencia> findById(Long id) {
        return licenciaRepository.findById(id);
    }

    public void deleteById(Long id) {
        licenciaRepository.deleteById(id);
    }

    public void delete(Licencia licencia) {
        licenciaRepository.delete(licencia);
    }
}
