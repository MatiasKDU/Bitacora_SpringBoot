package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name="mantencion_activo")
public class Mantencion_Activo {


    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalle_mantencion;
    private LocalDateTime fecha_mantencion;
    private String responsable;

    // Constructor sin parámetros
    public Mantencion_Activo() {
    }

    public Mantencion_Activo(String detalle_mantencion, LocalDateTime fecha_mantencion, String responsable) {
        this.detalle_mantencion = detalle_mantencion;
        this.fecha_mantencion = fecha_mantencion;
        this.responsable = responsable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetalle_mantencion() {
        return detalle_mantencion;
    }

    public void setDetalle_mantencion(String detalle_mantencion) {
        this.detalle_mantencion = detalle_mantencion;
    }

    public LocalDateTime getFecha_mantencion() {
        return fecha_mantencion;
    }

    public void setFecha_mantencion(LocalDateTime fecha_mantencion) {
        this.fecha_mantencion = fecha_mantencion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
