package com.example.APILoja.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "PRODUTOS_BRADLEYEXEMPLO")
@Entity
public class produtoModel {
    @Id
    @Column(name = "id_produto")
    Long idProduto;
    @Column(name = "nome")
    String nome;
    @Column(name = "preco")
    Long preco;
    @ManyToOne
    @JoinColumn(name = "id_fornecedor",referencedColumnName = "id_fornecedor")
    private fornecedoresModel fornecedores;
}
