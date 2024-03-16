package com.noti.blog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="tb_contacto")
public class TbContacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto", nullable = false)
    private Integer idContacto;

    @Column(name ="descripcion", nullable = false)
    private String descripcion;

    @Column(name ="id_suario", nullable = false)
    private Integer idUsuario;
    @Column(name ="id_tipo_contacto", nullable = false)
    private Integer idTipoContacto;

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdTipoContacto() {
        return idTipoContacto;
    }

    public void setIdTipoContacto(Integer idTipoContacto) {
        this.idTipoContacto = idTipoContacto;
    }
}
