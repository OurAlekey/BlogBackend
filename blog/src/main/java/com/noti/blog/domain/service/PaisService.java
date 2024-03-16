package com.noti.blog.domain.service;

import com.noti.blog.domain.Pais;
import com.noti.blog.domain.repository.PaisRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisService {
    @Autowired
    private PaisRepository repository;

    public Optional<Pais> getById(Integer id){
        Optional<Pais> pais = repository.getById(id);
        if(pais.isEmpty()){
            throw  new BussnessNotFountException("NO SE ENCONTRO EL EL DATO CON ID: " + id);
        }else{
            return pais;
        }
    }

    public List<Pais> getAll(){
        List<Pais> paises = repository.getAll();
        if(paises.isEmpty()){
            throw  new BussnessNotFountException("NO SE ENCONTRARON DATOS ");
        }else{
            return  paises;
        }
    }

    public Pais save(Pais pais){
        Pais paisDTO = repository.save(pais);
        if(paisDTO.equals(null)){
            throw  new BussnessNotFountException("ERROR EN GUARDAR EL DATO POR FAVOR VERIFIQUE LOS CAMPOS ");
        }else{
            return  paisDTO;
        }
    }

}
