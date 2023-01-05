package com.example.resttests.modules.curso.repositories;

import com.example.resttests.modules.curso.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoJpaRepository extends JpaRepository<Curso, Integer> {

    public Curso findByNome(String nome);

}
