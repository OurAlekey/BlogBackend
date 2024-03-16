package com.noti.blog.persistence;

import com.noti.blog.domain.Pais;
import com.noti.blog.domain.repository.PaisRepository;
import com.noti.blog.persistence.crud.TbPaisCrud;
import com.noti.blog.persistence.entity.TbPais;
import com.noti.blog.persistence.mapper.TbPaisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TbPaisRepository implements PaisRepository {
    @Autowired
    private TbPaisCrud crud;
    @Autowired
    private TbPaisMapper mapper;

    @Override
    public Optional<Pais> getById(Integer id) {
        return crud.findById(id).map(tbPais -> mapper.toPais(tbPais));
    }

    @Override
    public List<Pais> getAll() {
        List<TbPais> tbPaises = (List<TbPais>) crud.findAll();
        return mapper.toPaises(tbPaises);
    }
    @Override
    public Pais save(Pais pais) {
        TbPais tbPais = mapper.toTbPais(pais);
        return mapper.toPais(crud.save(tbPais));
    }
}
