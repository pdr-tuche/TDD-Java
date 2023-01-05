package com.example.resttests.modules.curso.repositories;

import com.example.resttests.modules.curso.entities.Curso;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CursoInMemoryRepository implements ICursoRepository{
private List<Curso> cursos;

    public CursoInMemoryRepository() {
        this.cursos = new ArrayList<>();
    }

    @Override
    public Curso findByNome(String nome) {
        Optional<Curso> optionalCurso = this.cursos.stream().filter(curso -> curso.getNome().equals(nome)).findFirst();
        return optionalCurso.orElse(null);
    }

    @Override
    public Curso save(Curso curso) {
        this.cursos.add(curso);
        curso.setId(UUID.randomUUID());
        return curso;
    }

    @Override
    public List<Curso> getAll() {
        return this.cursos;
    }
}
