package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Categoria;
import com.noti.blog.persistence.entity.TbCategoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbCategoriaMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "id"),
            @Mapping(source = "descipcion",target = "descripcion")
    })
    Categoria toCategoria(TbCategoria tbCategoria);
    List<Categoria> toCategorias(List<TbCategoria> tbCategorias);
    @InheritInverseConfiguration
    TbCategoria toTbCategoria(Categoria categoria);
}
