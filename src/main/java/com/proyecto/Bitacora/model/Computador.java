package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="computador")
public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_equipo;
    private int numero_factura;
    private String marca;
    private String modelo;
    private String serie;
    private String numero_modelo;
    private Boolean disponibilidad;

    @ManyToOne
    @JoinColumn (name= "id_caract_software", nullable = true)
    private Caract_Hardware caract_hardware;

    @ManyToOne
    @JoinColumn (name= "id_caract_hardware", nullable = true)
    private Caract_Software caract_software;

    // Constructor sin parámetros
    public Computador() {
    }

    public Computador(String nombre_equipo, int numero_factura, String marca, String modelo, String serie, String numero_modelo, Boolean disponibilidad, Caract_Hardware caract_hardware, Caract_Software caract_software) {
        this.nombre_equipo = nombre_equipo;
        this.numero_factura = numero_factura;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.numero_modelo = numero_modelo;
        this.disponibilidad = disponibilidad;
        this.caract_hardware = caract_hardware;
        this.caract_software = caract_software;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public int getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(int numero_factura) {
        this.numero_factura = numero_factura;
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

    public String getNumero_modelo() {
        return numero_modelo;
    }

    public void setNumero_modelo(String numero_modelo) {
        this.numero_modelo = numero_modelo;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Caract_Hardware getCaract_hardware() {
        return caract_hardware;
    }

    public void setCaract_hardware(Caract_Hardware caract_hardware) {
        this.caract_hardware = caract_hardware;
    }

    public Caract_Software getCaract_software() {
        return caract_software;
    }

    public void setCaract_software(Caract_Software caract_software) {
        this.caract_software = caract_software;
    }
}
