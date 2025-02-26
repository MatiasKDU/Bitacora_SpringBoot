package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Tipo_Usuario;
import com.proyecto.Bitacora.service.Tipo_UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo-usuario")
public class Tipo_UsuarioRest {

    @Autowired
    private Tipo_UsuarioService tipo_usuarioService;

    //Para obtener los usuarios
    @GetMapping("/listar-tipousuario")
    public ResponseEntity<List<Tipo_Usuario>> getAllTipo_Usuarios() {
        return ResponseEntity.ok(tipo_usuarioService.findAll());
    }

    //Para obtener un usuario por el id
    @GetMapping("/obtener-tipousuario/{id}")
    public ResponseEntity<Tipo_Usuario> getUsuario(@PathVariable Long id) {
        Optional<Tipo_Usuario> tipo_usuario = tipo_usuarioService.findById(id);
        return tipo_usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Para crear otro tipo de usuario
    @PostMapping("/crear-tipousuario")
    public ResponseEntity<Tipo_Usuario> crearTipoUsuario(@RequestBody Tipo_Usuario tipo_usuario) {
        Tipo_Usuario newTipo_Usuario = tipo_usuarioService.save(tipo_usuario);
        return ResponseEntity.ok(newTipo_Usuario);
    }

    //Para poder modificar algun tipo de usuario ya existente
    @PutMapping("/modificar-tiposuario/{id}")
    public ResponseEntity<Tipo_Usuario> updateTipo_Usuario(@PathVariable Long id, @RequestBody Tipo_Usuario tipo_usuario) {
        Optional<Tipo_Usuario> existingTipo_Usuario = tipo_usuarioService.findById(id);
        if (existingTipo_Usuario.isPresent()) {
            tipo_usuario.setId(id);
            Tipo_Usuario updatedTipo_Usuario = tipo_usuarioService.save(tipo_usuario);
            return ResponseEntity.ok(updatedTipo_Usuario);

        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/eliminar-tipousuario/¨{id}")
    public ResponseEntity<Void> deleteTipo_Usuario(@PathVariable Long id) {
        Optional<Tipo_Usuario> tipo_usuario = tipo_usuarioService.findById(id);
        if (tipo_usuario.isPresent()) {
            tipo_usuarioService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
