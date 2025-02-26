package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Caract_Software;
import com.proyecto.Bitacora.service.Caract_HardwareService;
import com.proyecto.Bitacora.service.Caract_SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/caract_software/")
public class Caract_SoftwareRest {

    @Autowired
    private Caract_SoftwareService caract_softwareService;

    @GetMapping
    private ResponseEntity<List<Caract_Software>> getAllCaract_Software(){
        return ResponseEntity.ok(caract_softwareService.findAll());
    }
}
