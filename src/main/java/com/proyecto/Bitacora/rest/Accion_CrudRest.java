package com.proyecto.Bitacora.rest;


import com.proyecto.Bitacora.model.Accion_Crud;
import com.proyecto.Bitacora.service.Accion_CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/accioncrud") // de esta forma buscare por la api

public class Accion_CrudRest {

    @Autowired
    private Accion_CrudService accion_crudService;

    @GetMapping("/listar-accioncrud")
    public ResponseEntity<List<Accion_Crud>> getAllAccion_Crud() {
        return ResponseEntity.ok(accion_crudService.findAll());
    }

    @GetMapping("/obtener-accioncrud/{id}")
    public ResponseEntity<Accion_Crud> getAccion_Crud(@PathVariable Long id) {
        Optional<Accion_Crud> accion_crud = accion_crudService.findById(id);
        return accion_crud.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-accioncrud")
    public ResponseEntity<Accion_Crud> createAccion_Crud(@RequestBody Accion_Crud accion_crud) {
        Accion_Crud newAccion_Crud = accion_crudService.save(accion_crud);
        return ResponseEntity.ok(newAccion_Crud);
    }

    @PutMapping("/modificar-accioncrud/{id}")
    public ResponseEntity<Accion_Crud> updateAccion_Crud(@PathVariable Long id, @RequestBody Accion_Crud accion_crud) {
        Optional<Accion_Crud> existingAccion_Crud = accion_crudService.findById(id);
        if (existingAccion_Crud.isPresent()) {
            accion_crud.setId(id);
            Accion_Crud updatedAccion_Usuario = accion_crudService.save(accion_crud);
            return ResponseEntity.ok(updatedAccion_Usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-accioncrud/{id}")
    public ResponseEntity<Void> deleteAccion_Crud(@PathVariable Long id) {
        Optional<Accion_Crud> accion_crud = accion_crudService.findById(id);
        if (accion_crud.isPresent()) {
            accion_crudService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
