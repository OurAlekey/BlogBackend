package com.noti.blog.domain.service;

import com.noti.blog.domain.Noticia;
import com.noti.blog.domain.repository.NoticiaRepository;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaService {

    @Autowired
    private NoticiaRepository repository;

    public Optional<Noticia> getById(Integer id){
        Optional<Noticia> noticia = repository.getById(id);

        if(noticia.isEmpty()){
            throw new BussnessNotFountException("NO SE ENCONTRO EL ID: " + id);
        }else {
            return noticia;
        }
    }

    public List<Noticia> getAll() {
        List<Noticia> noticias = repository.getAll();
        if(noticias.isEmpty()){
            throw new BussnessNotFountException("NO SE ENCONTRARON REGISTROS ");
        }else{
            return  noticias;
        }
    }

    public  Noticia save(Noticia noticia){
        Noticia noticiaDTO = repository.save(noticia);
        if(noticiaDTO.equals(null)){
            throw new BussnessNotFountException("OCURRIO UN ERROR AL GUARDAR ");
        }else{
            return noticiaDTO;
        }
    }

}
