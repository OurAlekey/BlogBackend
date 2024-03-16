package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Pais;
import com.noti.blog.persistence.entity.TbPais;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel ="spring")
public interface TbPaisMapper {
    @Mappings({
            @Mapping(source = "idPais",target = "id"),
            @Mapping(source = "descripcion",target = "descripcion")
    })
    Pais toPais(TbPais tbPais);
    List<Pais> toPaises(List<TbPais> tbPaises);

    @InheritInverseConfiguration
    TbPais toTbPais(Pais pais);
}
