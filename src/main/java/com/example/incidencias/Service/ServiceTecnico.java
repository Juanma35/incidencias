package com.example.incidencias.Service;

import com.example.incidencias.Entity.Tecnico;

import java.util.List;

public interface ServiceTecnico {


    public Tecnico save(Tecnico tecnico);

    public void delete(Long id);

    public Tecnico findByOne(Long id);


    public List<Tecnico> findAll();
}
