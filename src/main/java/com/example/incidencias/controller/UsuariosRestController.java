package com.example.incidencias.controller;


import com.example.incidencias.Entity.Usuarios;
import com.example.incidencias.Service.UsuariosService;
import com.example.incidencias.dto.UsuarioRequest;
import com.example.incidencias.dto.UsuarioResponse;
import com.example.incidencias.dto.UsuariosResponseBuilder;
import com.fasterxml.jackson.core.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;





@CrossOrigin
@RestController("/usuarios")
public class UsuariosRestController {

    private static final String MAPPER_USUARIO = "usuario";
    private static final String SERVICE_PRODUCES = "application/json; charset=UTF-8";

    @Autowired
    UsuariosService usuariosService;

    @RequestMapping(value = MAPPER_USUARIO, method = RequestMethod.GET,produces = SERVICE_PRODUCES)
    public List<UsuarioResponse> usuariosList( @RequestBody UsuarioRequest usuarioResponse) {

        List<Usuarios> allUsuariosList = usuariosService.findall();
        List<UsuarioResponse> ownAccountResponses = (List<UsuarioResponse>) new UsuariosResponseBuilder(allUsuariosList);

        return new UsuariosResponseBuilder(allUsuariosList)
                .build();
    }

    //Guardar
    @CrossOrigin
    @RequestMapping(value = MAPPER_USUARIO+"/create",method = RequestMethod.POST,produces = SERVICE_PRODUCES)
        public void createUser(@PathVariable Version version, @RequestBody UsuarioRequest usuarioRequest){

        Usuarios usuarios = new Usuarios();

        usuarios.setIdUsuario(usuarioRequest.getIdUsuario());
        usuarios.getUsuario(usuarioRequest.getNombre());
        usuarios.setPassword(usuarioRequest.getPassword());

    }}



