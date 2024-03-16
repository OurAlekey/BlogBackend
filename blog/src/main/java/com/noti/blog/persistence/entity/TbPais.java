package com.noti.blog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_pais")
public class TbPais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais", nullable = false)
    private Integer idPais;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
