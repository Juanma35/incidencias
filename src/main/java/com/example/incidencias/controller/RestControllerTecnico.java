package com.example.incidencias.controller;


import com.example.incidencias.Entity.Tecnico;
import com.example.incidencias.Service.ServiceTecnicoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api/Tecnico")
public class RestControllerTecnico {

    @Autowired
    private ServiceTecnicoImpl serviceTecnico;


    @GetMapping("/tecnico")
    public List<Tecnico> showTecnico(){

        return  serviceTecnico.findAll();
    }

    @GetMapping("/tecnico/{id}")
    public Tecnico devolver(@PathVariable Long id) {

        return serviceTecnico.findByOne(id);}

    @PostMapping("/tecnico")
    @ResponseStatus(HttpStatus.CREATED)
    public Tecnico create(@RequestBody Tecnico tecnico) {

        this.serviceTecnico.save(tecnico);
        return tecnico;
    }
}