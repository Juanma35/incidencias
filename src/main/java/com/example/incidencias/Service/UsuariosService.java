package com.example.incidencias.Service;

import com.example.incidencias.Entity.Usuarios;

import java.util.List;

public interface UsuariosService {

    public Usuarios save(Usuarios usuarios);

    public Usuarios findById(Long id);

    public void Delete(Long id);

    public List<Usuarios> findall();




}
