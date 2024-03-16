package com.noti.blog.web.controllers;

import com.noti.blog.domain.Pais;
import com.noti.blog.domain.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private PaisService service;

    @GetMapping("/id/{id}")
    public Optional<Pais> getById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }

    @GetMapping("/all")
    public List<Pais> getAll (){
        return service.getAll();
    }

    @PostMapping("/save")
    public  Pais save(@RequestBody Pais pais){
        return  service.save(pais);
    }
}
