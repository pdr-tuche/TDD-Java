package com.example.resttests.modules.curso.repositories;

import com.example.resttests.modules.curso.entities.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoRepository implements ICursoRepository {
    @Autowired
    CursoJpaRepository cursoJpaRepository;
    @Override
    public Curso findByNome(String nome) {
        return this.cursoJpaRepository.findByNome(nome);
    }

    @Override
    public Curso save(Curso curso) {
        return this.cursoJpaRepository.save(curso);
    }

    @Override
    public List<Curso> getAll() {
        return this.cursoJpaRepository.findAll();
    }

}
