package com.example.resttests.modules.curso.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name="cursos")
@Data //marcando classe como "possui dados"
@AllArgsConstructor //criar construtor com todos os atributos
@NoArgsConstructor //criar construtor sem atributos
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String descricao;

    private String nome;

    private int cargaHoraria;
}
