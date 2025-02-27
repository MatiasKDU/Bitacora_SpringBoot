package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Activo;
import com.proyecto.Bitacora.model.Estado_Activo;
import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.service.Estado_ActivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/api/estado_activo")
public class Estado_ActivoRest {

    @Autowired
    private Estado_ActivoService estado_activoService;


    //Listar todos los tipos de estados que tienen los activos
    @GetMapping ("obtener-estado-activo")
    private ResponseEntity<List<Estado_Activo>> getAllEstado_Activo(){
        return ResponseEntity.ok(estado_activoService.findAll());
    }

    //Listar los tipos de estados que tienen los activos por id
    @GetMapping("/obtener-estado-activo/by-id/{id}")
    private ResponseEntity<Estado_Activo> getEstadoActivoById(@PathVariable Long id){
        Optional<Estado_Activo> estadoActivo = estado_activoService.findById(id);
        return estadoActivo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Crear un nuevo tipo de activo

    @DeleteMapping("/crear-estado-activo")
    public ResponseEntity<Estado_Activo>createEstadoActivo(@RequestBody Estado_Activo estadoActivo){
        Estado_Activo newEstadoActivo = estado_activoService.save(estadoActivo);
        return ResponseEntity.ok(newEstadoActivo);

    }

    @DeleteMapping("/eliminar-estado-activo/{id}")
    public ResponseEntity<Void> deleteEstadoActivo (@PathVariable Long id){
        Optional<Estado_Activo> estadoActivo = estado_activoService.findById(id);
        if(estadoActivo.isPresent()){
            estado_activoService.deleteById(id);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    // Para poder modificar un usuario existente
    @PutMapping("/modificar-estado-activo/{id}")
    public ResponseEntity<Estado_Activo> updateUsuario(@PathVariable Long id, @RequestBody Estado_Activo estadoActivo) {
        Optional<Estado_Activo> existingEstadoActivo = estado_activoService.findById(id);
        if (existingEstadoActivo.isPresent()) {
            estadoActivo.setId(id);  //
            Estado_Activo updatedEstadoActivo = estado_activoService.save(estadoActivo);
            return ResponseEntity.ok(updatedEstadoActivo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }





}
