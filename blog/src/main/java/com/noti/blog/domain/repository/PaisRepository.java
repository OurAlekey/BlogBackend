package com.noti.blog.domain.repository;

import com.noti.blog.domain.Pais;

import java.util.List;
import java.util.Optional;

public interface PaisRepository {
    Optional<Pais> getById(Integer id);
    List<Pais> getAll();
    Pais save(Pais pais);
}
