package com.noti.blog.web.controllers;

import com.noti.blog.domain.Imagen;
import com.noti.blog.domain.service.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imagen")
public class ImagenController {
    @Autowired
    private ImagenService service;

    @GetMapping("/id/{id}")
    public Optional<Imagen> getById(@PathVariable Integer id){
        return  service.getById(id);
    }
    @GetMapping("/all")
    public List<Imagen> getAll(){
        return  service.getAll();
    }

    @PostMapping("/save")
    public Imagen save(@RequestBody Imagen imagen){
        return  service.save(imagen);
    }
}
