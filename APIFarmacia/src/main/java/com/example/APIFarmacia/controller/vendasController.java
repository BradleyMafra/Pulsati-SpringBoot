package com.example.APIFarmacia.controller;

import com.example.APIFarmacia.model.clienteModel;
import com.example.APIFarmacia.model.vendasModel;
import com.example.APIFarmacia.repository.clienteRepository;
import com.example.APIFarmacia.repository.vendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class vendasController {
    @Autowired
    private vendaRepository repository;
    @GetMapping("/buscar")
    public List<vendasModel> buscarTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idVenda}")
    public vendasModel buscaPorID(@PathVariable int idVenda){return repository.findById(idVenda).get();}
    @PostMapping("/adicionar")
    public vendasModel adicionar(@RequestBody vendasModel venda){return repository.save(venda);}
    @PutMapping("/atualizar")
    public vendasModel atualizar(@RequestBody vendasModel venda){return repository.save(venda);}
    @DeleteMapping("/deletar/{idVenda}")
    public void deletar(@PathVariable int idVenda){repository.deleteById(idVenda);}
}
