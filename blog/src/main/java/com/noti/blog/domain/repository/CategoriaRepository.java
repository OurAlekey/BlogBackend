package com.noti.blog.domain.repository;

import com.noti.blog.domain.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaRepository {
    Optional<Categoria> getById(Integer id);
    List<Categoria> getAll();
    Categoria save(Categoria categoria);
}
