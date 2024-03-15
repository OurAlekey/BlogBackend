package com.noti.blog.domain.repository;

import com.noti.blog.domain.Usuario;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends UserDetailsService {
    public Usuario getUsuario (String usuario);
    public Optional<Usuario> getId(Integer id);
    public List<Usuario> getAll();
    public Usuario save(Usuario usuario);

    public UserDetails loadUserByUsername(String email);

}
