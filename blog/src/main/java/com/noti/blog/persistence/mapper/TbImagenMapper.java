package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Imagen;
import com.noti.blog.persistence.entity.TbImagen;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbImagenMapper {
    @Mappings({
            @Mapping(source = "idImagen",target = "id"),
            @Mapping(source = "nombre",target = "nombre"),
            @Mapping(source = "idNoticia",target = "idNoticia"),
            @Mapping(source = "estado",target = "estado"),
    })
    Imagen toImagen(TbImagen tbImagen);
    List<Imagen> toImagenes(List<TbImagen> tbImagens);

    @InheritInverseConfiguration
    TbImagen toTbImagen(Imagen imagen);
}
