package com.example.incidencias.dto;



import java.util.Date;

public class incidenciasRequest {

    private Long IdIncidencia;

    private String tipo;

    private Date createAt;

    private String Comentario;

    private String clientes;

    private String tecnico;


    public incidenciasRequest(Long idIncidencia, String tipo, Date createAt, String comentario, String clientes, String tecnico) {
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

    public String getClientes() {
        return clientes;
    }

    public void setClientes(String clientes) {
        this.clientes = clientes;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}
