package com.noti.blog.web.controllers;

import com.noti.blog.domain.Titulo;
import com.noti.blog.domain.service.TitutloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/titulo")
public class TituloController {

    @Autowired
    private TitutloService service;

    @GetMapping("/id/{id}")
    public Optional<Titulo> getId(@PathVariable("id") Integer id){
        return  service.getId(id);
    }

    @RequestMapping("/all")
    public List<Titulo> getAll(){
        return  service.getAll();
    }

    @GetMapping("/inicio/{inicio}")
    public Titulo getByInicio(@PathVariable("inicio") char inicio){
        return  service.getByInicio(inicio);
    }

    @PostMapping("/save")
    public Titulo save(@RequestBody Titulo titulo){
        return  service.save(titulo);
    }
}
