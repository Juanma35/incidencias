package com.example.incidencias.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Table(name="Incidencia")
@Entity
public class Incidencia implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdIncidencia;

    @NotEmpty
    private String tipo;


    @NotNull
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createAt;

    @NotEmpty
    private String Comentario;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idClientes")
    @JsonBackReference
    private Clientes clientes;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="idTecnico")
    private Tecnico tecnico;


    public Long getIdIncidencia() {
        return IdIncidencia;
    }


    public void setIdIncidencia(Long idIncidencia) {
        IdIncidencia = idIncidencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public com.example.incidencias.Entity.Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(com.example.incidencias.Entity.Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
