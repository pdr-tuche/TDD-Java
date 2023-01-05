package com.example.resttests.modules.curso.service;

import com.example.resttests.modules.curso.entities.Curso;
import com.example.resttests.modules.curso.repositories.CursoJpaRepository;
import com.example.resttests.modules.curso.repositories.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CriarCursoService {
    private ICursoRepository repository;
    public CriarCursoService(ICursoRepository repository) {
        this.repository = repository;
    }

    public Curso execute(Curso curso){
        // validar se o curso existe pelo nome
        Curso cursoExistente = repository.findByNome(curso.getNome());
        // se sim, retornar erro
        if(cursoExistente != null){
            throw new Error("curso ja existe");
        }
        // se nao, retornar novo curso
        return repository.save(curso);

    }

    public List<Curso>busca(){
        return repository.getAll();
    }

}
