package com.cleberfsantos.entitycrud.repositories;

import com.cleberfsantos.entitycrud.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {

}
