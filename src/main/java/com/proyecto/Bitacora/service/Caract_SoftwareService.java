package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Caract_Software;
import com.proyecto.Bitacora.repository.Caract_SoftwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Caract_SoftwareService {

    @Autowired
    private Caract_SoftwareRepository caractSoftwareRepository;

    public Caract_Software save(Caract_Software caractSoftware) {
        return caractSoftwareRepository.save(caractSoftware);
    }

    public List<Caract_Software> findAll() {
        return caractSoftwareRepository.findAll();
    }

    public Optional<Caract_Software> findById(Long id) {
        return caractSoftwareRepository.findById(id);
    }

    public void deleteById(Long id) {
        caractSoftwareRepository.deleteById(id);
    }

    public void delete(Caract_Software caractSoftware) {
        caractSoftwareRepository.delete(caractSoftware);
    }
}
