package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Computador;
import com.proyecto.Bitacora.repository.ComputadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComputadorService {

    @Autowired
    private ComputadorRepository computadorRepository;

    public Computador save(Computador computador) {
        return computadorRepository.save(computador);
    }

    public List<Computador> findAll() {
        return computadorRepository.findAll();
    }

    public Optional<Computador> findById(Long id) {
        return computadorRepository.findById(id);
    }

    public void deleteById(Long id) {
        computadorRepository.deleteById(id);
    }

    public void delete(Computador computador) {
        computadorRepository.delete(computador);
    }
}
