package com.example.incidencias.Service;



import com.example.incidencias.Entity.Clientes;

import java.util.List;

public interface ServiceClientes  {


    public Clientes findOne(Long id);

    public void delete (Long id);

    public Clientes save(Clientes cliente);

    public List<Clientes> findAll();



}
