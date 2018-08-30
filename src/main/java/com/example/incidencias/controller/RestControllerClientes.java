package com.example.incidencias.controller;


import com.example.incidencias.Entity.Clientes;
import com.example.incidencias.Service.ServiceClientesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//creamos cors para determinar si comparte recursos y dominios


//@CrossOrigin(origins = {"http://localhost:4200"})//le damos acceso al este dominio a angular y los metodos permitidos
@RestController
@RequestMapping("/api")
class RestControllerClientes {

    @Autowired
    private ServiceClientesImpl serviceClientes;


    @GetMapping("/clientes")
    public List<Clientes>gestCliente(){

        return serviceClientes.findAll();

    }


    @PostMapping("/CrearClientes")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Clientes CrearClientes(@RequestBody Clientes cliente){
        return  serviceClientes.save(cliente);

    }

    @GetMapping("/clientes/{id}")
    public Clientes show(@PathVariable Long id){

        return serviceClientes.findOne(id);

    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Clientes update(@RequestBody Clientes clientes,@PathVariable Long id){

    Clientes ClienteActual = serviceClientes.findOne(id);

        ClienteActual.setNombre(clientes.getNombre());
        ClienteActual.setEmail(clientes.getEmail());

        return serviceClientes.save(ClienteActual);
    }

@DeleteMapping("/Cliente/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){

        serviceClientes.delete(id);
}




}
