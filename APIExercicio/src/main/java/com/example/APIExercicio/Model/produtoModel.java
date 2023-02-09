package com.example.APIExercicio.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Table(name = "EXERCICIO_BRADLEY_PRODUTO")
@Entity
public class produtoModel {
    @Id
    @Column(name = "id_produto")
    @NotNull
    int idProduto;
    @Column(name = "nome")
    @NotNull
    @Size(max = 100, message = "O tamanho máximo é de 100 caracteres")
    String nome;
    @Column(name = "descricao")
    @Size(max = 250, message = "O tamanho máximo é de 250 caracteres")
    String descricao;
    @Column(name = "preco")
    @NotNull
    @Min(0)
    String preco;
}