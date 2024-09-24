package com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bolsadeideas.springboot.backend.apirest.spring_boot_backend_apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{

}
