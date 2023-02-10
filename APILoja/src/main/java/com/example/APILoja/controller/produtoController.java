package com.example.APILoja.controller;

import com.example.APILoja.model.fornecedoresModel;
import com.example.APILoja.model.produtoModel;
import com.example.APILoja.repository.forncedoresRepository;
import com.example.APILoja.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class produtoController {
    @Autowired
    private produtoRepository repository;
    @GetMapping("/buscar")
    public List<produtoModel> buscaTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idProduto}")
    public produtoModel buscaPorID(@PathVariable int idProduto){return repository.findById(idProduto).get();}
    @PostMapping("/adicionar")
    public produtoModel adicionarProduto(@RequestBody produtoModel produto){return repository.save(produto);}
    @PutMapping("/atualizar")
    public produtoModel atualizarProduto(@RequestBody produtoModel produto){return repository.save(produto);}
    @DeleteMapping("/deletar/{idProduto}")
    public void deletarProduto(@PathVariable int idProduto){repository.deleteById(idProduto);}
}
