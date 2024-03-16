package com.noti.blog.domain.service;

import com.noti.blog.domain.Categoria;
import com.noti.blog.domain.repository.CategoriaRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Optional<Categoria> getById(Integer id){
        Optional<Categoria> categoria = repository.getById(id);
   if(categoria.isEmpty()){
       return categoria;
   }

   else {
       throw  new BussnessNotFountException("NO SE ENCONTRO LA CATEGORIA CON EL ID: " + id);
   }
    }
    public List<Categoria> geAll(){
        List<Categoria> categorias =  repository.getAll();
        if(categorias.isEmpty()){
            throw  new BussnessNotFountException("NO SE ENCONTRARON DATOS");
        }else {
            return categorias ;
        }

    }
    public Categoria save(Categoria categoria){
        Categoria categoriaDTO = repository.save(categoria);
        if(categoriaDTO.equals(null)){
            throw  new BussnessNotFountException("ERROR AL GUARDAR");
        }else {    return categoriaDTO;}
    }

    }
