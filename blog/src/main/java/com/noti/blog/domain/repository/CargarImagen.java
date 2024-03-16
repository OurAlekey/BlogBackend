package com.noti.blog.domain.repository;

import com.noti.blog.domain.Imagen;
import org.springframework.web.multipart.MultipartFile;

public interface CargarImagen {
   Imagen save(MultipartFile file, Integer idNoticia) throws Exception;
}
