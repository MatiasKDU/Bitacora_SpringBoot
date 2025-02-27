package com.proyecto.Bitacora.rest;


import com.proyecto.Bitacora.model.Computador;
import com.proyecto.Bitacora.service.ComputadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/computador")
public class ComputadorRest {

    @Autowired
    private ComputadorService computadorService;

    @GetMapping
    private ResponseEntity<List<Computador>> getAllComputador(){
        return ResponseEntity.ok(computadorService.findAll());
    }
}
