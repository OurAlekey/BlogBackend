package com.noti.blog.domain.service;

import com.noti.blog.domain.Imagen;
import com.noti.blog.domain.repository.ImagenRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImagenService {
    @Autowired
    private ImagenRepository repository;

    public Optional<Imagen> getById(Integer id){
        Optional<Imagen> imagen = repository.getById(id);
        if(imagen.isEmpty()){
            throw  new BussnessNotFountException("NO SE ENCONTRO EL DATO CON ID: " + id);
        }else {
            return  imagen;
        }
    }

    public List<Imagen> getAll(){
        List<Imagen> imagenes = repository.getAll();
        if(imagenes.isEmpty()){
            throw  new BussnessNotFountException("NO SE ENCONTRARON DATPS" );
        }else {
            return  imagenes;
        }
    }
    public  Imagen save(Imagen imagen){
        Imagen imagenDTO = repository.save(imagen);
        if(imagenDTO.equals(null)){
            throw  new BussnessNotFountException("ERRO AL GUARDAR LOS DATOS VERIFIQUE QUE LOS INGRESO CORRECTAMENTE" );
        }else {
            return  imagenDTO;
        }
    }

}
