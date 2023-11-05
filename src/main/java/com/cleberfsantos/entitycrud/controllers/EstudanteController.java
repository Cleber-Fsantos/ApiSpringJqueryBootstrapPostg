package com.cleberfsantos.entitycrud.controllers;

import com.cleberfsantos.entitycrud.models.EstudanteModel;
import com.cleberfsantos.entitycrud.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;
    @GetMapping("/")
    public String listarEstudantes(){
        return "/lista-estudantes";
    }

    @GetMapping("/novo")
    public String novoEstudante(Model model){
        EstudanteModel estudanteModel = new EstudanteModel();
        model.addAttribute("novoEstudante", estudanteModel);
        return "/novo-estudante";
    }

    @PostMapping("/gravar")
    public String gravarEstudante(@ModelAttribute("novoEstudante") EstudanteModel estudanteModel,
        RedirectAttributes attributes){
        estudanteService.criarEstudante(estudanteModel);
        attributes.addFlashAttribute("mensagem", "Estudante cadastrado com sucesso");
        return "redirect:/novo";
    }

}
