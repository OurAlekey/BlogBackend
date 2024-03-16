package com.noti.blog.persistence;

import com.noti.blog.domain.Titulo;
import com.noti.blog.domain.repository.TituloRepository;
import com.noti.blog.persistence.crud.TbTituloCrud;
import com.noti.blog.persistence.entity.TbTitulo;
import com.noti.blog.persistence.mapper.TbTituloMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TbTituloRepository implements TituloRepository {

    @Autowired
    private TbTituloCrud crud;

    @Autowired
    private TbTituloMapper mapper;
    @Override
    public Optional<Titulo> getId(Integer id) {
        return crud.findById(id).map(tbTitulo -> mapper.toTitutlo(tbTitulo));
    }

    @Override
    public List<Titulo> getdAll() {
        List<TbTitulo> tbTitulos = (List<TbTitulo>) crud.findAll();
        return mapper.toTitulos(tbTitulos);
    }

    @Override
    public Titulo getByInicio(char inicio) {
        TbTitulo tbTitulo =  crud.findByInicio(inicio);
        return mapper.toTitutlo(tbTitulo);
    }

    @Override
    public Titulo save(Titulo titulo) {
        TbTitulo tbTitulo = mapper.toTbTitulo(titulo);
        return mapper.toTitutlo(crud.save(tbTitulo));
    }
}
