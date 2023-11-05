package com.cleberfsantos.entitycrud.services;

import com.cleberfsantos.entitycrud.models.EstudanteModel;
import com.cleberfsantos.entitycrud.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

}
