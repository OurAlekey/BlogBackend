package com.noti.blog.domain.service;

import com.noti.blog.domain.Imagen;
import com.noti.blog.domain.repository.CargarImagen;
import com.noti.blog.exeptions.BussnessNotFountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class CargarImagenService implements CargarImagen {

    @Autowired
    private ImagenService imagenService;
    @Override
    public Imagen save(MultipartFile file, Integer idNoticia) throws Exception {
        try{
            String fileName = UUID.randomUUID().toString();
            String nombreNuevo = cargarImagen(file,fileName);
            Imagen imagen = new  Imagen();
            imagen.setNombre(nombreNuevo);
            imagen.setEstado('D');
            imagen.setIdNoticia(idNoticia);

            return imagenService.save(imagen);
        }catch (Exception e){
            throw  new BussnessNotFountException("ERROR AL GUARDAR LA IMAGEN");
        }

    }

    private String cargarImagen(MultipartFile file, String nombreArchivo) throws IOException {
        String nombreImagen = nombreArchivo;
        byte[] bytes = file.getBytes();
        String nombreDeArchivoOriginal = file.getOriginalFilename();
        long tamanoArchivo = file.getSize();
        //5 MEGAS
        long maximo =5 * 1024*1024;
        if(tamanoArchivo > maximo){
            throw  new BussnessNotFountException("EL TAMAÑO MAXIMO ES DE 5MB");
        }
        if(!nombreDeArchivoOriginal.endsWith(".jpg") &&
                !nombreDeArchivoOriginal.endsWith(".png") &&
                !nombreDeArchivoOriginal.endsWith(".jpeg")){
            throw  new BussnessNotFountException("SOLO SE ACEPTAN IMAGENES CON EL FORMATO .jpg , .png,.jpe");
        }
        String extencion = nombreDeArchivoOriginal.substring(nombreDeArchivoOriginal.lastIndexOf("."));
        String nombreNuevo =  nombreImagen + extencion;
        String pathGuardado = "C:/img";
        File folder = new File(pathGuardado);
        if(!folder.exists()){
            folder.mkdirs();
        }
        Path path = Paths.get(pathGuardado,nombreNuevo);
        Files.write(path, bytes);

        return  nombreNuevo;
    }

}
