package com.example.APIFarmacia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "clientes_bradleyfarmacia")
@Entity
public class clienteModel {
    @Id
    @Column(name = "idcliente")
    int idCliente;
    @Column(name = "nome")
    String nome;
    @Column(name = "endereco")
    String endereco;
    @Column(name = "telefone")
    String telefone;
    @Column(name = "ativo")
    int ativo;
}
