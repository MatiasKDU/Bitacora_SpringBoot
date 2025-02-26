package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Licencia;
import com.proyecto.Bitacora.service.LicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/licencia/")

public class Licencia_Rest {

    @Autowired
    private LicenciaService licenciaService;

    @GetMapping
    private ResponseEntity<List<Licencia>> getAllLicencia(){
        return ResponseEntity.ok(licenciaService.findAll());
    }

}
