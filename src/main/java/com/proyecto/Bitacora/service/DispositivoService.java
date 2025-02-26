package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Dispositivo;
import com.proyecto.Bitacora.repository.DispositivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DispositivoService {

    @Autowired
    private DispositivoRepository dispositivoRepository;

    public Dispositivo save(Dispositivo dispositivo) {
        return dispositivoRepository.save(dispositivo);
    }

    public List<Dispositivo> findAll() {
        return dispositivoRepository.findAll();
    }

    public Optional<Dispositivo> findById(Long id) {
        return dispositivoRepository.findById(id);
    }

    public void deleteById(Long id) {
        dispositivoRepository.deleteById(id);
    }

    public void delete(Dispositivo dispositivo) {
        dispositivoRepository.delete(dispositivo);
    }
}
