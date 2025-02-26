package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="estado_activo")
public class Estado_Activo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion_estadoactivo;

    // Constructor sin parámetros
    public Estado_Activo() {
    }

    public Estado_Activo(String descripcion_estadoactivo) {
        this.descripcion_estadoactivo = descripcion_estadoactivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion_estadoactivo() {
        return descripcion_estadoactivo;
    }

    public void setDescripcion_estadoactivo(String descripcion_estadoactivo) {
        this.descripcion_estadoactivo = descripcion_estadoactivo;
    }
}
