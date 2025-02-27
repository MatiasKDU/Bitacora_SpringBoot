package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name = "asignacion")
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "id_usuario", nullable = true)
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "id_activo", nullable = true)
    private Activo activo;

    // Constructor sin parámetros
    public Asignacion() {
    }

    public Asignacion(Usuario usuario, Activo activo) {
        this.usuario = usuario;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
