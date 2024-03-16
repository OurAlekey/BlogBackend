package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Noticia;
import com.noti.blog.persistence.entity.TbNoticia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbNoticiaMapper {
    @Mappings({
            @Mapping(source = "idNoticia",target = "id"),
            @Mapping(source = "descripcion",target = "descripcion"),
            @Mapping(source = "fechaModificacion",target = "fechaModificacion"),
            @Mapping(source = "idCategoria",target = "idCategoria"),
            @Mapping(source = "idTitulo",target = "idTitulo")
    })
    Noticia toNoticia (TbNoticia tbNoticia);
    List<Noticia> toNoticias (List<TbNoticia> tbNoticias);
    @InheritInverseConfiguration
    TbNoticia toTbNoticia(Noticia noticia);

}
