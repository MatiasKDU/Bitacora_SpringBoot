package com.proyecto.Bitacora.repository;

import com.proyecto.Bitacora.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
