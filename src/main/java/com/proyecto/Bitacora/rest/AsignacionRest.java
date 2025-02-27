package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Asignacion;
import com.proyecto.Bitacora.service.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/asignacion")
public class AsignacionRest {

    @Autowired
    private AsignacionService asignacionService;

    @GetMapping("/listar-asignaciones")
    public ResponseEntity<List<Asignacion>> getAllAsignacion() {
        return  ResponseEntity.ok(asignacionService.findAll());
    }

    @GetMapping("/obtener-asignacion")
    public ResponseEntity<Asignacion> getAsignacion(@PathVariable Long id) {
        Optional<Asignacion> asignacion = asignacionService.findById(id);
        return asignacion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-asignacion")
    public ResponseEntity<Asignacion> createAsignacion(@RequestBody Asignacion asignacion) {
        Asignacion newAsignacion = asignacionService.save(asignacion);
        return ResponseEntity.ok(newAsignacion);
    }

    @PutMapping("/modificar-asignacion/{id}")
    public ResponseEntity<Asignacion> updateAsignacion(@PathVariable Long id, @RequestBody Asignacion asignacion) {
        Optional<Asignacion> existingAsignacion = asignacionService.findById(id);
        if (existingAsignacion.isPresent()){
            asignacion.setId(id);
            Asignacion updatedAsignacion = asignacionService.save(asignacion);
            return ResponseEntity.ok(updatedAsignacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-asignacion/{id}")
    public ResponseEntity<Void> deleteAsignacion(@PathVariable Long id) {
        Optional<Asignacion> asignacion = asignacionService.findById(id);
        if (asignacion.isPresent()){
            asignacionService.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }

    }


}
