package com.noti.blog.persistence.mapper;


import com.noti.blog.domain.Titulo;
import com.noti.blog.persistence.entity.TbTitulo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbTituloMapper {

    @Mappings({
            @Mapping(source = "idTitulo",target = "id"),
            @Mapping(source = "descripcion",target = "descripcion"),
            @Mapping(source = "estado",target = "estado"),
            @Mapping(source = "inicio",target = "inicio"),
            @Mapping(source = "idUsuarioPublica",target = "idUsuarioPublica"),
            @Mapping(source = "fechaModificacion",target = "fechaModificacion"),
            @Mapping(source = "fechaPublicacion",target = "fechaPublicacion"),
    })
    Titulo toTitutlo(TbTitulo tbTitulo);
    List<Titulo> toTitulos(List<TbTitulo> tbTitulos);

    @InheritInverseConfiguration
    TbTitulo toTbTitulo(Titulo titulo);


}
