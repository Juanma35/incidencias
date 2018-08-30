package com.example.incidencias.dto;



import com.example.incidencias.Entity.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class UsuariosResponseBuilder {

    List <UsuarioResponse> usuariosResponses;

    public UsuariosResponseBuilder(List<Usuarios> usuarios) {
        usuariosResponses = new ArrayList<>();
        for (Usuarios usuario : usuarios) {
            usuariosResponses.add(new UsuarioResponse(usuario));
        }
    }

    public List<UsuarioResponse> build() {
        return usuariosResponses;
    }


}
