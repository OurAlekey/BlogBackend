package com.noti.blog.domain.dto;

import com.noti.blog.domain.Usuario;

public class AuthenticationResponse {


    private String jwt;

    private Usuario usuario;
    public AuthenticationResponse(String jwt , Usuario usuario) {
        this.jwt = jwt;
        this.usuario = usuario;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
