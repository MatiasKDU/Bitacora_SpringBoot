package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.model.Tipo_Servidor;
import com.proyecto.Bitacora.service.Tipo_ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/tipo_servidor")
public class Tipo_ServidorRest {

    @Autowired
    private Tipo_ServidorService tipo_servidorService;

    @GetMapping
    private ResponseEntity<List<Tipo_Servidor>> getAllTipo_Servidor(){
        return ResponseEntity.ok(tipo_servidorService.findAll());
    }

    // Para obtener un Tipo de servidor por ID
    @GetMapping("/obtener-tipo-servidor/{id}")
    public ResponseEntity<Tipo_Servidor> getTipoServidor(@PathVariable Long id) {
        Optional<Tipo_Servidor> tipoServidor = tipo_servidorService.findById(id);
        return tipoServidor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo tipo Servidor
    @PostMapping("/crear-tipo-servidor")
    public ResponseEntity<Tipo_Servidor>createTipoServidor(@RequestBody Tipo_Servidor tipoServidor){
        Tipo_Servidor newTipoServidor = tipo_servidorService.save(tipoServidor);
        return ResponseEntity.ok(newTipoServidor);

    }

    //Eliminar un  Tipo de servidor
    @DeleteMapping("/eliminar-tipo-servidor/{id}")
    public ResponseEntity<Void> deleteTipoServidor(@PathVariable Long id) {
        Optional<Tipo_Servidor> tipoServidor = tipo_servidorService.findById(id);
        if (tipoServidor.isPresent()) {
            tipo_servidorService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar un tipo de servidor existente
    @PutMapping("/modificar-tipo-servidor/{id}")
    public ResponseEntity<Tipo_Servidor> updateTiposervidor(@PathVariable Long id, @RequestBody Tipo_Servidor tipoServidor) {
        Optional<Tipo_Servidor> existingTipoServidor = tipo_servidorService.findById(id);
        if (existingTipoServidor.isPresent()) {
            tipoServidor.setId(id);  //
            Tipo_Servidor updatedTipoServidor = tipo_servidorService.save(tipoServidor);
            return ResponseEntity.ok(updatedTipoServidor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }






}
