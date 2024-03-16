package com.noti.blog.web.controllers;

import com.noti.blog.domain.Categoria;
import com.noti.blog.domain.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    @GetMapping("/id/{id}")
   // @ApiResponses({
     //       @ApiResponse(code = 200, message = "DATO ENCONTRADO CON EXITO")
    //})
    public Optional<Categoria> getById(@PathVariable("id") Integer id){
      return   service.getById(id);
    }

    @GetMapping("/all")
    public List<Categoria> getAll(){
       return service.geAll();
    }

    @PostMapping
    public  Categoria save(@RequestBody Categoria categoria){
        return service.save(categoria);
    }

}
