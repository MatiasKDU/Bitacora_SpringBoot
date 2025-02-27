package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/servidor")
public class ServidorRest {

    @Autowired
    private ServidorService servidorService;

    @GetMapping
    private ResponseEntity<List<Servidor>> getAllServidor(){
        return ResponseEntity.ok(servidorService.findAll());
    }
}
