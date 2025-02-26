package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Caract_Hardware;
import com.proyecto.Bitacora.repository.Caract_HardwareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Caract_HardwareService {

    @Autowired
    private Caract_HardwareRepository caractHardwareRepository;

    public Caract_Hardware save(Caract_Hardware caractHardware) {
        return caractHardwareRepository.save(caractHardware);
    }

    public List<Caract_Hardware> findAll() {
        return caractHardwareRepository.findAll();
    }

    public Optional<Caract_Hardware> findById(Long id) {
        return caractHardwareRepository.findById(id);
    }

    public void deleteById(Long id) {
        caractHardwareRepository.deleteById(id);
    }

    public void delete(Caract_Hardware caractHardware) {
        caractHardwareRepository.delete(caractHardware);
    }
}
