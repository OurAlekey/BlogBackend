package com.noti.blog.persistence.mapper;

import com.noti.blog.domain.Usuario;
import com.noti.blog.persistence.entity.TbUsuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TbUsuarioMapper {

    @Mappings({
            @Mapping(source = "idUsuario", target = "id"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(source = "apellido", target = "apellido"),
            @Mapping(source = "fechaNacimiento", target = "fechaNacimiento"),
            @Mapping(source = "usuario", target = "usuario"),
            @Mapping(source = "contrasena", target = "contrasena"),
            @Mapping(source = "idPais", target = "idPais"),


    })
    Usuario toUsuario (TbUsuario tbUsuario);
    List<Usuario> toUsuarios(List<TbUsuario> tbUsuarios);

    @InheritInverseConfiguration
    TbUsuario toTbUsuario(Usuario usuario);

}
