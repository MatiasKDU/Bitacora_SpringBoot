package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Caract_Hardware;
import com.proyecto.Bitacora.service.Caract_HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/caracthardware")

public class Caract_HardwareRest {

    @Autowired
    private Caract_HardwareService caract_hardwareService;

    @GetMapping("/listar-caracthardware")
    public ResponseEntity<List<Caract_Hardware>> getAllCaract_Hardware(){
        return ResponseEntity.ok(caract_hardwareService.findAll());
    }
    @GetMapping("/obtener-caracthardware/{id}")
    public ResponseEntity<Caract_Hardware> getCaract_Hardware(@PathVariable Long id) {
        Optional<Caract_Hardware> caract_hardware = caract_hardwareService.findById(id);
        return caract_hardware.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/crear-caracthardware")
    public ResponseEntity<Caract_Hardware> createCaract_Hardware(@RequestBody Caract_Hardware caract_hardware) {
        Caract_Hardware newCaract_Hardware = caract_hardwareService.save(caract_hardware);
        return ResponseEntity.ok(newCaract_Hardware);
    }

    @PutMapping("/modificar-caracthardware/{id}")
    public ResponseEntity<Caract_Hardware> updateCaract_Hardware(@PathVariable Long id, @RequestBody Caract_Hardware caract_hardware) {
        Optional<Caract_Hardware> existingCaract_Hardware = caract_hardwareService.findById(id);
        if (existingCaract_Hardware.isPresent()){
            caract_hardware.setId(id);
            Caract_Hardware updatedCaract_Hardware = caract_hardwareService.save(caract_hardware);
            return ResponseEntity.ok(updatedCaract_Hardware);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-caracthardware/{id}")
    public ResponseEntity<Void> deleteCaract_Hardware(@PathVariable Long id) {
        Optional<Caract_Hardware> caract_hardware = caract_hardwareService.findById(id);
        if (caract_hardware.isPresent()){
            caract_hardwareService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
