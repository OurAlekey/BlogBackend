package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Contacto;
import com.noti.blog.persistence.entity.TbContacto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbContactoMapper {

    @Mappings({
            @Mapping(source = "idContacto",target = "id"),
            @Mapping(source = "descripcion",target = "descripcion"),
            @Mapping(source = "idUsuario",target = "idUsuario"),
            @Mapping(source = "idTipoContacto",target = "idTipoContacto"),
    })
    Contacto toContacto(TbContacto tbContacto);
    List<Contacto> toContactos(List<TbContacto> tbContactos);

    @InheritInverseConfiguration
    TbContacto toTbContacto(Contacto contacto);

}
