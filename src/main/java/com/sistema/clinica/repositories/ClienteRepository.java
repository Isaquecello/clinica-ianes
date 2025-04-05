package com.sistema.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.clinica.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    
}