package com.example.incidencias.Service;

import com.example.incidencias.Dao.DaoUsuarios;
import com.example.incidencias.Entity.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceUsuarioImpl implements UsuariosService {

    @Autowired
    private DaoUsuarios daoUsuarios;

    @Override
    public Usuarios save(Usuarios usuarios) {
        return daoUsuarios.save(usuarios);
    }

    @Override
    public Usuarios findById(Long id) {
        return daoUsuarios.findById(id).orElse(null);
    }

    @Override
    public void Delete(Long id) {
        daoUsuarios.deleteById(id);
    }

    @Override
    public List<Usuarios> findall() {
        return (List<Usuarios>) daoUsuarios.findAll();
    }




}
