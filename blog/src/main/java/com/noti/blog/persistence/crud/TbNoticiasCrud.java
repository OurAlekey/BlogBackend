package com.noti.blog.persistence.crud;

import com.noti.blog.persistence.entity.TbNoticia;
import org.springframework.data.repository.CrudRepository;

public interface TbNoticiasCrud extends CrudRepository<TbNoticia,Integer> {

}
