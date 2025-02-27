package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String correo;
    private String correo_tbk;
    private String llave_ssh;
    @ManyToOne
    @JoinColumn (name = "id_tipousuario", nullable = true) //Permite que se puedan eliminar independientemente de la relacion
    private Tipo_Usuario tipoUsuario;

    // Constructor sin parámetros
    public Usuario() {
    }

    public Usuario(String nombre, String correo, String correo_tbk, String llave_ssh, Tipo_Usuario tipoUsuario) {
        this.nombre = nombre;
        this.correo = correo;
        this.correo_tbk = correo_tbk;
        this.llave_ssh = llave_ssh;
        this.tipoUsuario = tipoUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo_tbk() {
        return correo_tbk;
    }

    public void setCorreo_tbk(String correo_tbk) {
        this.correo_tbk = correo_tbk;
    }

    public String getLlave_ssh() {
        return llave_ssh;
    }

    public void setLlave_ssh(String llave_ssh) {
        this.llave_ssh = llave_ssh;
    }

    public Tipo_Usuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(Tipo_Usuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
