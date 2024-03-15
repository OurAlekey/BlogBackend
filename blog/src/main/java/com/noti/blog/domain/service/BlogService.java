package com.noti.blog.domain.service;

import com.noti.blog.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BlogService implements  UserDetailsService {
    @Autowired
    UsuarioService UsuarioService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        Usuario usuario =  UsuarioService.getUserByUsuario(username);
        return new User(usuario.getUsuario(), usuario.getContrasena(),new ArrayList<>());
    }
}
