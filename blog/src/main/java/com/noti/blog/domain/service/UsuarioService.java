package com.noti.blog.domain.service;

import com.noti.blog.domain.Usuario;
import com.noti.blog.domain.repository.UsuarioRepository;
import com.noti.blog.exeptions.UserExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuario save(Usuario usuario){

        if(repository.getUsuario(usuario.getUsuario()) != null & usuario.getId() == 0){
            throw new UserExistsException("El correo electronico ya existe");
        }else{
            Usuario user = usuario;
            if(!(usuario.getContrasena().length() >=60)){
                user.setContrasena(bCryptPasswordEncoder.encode(usuario.getContrasena()));
            }
            return repository.save(user);
        }

    }

    public  Usuario getUserByUsuario(String usuario){
        return repository.getUsuario(usuario);
    }
    public List<Usuario> getAll(){
        return repository.getAll();
    }


}
