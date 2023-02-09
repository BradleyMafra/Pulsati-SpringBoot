package com.example.APIExercicio.controller;

import com.example.APIExercicio.Model.pessoaModel;
import com.example.APIExercicio.repository.pessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {
    @Autowired
    private pessoaRepository repository;
    @GetMapping("/buscar")
    public List<pessoaModel> buscarTodasPessoas(){return repository.findAll();}
    @GetMapping("/buscar/{id_pessoa}")
    public pessoaModel buscarPorId(@PathVariable int id_pessoa){return repository.findById(id_pessoa).get();}
    @PostMapping("/adicionar")
    public pessoaModel adicionarPessoa(@RequestBody @Validated pessoaModel pessoa){return repository.save(pessoa);}
    @PutMapping("/atualizar")
    public pessoaModel atualizarPessoa(@RequestBody @Validated pessoaModel pessoa){return repository.save(pessoa);}
    @DeleteMapping("/deletar/{id_pessoa}")
    public void deletar(@PathVariable int id_pessoa){repository.deleteById(id_pessoa);}
}
