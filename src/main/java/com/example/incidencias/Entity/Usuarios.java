package com.example.incidencias.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;


@Entity
@Table(name="Usuarios")
public class Usuarios implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String password;


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario(String nombre) {
        return this.nombre;
    }

    public void setUsuario(String usuario) {
        this.nombre = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}
