package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Licencia;
import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.LicenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/licencia")

public class Licencia_Rest {

    @Autowired
    private LicenciaService licenciaService;


    //Obtener todas las licencias
    @GetMapping("/listar-licencias")
    private ResponseEntity<List<Licencia>> getAllLicencia(){

        return ResponseEntity.ok(licenciaService.findAll());

    }

    //obtener una licencia por id
    @GetMapping("/obtener-licencias/{id}")
    public ResponseEntity<Licencia> getLicencia(@PathVariable Long id) {
        Optional<Licencia> licencia = licenciaService.findById(id);
        return licencia.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear nueva licencia
    @PostMapping("/crear-licencia")
    public ResponseEntity<Licencia>createLicencia(@RequestBody Licencia licencia){
        Licencia newLicencia = licenciaService.save(licencia);
        return ResponseEntity.ok(newLicencia);

    }

    //Eliminar una licencia existente
    @DeleteMapping("/eliminar-licencia/{id}")
    public ResponseEntity<Void> deleteLicencia(@PathVariable Long id) {
        Optional<Licencia> licencia = licenciaService.findById(id);
        if (licencia.isPresent()) {
            licenciaService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar una licencia existente
    @PutMapping("/modificar-licencia/{id}")
    public ResponseEntity<Licencia> updateLicencia(@PathVariable Long id, @RequestBody Licencia licencia) {
        Optional<Licencia> existingLicencia = licenciaService.findById(id);
        if (existingLicencia.isPresent()) {
            licencia.setId(id);  //
            Licencia updatedLicencia = licenciaService.save(licencia);
            return ResponseEntity.ok(updatedLicencia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }








}
