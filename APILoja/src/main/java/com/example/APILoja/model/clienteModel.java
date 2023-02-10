package com.example.APILoja.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
@Table(name = "CLIENTES_BRADLEYEXEMPLO")
@Entity
public class clienteModel {
    @Id
    @Column(name = "id_cliente")
    private int idCliente;
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
