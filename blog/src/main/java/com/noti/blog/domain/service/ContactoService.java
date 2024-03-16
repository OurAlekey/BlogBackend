package com.noti.blog.domain.service;

import com.noti.blog.domain.Contacto;
import com.noti.blog.domain.repository.ContactoRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository repository;

    public Optional<Contacto> findById(Integer id){
            if(repository.getId(id).isEmpty()){
                throw new  BussnessNotFountException("ERROR NO SE ENCONTRO EL ID: " + id);
            }else {
                return  repository.getId(id);
            }
    }
    public List<Contacto> findAll(){
        if(repository.findAll().isEmpty()){
            throw new  BussnessNotFountException("NO SE ENCONTRARON DATOS");
        }else{
            return  repository.findAll();
        }
    }
    public  Contacto save(Contacto contacto){

        try {
            return repository.save(contacto);
        }catch (Exception e){
            throw new  BussnessNotFountException("ERROR AL GUARDAR DATOS VERIFIQUE QUE ENVIO LOS NECESARIOS");
        }


    }


}
