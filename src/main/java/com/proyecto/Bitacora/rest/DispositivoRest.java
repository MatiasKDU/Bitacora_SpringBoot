package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Dispositivo;
import com.proyecto.Bitacora.service.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/dispositivo/")
public class DispositivoRest {

    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping
    private ResponseEntity<List<Dispositivo>> getAllDispositivo(){
        return ResponseEntity.ok(dispositivoService.findAll());
    }
}
