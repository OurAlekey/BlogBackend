package com.noti.blog.persistence;

import com.noti.blog.domain.Noticia;
import com.noti.blog.domain.repository.NoticiaRepository;
import com.noti.blog.persistence.crud.TbNoticiasCrud;
import com.noti.blog.persistence.entity.TbNoticia;
import com.noti.blog.persistence.mapper.TbNoticiaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TbNoticiaRepository implements NoticiaRepository {
    @Autowired
    private TbNoticiasCrud crud;
    @Autowired
    private TbNoticiaMapper mapper;


    @Override
    public Optional<Noticia> getById(Integer id) {
        return crud.findById(id).map(tbNoticia -> mapper.toNoticia(tbNoticia));
    }

    @Override
    public List<Noticia> getAll() {
        List<TbNoticia> tbNoticias = (List<TbNoticia>) crud.findAll();
        return mapper.toNoticias(tbNoticias);
    }

    @Override
    public Noticia save(Noticia noticia) {
        TbNoticia tbNoticia = mapper.toTbNoticia(noticia);
        return mapper.toNoticia(crud.save(tbNoticia));
    }
}
