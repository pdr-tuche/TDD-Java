package com.example.resttests.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CriarCursoServiceTest {
    @Test
    public void deve_criar_um_novo_curso(){
        //criar um novo curso
        Curso curso = new Curso();
        curso.setDescricao("curso descrisao teste");
        curso.setName("nome do curso");
        curso.setCargaHoraria(100);

        // criar a tabela de curso(entidade)

        // criar um novo service
        CriarCursoService criarCursoService = new CreateCursoService();
        Curso cursoCriado = criarCursoService.execute(curso);
        assertNotNull(cursoCriado.getId());

        // criar um repository de curso para inserir na entidade
    }
}
