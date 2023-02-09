package com.example.APILivros.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "LIVROS")
@Entity
public class livroModel{
    @Id
    @Column(name = "id")
    int id;
    @Column(name = "anoPublicacaoo")
    int anoPublicacaoo;
    @Column(name = "TITULO")
    String titulo;
    @Column(name = "autor")
    String autor;
    @Column(name = "genero")
    String genero;
}
