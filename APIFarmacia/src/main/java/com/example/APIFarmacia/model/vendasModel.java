package com.example.APIFarmacia.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Table(name = "vendas_bradleyfarmacia")
@Entity
public class vendasModel {
    @Id
    @Column(name = "idvenda")
    int idVenda;
    @Column(name = "data_venda")
    Date data_venda;
    @Column(name = "ativo")
    int ativo;
    @ManyToOne
    @JoinColumn(name = "idmedicamento",referencedColumnName = "idmedicamento")
    public medicamentoModel medicamento;
    @ManyToOne
    @JoinColumn(name = "idcliente",referencedColumnName = "idcliente")
    public clienteModel cliente;
}
