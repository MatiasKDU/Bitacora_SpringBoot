package com.proyecto.Bitacora.rest;


import com.proyecto.Bitacora.model.Accion_Crud;
import com.proyecto.Bitacora.service.Accion_CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/accioncrud/") // de esta forma buscare por la api

public class Accion_CrudRest {

    @Autowired
    private Accion_CrudService accion_crudService;

    @GetMapping
    private ResponseEntity<List<Accion_Crud>> getAllAccion_Crud(){
        return ResponseEntity.ok(accion_crudService.findAll());
    }
}
