package com.example.incidencias.Service;

import com.example.incidencias.Dao.DaoIncidencia;
import com.example.incidencias.Entity.Incidencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceIncidenciasImpl implements ServiceIncidencias {

@Autowired
private DaoIncidencia daoIncidencia;
    @Override
    public List<Incidencia> findAll() {
        return (List<Incidencia>) daoIncidencia.findAll();
    }

    @Override
    public void delete(Long id) {
        daoIncidencia.deleteById(id);
    }

    @Override
    public Incidencia save(Incidencia incidencia) {
       return daoIncidencia.save(incidencia);
    }

    @Override
    public Incidencia findOne(Long id) {
        return daoIncidencia.findById(id).orElse(null);
    }
}
