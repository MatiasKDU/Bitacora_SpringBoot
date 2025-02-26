package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="tipo_usuario")
public class Tipo_Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion_tipousuario;

    // Constructor sin parámetros
    public Tipo_Usuario() {
    }

    public Tipo_Usuario(String descripcion_tipousuario) {
        this.descripcion_tipousuario = descripcion_tipousuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion_tipousuario() {
        return descripcion_tipousuario;
    }

    public void setDescripcion_tipousuario(String descripcion_tipousuario) {
        this.descripcion_tipousuario = descripcion_tipousuario;
    }
}
