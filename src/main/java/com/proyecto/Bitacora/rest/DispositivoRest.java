package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Computador;
import com.proyecto.Bitacora.model.Dispositivo;
import com.proyecto.Bitacora.service.DispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/dispositivo") //SOLO FALTA ESTE
public class DispositivoRest {

    @Autowired
    private DispositivoService dispositivoService;

    @GetMapping("/listar-dispositivos")
    public ResponseEntity<List<Dispositivo>> getAllDispositivos(){
        return ResponseEntity.ok(dispositivoService.findAll());
    }

    @GetMapping("/obtener-dispositivo/{id}")
    public ResponseEntity<Dispositivo> getDispositivo(@PathVariable Long id) {
        Optional<Dispositivo> dispositivo = dispositivoService.findById(id);
        return dispositivo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-dispositivo")
    public ResponseEntity<Dispositivo> createDispositivo(@RequestBody Dispositivo dispositivo) {
        Dispositivo newDispositivo = dispositivoService.save(dispositivo);
        return ResponseEntity.ok(newDispositivo);
    }

    @DeleteMapping("eliminar-dispositivo/{id}")
    public ResponseEntity<Void> deleteDispositivo(@PathVariable Long id) {
        Optional<Dispositivo> dispositivo = dispositivoService.findById(id);
        if(dispositivo.isPresent()){
            dispositivoService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //falta put - modificar
// sdadasdas

    //falta delete - eliminar

}
