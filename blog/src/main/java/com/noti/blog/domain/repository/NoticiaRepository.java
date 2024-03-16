package com.noti.blog.domain.repository;

import com.noti.blog.domain.Noticia;

import java.util.List;
import java.util.Optional;

public interface NoticiaRepository {
    Optional<Noticia>getById(Integer id);
    List<Noticia> getAll();
    Noticia save(Noticia noticia);


}
