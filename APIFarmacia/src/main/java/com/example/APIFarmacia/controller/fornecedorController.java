package com.example.APIFarmacia.controller;

import com.example.APIFarmacia.model.fornecedorModel;
import com.example.APIFarmacia.repository.fornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class fornecedorController {
    @Autowired
    private fornecedorRepository repository;
    @GetMapping("/buscar")
    public List<fornecedorModel> buscarTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idFornecedor}")
    public fornecedorModel buscaPorID(@PathVariable int idFornecedor){return repository.findById(idFornecedor).get();}
    @PostMapping("/adicionar")
    public fornecedorModel adicionar(@RequestBody fornecedorModel fornecedor){return repository.save(fornecedor);}
    @PutMapping("/atualizar")
    public fornecedorModel atualizar(@RequestBody fornecedorModel fornecedor){return repository.save(fornecedor);}
    @DeleteMapping("/deletar/{idFornecedor}")
    public void deletar(@PathVariable int idFornecedor){repository.deleteById(idFornecedor);}
}
