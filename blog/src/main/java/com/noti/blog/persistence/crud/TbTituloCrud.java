package com.noti.blog.persistence.crud;


import com.noti.blog.persistence.entity.TbTitulo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TbTituloCrud extends CrudRepository<TbTitulo,Integer> {
    TbTitulo findByInicio(char inicio);

}
