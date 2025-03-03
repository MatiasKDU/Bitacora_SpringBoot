package com.proyecto.Bitacora.rest;

import com.proyecto.Bitacora.model.Servidor;
import com.proyecto.Bitacora.model.Usuario;
import com.proyecto.Bitacora.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario/")
public class UsuarioRest {

    @Autowired
    private UsuarioService usuarioService;

    // PAra listar a  todos los usuarios
    @GetMapping("/listar-usuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    // Para obtener un usuario por el id
    @GetMapping("/obtener-usuario/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.findById(id);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Para crear un nuevo usuario
    @PostMapping("/crear-usuario")
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario newUsuario = usuarioService.save(usuario);
        return ResponseEntity.ok(newUsuario);
    }

    // Para poder modificar un usuario existente
    @PutMapping("/modificar-usuario/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        Optional<Usuario> existingUsuario = usuarioService.findById(id);
        if (existingUsuario.isPresent()) {
            usuario.setId(id);  //
            Usuario updatedUsuario = usuarioService.save(usuario);
            return ResponseEntity.ok(updatedUsuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // PAra eliminar un usuario
    @DeleteMapping("/eliminar-usuario/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioService.findById(id);
        if (usuario.isPresent()) {
            usuarioService.deleteById(id);  //
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
