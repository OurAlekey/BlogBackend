package com.noti.blog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_categoria")
public class TbCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria", nullable = false)
    private Integer idCategoria;

    @Column(name = "descripcion", nullable = false)
    private String descipcion;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }
}
