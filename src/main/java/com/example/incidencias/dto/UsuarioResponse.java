package com.example.incidencias.dto;

import com.example.incidencias.Entity.Usuarios;

public class UsuarioResponse {

    private Long idUsuario;

    private String nombre;

    private String password;

    public UsuarioResponse(Usuarios usuario) {

        this.idUsuario=usuario.getIdUsuario();
        this.nombre=usuario.getUsuario(usuarioRequest.getNombre());
        this.password=usuario.getPassword();
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
