package com.example.incidencias.Service;

import com.example.incidencias.Dao.DaoCliente;
import com.example.incidencias.Entity.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceClientesImpl implements ServiceClientes {

    @Autowired
    private DaoCliente daoCliente;


    @Override
    @Transactional(readOnly = true)
    public Clientes findOne(Long id) {

        return daoCliente.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long id) {

        daoCliente.deleteById(id);

    }

    @Override
    @Transactional
    public Clientes save(Clientes cliente)
    {
       return daoCliente.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Clientes> findAll() {
        return (List<Clientes>) daoCliente.findAll();
    }
}
