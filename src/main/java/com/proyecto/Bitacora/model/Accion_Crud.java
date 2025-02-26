package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name = "accion_crud")
public class Accion_Crud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Para que aumente el id de manera automatica.
    private Long id;
    private String tipo_accion;
    // Constructor sin parámetros
    public Accion_Crud() {
    }

    public Accion_Crud(String tipo_accion) {
        this.tipo_accion = tipo_accion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_accion() {
        return tipo_accion;
    }

    public void setTipo_accion(String tipo_accion) {
        this.tipo_accion = tipo_accion;
    }
}
