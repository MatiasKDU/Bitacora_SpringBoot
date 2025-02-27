package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Caract_Hardware;
import com.proyecto.Bitacora.model.Caract_Software;
import com.proyecto.Bitacora.service.Caract_HardwareService;
import com.proyecto.Bitacora.service.Caract_SoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/caractsoftware")
public class Caract_SoftwareRest {

    @Autowired
    private Caract_SoftwareService caract_softwareService;

    @GetMapping("/listar-caractsoftware")
    public ResponseEntity<List<Caract_Software>> getAllCaract_Software(){
        return ResponseEntity.ok(caract_softwareService.findAll());

    }

    @GetMapping("/obtener-caractsoftware/{id}")
    public ResponseEntity<Caract_Software> getCaract_Software(@PathVariable Long id) {
        Optional<Caract_Software> caract_software = caract_softwareService.findById(id);
        return caract_software.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-caractsoftware")
    public ResponseEntity<Caract_Software> createCaract_Software(@RequestBody Caract_Software caract_software) {
        Caract_Software newCaract_Software = caract_softwareService.save(caract_software);
        return ResponseEntity.ok(newCaract_Software);
    }

    @PutMapping("/modificar-caractsoftware/{id}")
    public ResponseEntity<Caract_Software> updateCaract_Software(@PathVariable Long id, @RequestBody Caract_Software caract_software) {
        Optional<Caract_Software> existingCaract_Software = caract_softwareService.findById(id);
        if (existingCaract_Software.isPresent()) {
            caract_software.setId(id);
            Caract_Software updatedCaract_Software = caract_softwareService.save(caract_software);
            return ResponseEntity.ok(updatedCaract_Software);
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-caractsoftware/{id}")
    public ResponseEntity<Void> deleteCaract_Software(@PathVariable Long id) {
        Optional<Caract_Software> caract_software = caract_softwareService.findById(id);
        if (caract_software.isPresent()){
            caract_softwareService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }

    }


}
