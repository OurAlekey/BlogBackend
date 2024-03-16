package com.noti.blog.domain.repository;

import com.noti.blog.domain.Titulo;

import java.util.List;
import java.util.Optional;

public interface TituloRepository {
    Optional<Titulo> getId(Integer id);
    List<Titulo> getdAll();
    Titulo getByInicio(char inicio);
    Titulo save(Titulo titulo);
}
