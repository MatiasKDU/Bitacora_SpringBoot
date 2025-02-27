package com.proyecto.Bitacora.model;

import jakarta.persistence.*;

@Entity
@Table (name="caract_software")
public class Caract_Software {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private int numero_anydesk;
    @ManyToOne
    @JoinColumn (name="id_sistema_operativo", nullable = true)
    private Sistema_Operativo sistema_operativo;

    public Caract_Software() {
    }

    public Caract_Software(int numero_anydesk, Sistema_Operativo sistema_operativo) {
        this.numero_anydesk = numero_anydesk;
        this.sistema_operativo = sistema_operativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero_anydesk() {
        return numero_anydesk;
    }

    public void setNumero_anydesk(int numero_anydesk) {
        this.numero_anydesk = numero_anydesk;
    }

    public Sistema_Operativo getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(Sistema_Operativo sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }
}
