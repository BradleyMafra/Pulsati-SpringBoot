package com.example.ExemploJoin.controller;

import com.example.ExemploJoin.model.pessoaModel;
import com.example.ExemploJoin.model.vendasModel;
import com.example.ExemploJoin.repository.vendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class vendasController {
    @Autowired
    private vendasRepository repository;
    @GetMapping("/buscar")
    public List<vendasModel> buscar(){return repository.findAll();}
    @GetMapping("/buscar/{id}")
    public vendasModel buscar(@PathVariable long id){return repository.findById(id).get();}
    @PostMapping("/salvar")
    public vendasModel salvar(@RequestBody vendasModel vendas){return repository.save(vendas);}
    @PutMapping("/atualizar")
    public vendasModel atualizar(@RequestBody vendasModel vendas){return repository.save(vendas);}
    @DeleteMapping("/deletar")
    public void deletar(@PathVariable long id){repository.deleteById(id);}
}
