package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

import java.awt.*;

@Entity
@Table (name="servidor")
public class Servidor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_servidor;
    private String id_instancia;
    private String estado_instancia;
    private String ip;
    private String nombre_cuenta;
    private Boolean ssh;
    private String estado_usuario;
    private Boolean llave;
    private String estado_llave;
    private String servicios_aplicaciones;
    private TextArea Observacion;
    @ManyToOne
    @JoinColumn ( name= "id_tipo_sevidor")
    private Tipo_Servidor tipo_servidor;
    @ManyToOne
    @JoinColumn (name="id_proceso_servidor")
    private Proceso_Servidor proceso_servidor;

    public Servidor(String nombre_servidor, String id_instancia, String estado_instancia, String nombre_cuenta, String ip, Boolean ssh, String estado_usuario, String estado_llave, Boolean llave, String servicios_aplicaciones, TextArea observacion, Tipo_Servidor tipo_servidor, Proceso_Servidor proceso_servidor) {
        this.nombre_servidor = nombre_servidor;
        this.id_instancia = id_instancia;
        this.estado_instancia = estado_instancia;
        this.nombre_cuenta = nombre_cuenta;
        this.ip = ip;
        this.ssh = ssh;
        this.estado_usuario = estado_usuario;
        this.estado_llave = estado_llave;
        this.llave = llave;
        this.servicios_aplicaciones = servicios_aplicaciones;
        Observacion = observacion;
        this.tipo_servidor = tipo_servidor;
        this.proceso_servidor = proceso_servidor;
    }

    // Constructor sin parámetros
    public Servidor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_servidor() {
        return nombre_servidor;
    }

    public void setNombre_servidor(String nombre_servidor) {
        this.nombre_servidor = nombre_servidor;
    }

    public String getId_instancia() {
        return id_instancia;
    }

    public void setId_instancia(String id_instancia) {
        this.id_instancia = id_instancia;
    }

    public String getEstado_instancia() {
        return estado_instancia;
    }

    public void setEstado_instancia(String estado_instancia) {
        this.estado_instancia = estado_instancia;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNombre_cuenta() {
        return nombre_cuenta;
    }

    public void setNombre_cuenta(String nombre_cuenta) {
        this.nombre_cuenta = nombre_cuenta;
    }

    public Boolean getSsh() {
        return ssh;
    }

    public void setSsh(Boolean ssh) {
        this.ssh = ssh;
    }

    public String getEstado_usuario() {
        return estado_usuario;
    }

    public void setEstado_usuario(String estado_usuario) {
        this.estado_usuario = estado_usuario;
    }

    public Boolean getLlave() {
        return llave;
    }

    public void setLlave(Boolean llave) {
        this.llave = llave;
    }

    public String getEstado_llave() {
        return estado_llave;
    }

    public void setEstado_llave(String estado_llave) {
        this.estado_llave = estado_llave;
    }

    public String getServicios_aplicaciones() {
        return servicios_aplicaciones;
    }

    public void setServicios_aplicaciones(String servicios_aplicaciones) {
        this.servicios_aplicaciones = servicios_aplicaciones;
    }

    public TextArea getObservacion() {
        return Observacion;
    }

    public void setObservacion(TextArea observacion) {
        Observacion = observacion;
    }

    public Tipo_Servidor getTipo_servidor() {
        return tipo_servidor;
    }

    public void setTipo_servidor(Tipo_Servidor tipo_servidor) {
        this.tipo_servidor = tipo_servidor;
    }

    public Proceso_Servidor getProceso_servidor() {
        return proceso_servidor;
    }

    public void setProceso_servidor(Proceso_Servidor proceso_servidor) {
        this.proceso_servidor = proceso_servidor;
    }
}
