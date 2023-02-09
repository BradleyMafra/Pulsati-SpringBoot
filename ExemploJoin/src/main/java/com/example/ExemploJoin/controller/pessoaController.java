package com.example.ExemploJoin.controller;

import com.example.ExemploJoin.model.pessoaModel;
import com.example.ExemploJoin.repository.pessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class pessoaController {
    @Autowired
    private pessoaRepository repository;

    @GetMapping("/buscar")
    public List<pessoaModel> buscar(){return repository.findAll();}
    @GetMapping("/buscar/{id}")
    public pessoaModel buscar(@PathVariable long id){return repository.findById(id).get();}
    @PostMapping("/salvar")
    public pessoaModel salvar(@RequestBody pessoaModel pessoa){return repository.save(pessoa);}
    @PutMapping("/atualizar")
    public pessoaModel atualizar(@RequestBody pessoaModel pessoa){return repository.save(pessoa);}
    @DeleteMapping("/deletar")
    public void deletar(@PathVariable long id){repository.deleteById(id);}
}
