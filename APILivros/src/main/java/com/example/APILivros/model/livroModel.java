package com.example.APILivros.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "livros")
@Entity
public class livroModel{
    @Column(name = "titulo")
    String titulo;
    @Column(name = "autor")
    String autor;
    @Column(name = "ano_publicacaoo")
    int ano_publicacaoo;
    @Column(name = "genero")
    String genero;
}
