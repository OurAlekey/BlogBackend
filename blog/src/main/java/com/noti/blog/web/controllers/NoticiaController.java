package com.noti.blog.web.controllers;

import com.noti.blog.domain.Noticia;
import com.noti.blog.domain.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/noticia")
public class NoticiaController{
    @Autowired
    private NoticiaService service;

    @GetMapping("/id/{id}")
    public  Optional<Noticia>  getById(@PathVariable("id") Integer id){
        return  service.getById(id);
    }
    @GetMapping("/all")
    public List<Noticia> getAll(){
        return  service.getAll();
    }

    @PostMapping("/save")
    public Noticia save (@RequestBody Noticia noticia){
        return service.save(noticia);
    }
}
