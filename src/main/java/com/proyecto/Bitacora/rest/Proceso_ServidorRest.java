package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Proceso_Servidor;
import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.Proceso_ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proceso_servidor")  // Cambié "name" por "value"
public class Proceso_ServidorRest {

    @Autowired
    private Proceso_ServidorService proceso_servidorService;

    @GetMapping
    public ResponseEntity<List<Proceso_Servidor>> getAllProceso_Servidor() {
        return ResponseEntity.ok(proceso_servidorService.findAll());
    }

    // Para obtener un servidor por ID
    @GetMapping("/obtener-proceso-servidor/{id}")
    public ResponseEntity<Proceso_Servidor> getProcesoServidor(@PathVariable Long id) {
        Optional<Proceso_Servidor> procesoServidor = proceso_servidorService.findById(id);
        return procesoServidor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo Proceso de Servidor
    @PostMapping("/crear-proceso-servidor")
    public ResponseEntity<Proceso_Servidor>createProcesoServidor(@RequestBody Proceso_Servidor procesoServidor){
        Proceso_Servidor newProcesoServidor = proceso_servidorService.save(procesoServidor);
        return ResponseEntity.ok(newProcesoServidor);

    }

    //Eliminar un servidor
    @DeleteMapping("/eliminar-proceso-servidor/{id}")
    public ResponseEntity<Void> deleteProcesoServidor(@PathVariable Long id) {
        Optional<Proceso_Servidor> procesoServidor = proceso_servidorService.findById(id);
        if (procesoServidor.isPresent()) {
            proceso_servidorService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar un proceso de servidor existente
    @PutMapping("/modificar-proceso-servidor/{id}")
    public ResponseEntity<Proceso_Servidor> updateProcesoServidor(@PathVariable Long id, @RequestBody Proceso_Servidor procesoServidor) {
        Optional<Proceso_Servidor> existingProcesoServidor = proceso_servidorService.findById(id);
        if (existingProcesoServidor.isPresent()) {
            procesoServidor.setId(id);  //
            Proceso_Servidor updatedProcesoServidor = proceso_servidorService.save(procesoServidor);
            return ResponseEntity.ok(updatedProcesoServidor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
