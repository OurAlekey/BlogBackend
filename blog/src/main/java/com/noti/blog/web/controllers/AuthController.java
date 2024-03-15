package com.noti.blog.web.controllers;


import com.noti.blog.domain.dto.AuthenticationRequest;
import com.noti.blog.domain.dto.AuthenticationResponse;
import com.noti.blog.domain.service.BlogService;
import com.noti.blog.domain.service.UsuarioService;
import com.noti.blog.exeptions.BussnessNotFountException;
import com.noti.blog.web.security.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private BlogService service;
    @Autowired
    private UsuarioService serviceUser;

    @Autowired
    private JWTUtil jwtUtil;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationRequest> createToken(@RequestBody AuthenticationRequest request){

        try {

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
            UserDetails userDetails = service.loadUserByUsername(request.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);
            return new ResponseEntity(new AuthenticationResponse(jwt, serviceUser.getUserByUsuario(request.getUsername())), HttpStatus.OK);
        }catch (BadCredentialsException e){

            throw new BussnessNotFountException("USUARIO/CONTRASEÑA INCORRECTA");
        }
    }
}

