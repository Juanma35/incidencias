package com.example.incidencias.Dao;


import com.example.incidencias.Entity.Clientes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DaoCliente extends PagingAndSortingRepository<Clientes,Long> {

}
