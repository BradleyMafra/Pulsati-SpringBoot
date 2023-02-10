package com.example.APIFarmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "fornecedores_bradleyfarmacia")
@Entity
public class fornecedorModel {
    @Id
    @Column(name = "idfornecedor")
    int idFornecedor;
    @Column(name = "nome")
    String nome;
    @Column(name = "endereco")
    String endereco;
    @Column(name = "telefone")
    String telefone;
    @Column(name = "ativo")
    int ativo;
}
