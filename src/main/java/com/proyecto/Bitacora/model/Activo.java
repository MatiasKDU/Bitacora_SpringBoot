package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "activo")
public class Activo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para que aumente el id de manera automatica
    private Long id;
    private String tipo_activo;
    private LocalDate fecha_entrega;
    private LocalDate fecha_compromiso;
    private LocalDate fecha_ingreso;
    @ManyToOne
    @JoinColumn (name = "id_computador")
    private Computador computador;
    @ManyToOne
    @JoinColumn (name = "id_servidor")
    private Servidor servidor;
    @ManyToOne
    @JoinColumn (name = "id_dispositivo")
    private Dispositivo dispositivo;
    @ManyToOne
    @JoinColumn (name = "id_estado_activo")
    private Estado_Activo estado_activo;
    @ManyToOne
    @JoinColumn (name= "id_licencia")
    private Licencia licencia;
    @ManyToOne
    @JoinColumn (name= "id_mantencion_activo")
    private Mantencion_Activo mantencion_activo;
    // Constructor sin parámetros
    public Activo() {
    }

    public Activo(String tipo_activo, LocalDate fecha_entrega, LocalDate fecha_compromiso, LocalDate fecha_ingreso, Computador computador, Servidor servidor, Dispositivo dispositivo, Estado_Activo estado_activo, Licencia licencia, Mantencion_Activo mantencion_activo) {
        this.tipo_activo = tipo_activo;
        this.fecha_entrega = fecha_entrega;
        this.fecha_compromiso = fecha_compromiso;
        this.fecha_ingreso = fecha_ingreso;
        this.computador = computador;
        this.servidor = servidor;
        this.dispositivo = dispositivo;
        this.estado_activo = estado_activo;
        this.licencia = licencia;
        this.mantencion_activo = mantencion_activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo_activo() {
        return tipo_activo;
    }

    public void setTipo_activo(String tipo_activo) {
        this.tipo_activo = tipo_activo;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public LocalDate getFecha_compromiso() {
        return fecha_compromiso;
    }

    public void setFecha_compromiso(LocalDate fecha_compromiso) {
        this.fecha_compromiso = fecha_compromiso;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Estado_Activo getEstado_activo() {
        return estado_activo;
    }

    public void setEstado_activo(Estado_Activo estado_activo) {
        this.estado_activo = estado_activo;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Mantencion_Activo getMantencion_activo() {
        return mantencion_activo;
    }

    public void setMantencion_activo(Mantencion_Activo mantencion_activo) {
        this.mantencion_activo = mantencion_activo;
    }
}
