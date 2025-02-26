package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="sistema_operativo")
public class Sistema_Operativo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_sistemaoperativo;
    private String versionso;

    // Constructor sin parámetros
    public Sistema_Operativo() {
    }

    public Sistema_Operativo(String nombre_sistemaoperativo, String versionso) {
        this.nombre_sistemaoperativo = nombre_sistemaoperativo;
        this.versionso = versionso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_sistemaoperativo() {
        return nombre_sistemaoperativo;
    }

    public void setNombre_sistemaoperativo(String nombre_sistemaoperativo) {
        this.nombre_sistemaoperativo = nombre_sistemaoperativo;
    }

    public String getVersionso() {
        return versionso;
    }

    public void setVersionso(String versionso) {
        this.versionso = versionso;
    }
}
