package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.model.Usuario;
import com.proyecto.Bitacora.service.ServidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/servidor")
public class ServidorRest {

    @Autowired
    private ServidorService servidorService;


    //Listar todos los servidores
    @GetMapping("/listar-servidor")
    private ResponseEntity<List<Servidor>> getAllServidor(){
        return ResponseEntity.ok(servidorService.findAll());
    }
    // Para obtener un usuario por ID
    @GetMapping("/obtener-usuario/{id}")
    public ResponseEntity<Servidor> getServidor(@PathVariable Long id) {
        Optional<Servidor> servidor = servidorService.findById(id);
        return servidor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo Servidor
    @PostMapping("/crear-servidor")
    public ResponseEntity<Servidor>createServidor(@RequestBody Servidor servidor){
        Servidor newServidor = servidorService.save(servidor);
        return ResponseEntity.ok(newServidor);

    }

    //Eliminar un servidor
    @DeleteMapping("/eliminar-servidor/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        Optional<Servidor> servidor = servidorService.findById(id);
        if (servidor.isPresent()) {
            servidorService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
        // Para poder modificar un usuario existente
        @PutMapping("/modificar-servidor/{id}")
        public ResponseEntity<Servidor> updateUsuario(@PathVariable Long id, @RequestBody Servidor servidor) {
            Optional<Servidor> existingServidor = servidorService.findById(id);
            if (existingServidor.isPresent()) {
                servidor.setId(id);  //
                Servidor updatedServidor = servidorService.save(servidor);
                return ResponseEntity.ok(updatedServidor);
            } else {
                return ResponseEntity.notFound().build();
            }
        }



//todook


    }














