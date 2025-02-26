package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="tipo_servidor")
public class Tipo_Servidor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion_tiposervidor;

    // Constructor sin parámetros
    public Tipo_Servidor() {
    }

    public Tipo_Servidor(String descripcion_tiposervidor) {
        this.descripcion_tiposervidor = descripcion_tiposervidor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion_tiposervidor() {
        return descripcion_tiposervidor;
    }

    public void setDescripcion_tiposervidor(String descripcion_tiposervidor) {
        this.descripcion_tiposervidor = descripcion_tiposervidor;
    }
}
