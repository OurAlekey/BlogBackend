package com.noti.blog.domain.repository;

import com.noti.blog.domain.Contacto;

import java.util.List;
import java.util.Optional;

public interface ContactoRepository {
    Optional<Contacto> getId(Integer id);
    List<Contacto> findAll();

    Contacto save(Contacto contacto);
}
