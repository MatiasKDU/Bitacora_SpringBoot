package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Tipo_Servidor;
import com.proyecto.Bitacora.service.Tipo_ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/tipo_servidor")
public class Tipo_ServidorRest {

    @Autowired
    private Tipo_ServidorService tipo_servidorService;

    @GetMapping
    private ResponseEntity<List<Tipo_Servidor>> getAllTipo_Servidor(){
        return ResponseEntity.ok(tipo_servidorService.findAll());
    }
}
