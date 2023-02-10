package com.example.ExerciciosN.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "livro_bradley")
@Entity
public class livroModel {
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "titulo")
    String titulo;
    @Column(name = "autor")
    String autor;
    @Column(name = "ano_publicacao")
    int ano_publicacao;
    }
