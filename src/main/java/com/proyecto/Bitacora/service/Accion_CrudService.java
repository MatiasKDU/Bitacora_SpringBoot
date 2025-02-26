package com.proyecto.Bitacora.service;

import com.proyecto.Bitacora.model.Accion_Crud;
import com.proyecto.Bitacora.repository.Accion_CrudRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Accion_CrudService {

    @Autowired
    private Accion_CrudRespository accionCrudRespository;

    public Accion_Crud save(Accion_Crud accionCrud) {
        return accionCrudRespository.save(accionCrud);
    }

    public List<Accion_Crud> findAll() {
        return accionCrudRespository.findAll();
    }

    public Optional<Accion_Crud> findById(Long id) {
        return accionCrudRespository.findById(id);
    }

    public void deleteById(Long id) {
        accionCrudRespository.deleteById(id);
    }

    public void delete(Accion_Crud accionCrud) {
        accionCrudRespository.delete(accionCrud);
    }
}
