package com.example.APILoja.controller;

import com.example.APILoja.model.produtoModel;
import com.example.APILoja.model.vendaModel;
import com.example.APILoja.repository.vendaReposittory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class vendaController {
    @Autowired
    private vendaReposittory repository;
    @GetMapping("/buscar")
    public List<vendaModel> buscaTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idProduto}")
    public vendaModel buscaPorID(@PathVariable int idVenda){return repository.findById(idVenda).get();}
    @PostMapping("/adicionar")
    public vendaModel adicionarVenda(@RequestBody vendaModel venda){return repository.save(venda);}
    @PutMapping("/atualizar")
    public vendaModel atualizarVenda(@RequestBody vendaModel venda){return repository.save(venda);}
    @DeleteMapping("/deletar/{idProduto}")
    public void deletarVenda(@PathVariable int idVenda){repository.deleteById(idVenda);}
}
