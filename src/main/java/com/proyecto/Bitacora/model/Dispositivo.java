package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="dispositivo")
public class Dispositivo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_dispositivo;
    private String marca;
    private String modelo;
    private String serie;
    private String disponibilidad;
    private int almacenamiento;

    // Constructor sin parámetros
    public Dispositivo() {
    }

    public Dispositivo(String nombre_dispositivo, String marca, String serie, String modelo, int almacenamiento, String disponibilidad) {
        this.nombre_dispositivo = nombre_dispositivo;
        this.marca = marca;
        this.serie = serie;
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.disponibilidad = disponibilidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_dispositivo() {
        return nombre_dispositivo;
    }

    public void setNombre_dispositivo(String nombre_dispositivo) {
        this.nombre_dispositivo = nombre_dispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
}
