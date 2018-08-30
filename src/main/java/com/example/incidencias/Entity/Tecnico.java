package com.example.incidencias.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table(name="Tecnico")
public class Tecnico implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idTecnico;


    private String nombre;


    public Long getIdTecnico() {
        return idTecnico;
    }

    public void setIdTecnico(Long idTecnico) {
        this.idTecnico = idTecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
