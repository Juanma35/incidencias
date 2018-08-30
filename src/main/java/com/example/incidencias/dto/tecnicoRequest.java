package com.example.incidencias.dto;

public class tecnicoRequest {

    private long idtecnicos;

    private String nombre;

    public tecnicoRequest(long idtecnicos, String nombre) {
        this.idtecnicos = idtecnicos;
        this.nombre = nombre;
    }

    public long getIdtecnicos() {
        return idtecnicos;
    }

    public void setIdtecnicos(long idtecnicos) {
        this.idtecnicos = idtecnicos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
