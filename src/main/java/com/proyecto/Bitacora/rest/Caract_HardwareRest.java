package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Caract_Hardware;
import com.proyecto.Bitacora.service.Caract_HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/caract_hardware")

public class Caract_HardwareRest {

    @Autowired
    private Caract_HardwareService caract_hardwareService;

    @GetMapping
    private ResponseEntity<List<Caract_Hardware>> getAllCaract_Hardware(){
        return ResponseEntity.ok(caract_hardwareService.findAll());
    }
}
