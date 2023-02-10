package com.example.APIFarmacia.controller;

import com.example.APIFarmacia.model.clienteModel;
import com.example.APIFarmacia.model.fornecedorModel;
import com.example.APIFarmacia.repository.clienteRepository;
import com.example.APIFarmacia.repository.fornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteRepository repository;
    @GetMapping("/buscar")
    public List<clienteModel> buscarTodos(){return repository.findAll();}
    @GetMapping("/buscar/{idCliente}")
    public clienteModel buscaPorID(@PathVariable int idCliente){return repository.findById(idCliente).get();}
    @PostMapping("/adicionar")
    public clienteModel adicionar(@RequestBody clienteModel cliente){return repository.save(cliente);}
    @PutMapping("/atualizar")
    public clienteModel atualizar(@RequestBody clienteModel cliente){return repository.save(cliente);}
    @DeleteMapping("/deletar/{idCliente}")
    public void deletar(@PathVariable int idCliente){repository.deleteById(idCliente);}


//    @PutMapping("/inativo/{idCliente}")
//    public ResponseEntity<clienteModel> updateClienteAtivo(@PathVariable int idCliente, @RequestBody clienteModel updatedCliente) {
//        clienteModel cliente = repository.findById(idCliente).orElse(null);
//        if (cliente == null) {
//            return ResponseEntity.notFound().build();
//        }
//        cliente.setAtivo(updatedCliente.getAtivo());
//        repository.save(cliente);
//        return ResponseEntity.ok(cliente);
//    }
}
