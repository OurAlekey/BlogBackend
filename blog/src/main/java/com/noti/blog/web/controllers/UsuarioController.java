package com.noti.blog.web.controllers;

import com.noti.blog.domain.Usuario;
import com.noti.blog.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping("/all")
    public List<Usuario> getAll(){
        return   service.getAll();
    }

    @PostMapping("/save")
    public Usuario saveUsuario(@RequestBody  Usuario usuario){
        return  service.save(usuario);
    }
}
