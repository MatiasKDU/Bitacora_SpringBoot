package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Mantencion_Activo;
import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.Mantencion_ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/mantencion_activo")
public class Mantencion_ActivoRest {

    @Autowired
    private Mantencion_ActivoService mantencion_activoService;

    @GetMapping
    private ResponseEntity<List<Mantencion_Activo>> getAllMantencion_Activo () {
        return ResponseEntity.ok(mantencion_activoService.findAll());
    }

    // Para obtener un servidor por ID
    @GetMapping("/obtener-mantencion/{id}")
    public ResponseEntity<Mantencion_Activo> getMantencionActivo(@PathVariable Long id) {
        Optional<Mantencion_Activo> mantencionActivo = mantencion_activoService.findById(id);
        return mantencionActivo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear una nueva mantencion de activo
    @PostMapping("/crear-mantencion-activo")
    public ResponseEntity<Mantencion_Activo>createMantencionActivo(@RequestBody Mantencion_Activo mantencionActivo){
        Mantencion_Activo newMantencionActivo = mantencion_activoService.save(mantencionActivo);
        return ResponseEntity.ok(newMantencionActivo);

    }

    //Eliminar una mantencion de activo
    @DeleteMapping("/eliminar-mantencion-activo/{id}")
    public ResponseEntity<Void> deleteMantencionActivo(@PathVariable Long id) {
        Optional<Mantencion_Activo> mantencionActivo = mantencion_activoService.findById(id);
        if (mantencionActivo.isPresent()) {
            mantencion_activoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar una mantencion de activo existente
    @PutMapping("/modificar-mantencion-activo/{id}")
    public ResponseEntity<Mantencion_Activo> updateMantencionActivo(@PathVariable Long id, @RequestBody Mantencion_Activo mantencionActivo) {
        Optional<Mantencion_Activo> existingMantencionActivo = mantencion_activoService.findById(id);
        if (existingMantencionActivo.isPresent()) {
            mantencionActivo.setId(id);  //
            Mantencion_Activo updatedMantencionActivo = mantencion_activoService.save(mantencionActivo);
            return ResponseEntity.ok(updatedMantencionActivo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }




}
