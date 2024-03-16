package com.noti.blog.web.controllers;

import com.noti.blog.domain.Contacto;
import com.noti.blog.domain.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacto")
public class ContactoController {

    @Autowired
    private ContactoService service;
    @GetMapping("/id/{id}")
    public Optional<Contacto> getId(@PathVariable("id") Integer id){
        return  service.findById(id);
    }

    @GetMapping("/all")
    public List<Contacto> getAll(){
        return  service.findAll();
    }

    @PostMapping("/save")
    public Contacto save(@RequestBody  Contacto contacto){
        return  service.save(contacto);
    }

}
