package com.noti.blog.persistence;

import com.noti.blog.domain.Categoria;
import com.noti.blog.domain.repository.CategoriaRepository;
import com.noti.blog.persistence.crud.TbCategoriaCrud;
import com.noti.blog.persistence.entity.TbCategoria;
import com.noti.blog.persistence.mapper.TbCategoriaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TbCategoriaRepository implements CategoriaRepository {
    @Autowired
    private TbCategoriaCrud crud;
    @Autowired
    private TbCategoriaMapper mapper;
    @Override
    public Optional<Categoria> getById(Integer id) {
        return crud.findById(id).map(tbCategoria -> mapper.toCategoria(tbCategoria));
    }

    @Override
    public List<Categoria> getAll() {
        List<TbCategoria> tbCategorias = (List<TbCategoria>) crud.findAll();
        return mapper.toCategorias(tbCategorias);
    }

    @Override
    public Categoria save(Categoria categoria) {
        TbCategoria tbCategoria = mapper.toTbCategoria(categoria);
        return mapper.toCategoria(crud.save(tbCategoria));
    }


}
