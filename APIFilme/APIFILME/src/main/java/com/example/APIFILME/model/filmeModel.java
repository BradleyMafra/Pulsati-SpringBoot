package com.example.APIFILME.model;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.sql.Date;

@Data
@Table(name = "ANA_FILMES")
@Entity
public class filmeModel {
    @Id
    @Column(name = "ID")
    private int ID;
    @Column(name = "NOME")
    private String NOME;
    @Column(name = "DESCRICAO")
    private String DESCRICAO;
    @Column(name = "DATA_LANCAMENTO")
    private Date DATA_LANCAMENTO;
    @Column(name = "QUANTIDADE_VENDAS")
    private int QUANTIDADE_VENDAS;
    @Column(name = "PAIS_ORIGEM")
    private String PAIS_ORIGEM;
}
