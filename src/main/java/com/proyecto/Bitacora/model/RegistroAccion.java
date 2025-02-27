package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "registroaccion")
public class RegistroAccion {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String detalles;
    private LocalDateTime fecha_hora;

    @ManyToOne // relacion muchos a uno
    @JoinColumn (name = "id_accion_crud", nullable = true) // se unira a la tabla accion_crud
    private Accion_Crud accionCrud; // llave foranea - pk a Accion_Crud
    @ManyToOne
    @JoinColumn (name = "id_usuario", nullable = true)
    private Usuario usuario; // llave foranea - pk a Usuario
    @ManyToOne
    @JoinColumn (name = "id_activo", nullable = true)
    private Activo activo; // llave foranea - pk a Activo

    // Constructor sin parámetros
    public RegistroAccion() {
    }

    public RegistroAccion(String detalles, LocalDateTime fecha_hora, Accion_Crud accionCrud, Usuario usuario, Activo activo) {
        this.detalles = detalles;
        this.fecha_hora = fecha_hora;
        this.accionCrud = accionCrud;
        this.usuario = usuario;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public Accion_Crud getAccionCrud() {
        return accionCrud;
    }

    public void setAccionCrud(Accion_Crud accionCrud) {
        this.accionCrud = accionCrud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }
}
