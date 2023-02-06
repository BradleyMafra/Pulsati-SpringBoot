package com.example.demo.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class funcionarioModel {
    private int id;
    private String nome;
    private String sobrenome;
    private int idade;
    private int codigoCadastro;
}
