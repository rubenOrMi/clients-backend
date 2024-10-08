package com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IUploadFileService {

    public Resource cargar(String nombreFoto) throws MalformedURLException;

    public String guardarImagen(MultipartFile archivo) throws IOException;

    public boolean eliminarImagen(String nombreFoto);

    public Path getPath(String nombreFoto);
}
