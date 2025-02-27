package com.proyecto.Bitacora.rest;


import com.proyecto.Bitacora.model.Computador;
import com.proyecto.Bitacora.service.ComputadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/computador")
public class ComputadorRest {

    @Autowired
    private ComputadorService computadorService;

    @GetMapping("/listar-computadores")
    public ResponseEntity<List<Computador>> getAllComputador() {
        return ResponseEntity.ok(computadorService.findAll());
    }

    @GetMapping("/obtener-computador/{id}")
    public ResponseEntity<Computador> getComputador(@PathVariable Long id) {
        Optional<Computador> computador = computadorService.findById(id);
        return computador.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-computador")
    public ResponseEntity<Computador> createComputador(@RequestBody Computador computador) {
        Computador newComputador = computadorService.save(computador);
        return ResponseEntity.ok(newComputador);
    }

    @PutMapping("/modificar-computador/{id}")
    public ResponseEntity<Computador> updateComputador(@PathVariable Long id, @RequestBody Computador computador) {
        Optional<Computador> existingComputador = computadorService.findById(id);
        if (existingComputador.isPresent()) {
            computador.setId(id);
            Computador updatedComputador = computadorService.save(computador);
            return ResponseEntity.ok(updatedComputador);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-computador/{id}")
    public ResponseEntity<Void> deleteComputador(@PathVariable Long id) {
        Optional<Computador> computador = computadorService.findById(id);
        if(computador.isPresent()){
            computadorService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
