package com.example.APIExercicio.controller;

import com.example.APIExercicio.Model.produtoModel;
import com.example.APIExercicio.repository.produtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class produtoController {
    @Autowired
    private produtoRepository repository;

    @GetMapping("/buscar")
    public List<produtoModel> buscar(){return repository.findAll();}
    @GetMapping("/buscar/{id_produto}")
    public produtoModel buscarPorId(@PathVariable int id_produto){return repository.findById(id_produto).get();}
    @PostMapping("/salvar")
    public produtoModel salvarProduto(@RequestBody @Validated produtoModel produto){return repository.save(produto);}
    @PutMapping("/atualizar")
    public produtoModel atualizarProduto(@RequestBody @Validated produtoModel produto){return repository.save(produto);}
    @DeleteMapping("/deletar/{id_produto}")
    public void deletarProduto(@PathVariable int id_produto){repository.deleteById(id_produto);}
}
