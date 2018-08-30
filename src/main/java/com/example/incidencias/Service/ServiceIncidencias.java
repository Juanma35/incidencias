package com.example.incidencias.Service;

import com.example.incidencias.Entity.Incidencia;

import java.util.List;

public interface ServiceIncidencias {


    public List<Incidencia> findAll();

    public void delete(Long id);

    public Incidencia  save(Incidencia incidencia);

    public Incidencia findOne(Long id);


}
