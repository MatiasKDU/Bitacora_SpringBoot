package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="proceso_servidor")
public class Proceso_Servidor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_proceso;
    private int numero_procesos;
    private String identificacion;
    private String ruta;
    private String archivo;
    private String levantamiento;

    // Constructor sin parámetros
    public Proceso_Servidor() {
    }

    public Proceso_Servidor(String nombre_proceso, int numero_procesos, String identificacion, String ruta, String archivo, String levantamiento) {
        this.nombre_proceso = nombre_proceso;
        this.numero_procesos = numero_procesos;
        this.identificacion = identificacion;
        this.ruta = ruta;
        this.archivo = archivo;
        this.levantamiento = levantamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_proceso() {
        return nombre_proceso;
    }

    public void setNombre_proceso(String nombre_proceso) {
        this.nombre_proceso = nombre_proceso;
    }

    public int getNumero_procesos() {
        return numero_procesos;
    }

    public void setNumero_procesos(int numero_procesos) {
        this.numero_procesos = numero_procesos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getLevantamiento() {
        return levantamiento;
    }

    public void setLevantamiento(String levantamiento) {
        this.levantamiento = levantamiento;
    }
}
