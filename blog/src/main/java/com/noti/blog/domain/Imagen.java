package com.noti.blog.domain;

public class Imagen {
    private Integer id;
    private String nombre;
    private Integer idNoticia;

    private  char estado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
}
