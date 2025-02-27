package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Sistema_Operativo;
import com.proyecto.Bitacora.service.Sistema_OperativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/sistema_operativo")
public class Sistema_OperativoRest {

    @Autowired
    private Sistema_OperativoService sistema_operativoService;

    @GetMapping
    private ResponseEntity<List<Sistema_Operativo>> getAllSistema_Operativo(){
        return ResponseEntity.ok(sistema_operativoService.findAll());
    }
}
