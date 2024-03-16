package com.noti.blog.persistence.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="tb_noticia")
public class TbNoticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_noticia", nullable = false)
    private Integer idNoticia;
    @Column(name = "descripcion", nullable = false)
    private  String descripcion;
    @Column(name = "fecha_modificacion", nullable = false)
    private Date fechaModificacion;
    @Column(name = "id_categoria", nullable = false)
    private  Integer idCategoria;
    @Column(name = "id_titulo", nullable = false)
    private  Integer idTitulo;

    public Integer getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Integer idTitulo) {
        this.idTitulo = idTitulo;
    }
}
