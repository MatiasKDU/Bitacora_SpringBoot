package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Asignacion;
import com.proyecto.Bitacora.service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/asignacion")
public class AsignacionRest {

    @Autowired
    private AsignacionService asignacionService;

    @GetMapping
    private ResponseEntity<List<Asignacion>> getAllAsignacion(){
        return ResponseEntity.ok(asignacionService.findAll());
    }
}
