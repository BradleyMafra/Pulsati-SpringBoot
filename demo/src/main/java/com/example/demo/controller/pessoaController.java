package com.example.demo.controller;
import com.example.demo.model.pessoaModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // Anotação para indicar que é um controller
                // Ele vai fazer com que o Spring saiba que essa classe
                // tem rotas para ele listar
public class pessoaController {
    @GetMapping("/pessoa")// Anotação para indicar que pe uma rota
                         // do tipo get, que vai se acessada pelo /pessoa

    public ResponseEntity<List<pessoaModel>> pessoa(){
        // RespondeEntity é um objeto que vai ser retornado
        // List<pessoaModel> é o tipo de dado que vai ser retornado
        // o ResponseEntity transforma a lista em um objeto json com os dados

        List<pessoaModel> pessoas = new ArrayList<>();// Cura lista de pessoas

        pessoas.add(new pessoaModel(1,"Marcos",20));// Adiciona pessoas usando o construtor de pessoa
        pessoas.add(new pessoaModel(1,"Natan",23));// O mesmo de cima com os dados difeerentes

        return ResponseEntity.ok(pessoas); // Da o retorno da lista de pessoas
    }
}
