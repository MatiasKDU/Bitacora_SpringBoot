package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Sistema_Operativo;
import com.proyecto.Bitacora.repository.Sistema_OperativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Sistema_OperativoService {

    @Autowired
    private Sistema_OperativoRepository sistemaOperativoRepository;

    public Sistema_Operativo save(Sistema_Operativo sistemaOperativo) {
        return sistemaOperativoRepository.save(sistemaOperativo);
    }

    public List<Sistema_Operativo> findAll() {
        return sistemaOperativoRepository.findAll();
    }

    public Optional<Sistema_Operativo> findById(Long id) {
        return sistemaOperativoRepository.findById(id);
    }

    public void deleteById(Long id) {
        sistemaOperativoRepository.deleteById(id);
    }

    public void delete(Sistema_Operativo sistemaOperativo) {
        sistemaOperativoRepository.delete(sistemaOperativo);
    }
}
