package com.noti.blog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_imagen")
public class TbImagen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen", nullable = false)
    private  Integer idImagen;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "id_noticia", nullable = false)
    private  Integer idNoticia;

    @Column(name = "estado", nullable = false)
    private  char estado;

    public Integer getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(Integer idImagen) {
        this.idImagen = idImagen;
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
