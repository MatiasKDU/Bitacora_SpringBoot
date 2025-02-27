package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Estado_Activo;
import com.proyecto.Bitacora.service.Estado_ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/estado_activo")
public class Estado_ActivoRest {

    @Autowired
    private Estado_ActivoService estado_activoService;

    @GetMapping
    private ResponseEntity<List<Estado_Activo>> getAllEstado_Activo(){
        return ResponseEntity.ok(estado_activoService.findAll());
    }
}
