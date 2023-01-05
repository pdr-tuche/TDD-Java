package com.example.resttests.modules.controller;

import com.example.resttests.modules.curso.entities.Curso;
import com.example.resttests.modules.curso.repositories.CursoRepository;
import com.example.resttests.modules.curso.service.CriarCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository repository;

    @PostMapping("/")
    public Curso criarCurso(@RequestBody Curso curso){
        CriarCursoService criarCursoService = new CriarCursoService(repository);
        return criarCursoService.execute(curso);
    }

    @GetMapping("/")
    public List<Curso> cursos(){
        CriarCursoService criarCursoService = new CriarCursoService(repository);
        return criarCursoService.busca();

    }


}
