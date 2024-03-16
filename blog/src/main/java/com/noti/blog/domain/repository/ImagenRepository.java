package com.noti.blog.domain.repository;

import com.noti.blog.domain.Imagen;
import java.util.List;
import java.util.Optional;

public interface ImagenRepository {
    Optional<Imagen> getById(Integer id);
    List<Imagen> getAll();
    Imagen save(Imagen imagen);
}
