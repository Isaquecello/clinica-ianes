package com.sistema.clinica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistema.clinica.models.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    
}