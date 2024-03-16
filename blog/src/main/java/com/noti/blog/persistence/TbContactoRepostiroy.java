package com.noti.blog.persistence;

import com.noti.blog.domain.Contacto;
import com.noti.blog.domain.repository.ContactoRepository;
import com.noti.blog.persistence.crud.TbContactoCrud;
import com.noti.blog.persistence.entity.TbContacto;
import com.noti.blog.persistence.mapper.TbContactoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TbContactoRepostiroy implements ContactoRepository {

    @Autowired
    private TbContactoCrud crud;
    @Autowired
    private TbContactoMapper mapper;

    @Override
    public Optional<Contacto> getId(Integer id) {
        return crud.findById(id).map(tbContacto -> mapper.toContacto(tbContacto));
    }

    @Override
    public List<Contacto> findAll() {
        List<TbContacto> tbContactos = (List<TbContacto>) crud.findAll();
        return mapper.toContactos(tbContactos);
    }

    @Override
    public Contacto save(Contacto contacto) {
        TbContacto tbContacto = mapper.toTbContacto(contacto);
        return mapper.toContacto(crud.save(tbContacto));
    }
}
