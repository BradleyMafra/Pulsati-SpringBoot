package com.example.APILoja.controller;

import com.example.APILoja.model.clienteModel;
import com.example.APILoja.model.fornecedoresModel;
import com.example.APILoja.repository.forncedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class fornecedorController {
    @Autowired
    private forncedoresRepository repository;

    @GetMapping("/buscar")
    public List<fornecedoresModel> buscaTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idFornecedor}")
    public fornecedoresModel buscaPorID(@PathVariable int idFornecedor){return repository.findById(idFornecedor).get();}
    @PostMapping("/adicionar")
    public fornecedoresModel adicionarFornecedor(@RequestBody fornecedoresModel fornecedor){return repository.save(fornecedor);}
    @PutMapping("/atualizar")
    public fornecedoresModel atualizarFornecedor(@RequestBody fornecedoresModel fornecedor){return repository.save(fornecedor);}
    @DeleteMapping("/deletar/{idFornecedor}")
    public void deletarFornecedor(@PathVariable int idFornecedor){repository.deleteById(idFornecedor);}
}
