package com.example.resttests.modules.curso.repositories;

import com.example.resttests.modules.curso.entities.Curso;

import java.util.List;

public interface ICursoRepository {
    public Curso findByNome(String nome);
    public Curso save(Curso curso);

    public List<Curso> getAll();
}
