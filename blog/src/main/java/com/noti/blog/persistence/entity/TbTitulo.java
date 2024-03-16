package com.noti.blog.persistence.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="tb_titulo")
public class TbTitulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titulo", nullable = false)
    private Integer idTitulo;

    @Column(name ="descripcion", nullable = false)
    private String descripcion;

    @Column(name="estado", nullable = false)
    private char estado;

    @Column(name = "inicio", nullable = false)
    private  char inicio;

    @Column(name= "id_usuario_publica" , nullable = false)
    private  Integer idUsuarioPublica;

    @Column(name = "fecha_modificacion", nullable = true)
    private Date fechaModificacion;

    @Column(name = "fecha_publicacion", nullable = false )
    private  Date fechaPublicacion;

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
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
