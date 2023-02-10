package com.example.APILoja.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name ="FORNECEDORES_BRADLEYEXEMPLO")
@Entity
public class fornecedoresModel {
    @Id
    @Column(name = "id_fornecedor")
    int idFornecedor;
    @Column(name = "nome")
    @NotNull
    String nome;
    @Column(name = "endereco")
    @NotNull
    String endereco;
    @Column(name = "telefone")
    @NotNull
    String telefone;
}
