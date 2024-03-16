package com.noti.blog.domain;

import java.sql.Date;

public class Titulo {
        private Integer id;
        private String descripcion;
        private char estado;
        private char inicio;
        private Integer idUsuarioPublica;
        private Date fechaModificacion;
        private Date fechaPublicacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public char getInicio() {
        return inicio;
    }

    public void setInicio(char inicio) {
        this.inicio = inicio;
    }

    public Integer getIdUsuarioPublica() {
        return idUsuarioPublica;
    }

    public void setIdUsuarioPublica(Integer idUsuarioPublica) {
        this.idUsuarioPublica = idUsuarioPublica;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
}
