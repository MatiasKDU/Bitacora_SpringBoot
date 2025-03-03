package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.RegistroAccion;
import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.RegistroAccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/registroaccion")
public class RegistroAccionRest {

    @Autowired
    private RegistroAccionService registroAccionService;

    @GetMapping
    private ResponseEntity<List<RegistroAccion>> getAllRegistroAccion(){
        return ResponseEntity.ok(registroAccionService.findAll());
    }

    // Para obtener un Registro de Accion por ID
    @GetMapping("/obtener-accion/{id}")
    public ResponseEntity<RegistroAccion> getRegistroAccion(@PathVariable Long id) {
        Optional<RegistroAccion> registroAccion = registroAccionService.findById(id);
        return registroAccion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo registro de accion
    @PostMapping("/crear-accion")
    public ResponseEntity<RegistroAccion>createRegistroAccion(@RequestBody RegistroAccion registroAccion){
        RegistroAccion newRegistroAccion = registroAccionService.save(registroAccion);
        return ResponseEntity.ok(newRegistroAccion);

    }

    //Eliminar un registro de accion
    @DeleteMapping("/eliminar-accion/{id}")
    public ResponseEntity<Void> deleteResgistroAccion(@PathVariable Long id) {
        Optional<RegistroAccion> registroAccion = registroAccionService.findById(id);
        if (registroAccion.isPresent()) {
            registroAccionService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar un usuario existente
    @PutMapping("/modificar-accion/{id}")
    public ResponseEntity<RegistroAccion> updateRegistroAccion(@PathVariable Long id, @RequestBody RegistroAccion registroAccion) {
        Optional<RegistroAccion> existingRegistroAccion = registroAccionService.findById(id);
        if (existingRegistroAccion.isPresent()) {
            registroAccion.setId(id);  //
            RegistroAccion updatedRegistroAccion = registroAccionService.save(registroAccion);
            return ResponseEntity.ok(updatedRegistroAccion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
