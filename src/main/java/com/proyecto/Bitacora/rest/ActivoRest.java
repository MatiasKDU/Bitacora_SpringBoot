package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Activo;
import com.proyecto.Bitacora.service.ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/activo")

public class ActivoRest {

    @Autowired
    private ActivoService activoService;

    @GetMapping("/listar-activos")
    public ResponseEntity<List<Activo>> getAllActivos(){
        return ResponseEntity.ok(activoService.findAll());
    }

    @GetMapping("/obtener-activo/{id}")
    public ResponseEntity<Activo> getActivo(@PathVariable Long id) {
        Optional<Activo> activo = activoService.findById(id);
        return activo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-activo")
    public ResponseEntity<Activo> createActivo(@RequestBody Activo activo) {
        Activo newActivo = activoService.save(activo);
        return ResponseEntity.ok(newActivo);
    }

    @PutMapping("/modificar-activo/{id}")
    public ResponseEntity<Activo> updateActivo(@PathVariable Long id, @RequestBody Activo activo) {
        Optional<Activo> existingActivo = activoService.findById(id);
        if(existingActivo.isPresent()){
            activo.setId(id);
            Activo updatedActivo = activoService.save(activo);
            return ResponseEntity.ok(updatedActivo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-activo/{id}")
    public ResponseEntity<Void> deleteActivo(@PathVariable Long id) {
        Optional <Activo> activo = activoService.findById(id);
        if(activo.isPresent()){
            activoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
