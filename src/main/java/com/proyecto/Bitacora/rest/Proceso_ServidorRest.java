package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Proceso_Servidor;
import com.proyecto.Bitacora.service.Proceso_ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/proceso_servidor")  // Cambié "name" por "value"
public class Proceso_ServidorRest {

    @Autowired
    private Proceso_ServidorService proceso_servidorService;

    @GetMapping
    public ResponseEntity<List<Proceso_Servidor>> getAllProceso_Servidor() {
        return ResponseEntity.ok(proceso_servidorService.findAll());
    }
}
