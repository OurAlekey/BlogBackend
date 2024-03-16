package com.noti.blog.persistence.crud;

import com.noti.blog.persistence.entity.TbContacto;
import org.springframework.data.repository.CrudRepository;

public interface TbContactoCrud extends CrudRepository<TbContacto,Integer> {
}
