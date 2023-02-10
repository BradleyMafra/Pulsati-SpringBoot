package com.example.APIFarmacia.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Table(name = "MEDICAMENTO_BRADLEYFARMACIA")
@Entity
public class medicamentoModel {
    @Id
    @Column(name = "idmedicamento")
    int idMedicamento;
    @Column(name = "nome")
    @NotNull
    String  nome;
    @Column(name = "descricao")
    String descricao;
    @Column(name = "preco")
    @NotNull
    int preco;
    @Column(name = "quantidade")
    @NotNull
    int quantidade;
    @Column(name = "idfornecedor")
    @NotNull
    int idFornecedor;
    @Column(name = "ativo")
    int ativo;
}
