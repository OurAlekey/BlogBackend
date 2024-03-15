package com.noti.blog.persistence;

import com.noti.blog.domain.Usuario;
import com.noti.blog.domain.repository.UsuarioRepository;
import com.noti.blog.persistence.crud.TbUsuarioCrud;
import com.noti.blog.persistence.entity.TbUsuario;
import com.noti.blog.persistence.mapper.TbUsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.security.core.userdetails.User;
@Repository
public class TbUsuarioRepository implements UsuarioRepository {


    @Autowired
    private TbUsuarioCrud crud;

    @Autowired
    private TbUsuarioMapper mapper;

    @Override
    public Usuario getUsuario(String usuario) {
        TbUsuario tbUsuario = crud.findByUsuario(usuario);
        return mapper.toUsuario(tbUsuario);
    }

    @Override
    public Optional<Usuario> getId(Integer id) {
        return crud.findById(id).map(tbUser -> mapper.toUsuario(tbUser));
    }

    @Override
    public List<Usuario> getAll() {
        List<TbUsuario> tbUsuarios = (List<TbUsuario>) crud.findAll();
        return mapper.toUsuarios(tbUsuarios);
    }

    @Override
    public Usuario save(Usuario usuario) {
        TbUsuario tbUser = mapper.toTbUsuario(usuario);
        return mapper.toUsuario(crud.save(tbUser));
    }


}
