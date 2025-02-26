package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name = "caract_hardware")



public class Caract_Hardware {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String bateria;
    private String ram;
    private int ram_hz;
    private String grafica;
    private String tipo_procesador;
    private String modelo_procesador;
    private String tipo_almacenamiento;
    private int espacio_almacenamiento;

    // Constructor sin parámetros
    public Caract_Hardware() {
    }

    public Caract_Hardware(String bateria, String ram, int ram_hz, String grafica, String tipo_procesador, String modelo_procesador, String tipo_almacenamiento, int espacio_almacenamiento) {
        this.bateria = bateria;
        this.ram = ram;
        this.ram_hz = ram_hz;
        this.grafica = grafica;
        this.tipo_procesador = tipo_procesador;
        this.modelo_procesador = modelo_procesador;
        this.tipo_almacenamiento = tipo_almacenamiento;
        this.espacio_almacenamiento = espacio_almacenamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getRam_hz() {
        return ram_hz;
    }

    public void setRam_hz(int ram_hz) {
        this.ram_hz = ram_hz;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getTipo_procesador() {
        return tipo_procesador;
    }

    public void setTipo_procesador(String tipo_procesador) {
        this.tipo_procesador = tipo_procesador;
    }

    public String getModelo_procesador() {
        return modelo_procesador;
    }

    public void setModelo_procesador(String modelo_procesador) {
        this.modelo_procesador = modelo_procesador;
    }

    public String getTipo_almacenamiento() {
        return tipo_almacenamiento;
    }

    public void setTipo_almacenamiento(String tipo_almacenamiento) {
        this.tipo_almacenamiento = tipo_almacenamiento;
    }

    public int getEspacio_almacenamiento() {
        return espacio_almacenamiento;
    }

    public void setEspacio_almacenamiento(int espacio_almacenamiento) {
        this.espacio_almacenamiento = espacio_almacenamiento;
    }
}
