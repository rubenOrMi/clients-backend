package com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.entity.Region;

public interface IClienteService {

    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente findById(Long id);

    public List<Region> findAllRegions();
}
