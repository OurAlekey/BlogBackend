package com.noti.blog.web.controllers;

import com.noti.blog.domain.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService service;

    @GetMapping("/prueba")
    public String prueba (){
        return  "hola";
    }
}
