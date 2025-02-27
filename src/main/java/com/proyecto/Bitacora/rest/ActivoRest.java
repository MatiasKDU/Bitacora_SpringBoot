package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Activo;
import com.proyecto.Bitacora.service.ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/activo")

public class ActivoRest {

    @Autowired
    private ActivoService activoService;

    @GetMapping
    private ResponseEntity<List<Activo>> getAllActivo(){
        return ResponseEntity.ok(activoService.findAll());
    }
}
