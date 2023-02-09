package com.example.ExemploJoin.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "vendas_lucas")
@Entity
public class vendasModel {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nome_comprador")
    private String nome_comprador;
    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private pessoaModel pessoa;
}
