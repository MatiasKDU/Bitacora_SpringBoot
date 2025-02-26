package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Asignacion;
import com.proyecto.Bitacora.repository.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsignacionService {

    @Autowired
    private AsignacionRepository asignacionRepository;
    //guardar un objeto
    public Asignacion save(Asignacion asignacion) {
        return asignacionRepository.save(asignacion);
    }
    //listar todos los objetos
    public List<Asignacion> findAll() {
        return asignacionRepository.findAll();
    }
    //BUSCAR POR
    public Optional<Asignacion> findById(Long id) {
        return asignacionRepository.findById(id);
    }
    //eliminar por
    public void deleteById(Long id) {
        asignacionRepository.deleteById(id);
    }
    //eliminar
    public void delete(Asignacion asignacion) {
        asignacionRepository.delete(asignacion);
    }
}
