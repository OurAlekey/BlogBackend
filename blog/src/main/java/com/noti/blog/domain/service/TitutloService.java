package com.noti.blog.domain.service;

import com.noti.blog.domain.Titulo;
import com.noti.blog.domain.repository.TituloRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TitutloService {
    @Autowired
    private TituloRepository repository;

    public Optional<Titulo> getId(Integer id){
        if(repository.getId(id).isEmpty()){
            throw new BussnessNotFountException("NO SE ENCONTRO EL ID: " + id);
        } else {
          return   repository.getId(id);
        }
    }
    public List<Titulo> getAll(){
        if(repository.getdAll().isEmpty()){
            throw new BussnessNotFountException("NO SE ENCONTRARON DATOS ");
        }else {
            return  repository.getdAll();
        }
    }

    public Titulo getByInicio(char inicio){
        if(repository.getByInicio(inicio).equals(null)){
            throw new BussnessNotFountException("NO SE ENCONTRARON DATOS ");
        }
        else {
            return  repository.getByInicio(inicio);
        }
    }
    public  Titulo save(Titulo titulo){
        try {
      if(titulo.getInicio() =='S'){
          if(repository.getByInicio('S').equals(null)){
              throw new BussnessNotFountException("YA EXISTE UNA PUBLICACION PARA INICIO ");
          }else{
              return  repository.save(titulo);
          }
      }else {
          return  repository.save(titulo);
      }



        }catch (Exception e){
            throw new BussnessNotFountException("ERRPR AL GUARDAR DATOS ");
        }
    }

}
