package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name = "licencia")
public class Licencia {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo_licencia;
    private String descripcion_licencia;

    // Constructor sin parámetros
    public Licencia() {
    }

    public Licencia(String descripcion_licencia, String tipo_licencia) {
        this.descripcion_licencia = descripcion_licencia;
        this.tipo_licencia = tipo_licencia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_licencia() {
        return tipo_licencia;
    }

    public void setTipo_licencia(String tipo_licencia) {
        this.tipo_licencia = tipo_licencia;
    }

    public String getDescripcion_licencia() {
        return descripcion_licencia;
    }

    public void setDescripcion_licencia(String descripcion_licencia) {
        this.descripcion_licencia = descripcion_licencia;
    }
}
