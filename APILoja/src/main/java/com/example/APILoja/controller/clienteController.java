package com.example.APILoja.controller;
import com.example.APILoja.model.clienteModel;
import com.example.APILoja.repository.clienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteRepository repository;
    @GetMapping("/buscar")
    public List<clienteModel> buscaTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idCliente}")
    public clienteModel buscarPorId(@PathVariable int idCliente){return repository.findById(idCliente).get();}
    @PostMapping("/adicionar")
    public clienteModel adicionarCliente(@RequestBody clienteModel cliente){return repository.save(cliente);}
    @PutMapping("/atualizar")
    public clienteModel atualizarCliente(@RequestBody clienteModel cliente){return repository.save(cliente);}
    @DeleteMapping("/deletar/{idCliente}")
    public void deletarCliente(@PathVariable int idCliente){repository.deleteById(idCliente);}
}