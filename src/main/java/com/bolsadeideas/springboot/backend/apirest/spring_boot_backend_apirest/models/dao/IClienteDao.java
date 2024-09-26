package com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegions();
}
