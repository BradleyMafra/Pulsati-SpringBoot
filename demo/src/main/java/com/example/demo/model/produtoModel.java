package com.example.demo.model;

import lombok.Data;
@Data
public class produtoModel {
    int id;
    String nome;
    double preco;

    produtoModel(){}

    public produtoModel(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

}
