package com.example.resttests.modules.curso.services;

import com.example.resttests.modules.curso.entities.Curso;
import com.example.resttests.modules.curso.repositories.CursoInMemoryRepository;
import com.example.resttests.modules.curso.service.CriarCursoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CriarCursoServiceTest {
    @Test
    public void deve_criar_um_novo_curso(){
        //criar um novo curso
        // criar a tabela de curso(entidade)
        //idm descricao, nome e carga horaria
        Curso curso = new Curso();
        curso.setDescricao("curso descrisao teste");
        curso.setNome("nome do curso");
        curso.setCargaHoraria(100);

        // criar um repository de curso para inserir na entidade
        CursoInMemoryRepository repository = new CursoInMemoryRepository();

        // criar um novo service
        CriarCursoService criarCursoService = new CriarCursoService(repository);
        Curso cursoCriado = criarCursoService.execute(curso);
        assertNotNull(cursoCriado.getId());
    }
    @Test
    public void nao_deve_criar_um_novo_curso_se_ele_ja_existir(){
        assertThrows(Error.class,() -> {
            Curso curso = new Curso();
            curso.setDescricao("NOT_CREATE_CURSO");
            curso.setNome("NOT_CREATE_CURSO");
            curso.setCargaHoraria(100);

            CursoInMemoryRepository repository = new CursoInMemoryRepository();

            CriarCursoService criarCursoService = new CriarCursoService(repository);
            criarCursoService.execute(curso);
            criarCursoService.execute(curso);
        });
    }
}
