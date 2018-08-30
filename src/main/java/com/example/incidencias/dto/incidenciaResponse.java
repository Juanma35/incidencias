package com.example.incidencias.dto;

import com.example.incidencias.Entity.Clientes;
import com.example.incidencias.Entity.Tecnico;

import java.util.Date;

public class incidenciaResponse {

    private Long IdIncidencia;

    private String tipo;

    private Date createAt;

    private String Comentario;

    private Clientes clientes;

    private Tecnico tecnico;

    public incidenciaResponse(Long idIncidencia, String tipo, Date createAt, String comentario, Clientes clientes, Tecnico tecnico) {

        IdIncidencia = idIncidencia;
        this.tipo = tipo;
        this.createAt = createAt;
       Comentario = comentario;
        this.clientes = clientes;
        this.tecnico = tecnico;
    }

    public Long getIdIncidencia() {
        return IdIncidencia;
    }

    public void setIdIncidencia(Long idIncidencia) {
        IdIncidencia = idIncidencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
