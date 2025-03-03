package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.model.Sistema_Operativo;
import com.proyecto.Bitacora.service.Sistema_OperativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/sistema_operativo")
public class Sistema_OperativoRest {

    @Autowired
    private Sistema_OperativoService sistema_operativoService;

    @GetMapping
    private ResponseEntity<List<Sistema_Operativo>> getAllSistema_Operativo(){
        return ResponseEntity.ok(sistema_operativoService.findAll());
    }

    // Para obtener un sistema operativo por ID
    @GetMapping("/obtener-sistema-operativo/{id}")
    public ResponseEntity<Sistema_Operativo> getSistemaOperativo(@PathVariable Long id) {
        Optional<Sistema_Operativo> sistemaOperativo = sistema_operativoService.findById(id);
        return sistemaOperativo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo sistema operativo
    @PostMapping("/crear-sistema-operativo")
    public ResponseEntity<Sistema_Operativo>createSistemaOperativo(@RequestBody Sistema_Operativo sistemaOperativo){
        Sistema_Operativo newSistemaOperativo = sistema_operativoService.save(sistemaOperativo);
        return ResponseEntity.ok(newSistemaOperativo);

    }

    //Eliminar un sistema Operativo
    @DeleteMapping("/eliminar-sistema-operativo/{id}")
    public ResponseEntity<Void> deleteSistemaOperativo(@PathVariable Long id) {
        Optional<Sistema_Operativo> sistemaOperativo = sistema_operativoService.findById(id);
        if (sistemaOperativo.isPresent()) {
            sistema_operativoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar un sistema operativo existente
    @PutMapping("/modificar-operativo/{id}")
    public ResponseEntity<Sistema_Operativo> updateSistemaOperativo(@PathVariable Long id, @RequestBody Sistema_Operativo sistemaOperativo) {
        Optional<Sistema_Operativo> existingSistemaOperativo = sistema_operativoService.findById(id);
        if (existingSistemaOperativo.isPresent()) {
            sistemaOperativo.setId(id);  //
            Sistema_Operativo updatedSistemaOperativo = sistema_operativoService.save(sistemaOperativo);
            return ResponseEntity.ok(updatedSistemaOperativo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
