package com.noti.blog.web.controllers;

import com.noti.blog.domain.Imagen;
import com.noti.blog.domain.repository.CargarImagen;
import com.noti.blog.domain.service.ImagenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/img")
public class CargarImagenController {
    @Autowired
    private CargarImagen cargarImagen;
    @Autowired
    private ImagenService imagenService;


    @PostMapping("/cargar/{idPoroyecto}")
    private ResponseEntity<Imagen> cargarImagen(@RequestParam MultipartFile file, @PathVariable  Integer idNoticia) throws Exception {
       return  new ResponseEntity<>(cargarImagen.save(file,idNoticia), HttpStatus.OK);
    }

}
