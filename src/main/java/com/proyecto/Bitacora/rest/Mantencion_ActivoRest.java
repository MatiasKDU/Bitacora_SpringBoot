package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Mantencion_Activo;
import com.proyecto.Bitacora.service.Mantencion_ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/mantencion_activo")
public class Mantencion_ActivoRest {

    @Autowired
    private Mantencion_ActivoService mantencion_activoService;

    @GetMapping
    private ResponseEntity<List<Mantencion_Activo>> getAllMantencion_Activo () {
        return ResponseEntity.ok(mantencion_activoService.findAll());
    }
}
