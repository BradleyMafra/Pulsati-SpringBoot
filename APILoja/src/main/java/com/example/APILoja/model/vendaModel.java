package com.example.APILoja.model;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.sql.Date;

@Data
@Table(name = "VENDAS_BRADLEYEXEMPLO")
@Entity
public class vendaModel {
    @Id
    @Column(name = "id_venda")
    int idVenda;
    @ManyToOne
    @JoinColumn(name = "id_produto",referencedColumnName = "id_produto")
    private produtoModel produto;
    @ManyToOne// Aqui seria FK                       // AQUI O ID DA TABLE ABAIXO
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    private clienteModel cliente;

    @Column(name = "data_venda")
    Date dataVenda;
}
