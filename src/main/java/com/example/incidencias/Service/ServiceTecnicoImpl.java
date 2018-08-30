package com.example.incidencias.Service;

import com.example.incidencias.Dao.DaoTecnico;
import com.example.incidencias.Entity.Tecnico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTecnicoImpl  implements ServiceTecnico {


   @Autowired
   private DaoTecnico daoTecnico;

    @Override
    public Tecnico save(Tecnico tecnico) {
        return daoTecnico.save(tecnico);
    }

    @Override
    public void delete(Long id) {
        daoTecnico.findById(id);
    }

    @Override
    public Tecnico findByOne(Long id) {
        return daoTecnico.findById(id).orElse(null);
    }

    @Override
    public List<Tecnico> findAll() {
        return (List<Tecnico>) daoTecnico.findAll();
    }
}
