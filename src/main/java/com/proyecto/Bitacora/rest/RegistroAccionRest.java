package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.RegistroAccion;
import com.proyecto.Bitacora.service.RegistroAccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/registroaccion")
public class RegistroAccionRest {

    @Autowired
    private RegistroAccionService registroAccionService;

    @GetMapping
    private ResponseEntity<List<RegistroAccion>> getAllRegistroAccion(){
        return ResponseEntity.ok(registroAccionService.findAll());
    }
}
