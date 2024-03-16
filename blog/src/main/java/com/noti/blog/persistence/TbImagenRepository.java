package com.noti.blog.persistence;

import com.noti.blog.domain.Imagen;
import com.noti.blog.domain.repository.ImagenRepository;
import com.noti.blog.persistence.crud.TbImagenCrud;
import com.noti.blog.persistence.entity.TbImagen;
import com.noti.blog.persistence.mapper.TbImagenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class TbImagenRepository implements ImagenRepository {

    @Autowired
    private TbImagenCrud crud;
    @Autowired
    private TbImagenMapper mapper;
    @Override
    public Optional<Imagen> getById(Integer id) {
        return crud.findById(id).map(tbImagen -> mapper.toImagen(tbImagen));
    }

    @Override
    public List<Imagen> getAll() {
        List<TbImagen> tbImagenes = (List<TbImagen>) crud.findAll();
        return mapper.toImagenes(tbImagenes);
    }

    @Override
    public Imagen save(Imagen imagen) {
        TbImagen tbImagen = mapper.toTbImagen(imagen);
        return mapper.toImagen(crud.save(tbImagen));
    }
}
