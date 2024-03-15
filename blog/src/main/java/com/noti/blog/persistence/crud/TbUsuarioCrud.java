package com.noti.blog.persistence.crud;

import com.noti.blog.persistence.entity.TbUsuario;
import org.springframework.data.repository.CrudRepository;

public interface TbUsuarioCrud extends CrudRepository<TbUsuario,Integer> {

    TbUsuario findByUsuario (String usuario);

}
